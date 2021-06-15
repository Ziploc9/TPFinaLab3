package Herramientas;
import Inventario.Inventario;
import RecursoNatural.Recurso;

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

    public enum Instrumentonombre {
        AZADA,
        CANIADEPESCAR,
        ESCUDO,
        ESPADA,
        HACHA,
        PICO;
    }



    public int getDaño() {
        return danio;
    }

    public void setDaño(int danio) {
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

    public void mostrarInstrumento(){
        System.out.format("Nombre: %s // Danio: %d // Durabilidad: %d // Resistencia: %d", this.getNombre(), this.getDaño(), this.getDurabilidad(), this.getResistencia());
    }

    public void mejorarInstrumento() {


    }

    public void romperInstrumento(){
        if(this.getDurabilidad() > 0) {
            this.setDurabilidad(this.getDurabilidad()-1);
            System.out.println("se mejoro tu " + this.getNombre());
        }else{
            System.out.println(" Tu "+ this.getNombre() + "esta roto, no se puede usar");
        }
    }

    public Instrumento crearInstrumento(){
        Instrumento aux = new Instrumento(5,5,5,Instrumentonombre.PICO.name());
        return aux;
    }



}
