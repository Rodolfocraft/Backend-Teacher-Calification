package pe.edu.upc.tf_arquitectura_web.entities;

import javax.persistence.*;
import java.time.LocalDate;

//crud-calificacion-docente
@Entity
@Table(name = "calificacion")
public class CalificacionDocente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "valoracion", nullable = false)
    private int valoracion;

    @Column(name = "recomendacion", nullable = false)
    private int recomendacion;

    @Column(name = "fechapublicacion", nullable = false)
    private LocalDate fechapublicacion;

    @ManyToOne
    @JoinColumn(name = "idProfesores")
    private Profesores profesores;

    @ManyToOne
    @JoinColumn(name = "idCurso")
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "idCarrerasProfesionales")
    private CarrerasProfesionales carrerasProfesionales;

    @ManyToOne
    @JoinColumn(name = "idUniversidad")
    private Universidad universidad;


    @ManyToOne
    @JoinColumn(name = "idAlumno")
    private Alumno alumno;

    @ManyToOne
    @JoinColumn(name = "idAdministrador")
    private Administrador administrador;

    //Hola :D


    public CalificacionDocente() {
    }

    public CalificacionDocente(int id, int valoracion, int recomendacion, LocalDate fechapublicacion, Profesores profesores, Curso curso, CarrerasProfesionales carrerasProfesionales, Universidad universidad, Alumno alumno, Administrador administrador) {
        this.id = id;
        this.valoracion = valoracion;
        this.recomendacion = recomendacion;
        this.fechapublicacion = fechapublicacion;
        this.profesores = profesores;
        this.curso = curso;
        this.carrerasProfesionales = carrerasProfesionales;
        this.universidad = universidad;
        this.alumno = alumno;
        this.administrador = administrador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public int getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(int recomendacion) {
        this.recomendacion = recomendacion;
    }

    public LocalDate getFechapublicacion() {
        return fechapublicacion;
    }

    public void setFechapublicacion(LocalDate fechapublicacion) {
        this.fechapublicacion = fechapublicacion;
    }

    public Profesores getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesores profesores) {
        this.profesores = profesores;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public CarrerasProfesionales getCarrerasProfesionales() {
        return carrerasProfesionales;
    }

    public void setCarrerasProfesionales(CarrerasProfesionales carrerasProfesionales) {
        this.carrerasProfesionales = carrerasProfesionales;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}
