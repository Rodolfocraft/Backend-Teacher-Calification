package pe.edu.upc.tf_arquitectura_web.serviceinterfaces;

import pe.edu.upc.tf_arquitectura_web.entities.Students;

import java.util.List;

public interface IStudentsService {
    public void insert(Students students);
    public List<Students> list();
    public void delete(int idStudents);
    public Students listId(int idStudents);

    public List<String[]> cantidadDeestudiantesporsucodigo();
}
