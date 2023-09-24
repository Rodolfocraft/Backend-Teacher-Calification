package pe.edu.upc.tf_arquitectura_web.controller;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tf_arquitectura_web.dtos.StudentsDTO;
import pe.edu.upc.tf_arquitectura_web.entities.Criterio;
import pe.edu.upc.tf_arquitectura_web.dtos.CriterioDTO;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.ICriterioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/criterio")
public class CriterioController {
    @Autowired
    private ICriterioService ps;
    @PostMapping
    public void registrar(@RequestBody CriterioDTO dto){
        ModelMapper m=new ModelMapper();
        Criterio c=m.map(dto,Criterio.class);
        ps.insert(c);
    }
    @GetMapping
    public List<CriterioDTO>listar(){
        return ps.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,CriterioDTO.class);
        }).collect(Collectors.toList());
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){ps.delete(id);}


    @GetMapping("/{id}")
    public CriterioDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        CriterioDTO dto = m.map(ps.listId(id), CriterioDTO.class);
        return dto;
    }
}
