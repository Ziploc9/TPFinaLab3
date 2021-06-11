package com.company;

import com.company.Herramientas.*;

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

    public static void menuJuegoNocheA(){
        System.out.println("\n1- Entrar a la Casa");
        System.out.println("\n1- Buscar Mounstro");
    }

    public static void menuJuegoNocheC(){
        System.out.println("\n1- Salir de la Casa");
        System.out.println("\n2- Dormir");
        System.out.println("\n3- Mejorar Instrumento");

    }

    public static void menuInstrumento(){
        System.out.println("\n1- Azada");
        System.out.println("\n2- Cania de Pescar");
        System.out.println("\n3- Escudo");
        System.out.println("\n4- Espada");
        System.out.println("\n5- Hacha");
        System.out.println("\n6- Pico");

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
    public static void juego_deNoche(Azada azada, CaniaDePescar cania, Escudo escudo, Espada espada, Hacha hacha, Pico pico) {
        int option = 0, contadorNoche = 0;
        Scanner scan = new Scanner(System.in);

        while (option != 999) {
            menuJuegoNocheA();
            System.out.print("Elijes: ");
            option = scan.nextInt();
            switch (option) {
                case 1://Entrar a la casa
                    System.out.println("");
                    System.out.println("\n1- Entrar a la Casa");
                    System.out.println("\n1- Entrar a la Casa");

                    break;

                case 2://Buscar Mounstro

                    break;

                return contadorNoche;


            }
        }
    }


    public static void juegoCasa(Azada azada, CaniaDePescar cania, Escudo escudo, Espada espada, Hacha hacha, Pico pico){
        int option = 0;
        Scanner scan = new Scanner(System.in);

        while (option != 999){
            switch (option){
                case 1: //Salir de la casa
                    System.out.println("Usted esta saliendo de la casa");
                    break;

                case 2: //Dormir
                    // hacer transcurrir el tiempo hasta que se haga de dia
                    break;

                case 3: //Mejorar Instrumento

                    menuMejorar(azada, cania, escudo, espada, hacha, pico);

                    break;




            }
        }
    }

    public static void menuMejorar(Azada azada, CaniaDePescar cania, Escudo escudo, Espada espada, Hacha hacha, Pico pico){

        /*Azada azada = new Azada(10,20,25,"Azada Inicial");
        CaniaDePescar cania = new CaniaDePescar(10,20,25,"Cania Inicial");
        Escudo escudo = new Escudo(0,20,50,"Escudo Inical");
        Espada espada = new Espada(25,25,15,"Esoada Inicial");
        Hacha hacha = new Hacha(20,20,15,"Hacha Inicial");
        Pico pico = new Pico(10,20,15,"Pico Inical");*/

        Recurso peces = new Recurso("peces", 10,true,8,10,9);

        int option = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Elije la herramienta a mejorar: ");
        menuInstrumento();
        System.out.println("Elijes: ");
        option = scan.nextInt();
        switch (option){

            case 1://Azada

                System.out.println("Vamos a mejorar tu Azada");
                System.out.println("Condicion actual: ");
                azada.mostrarInstrumento();
                azada.mejorarInstrumento();
                System.out.println("Condicion despues de ser mejorada: ");
                azada.mostrarInstrumento();

                break;

            case 2://CaniaDePescar

                System.out.println("Vamos a mejorar tu Cania de Pescar...");
                System.out.println("Condicion actual: ");
                cania.mostrarInstrumento();
                cania.mejorarInstrumento();
                System.out.println("Condicion despues de ser mejorada: ");
                cania.mostrarInstrumento();

                break;

            case 3://Escudo

                System.out.println("Vamos a mejorar tu Escudo");
                System.out.println("Condicion actual: ");
                escudo.mostrarInstrumento();
                escudo.mejorarInstrumento();
                System.out.println("Condicion despues de ser mejorada: ");
                escudo.mostrarInstrumento();

                break;

            case 4://Espada

                System.out.println("Vamos a mejorar tu Espada");
                System.out.println("Condicion actual: ");
                espada.mostrarInstrumento();
                espada.mejorarInstrumento();
                System.out.println("Condicion despues de ser mejorada: ");
                espada.mostrarInstrumento();

                break;
            case 5://Hacha

                System.out.println("Vamos a mejorar tu Hacha");
                System.out.println("Condicion actual: ");
                hacha.mostrarInstrumento();
                hacha.mejorarInstrumento();
                System.out.println("Condicion despues de ser mejorada: ");
                hacha.mostrarInstrumento();

                break;

            case 6://Pico

                System.out.println("Vamos a mejorar tu Pico");
                System.out.println("Condicion actual: ");
                pico.mostrarInstrumento();
                pico.mejorarInstrumento();
                System.out.println("Condicion despues de ser mejorada: ");
                pico.mostrarInstrumento();

                break;
        }


    }

    /*public static void menuCrear(Azada azada, CaniaDePescar cania, Escudo escudo, Espada espada, Hacha hacha, Pico pico){
        int option = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Elije la herramienta a Crear: ");
        menuInstrumento();
        System.out.println("Elijes: ");
        option = scan.nextInt();
        switch (option){

            case 1://Azada

                System.out.println("Vamos a crear tu Azada");
                System.out.println("Condicion actual: ");


                break;

            case 2://CaniaDePescar

                System.out.println("Vamos a mejorar tu Cania de Pescar...");
                System.out.println("Condicion actual: ");
                cania.mostrarInstrumento();
                cania.mejorarInstrumento();
                System.out.println("Condicion despues de ser mejorada: ");
                cania.mostrarInstrumento();

                break;

            case 3://Escudo

                System.out.println("Vamos a mejorar tu Escudo");
                System.out.println("Condicion actual: ");
                escudo.mostrarInstrumento();
                escudo.mejorarInstrumento();
                System.out.println("Condicion despues de ser mejorada: ");
                escudo.mostrarInstrumento();

                break;

            case 4://Espada

                System.out.println("Vamos a mejorar tu Espada");
                System.out.println("Condicion actual: ");
                espada.mostrarInstrumento();
                espada.mejorarInstrumento();
                System.out.println("Condicion despues de ser mejorada: ");
                espada.mostrarInstrumento();

                break;
            case 5://Hacha

                System.out.println("Vamos a mejorar tu Hacha");
                System.out.println("Condicion actual: ");
                hacha.mostrarInstrumento();
                hacha.mejorarInstrumento();
                System.out.println("Condicion despues de ser mejorada: ");
                hacha.mostrarInstrumento();

                break;

            case 6://Pico

                System.out.println("Vamos a mejorar tu Pico");
                System.out.println("Condicion actual: ");
                pico.mostrarInstrumento();
                pico.mejorarInstrumento();
                System.out.println("Condicion despues de ser mejorada: ");
                pico.mostrarInstrumento();

                break;
        }


    }*/
}

