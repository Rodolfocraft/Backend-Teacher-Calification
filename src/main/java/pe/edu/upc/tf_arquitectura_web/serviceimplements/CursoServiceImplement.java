package pe.edu.upc.tf_arquitectura_web.serviceimplements;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tf_arquitectura_web.entities.Curso;
import pe.edu.upc.tf_arquitectura_web.repositories.ICursoRepository;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.ICursoService;

import java.util.List;

@Service
public class CursoServiceImplement implements ICursoService {
    @Autowired
    private ICursoRepository pR;
    @Override
    public void insert(Curso curso){pR.save(curso);}
    @Override
    public List<Curso>list(){return pR.findAll();}
    @Override
    public void delete(int idCurso){pR.deleteById(idCurso);}

    @Override
    public Curso listId(int idCurso) {
        return pR.findById(idCurso).orElse(new Curso());
    }

    @Override
    public List<String[]> cantidadDeCursosPorUniversidad() {
        return pR.cantidadDeCursosPorUniversidad();
    }


}
