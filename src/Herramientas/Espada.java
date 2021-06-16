package Herramientas;

public class Espada extends Instrumento implements Armas{
    public Espada(int danio, int durabilidad, int resistencia, String nombre) {
        super(danio, durabilidad, resistencia, nombre);
    }

    @Override
    public void mejorarInstrumento(){

    }

    @Override
    public void mostrarInstrumento(){
        System.out.format("Nombre: %s // Danio: %d // Durabilidad: %d // Resistencia: %d", this.getNombre(), this.getDaño(), this.getDurabilidad(), this.getResistencia());
    }

    @Override
    public void Atacar() {

    }
}