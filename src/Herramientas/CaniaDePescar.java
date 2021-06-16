package Herramientas;

public class CaniaDePescar extends Instrumento {
    public CaniaDePescar(int danio, int durabilidad, int resistencia, String nombre) {
        super(danio, durabilidad, resistencia, nombre);
    }

    public boolean ponerCarnada(){
        if(Inventario.usarDelInventario("Frutos", 1)){
            return true;
        }else{
            return false;
        }

    }

    @Override
    public void repararInstrumento() {
        if(Inventario.usarDelInventario("Madera", 2)){
            this,setDurabilidad(this.getDurabilidad()+5);
            System.out.println("  ");
            System.out.format("Reparaste tu %s, ahora tiene %d de durabilidad", this.getNombre(), getDurabilidad());
        }else{
            System.out.println("No tenes los objetos necesarios");
        }
    }

    @Override
    public void mejorarInstrumento() {
        if (Inventario.usarDelInventario("Madera", 2) == true){
            this.setDanio(this.getDanio()+10);
            this.setResistencia(this.getResistencia()+10);
            System.out.println("  ");
            System.out.format("Mejoraste tu %s, ahora tiene %d de daño y %d de resistencia", this.getNombre(), this.getDanio(), this.getResistencia());
        }else{
            System.out.println("No tenes los objetos necesarios");
        }
    }

    @Override
    public void mostrarInstrumento(){
        System.out.format("Nombre: %s // Danio: %d // Durabilidad: %d // Resistencia: %d", this.getNombre(), this.getDanio(), this.getDurabilidad(), this.getResistencia());
    }

}
