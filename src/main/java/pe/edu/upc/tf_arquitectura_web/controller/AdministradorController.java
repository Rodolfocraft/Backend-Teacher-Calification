package pe.edu.upc.tf_arquitectura_web.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tf_arquitectura_web.dtos.AlumnoDTO;
import pe.edu.upc.tf_arquitectura_web.entities.Administrador;
import pe.edu.upc.tf_arquitectura_web.dtos.AdministradorDTO;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.IAdministradorService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/administrador")
public class AdministradorController {
    @Autowired
    private IAdministradorService ps;

    @PostMapping
    public void registrar(@RequestBody AdministradorDTO dto){
        ModelMapper m=new ModelMapper();
        Administrador a=m.map(dto,Administrador.class);
        ps.insert(a);
    }

    @GetMapping
    public List<AdministradorDTO>listar(){
        return ps.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,AdministradorDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void modificar(@RequestBody AdministradorDTO dto){
        ModelMapper m=new ModelMapper();
        Administrador a=m.map(dto,Administrador.class);
        ps.insert(a);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){ps.delete(id);}

    @GetMapping("/{id}")
    public AdministradorDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        AdministradorDTO dto = m.map(ps.listId(id), AdministradorDTO.class);
        return dto;
    }
}
