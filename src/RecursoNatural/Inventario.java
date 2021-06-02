package RecursoNatural;

public class Inventario {
    private Recurso recursos[];
    private int peso;
    private int cantRecursosActuales=0;


    public Inventario(){
    }

    public void agregarAlInventario(Recurso x, int cantidadAgregar){
        int i=0;
        if(this.cantRecursosActuales == 0) {
            recursos[0] = x;
            recursos[0].setCantidadRecurso(recursos[0].getCantidadRecurso() + cantidadAgregar);
        }
        else{
            for (TipoRecurso aux:this.recursos) {
                if (aux.getNombre().equals(x.getNombre())) {
                    if (peso < 30) {
                        recursos[i].setCantidadRecurso(recursos[i].getCantidadRecurso() + cantidadAgregar);
                        this.peso = this.peso + cantidadAgregar;
                    } else {
                        System.out.println("Llevas demasiado peso!");
                    }
                }
                i++;
            }
        }
    }

    public void verInventario(){
        for (Recurso aux:this.recursos){
            System.out.println("*" + aux.getNombre() + " (" + aux.getCantidadRecurso() + ")");
        }
    }

    public void soltarRecurso(Recurso x, int cantidadTirar){
        int i=0;
        if(this.cantRecursosActuales == 0) {
            System.out.println("El inventario esta vacio!");
        }
        else{
            for (TipoRecurso aux:this.recursos) {
                if (aux.getNombre().equals(x.getNombre())) {
                    if(recursos[i].getCantidadRecurso() - cantidadTirar > 0){
                        recursos[i].setCantidadRecurso(recursos[i].getCantidadRecurso() - cantidadTirar);
                        this.peso = this.peso - cantidadTirar;
                    }
                    else{
                        System.out.println("No puedes arrojar mas de lo que tienes!");
                    }
                }
                i++;
            }
        }

    }
}