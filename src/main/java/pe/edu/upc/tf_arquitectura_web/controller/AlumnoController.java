package pe.edu.upc.tf_arquitectura_web.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tf_arquitectura_web.dtos.AlumnoDTO;
import pe.edu.upc.tf_arquitectura_web.dtos.StudentsDTO;
import pe.edu.upc.tf_arquitectura_web.entities.Alumno;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.IAlumnoService;
import pe.edu.upc.tf_arquitectura_web.repositories.IAlumnoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @Autowired
    private IAlumnoService aS;

    @PostMapping
    public void registrar(@RequestBody AlumnoDTO dto) {
        ModelMapper m = new ModelMapper();
        Alumno a = m.map(dto,Alumno.class);
        aS.insert(a);
    }
    @PutMapping
    public void modificar(@RequestBody AlumnoDTO dto){
        ModelMapper m=new ModelMapper();
        Alumno a = m.map(dto,Alumno.class);
        aS.insert(a);
    }

    @GetMapping
    //@PreAuthorize("hasAuthority('ADMIN')")
    public List<AlumnoDTO> listar() {
        return aS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, AlumnoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        aS.delete(id);
    }

    @GetMapping("/{id}")
    public AlumnoDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        AlumnoDTO dto = m.map(aS.listId(id), AlumnoDTO.class);
        return dto;
    }
    @GetMapping("/cantidaddealumnos")
    public List<StudentsDTO> cantidadDeestudiantesporsucodigo() {
        List<String[]> lista = aS.cantidadDeestudiantesporsucodigo();
        List<StudentsDTO> listaDTO = new ArrayList<>();
        for (String[] data : lista) {
            StudentsDTO dto = new StudentsDTO();
            dto.setCarreraprofesional(data[0]);
            dto.setContadoralumnos(Integer.parseInt(data[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
