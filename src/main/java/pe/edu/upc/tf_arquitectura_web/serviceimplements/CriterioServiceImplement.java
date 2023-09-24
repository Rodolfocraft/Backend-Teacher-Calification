package pe.edu.upc.tf_arquitectura_web.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tf_arquitectura_web.entities.Criterio;
import pe.edu.upc.tf_arquitectura_web.repositories.ICriterioRepository;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.ICriterioService;

import java.util.List;

@Service
public class CriterioServiceImplement implements ICriterioService {
    @Autowired
    private ICriterioRepository pR;
    @Override
    public void insert(Criterio criterio){pR.save(criterio);}

    @Override
    public List<Criterio>list(){return pR.findAll();}
    @Override
    public void delete(int idCriterio){pR.deleteById(idCriterio);}

    @Override
    public Criterio listId(int idCriterio) {
        return pR.findById(idCriterio).orElse(new Criterio());
    }


}
