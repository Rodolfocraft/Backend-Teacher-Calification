package pe.edu.upc.tf_arquitectura_web.serviceinterfaces;

import pe.edu.upc.tf_arquitectura_web.entities.Solicitud;

import java.util.List;

public interface ISolicitudService {
    public void insert(Solicitud solicitud);
    public List<Solicitud> list();
    public void delete(int idSolicitud);
    public Solicitud listId(int idSolicitud);
}
