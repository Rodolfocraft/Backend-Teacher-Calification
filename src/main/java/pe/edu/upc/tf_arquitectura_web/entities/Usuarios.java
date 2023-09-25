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
    @Column(name = "usuario", length = 45, nullable = false)
    private String usuario;
    @Column(name = "contraseña", length = 45, nullable = false)
    private String contraseña;
    @Column(name = "correo", length = 45, nullable = false)
    private String correo;
    @Column(name = "telefono", length = 9, nullable = false)
    private String telefono;
    @Column(name = "fechanac", nullable = false)
    private LocalDate fechanac;
    @Column(name = "nombre", length = 45, nullable = false)
    private String nombre;
    @Column(name = "apellido", length = 45, nullable = false)
    private String apellido;
    @Column(name = "tipousuario", length = 45, nullable = false)
    private String tipousuario;


    public Usuarios() {
    }

    public Usuarios(int id, String usuario, String contraseña, String correo, String telefono, LocalDate fechanac, String nombre, String apellido, String tipousuario) {
        this.id = id;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.correo = correo;
        this.telefono = telefono;
        this.fechanac = fechanac;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipousuario = tipousuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechanac() {
        return fechanac;
    }

    public void setFechanac(LocalDate fechanac) {
        this.fechanac = fechanac;
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

    public String getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }
}
