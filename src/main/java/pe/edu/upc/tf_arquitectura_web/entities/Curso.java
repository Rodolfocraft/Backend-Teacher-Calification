package pe.edu.upc.tf_arquitectura_web.entities;

import javax.persistence.*;
//Crud Curso
@Entity
@Table(name = "Curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "codCurso", length = 45, nullable = false)
    private String codCurso;
    @Column(name = "nombreCurso", length = 80, nullable = false)
    private String nombreCurso;

    @ManyToOne
    @JoinColumn(name = "CalificacionDocente")
    private CalificacionDocente calificacionDocente;

    public Curso() {
    }

    public Curso(int id, String codCurso, String nombreCurso, CalificacionDocente calificacionDocente) {
        this.id = id;
        this.codCurso = codCurso;
        this.nombreCurso = nombreCurso;
        this.calificacionDocente = calificacionDocente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public CalificacionDocente getCalificacionDocente() {
        return calificacionDocente;
    }

    public void setCalificacionDocente(CalificacionDocente calificacionDocente) {
        this.calificacionDocente = calificacionDocente;
    }
}
