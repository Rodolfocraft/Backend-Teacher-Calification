package pe.edu.upc.tf_arquitectura_web.serviceinterfaces;

import pe.edu.upc.tf_arquitectura_web.entities.Usuarios;

import java.util.List;

public interface IUsuariosService {
    public void insert(Usuarios usuarios);
    public List<Usuarios> list();
    public void delete(int idUsuarios);
    public Usuarios listId(int id);
    public List<String[]> ordensegunfechanacimiento();
}
