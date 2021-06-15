package Herramientas;

public class Hacha extends Instrumento implements  Armas{
    public Hacha(int daño, int durabilidad, int resistencia, String nombre) {
        super(daño, durabilidad, resistencia, nombre);
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
