public class VehiculoBlindado extends Vehiculo {

    private String nivelBlindaje;


    public VehiculoBlindado(String id, String modelo, String fechafabricacion, int kilometraje, String nivelBlindaje,EstadoOperativo estadoOperativo) {
        super(id, modelo, fechafabricacion, kilometraje,estadoOperativo);
        this.nivelBlindaje = nivelBlindaje;
    }

    public String getNivelBlindaje() {
        return nivelBlindaje;
    }

    public void setNivelBlindaje(String nivelBlindaje) {
        this.nivelBlindaje = nivelBlindaje;
    }

    @Override
    public String toString() {
        return super.toString()+ " VehiculoBlindado{" +
                "nivelBlindaje='" + nivelBlindaje + '\'' +
                '}';
    }
}
