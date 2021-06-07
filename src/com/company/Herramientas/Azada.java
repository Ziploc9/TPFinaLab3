package com.company.Herramientas;

public class Azada extends Instrumento {

    public Azada(int daño, int durabilidad, int resistencia, String nombre) {
        super(daño, durabilidad, resistencia, nombre);
    }

    @Override
    public void mejorarInstrumento(){
        if (buscarEnInventario()>2){
            soltarRecurso(madera,2);
            this.setDaño(this.getDaño()+10);
            System.out.format("Mejoraste tu %s, ahora tiene %d de daño", this.getNombre(), this.getDaño());
        }else{
            System.out.println("No tenes los objetos necesarios");
        }
    }

    @Override
    public void mostrarInstrumento(){
        System.out.format("Nombre: %s // Danio: %d // Durabilidad: %d // Resistencia: %d", this.getNombre(), this.getDaño(), this.getDurabilidad(), this.getResistencia());
    }
}
