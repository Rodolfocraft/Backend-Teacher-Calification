package pe.edu.upc.tf_arquitectura_web.dtos;

public class StudentsCalificaciónDocenteDTO {
    private String nameProfesor;
    private int quantityCalifications;

    public String getNameProfesor() {
        return nameProfesor;
    }

    public void setNameProfesor(String nameProfesor) {
        this.nameProfesor = nameProfesor;
    }

    public int getQuantityCalifications() {
        return quantityCalifications;
    }

    public void setQuantityCalifications(int quantityCalifications) {
        this.quantityCalifications = quantityCalifications;
    }
}
