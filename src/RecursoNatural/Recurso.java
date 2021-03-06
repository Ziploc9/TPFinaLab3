package RecursoNatural;
import Personaje.*;

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
    }

    public Recurso() {
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

    public boolean comprobarRecurso(){  //Comprueba si quedan recursos
        if(getCantidadRecurso() <= 0){
            setExiste(false);
        }else{
            setExiste(true);
        }
        return isExiste();
    }

    public int recolectarRecurso(double danio){   //
        int acumuladorRecurso=0;
        if(comprobarRecurso()){                                                 // compruebo que el recurso este disponible
            if(getResistencia() < danio) {                              // compruebo que el danio del arma sea mayor al de la resistencia del recurso
                if ("madera".equals(getNombre())) {
                    System.out.println("Agarraste el Hacha con la mano derecha y llegaste hasta el arbol..");
                    System.out.println("Comienzas a talar el arbol..");
                    System.out.println("Felicidades obtuviste 1 de madera..");
                    this.setCantidadRecurso(this.getCantidadRecurso()-1);
                    acumuladorRecurso++;
                } else if ("peces".equals(getNombre())) {
                    System.out.println("Agarraste la cania y caminas hasta el lago..");
                    System.out.println("Lanzas el ansuelo al lago..");
                    System.out.println("Comienzas a luchar contra el pez");
                    System.out.println("Felicidades obtuviste 1 pescado..");
                    this.setCantidadRecurso(this.getCantidadRecurso()-1);
                    acumuladorRecurso++;
                } else if ("piedra".equals(getNombre())) {
                    System.out.println("Agarraste el Pico con la mano derecha y llegas a donde hay piedras..");
                    System.out.println("Comienzas a picar las piedras..");
                    System.out.println("Felicidades obtuviste 1 de piedra..");
                    this.setCantidadRecurso(this.getCantidadRecurso()-1);
                    acumuladorRecurso++;
                }
            }else{
                System.out.println("El arma que tienes no es lo suficiente fuerte para utilizar en este recurso.");
            }
        }else{
            System.out.println("\n Recurso en regeneracion..");
        }
        return acumuladorRecurso;
    }

    public int recolectarRecurso(){
        int acumladorRecurso=0;
        if(comprobarRecurso()){                                                 // compruebo que el recurso este disponible
            System.out.println("Te colocas los guantes y vas al huerto..");
            System.out.println("Comienzas a revisar los frutos para tratar de sacarlos..");
            System.out.println("Felicidades obtuviste 1 fruto..");
            this.setCantidadRecurso(this.getCantidadRecurso()-1);
            acumladorRecurso++;
        }else{
            System.out.println("\n Recurso en regeneracion..");
        }
        return acumladorRecurso;
    }

    public void reiniciarRecurso(){
        if(getCantidadRecurso()<=0) {
            if ("peces".equals(getNombre())) {
                setCantidadRecurso(10);
            } else if ("madera".equals(getNombre())) {
                setCantidadRecurso(10);
            } else if ("frutos".equals(getNombre())) {
                setCantidadRecurso(10);
            } else if ("piedra".equals(getNombre())) {
                setCantidadRecurso(10);
            }
        }
    }

    public int explotarRecurso(){
        int recu = 1;
        setCantidadRecurso(getCantidadRecurso() - recu);

        return recu;
    }

}