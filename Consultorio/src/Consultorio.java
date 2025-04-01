import java.util.LinkedList;

public class Consultorio {
    private String nombre;
    private String nit;
    private LinkedList<Odontologo>Odontologos;
    private LinkedList<Paciente>Pacientes;

    public Consultorio(String nombre, String nit, LinkedList<Odontologo> odontologos, LinkedList<Paciente> pacientes) {
        this.nombre = nombre;
        this.nit = nit;
        Odontologos = odontologos;
        Pacientes = pacientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public LinkedList<Odontologo> getOdontologos() {
        return Odontologos;
    }

    public void setOdontologos(LinkedList<Odontologo> odontologos) {
        Odontologos = odontologos;
    }

    public LinkedList<Paciente> getPacientes() {
        return Pacientes;
    }

    public void setPacientes(LinkedList<Paciente> pacientes) {
        Pacientes = pacientes;
    }
    public boolean agregarOdontologo(Odontologo odontologo) {
        Odontologos.add(odontologo);
        return true;
    }
}
