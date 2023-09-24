package pe.edu.upc.tf_arquitectura_web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.tf_arquitectura_web.entities.CarrerasProfesionales;

@Repository
public interface ICarrerasProfesionalesRepository extends JpaRepository<CarrerasProfesionales, Integer>{

}
