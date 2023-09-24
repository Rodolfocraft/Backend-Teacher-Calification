package pe.edu.upc.tf_arquitectura_web.serviceinterfaces;

import pe.edu.upc.tf_arquitectura_web.entities.Universidad;


import java.util.List;

public interface IUniversidadService {
    public void insert(Universidad universidad);
    public List<Universidad> list();

    public void delete(int idUniversidad);
    public Universidad listId(int idUniversidad);
}
