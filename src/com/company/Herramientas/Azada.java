package com.company.Herramientas;

public class Azada extends Instrumento {

    public Azada(int danio, int durabilidad, int resistencia, String nombre) {
        super(danio, durabilidad, resistencia, nombre);
    }

    @Override
    public void mejorarInstrumento() {
        if (Inventario.usarDelInventario("Madera", 2) == true){
            this.setDanio(this.getDanio()+10);
            System.out.println("  ");
            System.out.format("Mejoraste tu %s, ahora tiene %d de daño", this.getNombre(), this.getDanio());
        }else{
            System.out.println("No tenes los objetos necesarios");
        }
    }

    @Override
    public void repararInstrumento() {
        if(Inventario.usarDelInventario("Madera", 2)){
            this,setDurabilidad(this.getDurabilidad()+5);
            System.out.println("  ");
            System.out.format("Reparaste tu %s, ahora tiene %d de durabilidad", this.getNombre(), getDurabilidad());
        }else{
            System.out.println("No tenes los objetos necesarios");
        }
    }

    @Override
    public void mostrarInstrumento(){
        System.out.format("Nombre: %s // Danio: %d // Durabilidad: %d // Resistencia: %d", this.getNombre(), this.getDanio(), this.getDurabilidad(), this.getResistencia());
    }
}
