package Personaje;
import RecursoNatural.Inventario;

public class Fantasma extends Personaje {

    public Fantasma(String nombre, int vida, int danio, int resistencia, float velocidad) {
        super(nombre, vida, danio, resistencia, velocidad);
        nombre = "CHALM";
        vida = 200;
        danio = 20;
        resistencia = 20;
        velocidad = 10;
    }

    public boolean casaAbierta() {
        //verifica si la casa esta abierta o no
        return true;
    }

    public void destruir(Inventario inv) {
        if (casaAbierta()) {
            System.out.println("Olvidaste de cerrar la casa y fuiste asesinado!");
        } else {
            int numRand = (int) (Math.random() * 5 + 1);
            if (numRand == 3) {
                System.out.println("El fantasma no logro entrar a la casa. Pero causo algunos daños externos!");
                if (inv.usarDelInventario("madera", 4)) {
                    System.out.println("Usaste 4 de madera para las reparaciones!");
                } else {
                    if (inv.usarDelInventario("frutos", 2)) {
                        System.out.println("No tienes suficiente madera para las reparaciones, tuviste que ir al pueblo a cambiar algunos frutos por madera.");
                    } else {
                        if (inv.usarDelInventario("peces", 2)) {
                            if (inv.usarDelInventario("madera", 4)) {
                                System.out.println("Usaste 4 de madera para las reparaciones!");
                            } else {
                                if (inv.usarDelInventario("frutos", 2)) {
                                    System.out.println("No tienes suficiente madera para las reparaciones, tuviste que ir al pueblo a cambiar algunos frutos por madera.");
                                } else {
                                    if (inv.usarDelInventario("peces", 2)) {
                                        System.out.println("No tienes suficiente madera para las reparaciones, tuviste que ir al pueblo a cambiar algunos pescados por madera.");
                                    } else {
                                        System.out.println("No tienes suficiente madera para las reparaciones, pasaras frio esta noche!");
                                    }
                                }
                            }
                        } else {
                            System.out.println("El fantasma no logro causar ningun daño importante y se retiro, por ahora.");
                        }
                    }
                    System.out.println("El fantasma no logro causar ningun daño importante y se retiro, por ahora.");
                }
            }
        }
    }

    public void llegadaFantasma() {
        System.out.println("Sientes un escalofrio, algo esta observandote.");
    }
}