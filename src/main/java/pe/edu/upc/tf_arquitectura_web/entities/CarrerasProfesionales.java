package pe.edu.upc.tf_arquitectura_web.entities;


import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "CarrerasProfesionales")
public class CarrerasProfesionales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "codCarreraProfesional",length = 10,nullable = false)
    private String codCarreraProfesional;
    @Column(name = "nombreCarreraProfesional",length = 100,nullable = false)
    private String nombreCarreraProfesional;

    @ManyToOne
    @JoinColumn(name = "CalificacionDocente")
    private CalificacionDocente calificacionDocente;

    public CarrerasProfesionales() {
    }

    public CarrerasProfesionales(int id, String codCarreraProfesional, String nombreCarreraProfesional, CalificacionDocente calificacionDocente) {
        this.id = id;
        this.codCarreraProfesional = codCarreraProfesional;
        this.nombreCarreraProfesional = nombreCarreraProfesional;
        this.calificacionDocente = calificacionDocente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodCarreraProfesional() {
        return codCarreraProfesional;
    }

    public void setCodCarreraProfesional(String codCarreraProfesional) {
        this.codCarreraProfesional = codCarreraProfesional;
    }

    public String getNombreCarreraProfesional() {
        return nombreCarreraProfesional;
    }

    public void setNombreCarreraProfesional(String nombreCarreraProfesional) {
        this.nombreCarreraProfesional = nombreCarreraProfesional;
    }

    public CalificacionDocente getCalificacionDocente() {
        return calificacionDocente;
    }

    public void setCalificacionDocente(CalificacionDocente calificacionDocente) {
        this.calificacionDocente = calificacionDocente;
    }
}
