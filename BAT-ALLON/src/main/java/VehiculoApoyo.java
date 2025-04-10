public class VehiculoApoyo extends Vehiculo {

    private String nombre;
    private TipoFuncion tipoFuncion;

    public VehiculoApoyo(String id, String modelo, String fechafabricacion, int kilometraje, String nombre, TipoFuncion tipoFuncion, EstadoOperativo estadoOperativo) {
        super(id, modelo, fechafabricacion, kilometraje, estadoOperativo); // Llama al constructor de Vehiculo (clase padre)
        this.nombre = nombre;
        this.tipoFuncion = tipoFuncion;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoFuncion getTipoFuncion() {
        return tipoFuncion;
    }

    public void setTipoFuncion(TipoFuncion tipoFuncion) {
        this.tipoFuncion = tipoFuncion;
    }



    @Override
    public String toString() {
        return "VehiculoApoyo{" +
                "nombre='" + nombre + '\'' +
                ", tipoFuncion=" + tipoFuncion +
                '}';
    }
}
