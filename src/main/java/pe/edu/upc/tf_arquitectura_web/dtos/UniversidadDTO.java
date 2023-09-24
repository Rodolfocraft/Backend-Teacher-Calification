package pe.edu.upc.tf_arquitectura_web.dtos;

import pe.edu.upc.tf_arquitectura_web.entities.CalificacionDocente;

public class UniversidadDTO {

    private int id;
    private String codUniversidad;
    private String nombreUniversidad;
    private CalificacionDocente calificacionDocente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodUniversidad() {
        return codUniversidad;
    }

    public void setCodUniversidad(String codUniversidad) {
        this.codUniversidad = codUniversidad;
    }

    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public CalificacionDocente getCalificacionDocente() {
        return calificacionDocente;
    }

    public void setCalificacionDocente(CalificacionDocente calificacionDocente) {
        this.calificacionDocente = calificacionDocente;
    }
}
