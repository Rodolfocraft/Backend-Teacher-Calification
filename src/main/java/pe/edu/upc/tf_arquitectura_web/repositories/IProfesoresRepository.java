package pe.edu.upc.tf_arquitectura_web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tf_arquitectura_web.entities.Profesores;

import java.util.List;
@Repository
public interface IProfesoresRepository extends JpaRepository<Profesores, Integer>{
    @Query(value = "select u.nombre_universidad, count (p.id)\n" +
            "from universidad u \n" +
            "inner join calificacion c on u.id=c.id_universidad\n" +
            "inner join profesores p on c.id_profesores=p.id\n" +
            "group by u.nombre_universidad",nativeQuery = true)
    public List<String[]> cantidadDeProfesoresPorUniversidad();
}
