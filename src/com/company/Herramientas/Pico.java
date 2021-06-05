package com.company.Herramientas;

public class Pico extends Instrumento {
    public Pico(int daño, int durabilidad, int resistencia, String nombre) {
        super(daño, durabilidad, resistencia, nombre);
    }

    @Override
    public void mejorarInstrumento(){
        if (buscarEnInventario(madera)>2 && buscarEnInventario(piedra)>2){
            soltarRecurso(madera,2);
            soltarRcurso(piedra,2);
            this.setDaño(this.daño+10);
            System.out.format("Mejoraste tu %s, ahora tiene %i de daño", this.getNombre(), this.getDaño());
        }else{
            System.out.println("No tenes los objetos necesarios");
        }
    }

    public void minar(){

    }
}
