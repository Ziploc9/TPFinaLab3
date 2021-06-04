package RecursoNatural;

public class Inventario {
    private Recurso recursos[];
    private int peso;
    private int cantRecursosActuales=0;


    public Inventario(){
    }

    public void agregarAlInventario(Recurso x, int cantidad){
        int i=0;
        for (TipoRecurso aux:this.recursos) {
            if (aux.getNombre().equals(x.getNombre())) {
                if (peso < 30) {
                    recursos[i].setCantidadRecurso(recursos[i].getCantidadRecurso() + cantidad);
                    this.peso = peso + cantidad;
                }
            }
            else {
                if(this.cantRecursosActuales == 0){
                    recursos[0] = x;
                    recursos[0].setCantidadRecurso(recursos[0].getCantidadRecurso() + cantidad);

                }
                else {
                    recursos[cantRecursosActuales + 1] = x;
                    recursos[cantRecursosActuales + 1].setCantidadRecurso(recursos[i].getCantidadRecurso() + cantidad);
                }
            }
            i++;
        }
    }



    public void verInventario(){
        for (Recurso aux:this.recursos){
            System.out.println("*" + aux.getNombre() + " (" + aux.getCantidadRecurso() + ")");
        }
    }

    public void soltarItem(){
    }
}
