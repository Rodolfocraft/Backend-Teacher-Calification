package pe.edu.upc.tf_arquitectura_web.dtos;

public class ProfesorUniversidadDTO {
    private String nombreUniversidad;
    private int cantidadProfesores;


    public String getNombreUniversidad() {
        return nombreUniversidad;
    }

    public void setNombreUniversidad(String nombreUniversidad) {
        this.nombreUniversidad = nombreUniversidad;
    }

    public int getCantidadProfesores() {
        return cantidadProfesores;
    }

    public void setCantidadProfesores(int cantidadProfesores) {
        this.cantidadProfesores = cantidadProfesores;
    }
}
