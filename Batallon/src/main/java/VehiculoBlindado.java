public class VehiculoBlindado extends Vehiculo {

    private String nivelBlindaje;


    public VehiculoBlindado(String id, String modelo, String fechafabricacion, String kilometraje, String nivelBlindaje) {
        super(id, modelo, fechafabricacion, kilometraje);
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
