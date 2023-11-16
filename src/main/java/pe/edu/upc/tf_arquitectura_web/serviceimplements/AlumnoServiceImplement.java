package pe.edu.upc.tf_arquitectura_web.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tf_arquitectura_web.entities.Alumno;
import pe.edu.upc.tf_arquitectura_web.repositories.IAlumnoRepository;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.IAlumnoService;

import java.util.List;

@Service
public class AlumnoServiceImplement implements IAlumnoService {

    @Autowired
    private IAlumnoRepository aR;


    @Override
    public void insert(Alumno alumno) {
        aR.save(alumno);
    }

    @Override
    public List<Alumno> list() {
        return aR.findAll();
    }

    @Override
    public void delete(int idAlumno) {
        aR.deleteById(idAlumno);
    }

    @Override
    public Alumno listId(int idAlumno) {
        return aR.findById(idAlumno).orElse(new Alumno());
    }

    @Override
    public List<String[]> cantidadDeestudiantesporsucodigo() {
        return aR.cantidadDeestudiantesporsucodigo();
    }
}
