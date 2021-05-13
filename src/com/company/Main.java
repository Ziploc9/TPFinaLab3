package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        correrjuego();
    }

    /**--------Menus de juego ----------------*/
    public static void menuStart(){
        System.out.println("\n1- Iniciar juego");
        System.out.println("2- Controles");
        System.out.println("3- Guardar partida");
        System.out.println("4- Creditos");
        System.out.println("5- Salir juego\n");
    }

    public static void controles(){

    }

    public static void menuJuego(){
        System.out.println("\n1- Ir a Mimir.");
        System.out.println("2- Buscar madera.");
        System.out.println("3- Buscar piedra.");
        System.out.println("4- Ir a la huerta");
        System.out.println("5- Ir a pescar");
        System.out.println("7- menu principal");
    }

    /**------- Switch inicia el menu principal del juego----*/

    public static void correrjuego(){

        int option = 0;
        Scanner scan = new Scanner(System.in);

        while (option != 11199207){

            menuStart();
            System.out.println("Tu opcion: ");
            option = scan.nextInt();

            switch (option) {

                case 1: // Al entrar al case 1 inicia el juego y entra a otro switch ya dentro del juego
                            juego_deDia();
                    break;

                    /**Aca termina el Switch de rol **/
                    /**Aca continnua el switch del menu principal**/

                case 2:
                    controles();

                    break;

                case 3:
                    System.out.println("¿En serio elegiste esto? ¿Pensas que mi creador es capaz de darme esa habilidad?.");
                    break;

                case 4:
                    System.out.println("Mis creadores son los mejores programadores..\n");
                    String seguir;
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

    /**---------Modo juego de dia--------------*/
    public static void juego_deDia() {
        int option =0;

        Scanner scan = new Scanner(System.in);

        /*Switch inicia rol */

        menuJuego();
        System.out.print("Elijes: ");
        option = scan.nextInt();
        switch (option) {

            case 1:// Dormir

                break;

            case 2:// Buscar madera

                break;

            case 3: // Minar



                break;

            case 4: // Cultivar


                break;

            case 5: // Pescar

                break;

            case 6: // Mejorar Objetos


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
        /*Hacer que corte la funcion cuando llegue a la hora de la noche (contador 5)*/
    }

    /**-----Modo juego noche------**/
    public static void juego_deNoche(){

    }

}

