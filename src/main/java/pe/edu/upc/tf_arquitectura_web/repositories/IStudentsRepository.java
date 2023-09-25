package pe.edu.upc.tf_arquitectura_web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tf_arquitectura_web.entities.Students;

import java.util.List;

@Repository
public interface IStudentsRepository extends JpaRepository<Students,Integer> {
    @Query(value = "select s.cod_students, count (c.cod_curso)\n" +
            " from students s inner join curso c\n" +
            " on s.id = c.id\n" +
            " group by s.cod_students",nativeQuery = true)

    public List<String[]> cantidadDeestudiantesporsucodigo();
}
