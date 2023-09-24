package pe.edu.upc.tf_arquitectura_web.serviceimplements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tf_arquitectura_web.entities.CarrerasProfesionales;
import pe.edu.upc.tf_arquitectura_web.repositories.ICarrerasProfesionalesRepository;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.ICarrerasProfesionalesService;
import java.util.List;
@Service
public class CarrerasProfesionalesServiceImplement implements ICarrerasProfesionalesService{
    @Autowired
    private ICarrerasProfesionalesRepository pR;

    @Override
    public void insert(CarrerasProfesionales carrerasProfesionales) {pR.save(carrerasProfesionales);}
    @Override
    public List<CarrerasProfesionales> list(){return pR.findAll();}

    @Override
    public void delete(int idCarrerasProfesionales) {pR.deleteById(idCarrerasProfesionales);}

    @Override
    public CarrerasProfesionales listId(int idCarrerasProfesionales) {
        return pR.findById(idCarrerasProfesionales).orElse(new CarrerasProfesionales());
    }


}
