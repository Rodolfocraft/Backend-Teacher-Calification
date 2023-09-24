package pe.edu.upc.tf_arquitectura_web.serviceinterfaces;

import java.util.List;
import pe.edu.upc.tf_arquitectura_web.entities.Criterio;
public interface ICriterioService {
    public void insert(Criterio criterio);
    public List<Criterio> list();
    public void delete(int idCriterio);
    public Criterio listId(int idCriterio);
}
