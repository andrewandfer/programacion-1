package co.edu.uniquindio.hospital.hospitalapp.hospitalapp.model;

import java.util.ArrayList;
import java.util.LinkedList;

public class Hospital {
    private String nombre;
    private String direccion;
    private String nit;
    private LinkedList<Medico> medicosHospital;
    private Administrador administrador;

    public Hospital(String nombre, String direccion, String nit, LinkedList<Medico> medicosHospital, Administrador administrador) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.medicosHospital = medicosHospital;
        this.administrador = administrador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public LinkedList<Medico> getMedicosHospital() {
        return medicosHospital;
    }

    public void setMedicosHospital(LinkedList<Medico> medicosHospital) {
        this.medicosHospital = medicosHospital;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", nit='" + nit + '\'' +
                ", medicosHospital=" + medicosHospital +
                ", administrador=" + administrador +
                '}';
    }
}



