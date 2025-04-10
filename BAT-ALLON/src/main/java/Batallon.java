import java.time.LocalDate;
import java.util.LinkedList;

public class Batallon {
    private String nombre;
    private LocalDate fecha;
    private String ubicacion;
    private LinkedList<Vehiculo> vehiculos;
    private LinkedList<Mision> misiones;
    private LinkedList<VehiculoApoyo> listaVehiculoApoyo;
    private LinkedList<VehiculoBlindado> listaVehiculoBlindado;
    private LinkedList<VehiculoTransporteTropas> listaVehiculoTransporteTropas;


    public Batallon(String nombre, LocalDate fecha, String ubicacion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.vehiculos = vehiculos;
        this.misiones = misiones;
        this.listaVehiculoApoyo = listaVehiculoApoyo;
        this.listaVehiculoBlindado = listaVehiculoBlindado;
        this.listaVehiculoTransporteTropas = listaVehiculoTransporteTropas;

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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public LinkedList<VehiculoApoyo> getListaVehiculoApoyo() {
        return listaVehiculoApoyo;
    }

    public void setListaVehiculoApoyo(LinkedList<VehiculoApoyo> listaVehiculoApoyo) {
        this.listaVehiculoApoyo = listaVehiculoApoyo;
    }

    public LinkedList<VehiculoBlindado> getVehiculoBlindado() {
        return listaVehiculoBlindado;
    }

    public void setVehiculoBlindado(LinkedList<VehiculoBlindado> vehiculoBlindado) {
        this.listaVehiculoBlindado = vehiculoBlindado;
    }

    public LinkedList<VehiculoTransporteTropas> getVehiculoTransporteTropas() {
        return listaVehiculoTransporteTropas;
    }

    public void setVehiculoTransporteTropas(LinkedList<VehiculoTransporteTropas> vehiculoTransporteTropas) {
        this.listaVehiculoTransporteTropas = vehiculoTransporteTropas;
    }

    @Override
    public String toString() {
        return "Batallon{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", vehiculos=" + vehiculos +
                ", misiones=" + misiones +
                ", vehiculoApoyo=" + listaVehiculoApoyo +
                ", vehiculoBlindado=" + listaVehiculoBlindado +
                ", vehiculoTransporteTropas=" + listaVehiculoTransporteTropas +
                '}';
    }

    public void agregarVehiculo(Vehiculo vehiculoAgregar) {
        if (buscarVehiculo(vehiculoAgregar.getId()) == null) {
            vehiculos.add(vehiculoAgregar);
        } else {
            System.out.println("Vehiculo ya existe");
        }
    }


    public boolean verificarVehiculo(String id) {
        boolean centinela = false;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getId().equals(id)) {
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
            if (misiones.get(i).getId().equals(codigomision)) {
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
        for (int i = 0; i < misiones.size(); i++) {
            if (misiones.get(i).equals(misionActualizar)) {
                misiones.set(i, misionActualizar);
                return true;
            }
        }
        return false;
    }

    public boolean verficarMision(String codigoMision) {
        boolean centinela = false;
        for (Mision mision : misiones) {
            if (mision.getId().equals(codigoMision)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public LinkedList<Vehiculo> obtenerVehiculos50misiones() {
        LinkedList<Vehiculo> vehiculosMisionesCompletadas = new LinkedList<>();
        for (VehiculoApoyo vehiculoapoyo : listaVehiculoApoyo) {
            if (vehiculoapoyo.getMisionesCompletadas() > 50) {
                vehiculosMisionesCompletadas.add(vehiculoapoyo);
            }
            for (VehiculoBlindado vehiculo : listaVehiculoBlindado) {
                if (vehiculo.getMisionesCompletadas() > 50) {
                    vehiculosMisionesCompletadas.add(vehiculo);
                }
            }

            for (VehiculoTransporteTropas vehiculo : listaVehiculoTransporteTropas) {
                if (vehiculo.getMisionesCompletadas() > 50) {
                    vehiculosMisionesCompletadas.add(vehiculo);

                }

            }

        }

        return vehiculosMisionesCompletadas;
    }

    public boolean registrarMision(LocalDate fechaMision, String ubicacionMision, String idVehiculoMision) {
        boolean flag = false;

        String cantidadMisionesActuales = String.valueOf(misiones.size() + 1);
        Mision newMision = new Mision(fechaMision, idVehiculoMision, ubicacionMision);
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getId().equals(idVehiculoMision)) {
                int misionesCompletadas = vehiculo.getMisionesCompletadas();
                vehiculo.setMisionesCompletadas(misionesCompletadas + 1);
            }
        }
        return flag;
    }

    public void calcularPromedioTipo() {
        int kilometrajeApoyo = 0;
        int cantidadApoyo = listaVehiculoApoyo.size();
        for (VehiculoApoyo vehiculoApoyo : listaVehiculoApoyo) {
            kilometrajeApoyo += vehiculoApoyo.getKilometraje();
        }
        if (cantidadApoyo != 0) {
            int promedioKilometrajeApoyo = kilometrajeApoyo / listaVehiculoApoyo.size();
        }


        int kilometrajeBlindado = 0;
        int cantidadBlindado = listaVehiculoBlindado.size();
        for (VehiculoBlindado vehiculoBlindado : listaVehiculoBlindado) {
            kilometrajeBlindado += vehiculoBlindado.getKilometraje();
        }
        if (cantidadBlindado != 0) {
            int promedioKilometrajeBlindado = kilometrajeBlindado / listaVehiculoBlindado.size();
        }


        int kilometrajeTransporteTropas = 0;
        int cantidadTransporteTropas = listaVehiculoTransporteTropas.size();
        for (VehiculoTransporteTropas vehiculoTransporteTropas : listaVehiculoTransporteTropas) {
            kilometrajeTransporteTropas += vehiculoTransporteTropas.getKilometraje();
        }
        if (cantidadTransporteTropas != 0) {
            int promedioTransporteTropas = kilometrajeTransporteTropas / listaVehiculoTransporteTropas.size();
        }
    }


    public Vehiculo vehiculoconmasmisionesCompletadas() {
        Vehiculo vehiculomasmisiones = vehiculos.get(0);
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getMisionesCompletadas() > vehiculomasmisiones.getMisionesCompletadas()) {
                vehiculomasmisiones = vehiculos.get(i);
            }
        }
        return vehiculomasmisiones;
    }

    public LinkedList<Mision> buscarMisionesPorFechaYUbicacion(LocalDate fechaBuscada, String ubicacionBuscada) {
        LinkedList<Mision> misionesEncontradas = new LinkedList<>();
        for(Mision mision:misiones) {
            if(mision.getFecha().equals(fechaBuscada)&&mision.getUbicacion().equals(ubicacionBuscada)) {
                misionesEncontradas.add(mision);
            }
        }
    return misionesEncontradas;
    }
}



