<<<<<<< HEAD
=======
package Personaje;

import Inventario.*;


public class Fantasma extends Personaje{

    public Fantasma(String nombre, int vida, int danio, int resistencia, float velocidad) {
        super(nombre, vida, danio, resistencia, velocidad);
    }



    public boolean destruir(Inventario inv, boolean puerta) {
        if (puerta) {

            System.out.println("Olvidaste de cerrar la casa y fuiste asesinado!");
            return true;
        }
        else {
            int numRand = (int)(Math.random()*5+1);
            if (numRand == 3) {
                System.out.println("El fantasma no logro entrar a la casa. Pero causo algunos daños externos!");
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
            }
            System.out.println("El fantasma no logro causar mas daños importante y se retiro, por ahora.");
            return false;
        }

    }

    public int atacar(){
        int numRand = (int)(Math.random()*4+1);
        int danio=0;
        switch (numRand) {
            case 1:
                System.out.println("El fantasma usa el comando mas peligroso.... ");
                System.out.println(".......");
                System.out.println(".......");
                System.out.println(".......");
                System.out.println(".......");
                System.out.println("sudo...");
                System.out.println("SUPERUSER DO");
                System.out.println("Con esto logra realizar un golpe critico");
                danio=this.getDamage()*3;

                break;

            case 2:

                System.out.println("El fantasma esta intentado arreglar su codigo interno");
                System.out.println("nuevamente tiene problemas de compatibilidad");
                System.out.println("Te riees de el mientra el sigue perdiendo el tiempo");

                danio = 0;

                break;

            case 3:

                System.out.println("El fantasma usa el comando zip");
                System.out.println("logrando comprimir tu vida");
                danio = this.getDamage() * 2;

                break;

            case 4:

                System.out.println("El fantasma habla sobre la superioridad de linux como sistema operativo");
                System.out.println("Pero ve tu collar de windows");
                System.out.println("Se enfurece e intenta atacarte");
                System.out.println("Pero gritas AGUANTE WINDOWS y tira su poder especial cd..");
                System.out.println("Volviendo a su posicion anterior");

                danio = 0;

                break;

            case 5:

                System.out.println("El fantasma usa el comando rmdir");
                System.out.println("Eliminando parte de tu vida....");

                danio = this.getDamage();
                break;

        }
        return danio;
    }


}
>>>>>>> 98368e54b7e9055a6fa7b901141aeea6b59037c5
