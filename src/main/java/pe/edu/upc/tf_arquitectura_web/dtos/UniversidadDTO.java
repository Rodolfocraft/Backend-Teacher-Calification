package pe.edu.upc.tf_arquitectura_web.dtos;

import javax.persistence.Column;
import java.time.LocalDate;

public class UniversidadDTO {

    private int id;
    private String codUniversidad;
    private String nombreUniversidad;

    private String sede;

    private String descripcion;

    private LocalDate fechafundacion;

    private String direccion;

    private String tipo;


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

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechafundacion() {
        return fechafundacion;
    }

    public void setFechafundacion(LocalDate fechafundacion) {
        this.fechafundacion = fechafundacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
