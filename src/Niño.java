public class Niño {
    private String nombre;
    private String genero;
    private int edad;
    private String id;
    private String alergias;
    private String nombreAcudiente;
    private String numeroAcudiente;

    public Niño(String nombre,String genero,int edad,String id,String alergias,String nombreAcudiente,String numeroAcudiente){
        this.nombre=nombre;
        this.genero=genero;
        this.edad=edad;
        this.id=id;
        this.alergias=alergias;
        this.nombreAcudiente=nombreAcudiente;
        this.numeroAcudiente=numeroAcudiente;

    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero(){
        return genero;
        }

    }

