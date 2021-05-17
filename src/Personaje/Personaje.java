package Personaje;

public class Personaje {

    private String nombre;
    private int vida;
    private int damage;
    private int resistencia;
    private float velocidad;
    private boolean armaEnMano = false;

    public Personaje(String nombre, int vida, int damage, int resistencia, float velocidad, boolean armaEnMano){
        this.nombre = nombre;
        this.vida = vida;
        this.damage = damage;
        this.resistencia = resistencia;
        this.velocidad = velocidad;
        this.armaEnMano = armaEnMano;
    }

    public Personaje(){

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

    public boolean getArmaenMano(){return armaEnMano;}

    public void setArmaEnMano(boolean armaenmano){this.armaEnMano = armaenmano;}

    //endregion

    //region [Metodos]

    public static void caminar(String lugar){
        System.out.println("Estas caminando hacia "+lugar);
    }

    public static void abrircasa(){

    }
    //endregion
}
