package RecursoNatural;

public class TipoRecurso {

    private String nombre;
    private int regeneracionHambre;
    private boolean existe = true;

    //region [Getters & Setters]

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRegeneracionHambre() {
        return regeneracionHambre;
    }

    public void setRegeneracionHambre(int regeneracionHambre) {
        this.regeneracionHambre = regeneracionHambre;
    }

    public boolean isExiste() {
        return existe;
    }

    public void setExiste(boolean existe) {
        this.existe = existe;
    }

    //endregion

    public TipoRecurso(String nombre, int regeneracionHambre, boolean existe){
        this.nombre = nombre;
        this.regeneracionHambre = regeneracionHambre;
        this.existe = existe;
    }

    public boolean recursoExiste(){
        if(isExiste()){
            System.out.println("\n Recolectando recurso..");
        }else{
            System.out.println("\n Recurso aun no disponible..");
        }
        return isExiste();
    }
}