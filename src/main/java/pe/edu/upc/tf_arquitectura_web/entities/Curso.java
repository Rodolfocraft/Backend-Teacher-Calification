package pe.edu.upc.tf_arquitectura_web.entities;

import javax.persistence.*;
//Crud Curso
@Entity
@Table(name = "Curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "codCurso", length = 45, nullable = false)
    private String codCurso;
    @Column(name = "nombreCurso", length = 80, nullable = false)
    private String nombreCurso;

    @Column(name = "creditos", nullable = false)
    private int creditos;

    @Column(name = "semestre", nullable = false)
    private int semestre;

    @Column(name = "horasdictadas", nullable = false)
    private int horasdictadas;

    @Column(name = "modalidad", length = 80, nullable = false)
    private String modalidad;


    public Curso() {
    }

    public Curso(int id, String codCurso, String nombreCurso, int creditos, int semestre, int horasdictadas, String modalidad) {
        this.id = id;
        this.codCurso = codCurso;
        this.nombreCurso = nombreCurso;
        this.creditos = creditos;
        this.semestre = semestre;
        this.horasdictadas = horasdictadas;
        this.modalidad = modalidad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getHorasdictadas() {
        return horasdictadas;
    }

    public void setHorasdictadas(int horasdictadas) {
        this.horasdictadas = horasdictadas;
    }

    public String getModalidad() {
        return modalidad;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }
}
