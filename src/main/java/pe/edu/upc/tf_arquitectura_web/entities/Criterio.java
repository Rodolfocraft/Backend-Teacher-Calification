package pe.edu.upc.tf_arquitectura_web.entities;

import javax.persistence.*;

@Entity
@Table(name = "Criterio")
public class Criterio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "codCriterio",length = 100, nullable = false)
    private String codCriterio;
    @Column(name = "nombreCriterio",length = 100,nullable = false)
    private String nombreCriterio;
    @Column(name = "puntuacionCriterio", nullable = false)
    private int puntuacionCriterio;
    @Column(name = "idCalificacionDocente",nullable = false)
    private int idCalificacionDocente;

    @ManyToOne
    @JoinColumn(name = "CalificacionDocente")
    private CalificacionDocente calificacionDocente;

    public Criterio() {
    }

    public Criterio(int id, String codCriterio, String nombreCriterio, int puntuacionCriterio, int idCalificacionDocente, CalificacionDocente calificacionDocente) {
        this.id = id;
        this.codCriterio = codCriterio;
        this.nombreCriterio = nombreCriterio;
        this.puntuacionCriterio = puntuacionCriterio;
        this.idCalificacionDocente = idCalificacionDocente;
        this.calificacionDocente = calificacionDocente;
    }

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
