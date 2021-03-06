package Herramientas;
import Inventario.Inventario;

public class Pico extends Instrumento {
    public Pico(int danio, int durabilidad, int resistencia, String nombre) {
        super(danio, durabilidad, resistencia, nombre);
    }

    public Pico() {
    }

    @Override
    public void mejorarInstrumento(Inventario inventario) {
        if (inventario.usarDelInventario("piedra",2) == true){
            this.setDanio(this.getDanio()+10);
            this.setResistencia(this.getResistencia()+10);
            System.out.format("Mejoraste tu %s, ahora tiene %d de daño y %d de resistencia\n", this.getNombre(), this.getDanio(), this.getResistencia());
        }else{
            System.out.println("No tenes los objetos necesarios\n");
        }
    }

    @Override
    public void repararInstrumento(Inventario inventario) {
        if(inventario.usarDelInventario("piedra", 2)){
            this.setDurabilidad(this.getDurabilidad()+5);
            System.out.format("Reparaste tu %s, ahora tiene %d de durabilidad\n", this.getNombre(), getDurabilidad());
        }else{
            System.out.println("No tenes los objetos necesarios\n");
        }
    }

    @Override
    public void mostrarInstrumento(){
        System.out.format("Nombre: %s // Danio: %d // Durabilidad: %d // Resistencia: %d\n", this.getNombre(), this.getDanio(), this.getDurabilidad(), this.getResistencia());
    }
}