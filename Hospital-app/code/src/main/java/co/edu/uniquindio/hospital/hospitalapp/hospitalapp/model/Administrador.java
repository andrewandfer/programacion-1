package co.edu.uniquindio.hospital.hospitalapp.hospitalapp.model;

import java.util.LinkedList;

public class Administrador extends Persona {
    LinkedList<Horario> horariosCreados;
    LinkedList<Sala> salasAdministradas;
    LinkedList<Medico> medicosAdministrados;
    LinkedList<Paciente> PacienteAdministrados;
    LinkedList<Reporte> reportesAdministrados;

    public Administrador(String nombre, String apellido, String id) {
        super(nombre, apellido, id);
        this.horariosCreados = new LinkedList<>();
        this.salasAdministradas = new LinkedList<>();
        this.medicosAdministrados = new LinkedList<>();
        this.PacienteAdministrados = new LinkedList<>();
        this.reportesAdministrados = new LinkedList<>();
    }

    public LinkedList<Reporte> getReportesAdministrados() {
        return reportesAdministrados;
    }

    public void setReportesAdministrados(LinkedList<Reporte> reportesAdministrados) {
        this.reportesAdministrados = reportesAdministrados;
    }

    public LinkedList<Horario> getHorariosCreados() {
        return horariosCreados;
    }

    public void setHorariosCreados(LinkedList<Horario> horariosCreados) {
        this.horariosCreados = horariosCreados;
    }

    public LinkedList<Sala> getSalasAdministradas() {
        return salasAdministradas;
    }

    public void setSalasAdministradas(LinkedList<Sala> salasAdministradas) {
        this.salasAdministradas = salasAdministradas;
    }

    public LinkedList<Medico> getMedicosAdministrados() {
        return medicosAdministrados;
    }

    public void setMedicosAdministrados(LinkedList<Medico> medicosAdministrados) {
        this.medicosAdministrados = medicosAdministrados;
    }

    public LinkedList<Paciente> getPacienteAdministrados() {
        return PacienteAdministrados;
    }

    public void setPacienteAdministrados(LinkedList<Paciente> pacienteAdministrados) {
        PacienteAdministrados = pacienteAdministrados;
    }

    @Override
    public String toString() {
        return "Administrador{" +
                "horariosCreados=" + horariosCreados +
                ", salasAdministradas=" + salasAdministradas +
                ", medicosAdministrados=" + medicosAdministrados +
                ", PacienteAdministrados=" + PacienteAdministrados +
                ", reportesAdministrados=" + reportesAdministrados +
                '}';
    }
}


