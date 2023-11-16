package pe.edu.upc.tf_arquitectura_web.dtos;

public class StudentsDTO {
    private String carreraprofesional;
    private int contadoralumnos;

    public String getCarreraprofesional() {
        return carreraprofesional;
    }

    public void setCarreraprofesional(String carreraprofesional) {
        this.carreraprofesional = carreraprofesional;
    }

    public int getContadoralumnos() {
        return contadoralumnos;
    }

    public void setContadoralumnos(int contadoralumnos) {
        this.contadoralumnos = contadoralumnos;
    }
}
