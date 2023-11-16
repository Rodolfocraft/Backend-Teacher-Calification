package pe.edu.upc.tf_arquitectura_web.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tf_arquitectura_web.dtos.CalificacionDocenteDTO;
import pe.edu.upc.tf_arquitectura_web.dtos.AlumnoCalificacionDocenteDTO;
import pe.edu.upc.tf_arquitectura_web.entities.CalificacionDocente;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.ICalificacionDocenteService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/calificacionDocente")
public class CalificacionDocenteController {
    @Autowired
    private ICalificacionDocenteService cD;

    @PostMapping
    public void registrar(@RequestBody CalificacionDocenteDTO dto) {
        ModelMapper m = new ModelMapper();
        CalificacionDocente c = m.map(dto, CalificacionDocente.class);
        cD.insert(c);

    }
    @GetMapping
    public List<CalificacionDocenteDTO> listar(){
        return cD.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,CalificacionDocenteDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){cD.delete(id);}

    @PutMapping
    public void modificar(@RequestBody CalificacionDocenteDTO dto){
        ModelMapper m=new ModelMapper();
        CalificacionDocente c=m.map(dto,CalificacionDocente.class);
        cD.insert(c);
    }

    @GetMapping("/{id}")
    public CalificacionDocenteDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        CalificacionDocenteDTO dto = m.map(cD.listId(id), CalificacionDocenteDTO.class);
        return dto;
    }

    @GetMapping("cantidadCalificaciones")
    public List<AlumnoCalificacionDocenteDTO> cantidadCalificacionesPorProfesor(){
        List<String[]> lista=cD.quantyCalificationByTeacher();
        List<AlumnoCalificacionDocenteDTO>listaDTO=new ArrayList<>();
        for(String[] data: lista){
            AlumnoCalificacionDocenteDTO dto=new AlumnoCalificacionDocenteDTO();
            dto.setNameProfesor(data[0]);
            dto.setQuantityCalifications(Integer.parseInt(data[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }

}
