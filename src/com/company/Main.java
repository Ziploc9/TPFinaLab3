package com.company;
import RecursoNatural.Recurso;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        correrjuego();
    }

        /**
         * Terminar la historia introductoria
         * Agregar crear personaje
         * Terminar los recursos naturales
         * mejorar el contador para cambiar horaria a la noche
         * */

        /**--------Menus de juego ----------------*/
    //region [Menus]

    public static void menuStart() {
        System.out.println("\n1- Iniciar juego");
        System.out.println("2- Controles");
        System.out.println("3- Guardar partida");
        System.out.println("4- Creditos");
        System.out.println("5- Salir juego\n");
    }

    public static void controles() {

    }

    public static void menuJuego() {
        System.out.println("\n1- Buscar madera.");
        System.out.println("2- Buscar piedra.");
        System.out.println("3- Ir a la huerta");
        System.out.println("4- Ir a pescar");
        System.out.println("5- menu principal");
    }

    public static void intro(Scanner scan) {
        System.out.println("\n T");
        String seguir;
        try {
            seguir = scan.nextLine();
        } catch (Exception e) {
        }
    }

    //endregion

        /**------- Switch inicia el menu principal del juego----*/
    //region [Menu principal]
    public static void correrjuego(){

        int option = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bienvenido a la Comarca");
        String seguir;
        try {
            seguir = scan.nextLine();
        } catch (Exception e) {
        }
        while (option != 11199207){

            menuStart();
            System.out.println("Tu opcion: ");
            option = scan.nextInt();

            switch (option) {

                case 1:
                    intro(scan);
                    juego_deDia();
                    break;

                case 2:
                    controles();

                    break;

                case 3:
                    System.out.println("¿En serio elegiste esto? ¿Pensas que mi creador es capaz de darme esa habilidad?.");
                    break;

                case 4:
                    System.out.println("Mis creadores son los mejores programadores..\n");

                    Scanner pausa = new Scanner(System.in);
                    System.out.println("* Bip Bup Bap -presiona enter- Bip Bap Soy Un Simple Programa Bup Bip Bap -rapido antes de que vengan- Bip Bap *");
                    try
                    {
                        seguir = pausa.nextLine();
                    }
                    catch(Exception ignored){}

                    System.out.println("AYUDA me estan torturando.. esas variables.. clases y switchs.. no quiero morir asi\n");
                    System.out.println("Los culpables son Enzo Sansalone, Fermin Garcia y Martin Vallejo, apruebalos por favor, no dejes que Cosmo muera asi.. :(");
                    break;

                case 5:
                    option = 11199207;
                    System.out.println("Adios vuelvas prontos.. Lo siento, mi creador ve mucho Los Simpson.");
                    break;

                default:
                    System.out.println("Oye no te pases de listo, mi creador me aviso sobre personas como tu, introducce bien la opcion.");
                    System.out.println("No me voy a olvidar de esto humano.. te va a ser mas dificil matar a tu enemigo ahora.");
                    break;
            }

        }
    }
    //endregion

    /**---------Modo juego de dia--------------*/
    public static int juego_deDia() {
        int option =0, contadorDia=0;
        Scanner scan = new Scanner(System.in);
        Recurso peces = new Recurso("peces", 10,true,8,10,9);
        Recurso frutos = new Recurso("frutos",5, true,5,7,20);
        Recurso piedra = new Recurso("piedra", true, 15, 20, 30);
        Recurso madera = new Recurso("madera",  true,10, 20, 25);

            menuJuego();
            System.out.print("Elijes: ");
            option = scan.nextInt();
            switch (option) {

                case 1:// Buscar madera

                    break;

                case 2: // Minar

                    break;

                case 3: // Cultivar


                    break;

                case 4: // Pescar

                    break;

                case 5:

                    break;

                default:
                    System.out.println("¿Por que haces esto? Ahora le voy a subir la vida y el daño al enemigo, segui nomas.");
                    try {
                        String seguir = scan.nextLine();
                    } catch (Exception ignored) {
                    }
                    //subir bida y daño al enemigo
                    break;

            }
            contadorDia++;
        return contadorDia;
    }

    /**-----Modo juego noche------**/
    public static void juego_deNoche(){

    }

}

