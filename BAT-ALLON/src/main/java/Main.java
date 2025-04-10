import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Batallon batallon = new Batallon("Batallon Alfa", LocalDate.now(), "Base Militar");
        batallon.setVehiculos(new LinkedList<>()); // Inicialización necesaria
        batallon.setMisiones(new LinkedList<>());
        batallon.setListaVehiculoApoyo(new LinkedList<>());
        batallon.setVehiculoBlindado(new LinkedList<>());
        batallon.setVehiculoTransporteTropas(new LinkedList<>());

        int opcion;

        do {
            String menu = """
                    MENÚ BATALLÓN
                    1. Agregar Vehículo
                    2. Agregar Misión
                    3. Buscar Vehículo
                    4. Buscar Misión
                    5. Eliminar Vehículo
                    6. Eliminar Misión
                    7. Salir
                    """;
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1 -> {
                    String tipo = JOptionPane.showInputDialog("Ingrese el tipo de vehículo (APOYO, BLINDADO, TRANSPORTE):").toUpperCase();
                    String id = JOptionPane.showInputDialog("Ingrese ID del vehículo:");
                    String modelo = JOptionPane.showInputDialog("Ingrese el modelo del vehículo:");
                    String fechaFab = JOptionPane.showInputDialog("Ingrese la fecha de fabricación (YYYY-MM-DD):");
                    int kilometraje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el kilometraje:"));
                    EstadoOperativo estado = EstadoOperativo.valueOf(
                            JOptionPane.showInputDialog("Ingrese el estado operativo (ACTIVO, INACTIVO, MANTENIMIENTO):").toUpperCase());
                    int misionesCompletadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de misiones completadas:"));

                    Vehiculo nuevoVehiculo = null;
                    switch (tipo) {
                        case "APOYO" -> {
                            nuevoVehiculo = new VehiculoApoyo(id, modelo, fechaFab, kilometraje, estado, misionesCompletadas,nombre,tipofuncion);
                            EstadoOperativo tipofuncion = tipofuncion.valueOf(
                                    JOptionPane.showInputDialog("Ingrese el estado operativo (ACTIVO, INACTIVO, MANTENIMIENTO):").toUpperCase());
                            batallon.getListaVehiculoApoyo().add((VehiculoApoyo) nuevoVehiculo);
                        }
                        case "BLINDADO" -> {
                            nuevoVehiculo = new VehiculoBlindado(id, modelo, fechaFab, kilometraje, estado, misionesCompletadas);
                            batallon.getVehiculoBlindado().add((VehiculoBlindado) nuevoVehiculo);
                        }
                        case "TRANSPORTE" -> {
                            nuevoVehiculo = new VehiculoTransporteTropas(id, modelo, fechaFab, kilometraje, estado, misionesCompletadas);
                            batallon.getVehiculoTransporteTropas().add((VehiculoTransporteTropas) nuevoVehiculo);
                        }
                        default -> JOptionPane.showMessageDialog(null, "Tipo de vehículo inválido");
                    }

                    if (nuevoVehiculo != null) {
                        batallon.agregarVehiculo(nuevoVehiculo);
                        JOptionPane.showMessageDialog(null, "Vehículo agregado con éxito.");
                    }
                }

                case 2 -> {
                    String codigoMision = JOptionPane.showInputDialog("Ingrese código de misión:");
                    String fechaStr = JOptionPane.showInputDialog("Ingrese fecha de misión (YYYY-MM-DD):");
                    LocalDate fecha = LocalDate.parse(fechaStr);
                    String ubicacion = JOptionPane.showInputDialog("Ingrese ubicación:");
                    String personal = JOptionPane.showInputDialog("Ingrese personal asignado (separado por comas):");
                    LinkedList<String> personalAsignado = new LinkedList<>();
                    for (String p : personal.split(",")) {
                        personalAsignado.add(p.trim());
                    }

                    Mision nuevaMision = new Mision(fecha, ubicacion, codigoMision);
                    nuevaMision.setPersonalAsignado(personalAsignado);
                    batallon.crearMision(nuevaMision);
                    JOptionPane.showMessageDialog(null, "Misión agregada con éxito.");
                }

                case 3 -> {
                    String id = JOptionPane.showInputDialog("Ingrese ID del vehículo a buscar:");
                    Vehiculo vehiculo = batallon.buscarVehiculo(id);
                    JOptionPane.showMessageDialog(null, vehiculo != null ? vehiculo.toString() : "Vehículo no encontrado.");
                }

                // Podés seguir completando las opciones 4 a 7 aquí
            }

        } while (opcion != 7);
    }
}

