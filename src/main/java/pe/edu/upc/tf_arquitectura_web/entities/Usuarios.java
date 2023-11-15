package pe.edu.upc.tf_arquitectura_web.entities;
import javax.persistence.*;
import java.time.LocalDate;

// crud usuario

@Entity
@Table(name = "Usuarios")
public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "apellido", length = 45, nullable = false)
    private String apellido;
    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;
    @Column(name = "fechanac", nullable = false)
    private LocalDate fechanac;
    @Column(name = "contrasena", length = 45, nullable = false)
    private String contrasena;
    @Column(name = "telefono", length = 9, nullable = false)
    private String telefono;
    @Column(name = "correo", length = 45, nullable = false)
    private String correo;
    @Column(name = "genero", length = 15, nullable = false)
    private String genero;
    @Column(name = "direccion", length = 55, nullable = false)
    private String direccion;


    public Usuarios() {
    }

    public Usuarios(int id, String apellido, String nombre, LocalDate fechanac, String contrasena, String telefono, String correo, String genero, String direccion) {
        this.id = id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechanac = fechanac;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.correo = correo;
        this.genero = genero;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechanac() {
        return fechanac;
    }

    public void setFechanac(LocalDate fechanac) {
        this.fechanac = fechanac;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

