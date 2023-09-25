package pe.edu.upc.tf_arquitectura_web.controller;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tf_arquitectura_web.dtos.CursoUniversidadDTO;
import pe.edu.upc.tf_arquitectura_web.dtos.ProfesorUniversidadDTO;
import pe.edu.upc.tf_arquitectura_web.dtos.ProfesoresDTO;
import pe.edu.upc.tf_arquitectura_web.entities.Profesores;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.IProfesoresService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/profesores")
public class ProfesoresController {
    @Autowired
    private IProfesoresService pS;

    @PostMapping
    public void registrar(@RequestBody ProfesoresDTO dto) {
        ModelMapper m = new ModelMapper();
        Profesores p = m.map(dto, Profesores.class);
        pS.insert(p);

    }

    @GetMapping
    public List<ProfesoresDTO>listar(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,ProfesoresDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){pS.delete(id);}

   
    @PutMapping
    public void modificar(@RequestBody ProfesoresDTO dto){
        ModelMapper m = new ModelMapper();
        Profesores p = m.map(dto,Profesores.class);
        pS.insert(p);
    }
    @GetMapping("/cantidadprofesores")
    @PreAuthorize("hasAuthority('USER')")
    public List<ProfesorUniversidadDTO> cantidadDeProfesoresPorUniversidad() {
        List<String[]> lista = pS.cantidadDeProfesoresPorUniversidad();
        List<ProfesorUniversidadDTO> listaDTO = new ArrayList<>();
        for (String[] data : lista) {
            ProfesorUniversidadDTO dto = new ProfesorUniversidadDTO();
            dto.setNombreUniversidad(data[0]);
            dto.setCantidadProfesores(Integer.parseInt(data[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
