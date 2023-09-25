package pe.edu.upc.tf_arquitectura_web.dtos;
import java.time.LocalDate;
public class OrdenUsuariosDTO {

    private String nombreusuario;
    private String apellidousuario;
    private LocalDate fechanacusuario;

    public String getNombreusuario() {
        return nombreusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getApellidousuario() {
        return apellidousuario;
    }

    public void setApellidousuario(String apellidousuario) {
        this.apellidousuario = apellidousuario;
    }

    public LocalDate getFechanacusuario() {
        return fechanacusuario;
    }

    public void setFechanacusuario(LocalDate fechanacusuario) {
        this.fechanacusuario = fechanacusuario;
    }

}
