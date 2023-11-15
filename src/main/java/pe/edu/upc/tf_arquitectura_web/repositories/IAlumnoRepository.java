package pe.edu.upc.tf_arquitectura_web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tf_arquitectura_web.entities.Alumno;

import java.util.List;

@Repository
public interface IAlumnoRepository extends JpaRepository<Alumno,Integer> {

    @Query(value = "select c.nombre_carrera_profesional, count (a.id)\n" +
            "from alumno a inner join carreras_profesionales c\n" +
            "on a.id_carreras_profesionales = c.id\n" +
            "group by c.nombre_carrera_profesional",nativeQuery = true)
    public List<String[]> cantidadDeestudiantesporsucodigo();


}
