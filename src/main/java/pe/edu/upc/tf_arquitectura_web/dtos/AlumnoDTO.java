package pe.edu.upc.tf_arquitectura_web.dtos;

import pe.edu.upc.tf_arquitectura_web.entities.CarrerasProfesionales;
import pe.edu.upc.tf_arquitectura_web.entities.Universidad;
import pe.edu.upc.tf_arquitectura_web.entities.Usuarios;

public class AlumnoDTO {

    private int id;
    private Usuarios usuarios;

    private Universidad universidad;

    private CarrerasProfesionales carrerasProfesionales;

    private int ciclo;
    private int anioingreso;
    private int dni;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }

    public CarrerasProfesionales getCarrerasProfesionales() {
        return carrerasProfesionales;
    }

    public void setCarrerasProfesionales(CarrerasProfesionales carrerasProfesionales) {
        this.carrerasProfesionales = carrerasProfesionales;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public int getAnioingreso() {
        return anioingreso;
    }

    public void setAnioingreso(int anioingreso) {
        this.anioingreso = anioingreso;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
}
