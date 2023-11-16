package pe.edu.upc.tf_arquitectura_web.dtos;
public class OrdenUsuariosDTO {

    private String genero;
    private int contadorusuarios;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getContadorusuarios() {
        return contadorusuarios;
    }

    public void setContadorusuarios(int contadorusuarios) {
        this.contadorusuarios = contadorusuarios;
    }
}
