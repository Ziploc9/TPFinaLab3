package Herramientas;
import Inventario.Inventario;

public class Instrumento {
    private int danio;
    private int durabilidad;
    private int resistencia;
    private String nombre;

    public Instrumento(int danio, int durabilidad, int resistencia, String nombre) {
        this.danio = danio;
        this.durabilidad = durabilidad;
        this.resistencia = resistencia;
        this.nombre = nombre;
    }

    public Instrumento() {
    }


    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
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


    // Imprime el instrumento por pantalla
    public void mostrarInstrumento(){
        System.out.format("Nombre: %s // Danio: %d // Durabilidad: %d // Resistencia: %d\n", this.getNombre(), this.getDanio(), this.getDurabilidad(), this.getResistencia());
    }

    //Si tiene los recursos necesarios, aumenta el daño y la resistencia del instrumento
    public void mejorarInstrumento(Inventario inventario) {
        if (inventario.usarDelInventario("", 1)){
            this.setDanio(this.getDanio()+10);
            this.setResistencia(this.getResistencia()+10);
            System.out.format("Mejoraste tu %s, ahora tiene %d de daño y %d de resistencia\n", this.getNombre(), this.getDanio(), this.getResistencia());
        }else{
            System.out.println("No tenes los objetos necesarios\n");
        }
    }

    //Si tiene los recursos necesarios, aumenta la durabilidad del instrumento
    public void repararInstrumento(Inventario inventario) {
        if(inventario.usarDelInventario("hola", 1)){
            this.setDurabilidad(this.getDurabilidad()+5);
            System.out.format("Reparaste tu %s, ahora tiene %d de durabilidad\n", this.getNombre(), getDurabilidad());
        }else{
            System.out.println("No tenes los objetos necesarios\n");
        }
    }

    //Reduce la durabilidad del instrumento
    public void desgastarInstrumento(){
        if(this.getDurabilidad() > 0) {
            this.setDurabilidad(this.getDurabilidad()-2);
        }else{
            System.out.println(" Tu "+ this.getNombre() + "esta roto, no se puede usar\n");
        }
    }





}