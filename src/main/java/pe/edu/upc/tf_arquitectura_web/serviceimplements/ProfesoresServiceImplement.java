package pe.edu.upc.tf_arquitectura_web.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tf_arquitectura_web.entities.Profesores;
import pe.edu.upc.tf_arquitectura_web.repositories.IProfesoresRepository;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.IProfesoresService;

import java.util.List;

@Service
public class ProfesoresServiceImplement implements IProfesoresService {
    @Autowired
    private IProfesoresRepository pR;

    @Override
    public void insert(Profesores profesores) {pR.save(profesores);}
    @Override
    public List<Profesores> list(){return pR.findAll();}

    @Override
    public void delete(int idProfesores) {pR.deleteById(idProfesores);}

    @Override
    public Profesores listId(int idProfesores) {
        return pR.findById(idProfesores).orElse(new Profesores());
    }

    public List<String[]> cantidadDeProfesoresPorUniversidad() {
        return pR.cantidadDeProfesoresPorUniversidad();
    }
}
