import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.logging.Logger;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;

public class BatallonTest {
    /**
     * Instancia para el manejo de logs
     */
    private static final Logger LOG = Logger.getLogger(BatallonTest.class.getName());

    @Test
    public void nombrePrueba() {
        LOG.info("Inicio de prueba nombrePrueba...");

        // codigo de la prueba

        LOG.info("Fin de prueba registrarJugadorEquipo...");
    }
    LinkedList<Mision>misiones=new LinkedList<>();
    VehiculoApoyo vehiculoApoyo = new VehiculoApoyo("1067599979","mazda","2026",2015,"JUAN",TipoFuncion.COMUNICACIONES,EstadoOperativo.DISPONIBLE);
    Mision misionAlcon = new Mision(LocalDate.of(2024, 4, 10), "putumayo", "106758959");


    @Test
        void agregarVehiculo() {
            assertEquals("mazda",vehiculoApoyo.getModelo());
        }

        @Test
        void verificarVehiculo() {
            assertNotEquals(2016,vehiculoApoyo.getKilometraje());
        }

        @Test
        void eliminarVehiculo() {

        }

        @Test
        void buscarVehiculo() {
        }

        @Test
        void actualizarVehiculo() {
        }

        @Test
        void buscarMision() {
        }

        @Test
        void crearMision() {

        }

    @Test
    void eliminarMision() {
        Mision misionAlcon = new Mision(LocalDate.of(2024, 4, 10), "putumayo", "106758959");
        misiones.add(misionAlcon); // agregar misión antes de eliminarla
        eliminarMision(misionAlcon); // ✅ corregido: sin el tipo
        assertFalse(misiones.contains(misionAlcon)); // comprueba que fue eliminada
    }

        @Test
        void actualizarMision() {
        }

        @Test
        void verficarMision() {
        }

        @Test
        void obtenerVehiculos50misiones() {
        }

        @Test
        void registrarMision() {
        }

        @Test
        void calcularPromedioTipo() {
        }

        @Test
        void vehiculoconmasmisionesCompletadas() {
        }

        @Test
        void buscarMisionesPorFechaYUbicacion() {
        }
    }
