package pe.edu.upc.tf_arquitectura_web.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tf_arquitectura_web.entities.CalificacionDocente;
import pe.edu.upc.tf_arquitectura_web.entities.Curso;
import pe.edu.upc.tf_arquitectura_web.repositories.ICalificacionDocenteRepository;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.ICalificacionDocenteService;

import java.util.List;

@Service
public class CalificacionDocentesServiceImplement implements ICalificacionDocenteService {

    @Autowired
    private ICalificacionDocenteRepository cR;


    @Override
    public void insert(CalificacionDocente calificacionDocente) {
        cR.save(calificacionDocente);
    }

    @Override
    public List<CalificacionDocente> list() {
        return cR.findAll();
    }

    @Override
    public void delete(int idCalificacionDocente) {
        cR.deleteById(idCalificacionDocente);
    }

    @Override
    public CalificacionDocente listId(int idCalificacionDocente) {
        return cR.findById(idCalificacionDocente).orElse(new CalificacionDocente());
    }

    @Override
    public List<String[]> quantyCalificationByTeacher() {
        return cR.quantyCalificationByTeacher();
    }
}
