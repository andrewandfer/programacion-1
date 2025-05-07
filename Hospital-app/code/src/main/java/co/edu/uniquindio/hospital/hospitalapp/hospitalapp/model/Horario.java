package co.edu.uniquindio.hospital.hospitalapp.hospitalapp.model;

import java.time.LocalDate;
import java.util.LinkedList;

public class Horario {
    private LocalDate Inicio;
    private LocalDate Fin;
    private LinkedList<Medico> medicosAsignados;
    private Administrador administrador;

    public Horario(LocalDate inicio, LocalDate fin) {
        Inicio = inicio;
        Fin = fin;
    }

    public LocalDate getInicio() {
        return Inicio;
    }

    public void setInicio(LocalDate inicio) {
        Inicio = inicio;
    }

    public LocalDate getFin() {
        return Fin;
    }

    public void setFin(LocalDate fin) {
        Fin = fin;
    }

    public LinkedList<Medico> getMedicosAsignados() {
        return medicosAsignados;
    }

    public void setMedicosAsignados(LinkedList<Medico> medicosAsignados) {
        this.medicosAsignados = medicosAsignados;
    }

    @Override
    public String toString() {
        return "Horario{" +
                "Inicio=" + Inicio +
                ", Fin=" + Fin +
                ", medicosAsignados=" + medicosAsignados +
                '}';
    }

    public class HistorialMedico {
        private String idHistorialmedico;
        private String diagnostico;
        private String tratamiento;

        public HistorialMedico(String idHistorialmedico, String diagnostico, String tratamiento) {
            this.idHistorialmedico = idHistorialmedico;
            this.diagnostico = diagnostico;
            this.tratamiento = tratamiento;
        }
        public String getIdHistorialmedico() {
            return idHistorialmedico;
        }
        public void setIdHistorialmedico(String idHistorialmedico) {
            this.idHistorialmedico = idHistorialmedico;
        }
        public String getDiagnostico() {
            return diagnostico;
        }
        public void setDiagnostico(String diagnostico) {
            this.diagnostico = diagnostico;
        }
        public String getTratamiento() {
            return tratamiento;
        }
        public void setTratamiento(String tratamiento) {
            this.tratamiento = tratamiento;
        }
    }
}
