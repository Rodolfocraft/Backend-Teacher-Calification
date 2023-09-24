package pe.edu.upc.tf_arquitectura_web.serviceinterfaces;
import pe.edu.upc.tf_arquitectura_web.entities.Curso;
import java.util.List;
public interface ICursoService {
    public void insert (Curso curso);
    public List<Curso> list();
    public void delete(int idCurso);
    public Curso listId(int idCurso);

    public List<String[]> cantidadDeCursosPorUniversidad();
}
