package Herramientas;
import Inventario.Inventario;


public class Hacha extends Instrumento implements  Armas{
    public Hacha(int danio, int durabilidad, int resistencia, String nombre) {
        super(danio, durabilidad, resistencia, nombre);
    }

    public Hacha() {
    }

    @Override
    public void mejorarInstrumento(Inventario inventario) {
        if (inventario.usarDelInventario("piedra",2)){
            this.setDanio(this.getDanio()+10);
            this.setResistencia(this.getResistencia()+10);
            System.out.format("Mejoraste tu %s, ahora tiene %d de daño y %d de resistencia\n", this.getNombre(), this.getDanio(), this.getResistencia());
        }else{
            System.out.println("No tenes los objetos necesarios\n");
        }
    }

    @Override
    public void repararInstrumento(Inventario inventario) {
        if(inventario.usarDelInventario("piedra", 2)){
            this.setDurabilidad(this.getDurabilidad()+5);
            System.out.format("Reparaste tu %s, ahora tiene %d de durabilidad\n", this.getNombre(), getDurabilidad());
        }else{
            System.out.println("No tenes los objetos necesarios\n");
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
                System.out.println("\nTomas el hacha con las dos manos");
                System.out.println("Pero erras el golpe\n");
                System.out.println("No inflijes danio\n");
                danio=0;

                break;


                case 2:

                    System.out.println("\nTomas el hacha con una mano");
                    System.out.println("Le pegas en el hombro\n");
                    System.out.println("Inflijis el danio del arma mas tu fuerza\n");

                    danio = this.getDanio();

                    break;

                    case 3:

                        System.out.println("\nTomas el hacha con las dos manos");
                        System.out.println("y le pegas..\n");
                        System.out.println("Inflijes el doble de danio\n");
                        danio = this.getDanio() * 2;

                    break;

                    case 4:

                        System.out.println("\nLanzas el hacha apuntando a la cabeza del fantasma");
                        System.out.println("Pero el fantasma grita !PYTHON¡");
                        System.out.println("y desvia el arma\n");
                        System.out.println("No inflijes daño\n");

                        danio = 0;

                    break;

                    case 5:

                        System.out.println("\nLanzas el hacha apuntando a la cabeza del fantasma");
                        System.out.println("le aciertas\n");
                        System.out.println("PEGAS UN GOLPE CRITICOOOOO\n");

                        danio = this.getDanio()*3;
                    break;

                }
                return danio;

    }
}