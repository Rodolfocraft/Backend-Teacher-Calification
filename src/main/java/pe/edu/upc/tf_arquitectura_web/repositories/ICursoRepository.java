package pe.edu.upc.tf_arquitectura_web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tf_arquitectura_web.entities.Curso;

import java.util.List;

@Repository
public interface ICursoRepository extends JpaRepository<Curso, Integer> {

    @Query(value = "select u.nombre_universidad, count (c.id_curso)\n" +
            " from universidad u inner join curso c\n" +
            " on u.id = c.id\n" +
            " group by u.nombre_universidad",nativeQuery = true)

    public List<String[]> cantidadDeCursosPorUniversidad();

}
