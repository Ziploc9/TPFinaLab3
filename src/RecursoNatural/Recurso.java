package RecursoNatural;

public class Recurso extends TipoRecurso {
    private int resistencia;
    private int tiempoMadurez;
    private int cantidadRecurso;
    private TipoRecurso tipoRecurso;

    public Recurso(String nombre, int regeneracionHambre,boolean existe, int resistencia, int tiempoMadurez, int cantidadRecurso) {
        super(nombre,regeneracionHambre,existe);
        this.resistencia = resistencia;
        this.cantidadRecurso = cantidadRecurso;
        this.tiempoMadurez = tiempoMadurez;
    }

    public Recurso(String nombre, boolean existe, int resistencia, int tiempoMadurez, int cantidadRecurso){
        super(nombre, existe);
        this.resistencia = resistencia;
        this.tiempoMadurez = tiempoMadurez;
        this.cantidadRecurso = cantidadRecurso;
    }


    //region [getters setters]

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

    public void recolectarRecurso(boolean armaEnMano,double danio){
        int recu = getCantidadRecurso();
        if(comprobarRecurso()){                                                 // compruebo que el recurso este disponible
            if(armaEnMano) {                                                     // compruebo que tenga el arma en mano
                if(getResistencia() < danio) {                              // compruebo que el danio del arma sea mayor al de la resistencia del recurso
                    if ("madera".equals(getNombre())) {
                        System.out.println("Agarraste el Hacha con la mano derecha y llegaste hasta el arbol..");
                        System.out.println("Comienzas a talar el arbol..");
                        System.out.println("Felicidades obtuviste 1 de madera..");
                        setCantidadRecurso(recu-1);
                    } else if ("peces".equals(getNombre())) {
                        System.out.println("Agarraste la cania y caminas hasta el lago..");
                        System.out.println("Lanzas el ansuelo al lago..");
                        System.out.println("Comienzas a luchar contra el pez");
                        System.out.println("Felicidades obtuviste 1 pescado..");
                        setCantidadRecurso(recu-1);
                    } else if ("frutos".equals(getNombre())) {
                        System.out.println("Te colocas los guantes y vas al huerto..");
                        System.out.println("Comienzas a revisar los frutos para tratar de sacarlos..");
                        System.out.println("Felicidades obtuviste 1 fruto..");
                        setCantidadRecurso(recu-1);
                    } else if ("piedra".equals(getNombre())) {
                        System.out.println("Agarraste el Pico con la mano derecha y llegas a donde hay piedras..");
                        System.out.println("Comienzas a picar las piedras..");
                        System.out.println("Felicidades obtuviste 1 de piedra..");
                        setCantidadRecurso(recu-1);
                    }
                }else{
                    System.out.println("El arma que tienes no es lo suficiente fuerte para utilizar en este recurso.");
                }
            }else
            {
                System.out.println("No tienes nada en la mano como para explotar este recurso");
            }
        }else{
            System.out.println("\n Recurso en regeneracion..");
        }
    }

    public void reiniciarRecurso(){             // setear los recursos al default
        if(getCantidadRecurso()<=0) {
            if ("peces".equals(getNombre())) {
                setCantidadRecurso(9);
            } else if ("madera".equals(getNombre())) {
                setCantidadRecurso(25);
            } else if ("frutos".equals(getNombre())) {
                setCantidadRecurso(20);
            } else if ("piedra".equals(getNombre())) {
                setCantidadRecurso(30);
            }
        }
    }



}
