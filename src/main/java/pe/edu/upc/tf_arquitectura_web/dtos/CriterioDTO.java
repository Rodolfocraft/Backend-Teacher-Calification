package pe.edu.upc.tf_arquitectura_web.dtos;

import pe.edu.upc.tf_arquitectura_web.entities.CalificacionDocente;

public class CriterioDTO {
    private int id;
    private String codCriterio;
    private String nombreCriterio;
    private int puntuacionCriterio;
    private int idCalificacionDocente;
    private CalificacionDocente calificacionDocente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodCriterio() {
        return codCriterio;
    }

    public void setCodCriterio(String codCriterio) {
        this.codCriterio = codCriterio;
    }

    public String getNombreCriterio() {
        return nombreCriterio;
    }

    public void setNombreCriterio(String nombreCriterio) {
        this.nombreCriterio = nombreCriterio;
    }

    public int getPuntuacionCriterio() {
        return puntuacionCriterio;
    }

    public void setPuntuacionCriterio(int puntuacionCriterio) {
        this.puntuacionCriterio = puntuacionCriterio;
    }

    public int getIdCalificacionDocente() {
        return idCalificacionDocente;
    }

    public void setIdCalificacionDocente(int idCalificacionDocente) {
        this.idCalificacionDocente = idCalificacionDocente;
    }

    public CalificacionDocente getCalificacionDocente() {
        return calificacionDocente;
    }

    public void setCalificacionDocente(CalificacionDocente calificacionDocente) {
        this.calificacionDocente = calificacionDocente;
    }
}
