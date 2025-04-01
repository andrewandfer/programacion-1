import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;


public class Odontologo {
    private String nombre;
    private String licenciaProfesional;
    private String id;
    private LinkedList<Paciente>pacientes;
    public Odontologo(String nombre, String licenciaProfesional, String id, Especialidad especialidad) {
        this.nombre = nombre;
        this.licenciaProfesional = licenciaProfesional;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicenciaProfesional() {
        return licenciaProfesional;
    }

    public void setLicenciaProfesional(String licenciaProfesional) {
        this.licenciaProfesional = licenciaProfesional;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Nombre: " + nombre +
                ", licencia Profesional: " + licenciaProfesional+
                ",  id " +  id;

    }
}


