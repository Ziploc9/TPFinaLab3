<<<<<<< HEAD
=======

package Inventario;

import RecursoNatural.Recurso;
import RecursoNatural.TipoRecurso;

>>>>>>> 2770fd15c153485158a62f2ddb537a6f70dcaf74

package Inventario;
import RecursoNatural.Recurso;
import RecursoNatural.TipoRecurso;
<<<<<<< HEAD

=======
>>>>>>> 2770fd15c153485158a62f2ddb537a6f70dcaf74

public class Inventario {
    private Recurso recursos[] = new Recurso[4];
    private int peso;

    public Inventario(Recurso madera, Recurso piedra, Recurso frutos, Recurso peces) {
        this.peso = 0;
        this.recursos[0] = madera;
        this.recursos[1] = piedra;
        this.recursos[2] = frutos;
        this.recursos[3] = peces;
    }

    public void agregarAlInventario(Recurso x, int cantidadAgregar) {
        int i = 0;
        for (TipoRecurso aux : recursos) {
            if (aux.getNombre().equals(x.getNombre())) {
                checkearPeso(cantidadAgregar, i);
            }
            i++;
        }
    }

    public void checkearPeso(int cantidadAgregar, int i) {
        if (peso + cantidadAgregar < 30) {
            recursos[i].setStack(recursos[i].getStack() + cantidadAgregar);
            this.peso = this.peso + cantidadAgregar;
        } else {
            int exceso = peso + cantidadAgregar - 30;
            int cantidadAgregarNueva = cantidadAgregar - exceso;
            recursos[i].setStack(recursos[i].getStack() + cantidadAgregarNueva);
            System.out.println("Se desperdiciaron " + exceso + " recursos ya que tienes un exceso de peso!");
        }
    }

    public void verInventario() {
        for (Recurso aux : this.recursos) {
            System.out.println("*" + aux.getNombre() + " (" + aux.getStack() + ")");
        }
    }

    public void soltarRecurso(String nombre, int cantidadTirar) {
        int i = 0;
        for (TipoRecurso aux : this.recursos) {
            if (aux.getNombre().equals(nombre)) {
                if (recursos[i].getStack() - cantidadTirar > 0) {
                    recursos[i].setStack(recursos[i].getStack() - cantidadTirar);
                    this.peso = this.peso - cantidadTirar;
                } else {
                    System.out.println("No puedes soltar mas de lo que tienes!");
                }
            }
            i++;
        }
    }

    public boolean usarDelInventario(String nombre, int cantidad){ //solo para usar en otras funciones!
<<<<<<< HEAD
        for (Recurso aux : recursos) {
=======
        for (Recurso aux:this.recursos) {
<<<<<<< HEAD
            System.out.println("0");
            if (aux.getNombre().equals(nombre)) {
                System.out.println("1");
                if((aux.getStack() - cantidad) > 0){
                    System.out.println("2");
=======
>>>>>>> 2770fd15c153485158a62f2ddb537a6f70dcaf74
            if (aux.getNombre().equals(nombre)) {
                if((aux.getStack() - cantidad) > 0){
>>>>>>> maintest
                    aux.setStack(aux.getStack() - cantidad);
                    return true;
                }
                else{
                    System.out.println("3");
                    return false;
                }
            }
<<<<<<< HEAD
            else{
                System.out.println("4");
            }
=======
>>>>>>> maintest
        }
        return false;
    }
}
