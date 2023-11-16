package pe.edu.upc.tf_arquitectura_web.dtos;

import javax.persistence.Column;

public class CursoDTO {
    private int id;
    private String codCurso;
    private String nombreCurso;

    private int creditos;

    private int semestre;

    private int horasdictadas;

    private String modalidad;


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

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getHorasdictadas() {
        return horasdictadas;
    }

    public void setHorasdictadas(int horasdictadas) {
        this.horasdictadas = horasdictadas;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
}
