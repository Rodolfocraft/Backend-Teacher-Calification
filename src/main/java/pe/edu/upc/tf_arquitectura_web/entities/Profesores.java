package pe.edu.upc.tf_arquitectura_web.entities;
import javax.persistence.*;
import java.time.LocalDate;
//Tabla Profesores
@Entity
@Table(name = "Profesores")
public class Profesores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "codProfesor",length = 45,nullable = false)
    private String codProfesor;
    @Column(name = "nombre",length = 45,nullable = false)
    private String nombre;
    @Column(name = "apellido",length = 45,nullable = false)
    private String apellido;

    @ManyToOne
    @JoinColumn(name = "CalificacionDocente")
    private CalificacionDocente calificacionDocente;

    public Profesores() {
    }

    public Profesores(int id, String codProfesor, String nombre, String apellido, CalificacionDocente calificacionDocente) {
        this.id = id;
        this.codProfesor = codProfesor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.calificacionDocente = calificacionDocente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodProfesor() {
        return codProfesor;
    }

    public void setCodProfesor(String codProfesor) {
        this.codProfesor = codProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public CalificacionDocente getCalificacionDocente() {
        return calificacionDocente;
    }

    public void setCalificacionDocente(CalificacionDocente calificacionDocente) {
        this.calificacionDocente = calificacionDocente;
    }
}
