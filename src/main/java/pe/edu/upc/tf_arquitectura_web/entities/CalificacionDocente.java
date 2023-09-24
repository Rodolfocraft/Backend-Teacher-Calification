package pe.edu.upc.tf_arquitectura_web.entities;

import javax.persistence.*;

@Entity
@Table(name = "calificacion")
public class CalificacionDocente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "codCalificacionDocente", length = 60, nullable = false)
    private String codCalificacionDocente;
    @Column(name = "codAlumno", length = 60, nullable = false)
    private String codAlumno;
    @Column(name = "valoracion", nullable = false)
    private int valoracion;
    @Column(name = "codUniversidad", length = 60, nullable = false)
    private String codUniversidad;
    @Column(name = "codProfesor", length = 60, nullable = false)
    private String codProfesor;
    @Column(name = "codCurso", length = 60, nullable = false)
    private String codCurso;
    @Column(name = "codCarrerasProfesionales", length = 60, nullable = false)
    private String codCarrerasProfesionales;
    @Column(name = "recomendacion", nullable = false)
    private int recomendacion;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuarios usuarios;

    public CalificacionDocente() {
    }

    public CalificacionDocente(int id, String codCalificacionDocente, String codAlumno, int valoracion, String codUniversidad, String codProfesor, String codCurso, String codCarrerasProfesionales, int recomendacion, Usuarios usuarios) {
        this.id = id;
        this.codCalificacionDocente = codCalificacionDocente;
        this.codAlumno = codAlumno;
        this.valoracion = valoracion;
        this.codUniversidad = codUniversidad;
        this.codProfesor = codProfesor;
        this.codCurso = codCurso;
        this.codCarrerasProfesionales = codCarrerasProfesionales;
        this.recomendacion = recomendacion;
        this.usuarios = usuarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodCalificacionDocente() {
        return codCalificacionDocente;
    }

    public void setCodCalificacionDocente(String codCalificacionDocente) {
        this.codCalificacionDocente = codCalificacionDocente;
    }

    public String getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(String codAlumno) {
        this.codAlumno = codAlumno;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public String getCodUniversidad() {
        return codUniversidad;
    }

    public void setCodUniversidad(String codUniversidad) {
        this.codUniversidad = codUniversidad;
    }

    public String getCodProfesor() {
        return codProfesor;
    }

    public void setCodProfesor(String codProfesor) {
        this.codProfesor = codProfesor;
    }

    public String getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(String codCurso) {
        this.codCurso = codCurso;
    }

    public String getCodCarrerasProfesionales() {
        return codCarrerasProfesionales;
    }

    public void setCodCarrerasProfesionales(String codCarrerasProfesionales) {
        this.codCarrerasProfesionales = codCarrerasProfesionales;
    }

    public int getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(int recomendacion) {
        this.recomendacion = recomendacion;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
}
