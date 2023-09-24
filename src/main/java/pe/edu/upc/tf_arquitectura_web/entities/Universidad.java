package pe.edu.upc.tf_arquitectura_web.entities;


import javax.persistence.*;
//import java.time.LocalDate;

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


    @ManyToOne
    @JoinColumn(name = "CalificacionDocente")
    private CalificacionDocente calificacionDocente;

    public Universidad() {
    }

    public Universidad(int id, String codUniversidad, String nombreUniversidad, CalificacionDocente calificacionDocente) {
        this.id = id;
        this.codUniversidad = codUniversidad;
        this.nombreUniversidad = nombreUniversidad;
        this.calificacionDocente = calificacionDocente;
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

    public CalificacionDocente getCalificacionDocente() {
        return calificacionDocente;
    }

    public void setCalificacionDocente(CalificacionDocente calificacionDocente) {
        this.calificacionDocente = calificacionDocente;
    }
}
