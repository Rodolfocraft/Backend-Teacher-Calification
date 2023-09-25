package pe.edu.upc.tf_arquitectura_web.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tf_arquitectura_web.entities.Universidad;
import pe.edu.upc.tf_arquitectura_web.entities.Usuarios;
import pe.edu.upc.tf_arquitectura_web.repositories.IUsuariosRepository;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.IUsuariosService;

import java.util.List;

@Service
public class UsuariosServiceImplement implements IUsuariosService {
    @Autowired
    private IUsuariosRepository pR;

    @Override
    public void insert(Usuarios usuarios) {pR.save(usuarios);}
    @Override
    public List<Usuarios> list(){return pR.findAll();}

    @Override
    public void delete(int idUsuario) {pR.deleteById(idUsuario);}

    @Override
    public Usuarios listId(int id) {
        return pR.findById(id).orElse(new Usuarios());
    }

    public List<String[]> ordensegunfechanacimiento(){return pR.ordensegunfechanacimiento();}
}
