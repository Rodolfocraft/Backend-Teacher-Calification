package pe.edu.upc.tf_arquitectura_web.serviceinterfaces;

import pe.edu.upc.tf_arquitectura_web.entities.Profesores;

import java.util.List;

public interface IProfesoresService {
    public void insert(Profesores profesores);
    public List<Profesores> list();
    public void delete(int idProfesores);
    public Profesores listId(int idProfesores);

    public List<String[]> cantidadDeProfesoresPorUniversidad();
 
}
