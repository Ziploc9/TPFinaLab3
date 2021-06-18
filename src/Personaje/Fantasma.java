package Personaje;
import Inventario.Inventario;


public class Fantasma extends Personaje{

    public Fantasma(String nombre, int vida, int danio, int resistencia, float velocidad) {
        super(nombre, vida, danio, resistencia, velocidad);
    }

    public Fantasma() {
    }

    public boolean destruir(Inventario inv, boolean puerta) {
        if (puerta) {
            System.out.println("Olvidaste de cerrar la casa y fuiste asesinado!\n");
            return true;
        }
        else {
            int numRand = (int)(Math.random()*5+1);
            if (numRand == 3) {
                System.out.println("El fantasma no logro entrar a la casa. Pero causo algunos daños externos!\n");
                if (inv.usarDelInventario("madera", 4)) {
                    System.out.println("Usaste 4 de madera para las reparaciones!\n");
                } else {
                    if (inv.usarDelInventario("frutos", 2)) {
                        System.out.println("No tienes suficiente madera para las reparaciones, tuviste que ir al pueblo a cambiar algunos frutos por madera.\n");
                    } else {
                        if (inv.usarDelInventario("peces", 2)) {
                            System.out.println("No tienes suficiente madera para las reparaciones, tuviste que ir al pueblo a cambiar algunos pescados por madera.\n");
                        } else {
                            System.out.println("No tienes suficiente madera para las reparaciones, pasaras frio esta noche!\n");
                        }
                    }
                }
            }
            System.out.println("El fantasma no logro causar mas daños importante y se retiro, por ahora.\n");
            return false;
        }

    }

    public void buffear(){
        this.setVida(this.getVida()+1);
        this.setDamage(this.getDamage()+2);
    }

    public int atacar(int num){
        int danio=0;
        switch (num) {
            case 1:
                danio=this.getDamage()*3;
                break;

            case 2:
                danio = 0;
                break;

            case 3:
                danio = this.getDamage() * 2;
                break;

            case 4:
                danio = 0;
                break;
            case 5:
                danio = this.getDamage();
                break;
            default:

                break;

        }
        return danio;
    }
}
