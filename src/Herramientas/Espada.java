package Herramientas;

public class Espada extends Instrumento implements Armas{
    public Espada(int danio, int durabilidad, int resistencia, String nombre) {
        super(danio, durabilidad, resistencia, nombre);
    }

    @Override
    public void mejorarInstrumento("Piedra", 5) {
        if (Inventario.usarDelInventario() == true){
            this.setDanio(this.getDanio()+10);
            this.setResistencia(this.getResistencia()+10);
            System.out.println("  ");
            System.out.format("Mejoraste tu %s, ahora tiene %d de daño y %d de resistencia", this.getNombre(), this.getDanio(), this.getResistencia());
        }else{
            System.out.println("No tenes los objetos necesarios");
        }
    }


    @Override
    public void repararInstrumento() {
        if(Inventario.usarDelInventario("Piedra",3)){
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

    @Override
            public void atacar{}

}
