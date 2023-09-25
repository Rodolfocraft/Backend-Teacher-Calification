package pe.edu.upc.tf_arquitectura_web.dtos;

import pe.edu.upc.tf_arquitectura_web.entities.CalificacionDocente;
import pe.edu.upc.tf_arquitectura_web.entities.Universidad;

public class ProfesoresDTO {
    private int id;
    private String codProfesor;
    private String nombre;
    private String apellido;
    private CalificacionDocente calificacionDocente;
    private Universidad universidad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodProfesor() {
        return codProfesor;
    }

    public void setCodProfesor(String codProfesor) {
        this.codProfesor = codProfesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public CalificacionDocente getCalificacionDocente() {
        return calificacionDocente;
    }

    public void setCalificacionDocente(CalificacionDocente calificacionDocente) {
        this.calificacionDocente = calificacionDocente;
    }
    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
}
