package pe.edu.upc.tf_arquitectura_web.entities;

import javax.persistence.*;

@Entity
@Table(name = "Alumno")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuarios usuarios;

    @ManyToOne
    @JoinColumn(name = "idUniversidad")
    private Universidad universidad;

    @ManyToOne
    @JoinColumn(name = "idCarrerasProfesionales")
    private CarrerasProfesionales carrerasProfesionales;

    @Column(name = "ciclo", nullable = false)
    private int ciclo;
    @Column(name = "anioingreso", nullable = false)
    private int anioingreso;
    @Column(name = "dni", nullable = false)
    private int dni;


    public Alumno() {
    }

    public Alumno(int id, Usuarios usuarios, Universidad universidad, CarrerasProfesionales carrerasProfesionales, int ciclo, int anioingreso, int dni) {
        this.id = id;
        this.usuarios = usuarios;
        this.universidad = universidad;
        this.carrerasProfesionales = carrerasProfesionales;
        this.ciclo = ciclo;
        this.anioingreso = anioingreso;
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public CarrerasProfesionales getCarrerasProfesionales() {
        return carrerasProfesionales;
    }

    public void setCarrerasProfesionales(CarrerasProfesionales carrerasProfesionales) {
        this.carrerasProfesionales = carrerasProfesionales;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public int getAnioingreso() {
        return anioingreso;
    }

    public void setAnioingreso(int anioingreso) {
        this.anioingreso = anioingreso;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
