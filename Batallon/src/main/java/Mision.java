import java.util.LinkedList;

public class Mision {
    private String fecha;
    private String ubicacion;
    private String personalAsignado;
    private LinkedList<Vehiculo> vehiculos;
    private String codigoMision;

    public Mision(String fecha, String ubicacion, String personalAsignado, LinkedList<Vehiculo> vehiculos, String codigoMision) {
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.personalAsignado = personalAsignado;
        this.vehiculos = vehiculos;
        this.codigoMision = codigoMision;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPersonalAsignado() {
        return personalAsignado;
    }

    public void setPersonalAsignado(String personalAsignado) {
        this.personalAsignado = personalAsignado;
    }

    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public String getCodigoMision() {
        return codigoMision;
    }

    public void setCodigoMision(String codigoMision) {
        this.codigoMision = codigoMision;
    }

    @Override
    public String toString() {
        return "Mision{" +
                "fecha='" + fecha + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", personalAsignado='" + personalAsignado + '\'' +
                ", vehiculos=" + vehiculos +
                ", codigoMision='" + codigoMision + '\'' +
                '}';
    }
}

