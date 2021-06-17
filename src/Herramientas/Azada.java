package Herramientas;
import Inventario.Inventario;

public class Azada extends Instrumento {

    public Azada(int danio, int durabilidad, int resistencia, String nombre) {
        super(danio, durabilidad, resistencia, nombre);
    }

    public Azada() {
    }

    @Override
    public void mejorarInstrumento(Inventario inventario) {
        if (inventario.usarDelInventario("madera", 2) == true){
            this.setDanio(this.getDanio()+10);
            this.setResistencia(this.getResistencia()+10);
            System.out.format("Mejoraste tu %s, ahora tiene %d de daño y %d de resistencia\n", this.getNombre(), this.getDanio(), this.getResistencia());
        }else{
            System.out.println("No tenes los objetos necesarios");
        }
    }

    @Override
    public void repararInstrumento(Inventario inventario) {
        if(inventario.usarDelInventario("madera", 2)){
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
}