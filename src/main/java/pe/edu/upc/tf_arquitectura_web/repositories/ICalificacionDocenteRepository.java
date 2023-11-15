package pe.edu.upc.tf_arquitectura_web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tf_arquitectura_web.entities.CalificacionDocente;

import java.util.List;

@Repository
public interface ICalificacionDocenteRepository extends JpaRepository<CalificacionDocente,Integer> {
    @Query(value = "select p.nombre, count (c.id_profesores) as \"Numero de calificaciones\"\n" +
            "from profesores p inner join calificacion c\n" +
            "on p.id = c.id_profesores\n" +
            "group by p.nombre", nativeQuery = true)

    public List<String[]> quantyCalificationByTeacher();
}
