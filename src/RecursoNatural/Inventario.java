package RecursoNatural;

public class Inventario {
    Recurso recursos[];

    public Inventario(){
    }

    public void agregarAlInventario(){
    }

    public void verInventario(){
        for (Recurso x:this.recursos){
            System.out.println("*" + x.getNombre() + " (" + x.getCantidadRecurso());


        }
    }

    public void soltarItem(){
    }

    public void vaciarInventario(){
    }


}
