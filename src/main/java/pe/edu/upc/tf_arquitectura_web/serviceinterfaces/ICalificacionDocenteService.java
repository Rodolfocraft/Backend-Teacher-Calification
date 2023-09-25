package pe.edu.upc.tf_arquitectura_web.serviceinterfaces;

import pe.edu.upc.tf_arquitectura_web.entities.CalificacionDocente;

import java.util.List;

public interface ICalificacionDocenteService {
    public void insert(CalificacionDocente calificacionDocente);
    public List<CalificacionDocente> list();
    public void delete(int idCalificacionDocente);
    public CalificacionDocente listId(int idCalificacionDocente);

    public List<String[]> quantyCalificationByTeacher();
}
