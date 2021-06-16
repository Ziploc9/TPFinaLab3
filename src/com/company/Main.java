package com.company;
import Inventario.Inventario;
import Personaje.Personaje;
import RecursoNatural.Recurso;
import Herramientas.*;
//import javax.management.timer.Timer;
import java.util.Timer;
import java.util.*;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        correrjuego();
    }

        /**--------Menus de juego ----------------*/
    //region [Menus]

    public static void menuStart() {
        System.out.println("-> 1- Iniciar juego");
        System.out.println("-> 2- Controles");
        System.out.println("-> 3- Guardar partida");
        System.out.println("-> 4- Creditos");
        System.out.println("-> 5- Salir juego\n");
    }

    public static void controles() {

    }

    public static void menuJuego() {
        System.out.println("-> 1- Ir por madera.");
        System.out.println("-> 2- Ir por piedra.");
        System.out.println("-> 3- Ir a la huerta");
        System.out.println("-> 4- Ir a pescar");
        System.out.println("-> 5- Caminar por el lugar");
        System.out.println("-> 6- Estirar\n");
    }

    public static void intro() {
        efectoTipoGrafia("9 am.. *suena tu telefono*");
        efectoTipoGrafia("*Te levantas de la cama y vas a buscar el telefono*\n");

        efectoTipoGrafia("-¿Hola?..");
        efectoTipoGrafia("Anonimo: No salgas de tu casa en la noche.\n");

        efectoTipoGrafia("-¿Cristian?..¿Sos vos?.. Ya te dije que no me interesa tener Linux.");
        efectoTipoGrafia("*El anonimo colgo*\n");

        efectoTipoGrafia("-Dios..me hacen despertar temprano.. mejor voy afuera, de lo que se pierden estos de no estar en Necochea papa..");
        efectoTipoGrafia("*Sales de la casa, el sol te da plenamente*\n");
    }

    public static void pausa(){
        String seguir;
        Scanner scan = new Scanner(System.in);
        seguir = scan.nextLine();
    }

    public static void LimpiarConsola(){
        for(int i=0; i<15;i++){
            System.out.println("\n");
        }
    }

    public static void efectoTipoGrafia(String message) {
        if (message == null)
            return;
        StringBuilder espaciado = new StringBuilder();
        for (int i = 0 ;  i < message.length() ; i++) {
            String sub = message.substring(0, i + 1);
            try {
                Thread.sleep(25L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(espaciado.toString() + sub);
            espaciado.append('\b');
        }
        System.out.println();
    }

    public static void menuMadera(){
        System.out.println("-> 1- Observar.");
        System.out.println("-> 2- Talar");
        System.out.println("-> 3- Guardar Madera");
        System.out.println("-> 4- Ver Inventario");
        System.out.println("-> 5- Dejar de talar\n");
    }

    public static void menuPiedra(){
        System.out.println("-> 1- Observar.");
        System.out.println("-> 2- Picar");
        System.out.println("-> 3- Guardar piedra");
        System.out.println("-> 4- Ver Inventario");
        System.out.println("-> 5- Dejar la mineria\n");
    }

    public static void menuPeces(){
        System.out.println("-> 1- Observar.");
        System.out.println("-> 2- Pescar");
        System.out.println("-> 3- Guardar Pescado");
        System.out.println("-> 4- Ver Inventario");
        System.out.println("-> 5- Dejar la pesca\n");
    }

    public static void menuFrutos(){
        System.out.println("-> 1- Observar.");
        System.out.println("-> 2- Recolectar frutos");
        System.out.println("-> 3- Guardar frutos");
        System.out.println("-> 4- Ver Inventario");
        System.out.println("-> 5- Dejar la huerta\n");
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

    public static void menuVerInventarioFruta(){
        System.out.println("1- Comer\n");
        System.out.println("2- Tirar\n");
    }
    //endregion

    /**------- Crear personaje ---------*/

    //region [Crear Personaje]

    public static void nombrePersonaje(Personaje personaje) {
        String nom="";
        String confirm="";
        Scanner scan = new Scanner(System.in);
        efectoTipoGrafia("Sincronizando estimulos y vista del personaje..");
        efectoTipoGrafia("Sistema cargado, pulse enter");
        pausa();
        efectoTipoGrafia("Hola..Mi nombre es Chaldu y sere tu guia ch ch ch.. ");
        efectoTipoGrafia("Primero dime el nombre que quieres que tu personaje tenga.. si no eliges tendre que hacerlo por ti.");
        efectoTipoGrafia("¿Quieres colocarle un nombre a tu personaje? (Y/N)");
        confirm=scan.nextLine();
        if("Y".equals(confirm) || "y".equals(confirm)){
            efectoTipoGrafia("Nombre del personaje: ");
            nom = scan.nextLine();
            System.out.println("Asignaste tu nombre con exito invocador.");
        }else if("n".equals(confirm) || "N".equals(confirm)){
            efectoTipoGrafia("Se te asignara un nombre aguarda un instante..");

        } else{
            efectoTipoGrafia("Error en confirmacion..se auto seteara un nombre..disfruta la experiencia y recuerda es un juego.");

        }
        System.out.println("----------------------------------");
        efectoTipoGrafia("Nombre: "+ personaje.getNombre());
        efectoTipoGrafia("Vida: "+personaje.getVida());
        efectoTipoGrafia("Fuerza: "+personaje.getDamage());
        efectoTipoGrafia("Resistencia: "+personaje.getResistencia());
        efectoTipoGrafia("Velocidad: "+personaje.getVelocidad());
        efectoTipoGrafia("Armas en mano: No");
        System.out.println("----------------------------------");
        efectoTipoGrafia("*Sistema cargado* pulse enter");
    }


    //endregion

    /**------- Switch inicia el menu principal del juego----*/

    //region [Correr Juego principal]
    public static void correrjuego(){
        int option = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\nBienvenido a la Comarca");

        Personaje personaje = new Personaje("Julian",200,10,10,10);

        Recurso peces = new Recurso("peces", 10,true,8,10,9);
        Recurso frutos = new Recurso("frutos",5, true,5,7,20);
        Recurso piedra = new Recurso("piedra", 0,true, 15, 20, 30);
        Recurso madera = new Recurso("madera", 0 ,true,10, 20, 25);


        Azada azada = new Azada(10,20,25,"Azada");
        CaniaDePescar cania = new CaniaDePescar(10,20,25,"Cania");
        Escudo escudo = new Escudo(0,20,50,"Escudo");
        Espada espada = new Espada(25,25,15,"Espada");
        Hacha hacha = new Hacha(20,20,15,"Hacha");
        Pico pico = new Pico(10,20,15,"Pico");

        Inventario inventario = new Inventario(madera, piedra, frutos, peces);

        while (option != 11199207){

            menuStart();
            System.out.println("Tu opcion: ");
            option = scan.nextInt();

            switch (option) {

                case 1:

                    LimpiarConsola();
                    nombrePersonaje(personaje);
                    pausa();
                    LimpiarConsola();
                    intro();
                    pausa();
                    LimpiarConsola();
                    juego_deDia(personaje, madera, piedra, frutos, peces, inventario);

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
                    pausa();System.out.println("AYUDA me estan torturando.. esas variables.. clases y switchs.. no quiero morir asi\n");
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

    //region [De Dia]
    public static void juego_deDia(Personaje personaje,Recurso madera, Recurso piedra, Recurso frutos, Recurso peces,Inventario inventario) {
        int option = 0, contadorDia = 0, optionRecurso = 0, acumuladorRecurso = 0, num=0;
/**
        Timer tiempo = new Timer();
        TimerTask noche = new TimerTask() {
            @Override
            public void run() {
                menuJuegoNocheA();

            }
        };
        tiempo.scheduleAtFixedRate(noche, 10000, 1000);
**/
        Scanner scan = new Scanner(System.in);
        Random numeroRandom = new Random();
        while (option != 9212) {
            efectoTipoGrafia("¿Que quieres hacer ahora?");
            menuJuego();
            System.out.print("Elijes: ");
            option = scan.nextInt();
            switch (option) {

                case 1:// Buscar madera
                    //region [Madera]
                    acumuladorRecurso = 0;
                    optionRecurso = 0;
                    LimpiarConsola();
                    madera.reiniciarRecurso();
                    efectoTipoGrafia("Estas caminando hacia los arboles..");
                    pausa();
                    while (optionRecurso != 9124) {
                        menuMadera();
                        optionRecurso = scan.nextInt();
                        LimpiarConsola();
                        switch (optionRecurso) {

                            case 1:

                                if (madera.comprobarRecurso()) {
                                    efectoTipoGrafia("Caminas entre los arboles y compruebas que no esten humedos..");
                                    efectoTipoGrafia("Encuentras un arbol perfecto para talar..");
                                } else {
                                    efectoTipoGrafia("No encontraste ningun arbol listo para talar..");
                                }
                                pausa();
                                break;

                            case 2:
                                if (madera.comprobarRecurso()) {
                                    /**Reemplazar el 20 por el getDanio del arma*/

                                    acumuladorRecurso = madera.recolectarRecurso(20);

                                } else {
                                    efectoTipoGrafia("Tomas el Hacha pero no encuentras ningun arbol para talar..");
                                }

                                break;

                            case 3:

                                if (acumuladorRecurso > 0) {
                                    inventario.agregarAlInventario(madera, acumuladorRecurso);
                                }else {

                                    System.out.println("Debes tener al menos 1 del recurso quieres explotar..");
                                }
                                break;

                            case 4:
                                inventario.verInventario();
                                break;

                            case 5:
                                optionRecurso = 9124;

                                break;
                            default:
                                System.out.println("Restringete a las opciones que te damos.");
                                break;
                        }
                    }
                    //endregion
                    break;

                case 2: // Minar
                    //region [Minar]
                    acumuladorRecurso = 0;
                    optionRecurso = 0;
                    LimpiarConsola();
                    piedra.reiniciarRecurso();
                    efectoTipoGrafia("Estas caminando hacia las piedras..");
                    pausa();
                    while (optionRecurso != 9124) {
                        menuPiedra();
                        optionRecurso = scan.nextInt();
                        LimpiarConsola();
                        switch (optionRecurso) {

                            case 1:

                                if (piedra.comprobarRecurso()) {
                                    efectoTipoGrafia("Caminas entre algunas piedras buscando la perfecta para picar..");
                                    efectoTipoGrafia("Encuentras una piedra perfecta para picar..");
                                } else {
                                    efectoTipoGrafia("No encontraste ninguna piedra de para picar..");
                                }
                                pausa();
                                break;
                            case 2:
                                if (piedra.comprobarRecurso()) {
                                    /**Reemplazar el 20 por el getDanio del arma*/

                                    acumuladorRecurso = piedra.recolectarRecurso(20);

                                } else {
                                    efectoTipoGrafia("Tomas el pico pero no encuentras ninguna piedra para minar..");
                                }
                                break;

                            case 3:

                                acumuladorRecurso = +1; // borrar, se uso para testear
                                if (acumuladorRecurso > 0) {
                                    inventario.agregarAlInventario(piedra, acumuladorRecurso);
                                }else{

                                    System.out.println("Debes tener al menos 1 del recurso quieres explotar..");
                                }
                                break;

                            case 4:
                                inventario.verInventario();
                                break;

                            case 5:
                                optionRecurso = 9124;
                                break;
                            default:
                                System.out.println("Restringete a las opciones que te damos.");
                                break;
                        }
                    }

                    //endregion
                    break;

                case 3: // Cultivar
                    //region [Cultivo]
                    acumuladorRecurso = 0;
                    optionRecurso = 0;
                    LimpiarConsola();
                    frutos.reiniciarRecurso();
                    efectoTipoGrafia("Estas caminando hacia la huerta..");
                    pausa();
                    while (optionRecurso != 9124) {
                        menuFrutos();
                        optionRecurso = scan.nextInt();
                        LimpiarConsola();
                        switch (optionRecurso) {

                            case 1:

                                if (frutos.comprobarRecurso()) {
                                    efectoTipoGrafia("Te acercas a la huerta y te pones en cuclillas para ver los frutos..");
                                    efectoTipoGrafia("Ves los frutos que estan maduros..");
                                } else {
                                    efectoTipoGrafia("Los frutos que viste no estaban listos..");
                                }
                                pausa();
                                break;
                            case 2:
                                if (frutos.comprobarRecurso()) {
                                    acumuladorRecurso = frutos.recolectarRecurso();
                                } else {
                                    efectoTipoGrafia("Llegaste a la huerta pero no habia ningun fruto maduro..");
                                }
                                break;

                            case 3:

                                if (acumuladorRecurso > 0) {
                                    inventario.agregarAlInventario(frutos, acumuladorRecurso);
                                }else {

                                    System.out.println("Debes tener al menos 1 del recurso quieres explotar..");
                                }
                                break;

                            case 4:
                                inventario.verInventario();
                                menuVerInventarioFruta();
                                num = scan.nextInt();
                                if(num == 1){
                                    personaje.comer();
                                }else if(num == 2){

                                }else{
                                    System.out.println("Opcion invalida\n");
                                }
                                break;
                            case 5:
                                optionRecurso = 9124;
                                break;
                            default:
                                System.out.println("Restringete a las opciones que te damos.");
                                break;
                        }
                    }

                    //endregion
                    break;

                case 4: // Pescar
                    // region [Pesca]
                    acumuladorRecurso = 0;
                    optionRecurso = 0;
                    LimpiarConsola();
                    peces.reiniciarRecurso();
                    efectoTipoGrafia("Estas caminando hacia al lago..");
                    pausa();
                    while (optionRecurso != 9124) {
                        menuPeces();
                        optionRecurso = scan.nextInt();
                        LimpiarConsola();
                        switch (optionRecurso) {

                            case 1:

                                if (peces.comprobarRecurso()) {
                                    efectoTipoGrafia("Caminas hacia el lago para ver si hay peces..");
                                    efectoTipoGrafia("Encuentras algunos peces nadando en el lago..");
                                } else {
                                    efectoTipoGrafia("No encontraste ningun pez en el lago..");
                                }
                                pausa();
                                break;
                            case 2:
                                if (peces.comprobarRecurso()) {
                                    /**Reemplazar el 20 por el getDanio del arma*/

                                    acumuladorRecurso = peces.recolectarRecurso(20);

                                } else {
                                    efectoTipoGrafia("Tomas la cania de pescar pero no encuentras ningun pez..");
                                }
                                break;

                            case 3:

                                if (acumuladorRecurso > 0) {
                                    inventario.agregarAlInventario(peces, acumuladorRecurso);
                                }else {
                                    System.out.println("Debes tener al menos 1 del recurso quieres explotar..");
                                }
                                break;

                            case 4:
                                inventario.verInventario();
                                break;
                            case 5:
                                optionRecurso = 9124;
                                break;
                            default:
                                System.out.println("Restringete a las opciones que te damos.");
                                break;
                        }
                    }
                    //endregion
                    break;

                case 5: // caminar por el lugar
                    efectoTipoGrafia("Caminas al rededor de tu casa y ves que todo esta bien\n");
                    break;

                case 6: //estirarse
                    if (numeroRandom.nextInt() == 8) {
                        efectoTipoGrafia("Te estiras un poco asi descontracturante y ganando 1 punto de vida..");
                        personaje.setVida(personaje.getVida() + 1);
                    } else {
                        efectoTipoGrafia("Te estiras para relajarte un poco..");
                    }
                    break;

                case 7:
                    option = 9212;
                    break;

                default:
                    System.out.println("¿Por que haces esto? Ahora le voy a subir la vida y el daño al enemigo, segui nomas.");
                    pausa();
                    //subir vida y daño al enemigo
                    break;

            }
        }

    }

    //endregion


    /**-----Modo juego noche------**/
    //region [De noche]
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



            }
        }
    }
    //endregion

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

