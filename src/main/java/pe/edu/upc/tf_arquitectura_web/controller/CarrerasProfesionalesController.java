package pe.edu.upc.tf_arquitectura_web.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tf_arquitectura_web.dtos.CarrerasProfesionalesDTO;
import pe.edu.upc.tf_arquitectura_web.dtos.StudentsDTO;
import pe.edu.upc.tf_arquitectura_web.entities.CarrerasProfesionales;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.ICarrerasProfesionalesService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/CarrerasProfesionales")
public class CarrerasProfesionalesController {
    @Autowired
    private ICarrerasProfesionalesService pS;

    @PostMapping
    public void registrar(@RequestBody CarrerasProfesionalesDTO dto) {
        ModelMapper m = new ModelMapper();
        CarrerasProfesionales p = m.map(dto, CarrerasProfesionales.class);
        pS.insert(p);

    }
    @GetMapping
    public List<CarrerasProfesionalesDTO>listar(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,CarrerasProfesionalesDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){pS.delete(id);}


    @GetMapping("/{id}")
    public CarrerasProfesionalesDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        CarrerasProfesionalesDTO dto = m.map(pS.listId(id), CarrerasProfesionalesDTO.class);
        return dto;
    }

}
