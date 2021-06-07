package com.company.Herramientas;

public class CaniaDePescar extends Instrumento {
    public CaniaDePescar(int daño, int durabilidad, int resistencia, String nombre) {
        super(daño, durabilidad, resistencia, nombre);
    }

    @Override
    public void mejorarInstrumento(){
        if (buscarEnInventario()>2){
            soltarRecurso(madera,2);
            this.setDaño(this.daño+10);
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
