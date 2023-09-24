package pe.edu.upc.tf_arquitectura_web.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tf_arquitectura_web.dtos.StudentsDTO;
import pe.edu.upc.tf_arquitectura_web.entities.Students;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.IStudentsService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private IStudentsService sS;

    @PostMapping
    public void registrar(@RequestBody StudentsDTO dto) {
        ModelMapper m = new ModelMapper();
        Students s = m.map(dto, Students.class);
        sS.insert(s);
    }

    @GetMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public List<StudentsDTO> listar() {
        return sS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, StudentsDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        sS.delete(id);
    }

    @GetMapping("/{id}")
    public StudentsDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        StudentsDTO dto = m.map(sS.listId(id), StudentsDTO.class);
        return dto;
    }
}
