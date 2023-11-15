package pe.edu.upc.tf_arquitectura_web.dtos;

import pe.edu.upc.tf_arquitectura_web.entities.*;

import java.time.LocalDate;

public class CalificacionDocenteDTO {
    private int id;

    private int valoracion;

    private int recomendacion;

    private LocalDate fechapublicacion;

    private Profesores profesores;

    private Curso curso;

    private CarrerasProfesionales carrerasProfesionales;

    private Universidad universidad;

    private Alumno alumno;

    private Administrador administrador;


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
