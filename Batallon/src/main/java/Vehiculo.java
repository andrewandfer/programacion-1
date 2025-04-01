public class Vehiculo {

    private String id;
    private String modelo;
    private String fechafabricacion;
    private String kilometraje;
    private EstadoOperativo estadoOperativo;


    public Vehiculo(String id, String modelo, String fechafabricacion, String kilometraje) {
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFechafabricacion() {
        return fechafabricacion;
    }

    public void setFechafabricacion(String fechafabricacion) {
        this.fechafabricacion = fechafabricacion;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public EstadoOperativo getEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(EstadoOperativo estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;

    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id='" + id + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechafabricacion='" + fechafabricacion + '\'' +
                ", kilometraje='" + kilometraje + '\'' +
                '}';
    }
}
