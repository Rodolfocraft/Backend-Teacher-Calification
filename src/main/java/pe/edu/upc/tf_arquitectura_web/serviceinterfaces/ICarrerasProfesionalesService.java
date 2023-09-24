package pe.edu.upc.tf_arquitectura_web.serviceinterfaces;
import pe.edu.upc.tf_arquitectura_web.entities.CarrerasProfesionales;
import java.util.List;
public interface ICarrerasProfesionalesService {
    public  void insert(CarrerasProfesionales carrerasProfesionales);
    public List<CarrerasProfesionales> list();
    public void  delete(int idCarrerasProfesionales);
    public CarrerasProfesionales listId(int idCarrerasProfesionales);
}
