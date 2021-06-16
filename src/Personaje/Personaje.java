package Personaje;
import Herramientas.Instrumento;
import Inventario.Inventario;

public class Personaje {

    private String nombre;
    private int vida;
    private int damage;
    private int resistencia;
    private float velocidad;
    private Instrumento enMano;

    public Personaje(String nombre, int vida, int damage, int resistencia, float velocidad, Instrumento enMano){
        this.nombre = nombre;
        this.vida = vida;
        this.damage = damage;
        this.resistencia = resistencia;
        this.velocidad = velocidad;
        this.enMano = enMano;
    }

    public Personaje(String nombre, int vida, int damage, int resistencia, float velocidad){

        this.nombre = nombre;
        this.vida = vida;
        this.damage = damage;
        this.resistencia = resistencia;
        this.velocidad = velocidad;
    }

    //region [Getters y Setters]

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public Instrumento getEnMano() {
        return enMano;
    }

    public void setEnMano(Instrumento enMano) {
        this.enMano = enMano;
    }

    //endregion

    //region [Metodos]

    public void abrircasa(){
        System.out.println("Abriste la casa");
    }

    public void comer(){


    }

    public void equipar(){


    }

    public void desequipar(){

    }
    //endregion
}


