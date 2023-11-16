package pe.edu.upc.tf_arquitectura_web.entities;


import javax.persistence.*;
@Entity
@Table(name = "CarrerasProfesionales")
public class CarrerasProfesionales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "codCarreraProfesional",length = 10,nullable = false)
    private String codCarreraProfesional;
    @Column(name = "nombreCarreraProfesional",length = 100,nullable = false)
    private String nombreCarreraProfesional;
    @Column(name = "tipo", length = 45, nullable = false)
    private String tipo;
    @Column(name = "facultad", length = 45, nullable = false)
    private String facultad;
    @Column(name = "ciclo", nullable = false)
    private int ciclo;


    public CarrerasProfesionales() {
    }

    public CarrerasProfesionales(int id, String codCarreraProfesional, String nombreCarreraProfesional, String tipo, String facultad, int ciclo) {
        this.id = id;
        this.codCarreraProfesional = codCarreraProfesional;
        this.nombreCarreraProfesional = nombreCarreraProfesional;
        this.tipo = tipo;
        this.facultad = facultad;
        this.ciclo = ciclo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodCarreraProfesional() {
        return codCarreraProfesional;
    }

    public void setCodCarreraProfesional(String codCarreraProfesional) {
        this.codCarreraProfesional = codCarreraProfesional;
    }

    public String getNombreCarreraProfesional() {
        return nombreCarreraProfesional;
    }

    public void setNombreCarreraProfesional(String nombreCarreraProfesional) {
        this.nombreCarreraProfesional = nombreCarreraProfesional;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }
}
