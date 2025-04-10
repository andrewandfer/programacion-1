public abstract class Vehiculo {

    private String id;
    private String modelo;
    private String fechafabricacion;
    private int kilometraje;
    private EstadoOperativo estadoOperativo;
    private int misionesCompletadas;

    public Vehiculo(String id, String modelo, String fechafabricacion, int kilometraje, EstadoOperativo estadoOperativo) {
        this.id = id;
        this.modelo = modelo;
        this.fechafabricacion = fechafabricacion;
        this.kilometraje = kilometraje;
        this.misionesCompletadas = 0;
        this.estadoOperativo = estadoOperativo;
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

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public EstadoOperativo getEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(EstadoOperativo estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }

    public int getMisionesCompletadas() {
        return misionesCompletadas;
    }

    public void setMisionesCompletadas(int misionesCompletadas) {
        this.misionesCompletadas = misionesCompletadas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "id='" + id + '\'' +
                ", modelo='" + modelo + '\'' +
                ", fechafabricacion='" + fechafabricacion + '\'' +
                ", kilometraje='" + kilometraje + '\'' +
                ", estadoOperativo=" + estadoOperativo +
                ", misionesCompletadas='" + misionesCompletadas + '\'' +
                '}';
    }
}
