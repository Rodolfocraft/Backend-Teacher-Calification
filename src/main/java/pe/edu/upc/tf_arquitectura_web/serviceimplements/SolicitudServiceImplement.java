package pe.edu.upc.tf_arquitectura_web.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tf_arquitectura_web.entities.Solicitud;
import pe.edu.upc.tf_arquitectura_web.repositories.ISolicitudRepository;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.ISolicitudService;

import java.util.List;

@Service
public class SolicitudServiceImplement implements ISolicitudService {
    @Autowired
    private ISolicitudRepository sR;

    @Override
    public void insert(Solicitud solicitud) {
        sR.save(solicitud);
    }

    @Override
    public List<Solicitud> list() {
        return sR.findAll();
    }

    @Override
    public void delete(int idSolicitud) {
        sR.deleteById(idSolicitud);
    }

    @Override
    public Solicitud listId(int idSolicitud) {
        return sR.findById(idSolicitud).orElse(new Solicitud());
    }


}
