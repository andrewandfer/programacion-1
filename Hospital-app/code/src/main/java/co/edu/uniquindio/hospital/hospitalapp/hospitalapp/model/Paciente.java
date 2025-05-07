package co.edu.uniquindio.hospital.hospitalapp.hospitalapp.model;

import java.time.LocalDate;
import java.util.LinkedList;

public class Paciente extends Persona {
    private String idPaciente;
    private HistorialMedico historialMedico;
    private LinkedList<Cita> citas;

    public Paciente(String nombre, String apellido, String id, String idPaciente, String grupoSanguineo, String fechaNacimiento, HistorialMedico historialMedico) {
        super(nombre, apellido, id);
        this.idPaciente = idPaciente;
        this.historialMedico = historialMedico;
        this.citas = new LinkedList<>();
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public HistorialMedico getHistorialMedico() {
        return historialMedico;
    }

    public void setHistorialMedico(HistorialMedico historialMedico) {
        this.historialMedico = historialMedico;
    }

    public LinkedList<Cita> getCitas() {
        return citas;
    }

    public void setCitas(LinkedList<Cita> citas) {
        this.citas = citas;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "idPaciente='" + idPaciente + '\'' +
                ", historialMedico=" + historialMedico +
                ", citas=" + citas +
                '}';
    }
}
