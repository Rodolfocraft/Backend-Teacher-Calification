package pe.edu.upc.tf_arquitectura_web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tf_arquitectura_web.entities.Curso;

import java.util.List;

// implementar querie contar universidad por curso

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Integer> {

    @Query(value = "select u.nombre_universidad, count (cu.id)\n" +
            "from universidad u \n" +
            "inner join calificacion c on u.id=c.id_universidad\n" +
            "inner join curso cu on c.id_curso=cu.id\n" +
            "group by u.nombre_universidad",nativeQuery = true)

    public List<String[]> cantidadDeCursosPorUniversidad();

}
