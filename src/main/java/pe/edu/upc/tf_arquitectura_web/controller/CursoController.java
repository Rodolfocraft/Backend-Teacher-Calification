package pe.edu.upc.tf_arquitectura_web.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tf_arquitectura_web.dtos.CursoDTO;
import pe.edu.upc.tf_arquitectura_web.dtos.CursoUniversidadDTO;
import pe.edu.upc.tf_arquitectura_web.dtos.ProfesoresDTO;
import pe.edu.upc.tf_arquitectura_web.entities.Curso;
import pe.edu.upc.tf_arquitectura_web.entities.Profesores;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.ICursoService;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/curso")
public class CursoController {
    @Autowired
    private ICursoService ps;
    @PostMapping
    public void registrar(@RequestBody CursoDTO dto){
        ModelMapper m=new ModelMapper();
        Curso c= m.map(dto, Curso.class);
        ps.insert(c);
    }
    @GetMapping
    public List<CursoDTO>listar(){
        return ps.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, CursoDTO.class);
        }).collect(Collectors.toList());
    }
    @PutMapping
    public void modificar(@RequestBody CursoDTO dto){
        ModelMapper m = new ModelMapper();
        Curso p = m.map(dto,Curso.class);
        ps.insert(p);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){ps.delete(id);}

    @GetMapping("/{id}")
    public CursoDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        CursoDTO dto = m.map(ps.listId(id), CursoDTO.class);
        return dto;
    }
    @GetMapping("/cantidadcursos")
    public List<CursoUniversidadDTO> cantidadCursosPorUniversidad() {
        List<String[]> lista = ps.cantidadDeCursosPorUniversidad();
        List<CursoUniversidadDTO> listaDTO = new ArrayList<>();
        for (String[] data : lista) {
            CursoUniversidadDTO dto = new CursoUniversidadDTO();
            dto.setNombreUniversidad(data[0]);
            dto.setCantidadCursos(Integer.parseInt(data[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
