package com.company.Herramientas;

public class Instrumentos {
    private int daño;
    private int durabilidad;
    private int resistencia;
    private String nombre;

    public Instrumentos(int daño, int durabilidad, int resistencia, String nombre) {
        this.daño = daño;
        this.durabilidad = durabilidad;
        this.resistencia = resistencia;
        this.nombre = nombre;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(int durabilidad) {
        this.durabilidad = durabilidad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mejorarObjeto() {
        // coprobar si tienen los items en el inventario. (Caña = madera, espada = piedra, Hacha/Pico/Azada = madera+piedra, Escudo = madera, a  }
        if (/*tenes los objetos en el inventario*/){
            setDaño(this.daño+10);
        }else{
            System.out.println("No tenes los objetos necesarios");
        }
    }

    public void romperObjeto(){
        int durabilidad = this.getDurabilidad();
        if(durabilidad > 0)
            this.setDurabilidad(durabilidad--);
    }

    public void crearObjeto(){

    }



}