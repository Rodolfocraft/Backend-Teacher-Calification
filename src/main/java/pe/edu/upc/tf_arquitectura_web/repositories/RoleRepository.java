package pe.edu.upc.tf_arquitectura_web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.tf_arquitectura_web.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
