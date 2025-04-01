public class VehiculoTransporteTropas extends Vehiculo {

    private String capacidadSoldados;

    public VehiculoTransporteTropas(String id, String modelo, String fechafabricacion, String kilometraje, int capacidadSoldados) {
        super(id, modelo, fechafabricacion, kilometraje);
        this.capacidadSoldados = capacidadSoldados;
    }

    public String getCapacidadSoldados() {
        return capacidadSoldados;
    }

    public void setCapacidadSoldados(String capacidadSoldados) {
        this.capacidadSoldados = capacidadSoldados;
    }


    @Override
    public String toString() {
        return super.toString() +" VehiculoTransporteTropas{" +
                "capacidadSoldados='" + capacidadSoldados + '\'' +
                '}';
    }





}
