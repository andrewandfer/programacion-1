public class VehiculoApoyo extends Vehiculo {

    private String nombre;
    private TipoFuncion tipoFuncion;

    public VehiculoApoyo(String id, String modelo, String fechafabricacion, String kilometraje, String nombre, TipoFuncion tipoFuncion) {
        super(id, modelo, fechafabricacion, kilometraje);
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
        return super.toString() +"VehiculoApoyo{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
