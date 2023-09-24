package pe.edu.upc.tf_arquitectura_web.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.tf_arquitectura_web.entities.Students;
import pe.edu.upc.tf_arquitectura_web.repositories.IStudentsRepository;
import pe.edu.upc.tf_arquitectura_web.serviceinterfaces.IStudentsService;

import java.util.List;

@Service
public class StudentsServiceImplement implements IStudentsService {
    @Autowired
    private IStudentsRepository pR;

    @Override
    public void insert(Students students) {
        pR.save(students);
    }

    @Override
    public List<Students> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idStudents) {
        pR.deleteById(idStudents);
    }

    @Override
    public Students listId(int idStudents) {
        return pR.findById(idStudents).orElse(new Students());
    }


}
