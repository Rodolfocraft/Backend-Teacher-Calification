package pe.edu.upc.tf_arquitectura_web.dtos;

import pe.edu.upc.tf_arquitectura_web.entities.CalificacionDocente;

public class CarrerasProfesionalesDTO {
    private int id;
    private String codCarreraProfesional;
    private String nombreCarreraProfesional;
    private CalificacionDocente calificacionDocente;

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
