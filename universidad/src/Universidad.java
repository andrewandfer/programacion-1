import java.sql.ClientInfoStatus;

public class Universidad {
    private String nombre;
    private Curso[] listaCursos;
    private Estudiante[] listaEstudiantes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        listaCursos = new Curso[5];
        listaEstudiantes = new Estudiante[5];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Curso[] getListaCursos() {
        return listaCursos;
    }

    public void setListaCursos(Curso[] listaCursos) {
        this.listaCursos = listaCursos;
    }
    public Estudiante[] getListaEstudiantes() {
        return listaEstudiantes;
    }
    public void setListaEstudiantes(Estudiante[] listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public int buscarCurso(String codigoBuscar) {
        for (int i = 0; i < listaCursos.length; i++) {
            if (listaCursos[i] != null && listaCursos[i].getCodigo().equals(codigoBuscar)) {
                return i;
            }
        }
        return -1;
    }

    public boolean elimiarCurso(String codigoEliminar) {
        for (int i = 0; i < listaCursos.length; i++) {
            if (listaCursos[i] != null && listaCursos[i].getCodigo().equals(codigoEliminar)) {
                listaCursos[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean actualizarCurso(Curso cursoActualizar) {
        int indice = buscarCurso(cursoActualizar.getCodigo());
        if (indice == -1) {
            return false;
        }
        listaCursos[indice] = cursoActualizar;
        return true;
    }
}
    public int buscarEstudiante(String estudianteBuscar){
        for(int i=0;i<listaEstudiantes.length;i++){
            if(listaEstudiantes[i]!=null && listaEstudiantes[i].getId().equals(estudianteBuscar)){
                return i;
            }
        }
        return -1;
}
    public boolean eliminarEstudiante(String estudianteEliminar){
        for(int i=0;i<listaEstudiantes.length;i++){
            if(listaEstudiantes[i]!=null && listaEstudiante[i].getId().equals(estudianteEliminar)){
                listaEstudiantes[i]=null;
                return true;
            }
        return false;
        }
    }
    public boolean actualizarEstudiante(Estudiante EstudianteActualizar){
    int indice = buscarEstudiante(estudianteActualizar.getCodigo());
    if (indice == -1) {
        return false;
    }
    listaCursos[indice]=estudianteActualizar;

return true;}