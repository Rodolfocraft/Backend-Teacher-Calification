package pe.edu.upc.tf_arquitectura_web.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.tf_arquitectura_web.dtos.UsuariosDTO;
import pe.edu.upc.tf_arquitectura_web.entities.Usuarios;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.IUsuariosService;
import pe.edu.upc.tf_arquitectura_web.dtos.OrdenUsuariosDTO;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    @Autowired
    private IUsuariosService pS;

    @PostMapping
    public void registrar(@RequestBody UsuariosDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuarios p = m.map(dto, Usuarios.class);
        pS.insert(p);

    }
    @PutMapping
    public void modificar(@RequestBody UsuariosDTO dto) {
        ModelMapper m = new ModelMapper();
        Usuarios p = m.map(dto, Usuarios.class);
        pS.insert(p);

    }
    @GetMapping
    public List<UsuariosDTO>listar(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x,UsuariosDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){pS.delete(id);}

    @GetMapping("/{id}")
    public UsuariosDTO listId(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        UsuariosDTO dto = m.map(pS.listId(id), UsuariosDTO.class);
        return dto;
    }
    @GetMapping("/cantidadporgenero")
    public List<OrdenUsuariosDTO> ordensegunfechanacimiento(){
        List<String[]> lista=pS.ordensegunfechanacimiento();
        List<OrdenUsuariosDTO> listaDTO=new ArrayList<>();
        for(String[] data:lista){
            OrdenUsuariosDTO dto=new OrdenUsuariosDTO();
            dto.setGenero(data[0]);
            dto.setContadorusuarios(Integer.parseInt(data[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}
