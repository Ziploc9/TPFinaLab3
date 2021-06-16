package RecursoNatural;
import RecursoNatural.Recurso;

public class Recurso extends TipoRecurso {
    private int resistencia;
    private int tiempoMadurez;
    private int cantidadRecurso;
    private int stack;
    private TipoRecurso tipoRecurso;

    public Recurso(String nombre, int regeneracionHambre,boolean existe, int resistencia, int tiempoMadurez, int cantidadRecurso) {
        super(nombre,regeneracionHambre,existe);
        this.resistencia = resistencia;
        this.cantidadRecurso = cantidadRecurso;
        this.tiempoMadurez = tiempoMadurez;
        this.stack=0;
    }

    public Recurso(String nombre, boolean existe, int resistencia, int tiempoMadurez, int cantidadRecurso){
        super(nombre, existe);
        this.resistencia = resistencia;
        this.tiempoMadurez = tiempoMadurez;
        this.cantidadRecurso = cantidadRecurso;
    }


    //region [getters setters]

    public int getStack() {
        return stack;
    }

    public void setStack(int stack) {
        this.stack = stack;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getTiempoMadurez() {
        return tiempoMadurez;
    }

    public void setTiempoMadurez(int tiempoMadurez) {
        this.tiempoMadurez = tiempoMadurez;
    }

    public TipoRecurso getTipoRecurso() {
        return tipoRecurso;
    }

    public void setTipoRecurso(TipoRecurso tipoRecurso) {
        this.tipoRecurso = tipoRecurso;
    }

    public int getCantidadRecurso() {
        return cantidadRecurso;
    }

    public void setCantidadRecurso(int cantidadRecurso) {
        this.cantidadRecurso = cantidadRecurso;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public int getRegeneracionHambre() {
        return super.getRegeneracionHambre();
    }

    @Override
    public void setRegeneracionHambre(int regeneracionHambre) {
        super.setRegeneracionHambre(regeneracionHambre);
    }

    @Override
    public boolean isExiste() {
        return super.isExiste();
    }

    @Override
    public void setExiste(boolean existe) {
        super.setExiste(existe);
    }
//endregion

    public boolean comprobarRecurso(){
        if(getCantidadRecurso() <= 0){
            setExiste(false);
        }else{
            setExiste(true);
        }
        return isExiste();
    }

    public void recolectarRecurso(){
        if(comprobarRecurso()){
            System.out.println("\n Recolectando recurso..");
        }else{
            System.out.println("\n Recurso en regeneracion..");
        }
    }


}
