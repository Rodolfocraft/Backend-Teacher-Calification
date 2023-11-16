package pe.edu.upc.tf_arquitectura_web.entities;
import javax.persistence.*;
import java.time.LocalDate;
//Tabla Profesores
@Entity
@Table(name = "Profesores")
public class Profesores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "codProfesor",length = 45,nullable = false)
    private String codProfesor;
    @Column(name = "nombre",length = 45,nullable = false)
    private String nombre;
    @Column(name = "apellido",length = 45,nullable = false)
    private String apellido;

    @Column(name = "fechanac", nullable = false)
    private LocalDate fechanac;

    @Column(name = "especialidad",length = 45,nullable = false)
    private String especialidad;

    @Column(name = "grado",length = 45,nullable = false)
    private String grado;

    @Column(name = "genero", length = 15, nullable = false)
    private String genero;

    @Column(name = "aniosexperiencia", nullable = false)
    private int aniosexperiencia;


    public Profesores() {
    }

    public Profesores(int id, String codProfesor, String nombre, String apellido, LocalDate fechanac, String especialidad, String grado, String genero, int aniosexperiencia) {
        this.id = id;
        this.codProfesor = codProfesor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanac = fechanac;
        this.especialidad = especialidad;
        this.grado = grado;
        this.genero = genero;
        this.aniosexperiencia = aniosexperiencia;
    }

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

    public LocalDate getFechanac() {
        return fechanac;
    }

    public void setFechanac(LocalDate fechanac) {
        this.fechanac = fechanac;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAniosexperiencia() {
        return aniosexperiencia;
    }

    public void setAniosexperiencia(int aniosexperiencia) {
        this.aniosexperiencia = aniosexperiencia;
    }
}
