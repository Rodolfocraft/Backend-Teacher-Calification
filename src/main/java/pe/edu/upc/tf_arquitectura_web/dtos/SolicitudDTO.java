package pe.edu.upc.tf_arquitectura_web.dtos;

import pe.edu.upc.tf_arquitectura_web.entities.Usuarios;

public class SolicitudDTO {
    private int id;
    private String codSolicitud;
    private String codAlumno;
    private String tipSolicitud;
    private String nombreSolicitud;
    private String codAdministrador;
    private Usuarios usuarios;

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
