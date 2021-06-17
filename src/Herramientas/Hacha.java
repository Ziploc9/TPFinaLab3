package Herramientas;
import Inventario.Inventario;


public class Hacha extends Instrumento implements  Armas{
    public Hacha(int danio, int durabilidad, int resistencia, String nombre) {
        super(danio, durabilidad, resistencia, nombre);
    }


    @Override
    public void mejorarInstrumento(Inventario inventario) {
        if (inventario.usarDelInventario("piedra",2)){
            this.setDanio(this.getDanio()+10);
            this.setResistencia(this.getResistencia()+10);
            System.out.format("Mejoraste tu %s, ahora tiene %d de daño y %d de resistencia\n", this.getNombre(), this.getDanio(), this.getResistencia());
        }else{
            System.out.println("No tenes los objetos necesarios");
        }
    }

    @Override
    public void repararInstrumento(Inventario inventario) {
        if(inventario.usarDelInventario("piedra", 2)){
            this.setDurabilidad(this.getDurabilidad()+5);
            System.out.format("Reparaste tu %s, ahora tiene %d de durabilidad\n", this.getNombre(), getDurabilidad());
        }else{
            System.out.println("No tenes los objetos necesarios");
        }
    }

    @Override
    public void mostrarInstrumento(){
        System.out.format("Nombre: %s // Danio: %d // Durabilidad: %d // Resistencia: %d\n", this.getNombre(), this.getDanio(), this.getDurabilidad(), this.getResistencia());
    }

    @Override
    public int atacar(){
        int numRand = (int)(Math.random()*4+1);
        int danio=0;
        switch (numRand) {
            case 1:
                System.out.println("Tomas el hacha con las dos manos");
                System.out.println("Pero erras el golpe");
                System.out.println("No inflijes danio");
                danio=0;

                break;

<<<<<<< HEAD
            case 2:

                System.out.println("Tomas el hacha con una mano");
                System.out.println("Le pegas en el hombro");
                System.out.println("Inflijis el danio del arma mas tu fuerza");

                danio = this.getDanio();

                break;

            case 3:

                System.out.println("Tomas el hacha con las dos manos");
                System.out.println("y le pegas..");
                System.out.println("Inflijes el doble de danio");
                danio = this.getDanio() * 2;

                break;

            case 4:

                System.out.println("Lanzas el hacha apuntando a la cabeza del fantasma");
                System.out.println("Pero el fantasma grita !PYTHON¡");
                System.out.println("y desvia el arma");
                System.out.println("No inflijes daño");

                danio = 0;

                break;

            case 5:

                System.out.println("Lanzas el hacha apuntando a la cabeza del fantasma");
                System.out.println("le aciertas");
                System.out.println("PEGAS UN GOLPE CRITICOOOOO");

                danio = this.getDanio()*3;
                break;

        }
        return danio;
=======
                case 2:

                    System.out.println("Tomas el hacha con una mano");
                    System.out.println("Le pegas en el hombro");
                    System.out.println("Inflijis el danio del arma mas tu fuerza");

                    danio = this.getDanio();

                    break;

                    case 3:

                        System.out.println("Tomas el hacha con las dos manos");
                        System.out.println("y le pegas..");
                        System.out.println("Inflijes el doble de danio");
                        danio = this.getDanio() * 2;

                    break;

                    case 4:

                        System.out.println("Lanzas el hacha apuntando a la cabeza del fantasma");
                        System.out.println("Pero el fantasma grita !PYTHON¡");
                        System.out.println("y desvia el arma");
                        System.out.println("No inflijes daño");

                        danio = 0;

                    break;

                    case 5:

                        System.out.println("Lanzas el hacha apuntando a la cabeza del fantasma");
                        System.out.println("le aciertas");
                        System.out.println("PEGAS UN GOLPE CRITICOOOOO");

                        danio = this.getDanio()*3;
                    break;

                }
                return danio;
>>>>>>> origin/Enzo
    }




}