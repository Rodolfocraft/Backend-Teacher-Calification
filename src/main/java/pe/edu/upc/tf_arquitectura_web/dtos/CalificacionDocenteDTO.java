package pe.edu.upc.tf_arquitectura_web.dtos;

import pe.edu.upc.tf_arquitectura_web.entities.Usuarios;


public class CalificacionDocenteDTO {
    private int id;
    private String codCalificacionDocente;
    private String codAlumno;
    private int valoracion;
    private String codUniversidad;
    private String codProfesor;
    private String codCurso;
    private String codCarrerasProfesionales;
    private int recomendacion;
    private Usuarios usuarios;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodCalificacionDocente() {
        return codCalificacionDocente;
    }

    public void setCodCalificacionDocente(String codCalificacionDocente) {
        this.codCalificacionDocente = codCalificacionDocente;
    }

    public String getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(String codAlumno) {
        this.codAlumno = codAlumno;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public String getCodUniversidad() {
        return codUniversidad;
    }

    public void setCodUniversidad(String codUniversidad) {
        this.codUniversidad = codUniversidad;
    }

    public String getCodProfesor() {
        return codProfesor;
    }

    public void setCodProfesor(String codProfesor) {
        this.codProfesor = codProfesor;
    }

    public String getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }

    public String getCodCarrerasProfesionales() {
        return codCarrerasProfesionales;
    }

    public void setCodCarrerasProfesionales(String codCarrerasProfesionales) {
        this.codCarrerasProfesionales = codCarrerasProfesionales;
    }

    public int getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(int recomendacion) {
        this.recomendacion = recomendacion;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
}
