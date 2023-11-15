package pe.edu.upc.tf_arquitectura_web.controller;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tf_arquitectura_web.dtos.AlumnoDTO;
import pe.edu.upc.tf_arquitectura_web.dtos.UniversidadDTO;
import pe.edu.upc.tf_arquitectura_web.entities.Universidad;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.IUniversidadService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Universidad")
public class UniversidadController {
    @Autowired
    private IUniversidadService pS;
    @PostMapping
    public void registrar(@RequestBody UniversidadDTO dto) {
        ModelMapper m = new ModelMapper();
        Universidad p = m.map(dto, Universidad.class);
        pS.insert(p);

    }
    @PutMapping
    public void modificar(@RequestBody UniversidadDTO dto) {
        ModelMapper m = new ModelMapper();
        Universidad p = m.map(dto, Universidad.class);
        pS.insert(p);

    }
    @GetMapping
    public List<UniversidadDTO>listar(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,UniversidadDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){pS.delete(id);}


    @GetMapping("/{id}")
    public UniversidadDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        UniversidadDTO dto = m.map(pS.listId(id), UniversidadDTO.class);
        return dto;
    }

}
