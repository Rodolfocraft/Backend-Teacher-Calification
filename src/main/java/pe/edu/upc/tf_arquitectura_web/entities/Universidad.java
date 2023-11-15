package pe.edu.upc.tf_arquitectura_web.entities;


import javax.persistence.*;
import java.time.LocalDate;

//import java.time.LocalDate;
//University
@Entity
@Table(name = "Universidad")
public class Universidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "codUniversidad", length = 45, nullable = false)
    private String codUniversidad;
    @Column(name = "nombreUniversidad", length = 45, nullable = false)
    private String nombreUniversidad;

    @Column(name = "sede", length = 45, nullable = false)
    private String sede;

    @Column(name = "descripcion", length = 45, nullable = false)
    private String descripcion;

    @Column(name = "fechafundacion", nullable = false)
    private LocalDate fechafundacion;

    @Column(name = "direccion", length = 45, nullable = false)
    private String direccion;

    @Column(name = "tipo", length = 45, nullable = false)
    private String tipo;


    public Universidad() {
    }

    public Universidad(int id, String codUniversidad, String nombreUniversidad, String sede, String descripcion, LocalDate fechafundacion, String direccion, String tipo) {
        this.id = id;
        this.codUniversidad = codUniversidad;
        this.nombreUniversidad = nombreUniversidad;
        this.sede = sede;
        this.descripcion = descripcion;
        this.fechafundacion = fechafundacion;
        this.direccion = direccion;
        this.tipo = tipo;
    }

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
