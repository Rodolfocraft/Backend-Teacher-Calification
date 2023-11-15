package pe.edu.upc.tf_arquitectura_web.dtos;


import javax.persistence.Column;

public class CarrerasProfesionalesDTO {
    private int id;
    private String codCarreraProfesional;
    private String nombreCarreraProfesional;
    private String tipo;
    private String facultad;
    private int ciclo;


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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }
}
