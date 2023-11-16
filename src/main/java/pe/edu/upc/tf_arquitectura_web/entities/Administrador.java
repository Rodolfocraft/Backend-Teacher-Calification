package pe.edu.upc.tf_arquitectura_web.entities;

import javax.persistence.*;

// crud administrador

@Entity
@Table(name = "administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "codAdministrador",length = 60,nullable = false)
    private int codAdministrador;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuarios usuarios;


    public Administrador() {
    }

    public Administrador(int id, int codAdministrador, Usuarios usuarios) {
        this.id = id;
        this.codAdministrador = codAdministrador;
        this.usuarios = usuarios;
    }

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


