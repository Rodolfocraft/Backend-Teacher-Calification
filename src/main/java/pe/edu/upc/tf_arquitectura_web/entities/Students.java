package pe.edu.upc.tf_arquitectura_web.entities;
//Students
import javax.persistence.*;

@Entity
@Table(name = "Students")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "idUser", length = 60, nullable = false)
    private int idUser;
    @Column(name = "codStudents", length = 60, nullable = false)
    private String codStudents;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuarios usuarios;

    public Students() {
    }

    public Students(int id, int idUser, String codStudents, Usuarios usuarios) {
        this.id = id;
        this.idUser = idUser;
        this.codStudents = codStudents;
        this.usuarios = usuarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getCodStudents() {
        return codStudents;
    }

    public void setCodStudents(String codStudents) {
        this.codStudents = codStudents;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
}
