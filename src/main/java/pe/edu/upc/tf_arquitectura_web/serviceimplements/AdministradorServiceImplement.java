package pe.edu.upc.tf_arquitectura_web.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tf_arquitectura_web.entities.Administrador;
import pe.edu.upc.tf_arquitectura_web.repositories.IAdministradorRepository;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.IAdministradorService;

import java.util.List;

@Service
public class AdministradorServiceImplement implements IAdministradorService {
    @Autowired
    private IAdministradorRepository pR;
    @Override
    public void insert(Administrador administrador) {pR.save(administrador);}
    @Override
    public List<Administrador>list(){return pR.findAll();}
    @Override
    public void delete(int idAdministrador){pR.deleteById(idAdministrador);}

    @Override
    public Administrador listId(int idAdministrador) {
        return pR.findById(idAdministrador).orElse(new Administrador());
    }


}
