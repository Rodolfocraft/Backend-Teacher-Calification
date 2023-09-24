package pe.edu.upc.tf_arquitectura_web.dtos;

import pe.edu.upc.tf_arquitectura_web.entities.Usuarios;

public class AdministradorDTO {
    private int id;
    private int codAdministrador;
    private Usuarios usuarios;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodAdministrador() {
        return codAdministrador;
    }

    public void setCodAdministrador(int codAdministrador) {
        this.codAdministrador = codAdministrador;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
}
