<<<<<<< HEAD
=======
package Herramientas;
import Inventario.Inventario;

public class Espada extends Instrumento implements Armas{
    public Espada(int danio, int durabilidad, int resistencia, String nombre) {
        super(danio, durabilidad, resistencia, nombre);
    }

    @Override
    public void mejorarInstrumento(Inventario inventario) {
        if (inventario.usarDelInventario("piedra", 5)){
            this.setDanio(this.getDanio()+10);
            this.setResistencia(this.getResistencia()+10);
            System.out.format("Mejoraste tu %s, ahora tiene %d de daño y %d de resistencia\n", this.getNombre(), this.getDanio(), this.getResistencia());
        }else{
            System.out.println("No tenes los objetos necesarios");
        }
    }


    @Override
    public void repararInstrumento(Inventario inventario) {
        if(inventario.usarDelInventario("piedra",3)){
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
                System.out.println("Tomas la espada con las dos manos");
                System.out.println("Y le pegas en la cabeza");
                System.out.println("PUM!! GOLPE CRITICO EN NOMBRE DE WINDOWS");
                danio=this.getDanio()*3;

                break;

            case 2:

                System.out.println("Tomas la espada con una mano");
                System.out.println("Es muy pesada y el golpe muy lento");
                System.out.println("El fantasma lo esquiva al grito de LINUX");

                danio = 0;

                break;

            case 3:

                System.out.println("Tomas la espada con las dos manos");
                System.out.println("y le pegas..");
                System.out.println("Inflijes el doble de danio");
                danio = this.getDanio() * 2;

                break;

            case 4:

                System.out.println("Lanzas la espada apuntando a la cabeza del fantasma");
                System.out.println("Pero el fantasma grita !PYTHON¡");
                System.out.println("y desvia el arma");
                System.out.println("No inflijes daño");

                danio = 0;

                break;

            case 5:

                System.out.println("Le pegas al fantasma con el hacha");
                System.out.println("le aciertas");

                danio = this.getDanio();
                break;

        }
        return danio;
    }

}
>>>>>>> 98368e54b7e9055a6fa7b901141aeea6b59037c5
