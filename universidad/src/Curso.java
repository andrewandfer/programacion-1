public class Curso {
    private String nombre;
    private String codigo;
    private int creditos;

    public Curso(String nombre, int creditos, String codigo) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}



