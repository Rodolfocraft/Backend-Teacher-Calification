package pe.edu.upc.tf_arquitectura_web.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tf_arquitectura_web.entities.Universidad;
import pe.edu.upc.tf_arquitectura_web.repositories.IUniversidadRepository;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.IUniversidadService;

import java.util.List;

@Service
public class UniversidadServiceImplement implements IUniversidadService{

    @Autowired
    private IUniversidadRepository aR;
    @Override
    public void insert(Universidad universidad) {
        aR.save(universidad);
    }

    @Override
    public List<Universidad> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idUniversidad) {
        aR.deleteById(idUniversidad);
    }

    @Override
    public Universidad listId(int idUniversidad) {
        return aR.findById(idUniversidad).orElse(new Universidad());
    }


}
