package Inventario;
import RecursoNatural.*;

public class Inventario {
    private Recurso recursos[] = new Recurso[4];
    private int peso;
    private int cantRecursosActuales;


    public Inventario(Recurso madera, Recurso piedra, Recurso frutos, Recurso peces){
        this.peso=0;
        this.recursos[0] = madera;
        this.recursos[1] = piedra;
        this.recursos[2] = frutos;
        this.recursos[3] = peces;
        recursos[0].setCantidadRecurso(0);
        recursos[1].setCantidadRecurso(0);
        recursos[2].setCantidadRecurso(0);
        recursos[3].setCantidadRecurso(0);
    }

    public void agregarAlInventario(Recurso x, int cantidadAgregar){
        int i=0;
        for (TipoRecurso aux : recursos){
            if (aux.getNombre().equals(x.getNombre())){
                checkearPeso(cantidadAgregar,i);
            }
            i++;
        }
    }

    public void checkearPeso(int cantidadAgregar, int i){
        if (peso + cantidadAgregar < 30) {
            recursos[i].setCantidadRecurso(recursos[i].getCantidadRecurso() + cantidadAgregar);
            this.peso = this.peso + cantidadAgregar;
        }
        else {
            int exceso = peso + cantidadAgregar - 30;
            int cantidadAgregarNueva = cantidadAgregar - exceso;
            recursos[i].setCantidadRecurso(recursos[i].getCantidadRecurso() + cantidadAgregarNueva);
            System.out.println("Se desperdiciaron " + exceso + " recursos ya que tienes un exceso de peso!");
        }
    }

    public void verInventario(){
        if(this.cantRecursosActuales == 0) {
            System.out.println("El inventario esta vacio!");
        }
        else{
            for (Recurso aux:this.recursos){
                System.out.println("*" + aux.getNombre() + " (" + aux.getCantidadRecurso() + ")");
            }
        }
    }

    public void soltarRecurso(String nombre, int cantidadTirar){
        int i=0;
        if(this.cantRecursosActuales == 0) {
            System.out.println("El inventario esta vacio!");
        }
        else{
            for (TipoRecurso aux:this.recursos) {
                if (aux.getNombre().equals(nombre)) {
                    if(recursos[i].getCantidadRecurso() - cantidadTirar > 0){
                        recursos[i].setCantidadRecurso(recursos[i].getCantidadRecurso() - cantidadTirar);
                        this.peso = this.peso - cantidadTirar;
                    }
                    else{
                        System.out.println("No puedes soltar mas de lo que tienes!");
                    }
                }
                i++;
            }
        }

    }

    public boolean usarDelInventario(String nombre, int cantidad){ //solo para usar en otras funciones!
        for (Recurso aux:this.recursos) {
            if (aux.getNombre().equals(nombre)) {
                if((aux.getCantidadRecurso() - cantidad) > 0){
                    aux.setCantidadRecurso(aux.getCantidadRecurso() - cantidad);
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return false;
            }
        }
        return false;
    }
}