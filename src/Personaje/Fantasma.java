package Personaje;

import RecursoNatural.Inventario;

public class Fantasma extends Personaje{

    public Fantasma(String nombre, int vida, int danio, int resistencia, float velocidad, boolean armaEnMano) {
        super(nombre, vida, danio, resistencia, velocidad, armaEnMano);
        nombre = "elmalo";
        vida = 120;
        danio = 20;
        resistencia = 50;
        velocidad = 5;
        armaEnMano = false;
    }
    public boolean casaAbierta(){
        //verifica si la casa esta abierta o no
    }
    public void destruir(Inventario inv){
        if(casaAbierta() == true){
            System.out.println("Olvidaste de cerrar la casa y fuiste asesinado!");
        }
        else{
            System.out.println("El fantasma no logro entrar a la casa. Pero logro causar algunos daños");


        }
    }


}
