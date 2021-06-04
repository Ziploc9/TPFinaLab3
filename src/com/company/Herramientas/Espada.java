package com.company.Herramientas;

public class Espada extends Instrumentos implements Armas{
    public Espada(int daño, int durabilidad, int resistencia, String nombre) {
        super(daño, durabilidad, resistencia, nombre);
    }

    @Override
    public void mejorarObjeto() {
        super.mejorarObjeto();
    }
}
