import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class obtenerEspecialidad {

    @Test
    public void probarObtenerSoldados() {
        Batallon batallon = new Batallon("01", "aguila");
        Soldado soldado = new Soldado("01","jose",Rango.CABO,Funcion.LOGISTICA, 20, EstadoSoldado.NO_DISPONIBLE);
        Soldado s1 = new Soldado("02", "Ana", Rango.CABO, Funcion.MEDICO, 25, EstadoSoldado.NO_DISPONIBLE);
        Soldado s2 = new Soldado("03", "Lucas", Rango.CABO, Funcion.COMUNICACIONES, 22, EstadoSoldado.DISPONIBLE);
        Soldado s3 = new Soldado("04", "María", Rango.SOLDADO, Funcion.LOGISTICA, 28, EstadoSoldado.NO_DISPONIBLE);
        Soldado s4 = new Soldado("05", "Pedro", Rango.SARGENTO, Funcion.MEDICO, 21, EstadoSoldado.NO_DISPONIBLE);
        Soldado s5 = new Soldado("06", "Camila", Rango.CABO, Funcion.LOGISTICA, 23, EstadoSoldado.NO_DISPONIBLE);
        Soldado s6 = new Soldado("07", "David", Rango.SOLDADO, Funcion.COMUNICACIONES, 30, EstadoSoldado.DISPONIBLE);
        Soldado s7 = new Soldado("08", "Sofía", Rango.SARGENTO, Funcion.MEDICO, 24, EstadoSoldado.NO_DISPONIBLE);
        Soldado s8 = new Soldado("09", "Mateo", Rango.CABO, Funcion.COMUNICACIONES, 20, EstadoSoldado.DISPONIBLE);
        Soldado s9 = new Soldado("10", "Laura", Rango.SOLDADO, Funcion.MEDICO, 27, EstadoSoldado.DISPONIBLE);
        Soldado s10 = new Soldado("11", "Juan", Rango.CABO, Funcion.LOGISTICA, 26, EstadoSoldado.DISPONIBLE);
        Soldado s11 = new Soldado("12", "Valentina", Rango.SARGENTO, Funcion.LOGISTICA, 29, EstadoSoldado.DISPONIBLE);
        Soldado s12 = new Soldado("13", "Tomás", Rango.CABO, Funcion.MEDICO, 25, EstadoSoldado.NO_DISPONIBLE);
        Soldado s13 = new Soldado("14", "Martina", Rango.SARGENTO, Funcion.LOGISTICA, 22, EstadoSoldado.NO_DISPONIBLE);
        Soldado s14 = new Soldado("15", "Nicolás", Rango.SARGENTO, Funcion.COMUNICACIONES, 23, EstadoSoldado.NO_DISPONIBLE);
        Soldado s15 = new Soldado("16", "Carla", Rango.CABO, Funcion.MEDICO, 28, EstadoSoldado.DISPONIBLE);
        Soldado s16 = new Soldado("17", "Gabriel", Rango.SARGENTO, Funcion.MEDICO, 24, EstadoSoldado.NO_DISPONIBLE);
        Soldado s17 = new Soldado("18", "Florencia", Rango.SARGENTO, Funcion.LOGISTICA, 31, EstadoSoldado.NO_DISPONIBLE);
        Soldado s18 = new Soldado("19", "Sebastián", Rango.CABO, Funcion.COMUNICACIONES, 21, EstadoSoldado.DISPONIBLE);
        Soldado s19 = new Soldado("20", "Jazmín", Rango.SARGENTO, Funcion.MEDICO, 26, EstadoSoldado.DISPONIBLE);
        Soldado s20 = new Soldado("21", "Agustín", Rango.SARGENTO, Funcion.LOGISTICA, 27,EstadoSoldado.DISPONIBLE);

        batallon.getListaSoldados().add(soldado);
        batallon.getListaSoldados().add(s1);
        batallon.getListaSoldados().add(s2);
        batallon.getListaSoldados().add(s3);
        batallon.getListaSoldados().add(s4);
        batallon.getListaSoldados().add(s5);
        batallon.getListaSoldados().add(s6);
        batallon.getListaSoldados().add(s7);
        batallon.getListaSoldados().add(s8);
        batallon.getListaSoldados().add(s9);
        batallon.getListaSoldados().add(s10);
        batallon.getListaSoldados().add(s11);
        batallon.getListaSoldados().add(s12);
        batallon.getListaSoldados().add(s13);
        batallon.getListaSoldados().add(s14);
        batallon.getListaSoldados().add(s15);
        batallon.getListaSoldados().add(s16);
        batallon.getListaSoldados().add(s17);
        batallon.getListaSoldados().add(s18);
        batallon.getListaSoldados().add(s19);
        batallon.getListaSoldados().add(s20);

        batallon.obtenerSoldados();
    }
}
