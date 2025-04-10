import java.time.LocalDate;
import java.util.LinkedList;

public class Mision {
    private LocalDate fecha;
    private String ubicacion;
    private LinkedList<Soldado> personalAsignado;
    private String id;
    private Vehiculo vehiculo;

        public Mision(LocalDate fecha, String ubicacion, String id) {
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.personalAsignado = personalAsignado;
        this.vehiculo = vehiculo;
        this.id = id;

        personalAsignado = new LinkedList<>();
    }

        public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LinkedList<Soldado> getPersonalAsignado() {
        return personalAsignado;
    }

    public void setPersonalAsignado(LinkedList<Soldado> personalAsignado) {
        this.personalAsignado = personalAsignado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Mision{" +
                "fecha='" + fecha + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", personalAsignado=" + personalAsignado +
                ", vehiculo=" + vehiculo +
                ", codigoMision='" + id + '\'' +
                '}';
    }
}

