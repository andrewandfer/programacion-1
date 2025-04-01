import java.util.LinkedList;

public class Batallon {
    private String nombre;
    private String fecha;
    private String ubicacion;
    private LinkedList<Vehiculo> vehiculos;
    private LinkedList<Mision> misiones;

    public Batallon(String nombre, String fecha, String ubicacion, LinkedList<Mision> misiones, LinkedList<Vehiculo> vehiculos) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.misiones = misiones;
        this.vehiculos = vehiculos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public LinkedList<Mision> getMisiones() {
        return misiones;
    }

    public void setMisiones(LinkedList<Mision> misiones) {
        this.misiones = misiones;
    }

    @Override
    public String toString() {
        return "Batallon{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", vehiculos=" + vehiculos +
                ", misiones=" + misiones +
                '}';
    }

    public void crearVehiculo(Vehiculo vehiculoAgregar) {
        if (!verificarVehiculo(vehiculoAgregar.getId())) {
            vehiculos.add(vehiculoAgregar);
        }
    }

    public void agregarVehiculo(Vehiculo vehiculoAgregar) {
        if(buscarVehiculo(vehiculoAgregar.getId()) == null) {
            vehiculos.add(vehiculoAgregar);
        } else{
            System.out.println("Vehiculo ya existe");
        }
    }


    public boolean verificarVehiculo(String id){
        boolean centinela = false;
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo.getId().equals(id)){
                centinela = true;
            }
        }
        return centinela;
    }



    public boolean eliminarVehiculo(Vehiculo vehiculoEliminar) {
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).equals(vehiculoEliminar)) {
                vehiculos.remove(i);
            }
        }
        return true;
    }

    public Vehiculo buscarVehiculo(String id) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getId().equals(id)) {
                return vehiculo;
            }

        }
        return null;
        //commit
    }

    public boolean actualizarVehiculo(Vehiculo vehiculoActualizar) {
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getId().equals(vehiculoActualizar.getId())) {
                vehiculos.set(i, vehiculoActualizar);
                return true;

            }
        }
        return false;
    }

    public Mision buscarMision(String codigomision) {
        for (int i = 0; i < misiones.size(); i++) {
            if (misiones.get(i).getCodigoMision().equals(codigomision)) {
                return misiones.get(i);

            }
        }
        return null;
    }

    public boolean crearMision(Mision misionAgregar) {
        for (int i = 0; i < misiones.size(); i++) {
            if (misiones.get(i).equals(misionAgregar)) {
                return false;
            }
        }
        misiones.add(misionAgregar);
        return true;
    }
    public boolean eliminarMision(Mision misionEliminar) {
        for (int i = 0; i < misiones.size(); i++) {
            if (misiones.get(i).equals(misionEliminar)) {
                misiones.remove(i);
            }
        }
    return true;
    }

    public boolean actualizarMision(Mision misionActualizar) {
        for (int i=0;i<misiones.size();i++) {
            if(misiones.get(i).equals(misionActualizar)){
                misiones.set(i, misionActualizar);
                return true;
            }
        }
        return false;
    }

    public boolean verficarMision(String codigoMision) {
        boolean centinela = false;
        for (Mision mision : misiones) {
            if (mision.getCodigoMision().equals(codigoMision)) {
                centinela = true;
            }
        }
        return centinela;
    }
}



