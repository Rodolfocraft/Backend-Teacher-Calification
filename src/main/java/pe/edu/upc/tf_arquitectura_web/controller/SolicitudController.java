package pe.edu.upc.tf_arquitectura_web.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tf_arquitectura_web.dtos.SolicitudDTO;
import pe.edu.upc.tf_arquitectura_web.dtos.StudentsDTO;
import pe.edu.upc.tf_arquitectura_web.entities.Solicitud;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.ISolicitudService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/solicitud")
public class SolicitudController {
    @Autowired
    private ISolicitudService solS;

    @PostMapping
    public void registrar(@RequestBody SolicitudDTO dto) {
        ModelMapper m = new ModelMapper();
        Solicitud sol = m.map(dto, Solicitud.class);
        solS.insert(sol);
    }

    @GetMapping
    public List<SolicitudDTO> listar() {
        return solS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, SolicitudDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        solS.delete(id);
    }

    @GetMapping("/{id}")
    public SolicitudDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        SolicitudDTO dto = m.map(solS.listId(id), SolicitudDTO.class);
        return dto;
    }
}
