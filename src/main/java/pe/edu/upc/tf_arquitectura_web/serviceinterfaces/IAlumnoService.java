package pe.edu.upc.tf_arquitectura_web.serviceinterfaces;

import pe.edu.upc.tf_arquitectura_web.entities.Alumno;

import java.util.List;

public interface IAlumnoService {

    public void insert(Alumno alumno);
    public List<Alumno> list();
    public void delete(int idAlumno);
    public Alumno listId(int idAlumno);

    public List<String[]> cantidadDeestudiantesporsucodigo();
}
