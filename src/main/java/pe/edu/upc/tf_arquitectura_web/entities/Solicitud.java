package pe.edu.upc.tf_arquitectura_web.entities;

import javax.persistence.*;

@Entity
@Table(name = "solicitud")
public class Solicitud {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "codSolicitud", length = 60, nullable = false)
    private String codSolicitud;
    @Column(name = "codAlumno", length = 60, nullable = false)
    private String codAlumno;
    @Column(name = "tipSolicitud", length = 60, nullable = false)
    private String tipSolicitud;
    @Column(name = "nombreSolicitud", length = 60, nullable = false)
    private String nombreSolicitud;
    @Column(name = "codAdministrador", length = 60, nullable = false)
    private String codAdministrador;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuarios usuarios;

    public Solicitud() {
    }

    public Solicitud(int id, String codSolicitud, String codAlumno, String tipSolicitud, String nombreSolicitud, String codAdministrador, Usuarios usuarios) {
        this.id = id;
        this.codSolicitud = codSolicitud;
        this.codAlumno = codAlumno;
        this.tipSolicitud = tipSolicitud;
        this.nombreSolicitud = nombreSolicitud;
        this.codAdministrador = codAdministrador;
        this.usuarios = usuarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodSolicitud() {
        return codSolicitud;
    }

    public void setCodSolicitud(String codSolicitud) {
        this.codSolicitud = codSolicitud;
    }

    public String getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(String codAlumno) {
        this.codAlumno = codAlumno;
    }

    public String getTipSolicitud() {
        return tipSolicitud;
    }

    public void setTipSolicitud(String tipSolicitud) {
        this.tipSolicitud = tipSolicitud;
    }

    public String getNombreSolicitud() {
        return nombreSolicitud;
    }

    public void setNombreSolicitud(String nombreSolicitud) {
        this.nombreSolicitud = nombreSolicitud;
    }

    public String getCodAdministrador() {
        return codAdministrador;
    }

    public void setCodAdministrador(String codAdministrador) {
        this.codAdministrador = codAdministrador;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
}


