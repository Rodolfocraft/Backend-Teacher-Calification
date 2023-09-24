package pe.edu.upc.tf_arquitectura_web.serviceinterfaces;

import pe.edu.upc.tf_arquitectura_web.entities.Administrador;

import java.util.List;

public interface IAdministradorService {
    public void insert(Administrador administrador);
    public List<Administrador> list();
    public void delete(int idAdministrador);
    public Administrador listId(int idAdministrador);
}
