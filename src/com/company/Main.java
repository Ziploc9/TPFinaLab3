package com.company;
import Inventario.*;
import RecursoNatural.Recurso;
import Herramientas.*;

import java.util.Random;
import Personaje.*;
import java.io.*;


import java.io.FileWriter;
import java.io.*;
import com.google.gson.Gson;
import java.util.Scanner;
import java.io.FileReader;


public class Main {

    public static void main(String[] args) {
        correrjuego();
    }



    //region [Escritura]

    public static void pausa() {
        String seguir;
        efectoTipoGrafia("Presione enter...");
        Scanner scan = new Scanner(System.in);
        seguir = scan.nextLine();
    }

    public static void LimpiarConsola() {
        for (int i = 0; i < 15; i++) {
            System.out.println("\n");
        }
    }

    // Efecto de escritura
    public static void efectoTipoGrafia(String message) {
        if (message == null)
            return;
        StringBuilder espaciado = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
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

    //endregion
    /**--------Menus de juego ----------------*/
    /**   Escritura de los menues, previos a los switchs*/
    //region [Menus]

    public static void menuStart() {
        efectoTipoGrafia("¿Que quieres hacer ahora?");
        System.out.println("-> 1- Iniciar juego");
        System.out.println("-> 2- Cargar Partida");
        System.out.println("-> 3- Creditos");
        System.out.println("-> 4- Salir juego");
        System.out.print("Elijes: ");
    }

    public static void menuJuego() {
        efectoTipoGrafia("¿Que quieres hacer ahora?");
        System.out.println("-> 1- Ir por madera.");
        System.out.println("-> 2- Ir por piedra.");
        System.out.println("-> 3- Ir a la huerta");
        System.out.println("-> 4- Ir a pescar");
        System.out.println("-> 5- Caminar por el lugar");
        System.out.println("-> 6- Estirar");
        System.out.print("Elijes: ");
    }

    public static void intro() {
        efectoTipoGrafia("9 am.. suena tu telefono");
        efectoTipoGrafia("Te levantas de la cama y vas a buscar el telefono\n");

        efectoTipoGrafia("-¿Hola?..");
        efectoTipoGrafia("Anonimo: No salgas de tu casa en la noche.\n");

        efectoTipoGrafia("-¿Cristian?..¿Sos vos?.. Ya te dije que no me interesa tener Linux.");
        efectoTipoGrafia("El anonimo colgo\n");

        efectoTipoGrafia("-Dios..me hacen despertar temprano.. mejor voy afuera, de lo que se pierden estos de no estar en Necochea papa..");
        efectoTipoGrafia("Sales de la casa, el sol te da plenamente\n");

    }



    public static void menuMadera() {
        efectoTipoGrafia("¿Que quieres hacer ahora?");
        System.out.println("-> 1- Observar.");
        System.out.println("-> 2- Talar");
        System.out.println("-> 3- Guardar Madera");
        System.out.println("-> 4- Ver Inventario");
        System.out.println("-> 5- Dejar de talar\n");
        System.out.print("Elijes: ");
    }

    public static void menuPiedra() {
        efectoTipoGrafia("¿Que quieres hacer ahora?");
        System.out.println("-> 1- Observar.");
        System.out.println("-> 2- Picar");
        System.out.println("-> 3- Guardar piedra");
        System.out.println("-> 4- Ver Inventario");
        System.out.println("-> 5- Dejar la mineria\n");
        System.out.print("Elijes: ");
    }

    public static void menuPeces() {
        efectoTipoGrafia("¿Que quieres hacer ahora?");
        System.out.println("-> 1- Observar.");
        System.out.println("-> 2- Pescar");
        System.out.println("-> 3- Guardar Pescado");
        System.out.println("-> 4- Ver Inventario");
        System.out.println("-> 5- Dejar la pesca");
        System.out.print("Elijes: ");
    }

    public static void menuFrutos() {
        efectoTipoGrafia("¿Que quieres hacer ahora?");
        System.out.println("-> 1- Observar.");
        System.out.println("-> 2- Recolectar frutos");
        System.out.println("-> 3- Guardar frutos");
        System.out.println("-> 4- Ver Inventario");
        System.out.println("-> 5- Dejar la huerta");
        System.out.print("Elijes: ");
    }

    public static void menuJuegoNocheC() {
        efectoTipoGrafia("¿Que quieres hacer ahora?");
        System.out.println("1- Salir de la Casa para pelear con el mounstro");
        System.out.println("2- Dormir");
        System.out.println("3- Mejorar Instrumento");
        System.out.println("4- Reparar Instrumento");
        System.out.println("5- Cerrar Puerta");
        System.out.print("Elijes: ");
    }

    public static void menuJuegoNocheSinDormir(){
        efectoTipoGrafia("¿Que quieres hacer ahora?");
        System.out.println("1- Salir de la Casa para pelear con el mounstro");
        System.out.println("2- Dormir");
        System.out.println("2- Mejorar Instrumento");
        System.out.println("3- Reparar Instrumento");
        System.out.print("Elijes: ");
    }

    public static void menuInstrumento(int opcion) {
        if(opcion == 1){
            efectoTipoGrafia("Elije la herramienta a mejorar: ");
        }else{
            efectoTipoGrafia("Elije la herramienta a reparar: ");
        }
        System.out.println("1- Azada");
        System.out.println("2- Cania de Pescar");
        System.out.println("3- Escudo");
        System.out.println("4- Espada");
        System.out.println("5- Hacha");
        System.out.println("6- Pico");
        System.out.print("Elijes: ");
        }

    public static void menuPeleaA(){
        efectoTipoGrafia("¿Que quieres hacer ahora?");
        System.out.println("1- Correr hacia la derecha.");
        System.out.println("2- Correr hacia la izquierda.");
        System.out.println("3- Correr directo a el.");
        System.out.println("4- Esperar a que se acerque a ti.");
        System.out.print("Elijes: ");
        }

    public static void elegirArma(){
        efectoTipoGrafia("Que arma deseas usar?");
        System.out.println("1- Agarrar la espada.\n");
        System.out.println("2- Agarrar el hacha.\n");
        System.out.println("3- Agarrar el escudo.\n");
        System.out.print("Elijes: ");
        }
        //endregion

    // se pasa una cadena string y se verifica que no tenga numeros
    public static boolean verificarLetras(String cadena) {
        //Recorremos cada caracter de la cadena y comprobamos si son letras.
        //Para comprobarlo, lo pasamos a mayuscula y consultamos su numero ASCII.
        //Si está fuera del rango 65 - 90, es que NO son letras.
        //Para ser más exactos al tratarse del idioma español, tambien comprobamos
        //el valor 165 equivalente a la Ñ

        for (int i = 0; i < cadena.length(); i++)
        {
            char caracter = cadena.toUpperCase().charAt(i);
            if (165 != (int) caracter && ((int) caracter < 65 || (int) caracter > 90))
                return false; //Se ha encontrado un caracter que no es letra
        }

        //Terminado el bucle sin que se hay retornado false, es que todos los caracteres son letras
        return true;
    }


        /**------- Crear personaje ---------*/

        //Asigna nombre del personaje
        public static void nombrePersonaje(Personaje personaje){
            String nom;
            String confirm;
            Scanner scan = new Scanner(System.in);
            efectoTipoGrafia("Sincronizando estimulos y vista del personaje..");
            efectoTipoGrafia("Sistema cargado, pulse enter");
            pausa();
            efectoTipoGrafia("Hola..Mi nombre es Chaldu y sere tu guia ch ch ch.. ");
            efectoTipoGrafia("Primero dime el nombre que quieres que tu personaje tenga.. si no eliges tendre que hacerlo por ti.");
            efectoTipoGrafia("¿Quieres colocarle un nombre a tu personaje? (Y/N)");
            confirm = scan.nextLine();
            if ("Y".equals(confirm) || "y".equals(confirm)) {
                efectoTipoGrafia("Nombre del personaje: ");
                nom = scan.nextLine();

                if (!verificarLetras(nom)){
                    System.out.println("Ingresaste un nombre invalido, ahora se te asignara uno random");
                }else
                {
                    personaje.setNombre(nom);
                    System.out.println("Asignaste tu nombre con exito invocador.");
                }
            } else if ("n".equals(confirm) || "N".equals(confirm)) {
                efectoTipoGrafia("Se te asignara un nombre aguarda un instante..");

            } else {
                efectoTipoGrafia("Error en confirmacion..se auto seteara un nombre..disfruta la experiencia y recuerda es un juego.");

            }
            System.out.println("----------------------------------");
            efectoTipoGrafia("Nombre: " + personaje.getNombre());
            efectoTipoGrafia("Vida: " + personaje.getVida());
            efectoTipoGrafia("Fuerza: " + personaje.getDamage());
            efectoTipoGrafia("Resistencia: " + personaje.getResistencia());
            efectoTipoGrafia("Velocidad: " + personaje.getVelocidad());
            efectoTipoGrafia("Armas en mano: No");
            System.out.println("----------------------------------");
            efectoTipoGrafia("*Sistema cargado* pulse enter");
        }


        /**------- Switch inicia el menu principal del juego----*/

        //region [Json]

        //guarda la caja en el archivo
        public static void guardarCajita (Box cajita){
            Gson gson = new Gson();
            String json = gson.toJson(cajita);

            try {
                FileWriter fw = new FileWriter("Cajita.json");
                fw.write(json);
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

        //crea la caja para despues guardarla en el archivo
        public static void guardarPartida (Inventario inventario, Personaje personaje, Azada azada, CaniaDePescar cania, Escudo escudo, Espada espada, Hacha hacha, Pico pico,int contadorDias){
            Box caja = new Box(inventario, personaje, azada, cania, escudo, espada, hacha, pico, contadorDias);
            guardarCajita(caja);
            efectoTipoGrafia("Se ha guardo la partida automaticamente. . .");
            pausa();
            LimpiarConsola();
        }
        //endregion

        /**------- Switch inicia el menu principal del juego----*/

        //region [Menu principal]
        public static void correrjuego()
        {
            int option = 0,contadorTiempos = 0, contadorDias = 0;

            Recurso peces = new Recurso("peces", 10, true, 8, 10, 9);
            Recurso frutos = new Recurso("frutos", 5, true, 5, 7, 20);
            Recurso piedra = new Recurso("piedra", 0, true, 15, 20, 30);
            Recurso madera = new Recurso("madera", 0, true, 10, 20, 25);

            Personaje personaje = new Personaje("Luciano", 105, 10, 10, 10);
            Fantasma fantasma = new Fantasma("Fan de Linux", 120, 20, 10, 5);

            Azada azada = new Azada(10, 20, 25, "Azada");
            CaniaDePescar cania = new CaniaDePescar(10, 20, 25, "Cania");
            Escudo escudo = new Escudo(0, 20, 50, "Escudo");
            Espada espada = new Espada(25, 25, 15, "Espada");
            Hacha hacha = new Hacha(20, 20, 15, "Hacha");
            Pico pico = new Pico(10, 20, 15, "Pico");

            Inventario inventario = new Inventario(madera, piedra, frutos, peces);

            Box cajita = new Box();

            while (option != 11199207) {

                menuStart();
                option = validador();
                switch (option) {

                    case 1: //Iniciar Juego


                        System.out.println("\n\nBienvenido a la Comarca");

                        LimpiarConsola();
                        nombrePersonaje(personaje);
                        pausa();
                        LimpiarConsola();
                        intro();
                        pausa();
                        LimpiarConsola();

                        while (contadorDias <= 5) {
                            System.out.println("Dia: " + contadorDias);
                            juego_deDia(personaje,fantasma, madera, piedra, frutos, peces, inventario, contadorTiempos,hacha,pico,cania);
                            guardarPartida(inventario, personaje, azada, cania, escudo, espada, hacha, pico, contadorDias);

                            contadorTiempos = 0;
                            juego_deNoche(personaje, fantasma, azada, cania, escudo, espada, hacha, pico, inventario, contadorTiempos);
                            guardarPartida(inventario, personaje, azada, cania, escudo, espada, hacha, pico, contadorDias);
                            contadorDias++;
                            contadorTiempos = 0;
                        }

                        efectoTipoGrafia("Se te terminaron los dias, vuelves al inicio");

                        break;


                case 2: //Cargar Partida

                     azada = new Azada();
                     cania = new CaniaDePescar();
                     escudo = new Escudo();
                     espada = new Espada();
                     hacha = new Hacha();
                     pico = new Pico();

                     inventario = new Inventario();

                     //Cargar partida
                    try {
                        File file = new File("Cajita.json");
                        BufferedReader br = new BufferedReader(new FileReader(file));
                        Gson gson1 = new Gson();
                        cajita = gson1.fromJson(br, Box.class);
                        br.close();
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    inventario = cajita.getInventario();
                    personaje = cajita.getPersonaje();
                    azada = cajita.getAzada();
                    cania = cajita.getCaniaDePescar();
                    escudo = cajita.getEscudo();
                    espada = cajita.getEspada();
                    hacha = cajita.getHacha();
                    pico = cajita.getPico();
                    contadorDias= cajita.getContadorDia();

                    while(contadorDias <= 5) {
                        System.out.println("Dia: "+ contadorDias);
                        juego_deDia(personaje,fantasma, madera, piedra, frutos, peces, inventario, contadorTiempos,hacha,pico,cania);
                        guardarPartida(inventario,personaje,azada,cania,escudo,espada,hacha,pico,contadorDias);
                        contadorTiempos=0;
                        juego_deNoche(personaje, fantasma, azada, cania, escudo, espada, hacha, pico, inventario,contadorTiempos);
                        guardarPartida(inventario,personaje,azada,cania,escudo,espada,hacha,pico,contadorDias);
                        contadorDias++;
                        contadorTiempos=0;
                    }

                        break;


                    case 3: //Creditos
                        System.out.println("Mis creadores son los mejores programadores..\n");
                        efectoTipoGrafia("* Bip Bup Bap -presiona enter- Bip Bap Soy Un Simple Programa Bup Bip Bap -rapido antes de que vengan- Bip Bap *");
                        pausa();
                        System.out.println("AYUDA me estan torturando.. esas variables.. clases y switchs.. no quiero morir asi\n");
                        System.out.println("Los culpables son Enzo Sansalone, Fermin Garcia y Martin Vallejo, apruebalos por favor, no dejes que Cosmo muera asi.. :(\n");
                        pausa();
                        break;

                    case 4: // Salir del Juego
                        option = 11199207;
                        System.out.println("Adios vuelvas prontos.. Lo siento, mi creador ve mucho Los Simpson.");
                        break;

                    default:
                        System.out.println("Oye no te pases de listo, mi creador me aviso sobre personas como tu, introducce bien la opcion.");
                        System.out.println("No me voy a olvidar de esto humano.. te va a ser mas dificil matar a tu enemigo ahora.\n");
                        fantasma.buffear();
                        pausa();
                        break;
                }

            }
        }
        //endregion


        //Recibe lo que ingresa el usuario por teclado, si es un numero lo devuelve
        public static int validador(){
            Integer conversor;
            String soption ="";
            Scanner scan = new Scanner(System.in);
            soption = scan.next();

            try {
                conversor = Integer.parseInt(soption);
                return conversor;
            } catch (NumberFormatException nfe){
                return 0;
            }
        }

        /**---------Modo juego de dia--------------*/
        //region [De Dia]
        public static void juego_deDia(Personaje personaje,Fantasma fantasma, Recurso madera, Recurso piedra, Recurso frutos, Recurso peces, Inventario inventario,int contadorTiempos, Hacha hacha, Pico pico,CaniaDePescar cania){
            int option = 0,optionRecurso = 0, acumuladorRecurso = 0;


            while (option != 9212) {
                menuJuego();
                option = validador();

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
                            optionRecurso=validador();
                            LimpiarConsola();
                            switch (optionRecurso) {

                                case 1:
                                    contadorTiempos++;
                                    if (madera.comprobarRecurso()) {
                                        efectoTipoGrafia("Caminas entre los arboles y compruebas que no esten humedos..");
                                        efectoTipoGrafia("Encuentras un arbol perfecto para talar..\n");
                                    } else {
                                        efectoTipoGrafia("No encontraste ningun arbol listo para talar..\n");
                                    }
                                    pausa();
                                    break;
                                case 2:
                                    contadorTiempos++;
                                    if (madera.comprobarRecurso()) {

                                        acumuladorRecurso = acumuladorRecurso + madera.recolectarRecurso(hacha.getDanio());

                                    } else {
                                        efectoTipoGrafia("Tomas el Hacha pero no encuentras ningun arbol para talar..\n");
                                    }

                                    break;

                                case 3:
                                    contadorTiempos++;
                                    if (acumuladorRecurso > 0) {
                                        inventario.agregarAlInventario(madera, acumuladorRecurso);
                                        acumuladorRecurso = 0;
                                        System.out.println("Guardaste los trozos de madera en forma vertical dentro de la bolsa.\n");
                                    } else {
                                        System.out.println("Debes tener al menos 1 del recurso quieres explotar..\n");
                                    }

                                    break;

                                case 4:
                                    contadorTiempos++;
                                    inventario.verInventario();
                                    break;

                                case 5:
                                    contadorTiempos++;
                                    optionRecurso = 9124;
                                    System.out.println("Tomas la bolsa y te la cargas a los hombros.\n");
                                    break;
                                default:
                                    System.out.println("Restringete a las opciones que te damos.\n");
                                    break;
                            }
                            if (contadorTiempos == 10) {
                                optionRecurso = 9124;
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
                        efectoTipoGrafia("Estas caminando hacia las piedras..\n");
                        pausa();
                        while (optionRecurso != 9124) {
                            menuPiedra();
                            optionRecurso = validador();
                            LimpiarConsola();
                            switch (optionRecurso) {

                                case 1:
                                    contadorTiempos++;
                                    if (piedra.comprobarRecurso()) {
                                        efectoTipoGrafia("Caminas entre algunas piedras buscando la perfecta para picar..");
                                        efectoTipoGrafia("Encuentras una piedra perfecta para picar..\n");
                                    } else {
                                        efectoTipoGrafia("No encontraste ninguna piedra de para picar..\n");
                                    }
                                    pausa();
                                    break;
                                case 2:
                                    contadorTiempos++;
                                    if (piedra.comprobarRecurso()) {
                                        acumuladorRecurso = acumuladorRecurso + piedra.recolectarRecurso(pico.getDanio());

                                    } else {
                                        efectoTipoGrafia("Tomas el pico pero no encuentras ninguna piedra para minar..\n");
                                    }
                                    break;

                                case 3:
                                    contadorTiempos++;
                                    if (acumuladorRecurso > 0) {
                                        inventario.agregarAlInventario(piedra, acumuladorRecurso);
                                        acumuladorRecurso = 0;
                                        System.out.println("Guardaste los pedazos de piedra en un compartimento especial de la bolsa.\n");
                                    } else {
                                        System.out.println("Debes tener al menos 1 del recurso quieres explotar..\n");
                                    }
                                    break;

                                case 4:
                                    contadorTiempos++;
                                    inventario.verInventario();
                                    break;

                                case 5:
                                    contadorTiempos++;
                                    optionRecurso = 9124;
                                    System.out.println("Tomas la bolsa y te la cargas a los hombros.\n");
                                    break;
                                default:
                                    System.out.println("Restringete a las opciones que te damos.\n");
                                    pausa();
                                    break;
                            }
                            if (contadorTiempos == 10) {
                                optionRecurso = 9124;
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
                        efectoTipoGrafia("Estas caminando hacia la huerta..\n");
                        pausa();
                        while (optionRecurso != 9124) {
                            menuFrutos();
                            optionRecurso = validador();
                            LimpiarConsola();
                            switch (optionRecurso) {

                                case 1:
                                    contadorTiempos++;
                                    if (frutos.comprobarRecurso()) {
                                        efectoTipoGrafia("Te acercas a la huerta y te pones en cuclillas para ver los frutos..");
                                        efectoTipoGrafia("Ves los frutos que estan maduros..\n");
                                    } else {
                                        efectoTipoGrafia("Los frutos que viste no estaban listos..\n");
                                    }
                                    pausa();
                                    break;
                                case 2:
                                    contadorTiempos++;
                                    if (frutos.comprobarRecurso()) {
                                        acumuladorRecurso = acumuladorRecurso + frutos.recolectarRecurso();
                                        System.out.println("Tomas la azada que estaba apoyada contra el corral del huerto");
                                        System.out.println("Extraes los frutos con la Azada cuidadosamente");
                                        System.out.println("Dejas la azada apoyada donde estaba antes\n");
                                    } else {
                                        efectoTipoGrafia("Llegaste a la huerta pero no habia ningun fruto maduro..\n");
                                    }
                                    break;

                                case 3:
                                    contadorTiempos++;
                                    if (acumuladorRecurso > 0) {
                                        inventario.agregarAlInventario(frutos, acumuladorRecurso);
                                        acumuladorRecurso = 0;
                                        System.out.println("Guardaste los frutos en un costado de la bolsa.\n");
                                    } else {
                                        System.out.println("Debes tener al menos 1 del recurso quieres explotar..\n");
                                    }
                                    break;

                                case 4:
                                    contadorTiempos++;
                                    inventario.verInventario();
                                    break;
                                case 5:
                                    contadorTiempos++;
                                    optionRecurso = 9124;
                                    System.out.println("Tomas la bolsa y te la cargas a los hombros.\n");
                                    break;
                                default:
                                    System.out.println("Restringete a las opciones que te damos.\n");
                                    break;
                            }
                            if (contadorTiempos == 10) {
                                optionRecurso = 9124;
                            }
                        }

                        //endregion
                        break;

                    case 4: // Pescar
                        //region [Pesca]
                        acumuladorRecurso = 0;
                        optionRecurso = 0;
                        LimpiarConsola();
                        peces.reiniciarRecurso();
                        efectoTipoGrafia("Estas caminando hacia al lago..\n");
                        pausa();
                        while (optionRecurso != 9124) {
                            menuPeces();
                            optionRecurso = validador();
                            LimpiarConsola();
                            switch (optionRecurso) {

                                case 1:
                                    contadorTiempos++;
                                    if (peces.comprobarRecurso()) {
                                        efectoTipoGrafia("Caminas hacia el lago para ver si hay peces..");
                                        efectoTipoGrafia("Encuentras algunos peces nadando en el lago..\n");
                                    } else {
                                        efectoTipoGrafia("No encontraste ningun pez en el lago..\n");
                                    }
                                    pausa();
                                    break;
                                case 2:
                                    contadorTiempos++;
                                    if (peces.comprobarRecurso()) {
                                        acumuladorRecurso = acumuladorRecurso + peces.recolectarRecurso(cania.getDanio());
                                    } else {
                                        efectoTipoGrafia("Tomas la cania de pescar pero no encuentras ningun pez..\n");
                                    }
                                    break;

                                case 3:
                                    contadorTiempos++;
                                    if (acumuladorRecurso > 0) {
                                        inventario.agregarAlInventario(peces, acumuladorRecurso);
                                        acumuladorRecurso = 0;
                                        System.out.println("Envolviste el pescado en una bolsa y lo guardaste en un costado de la bolsa.\n");
                                    } else {
                                        System.out.println("Debes tener al menos 1 del recurso quieres explotar..\n");
                                    }
                                    break;

                                case 4:
                                    contadorTiempos++;
                                    inventario.verInventario();
                                    break;
                                case 5:
                                    contadorTiempos++;
                                    optionRecurso = 9124;
                                    System.out.println("Tomas la bolsa y te la cargas a los hombros.");
                                    break;
                                default:
                                    System.out.println("Restringete a las opciones que te damos.");
                                    break;
                            }
                            if (contadorTiempos == 10) {
                                optionRecurso = 9124;
                            }
                        }

                        //endregion
                        break;

                    case 5: // caminar por el lugar
                        contadorTiempos++;
                        efectoTipoGrafia("Caminas alrededor de tu casa y ves que todo esta bien\n");
                        break;

                    case 6: //estirarse
                        int numRand = (int)(Math.random()*4+1);
                        contadorTiempos++;
                        if (numRand == 4) {
                            efectoTipoGrafia("Te estiras un poco asi descontracturante y ganando 1 punto de vida..\n");
                            personaje.setVida(personaje.getVida() + 1);
                        } else {
                            efectoTipoGrafia("Te estiras para relajarte un poco..\n");
                        }
                        break;

                    default:
                        System.out.println("¿Por que haces esto? Ahora le voy a subir la vida y el daño al enemigo, segui nomas.\n");
                        fantasma.buffear();
                        pausa();

                        break;

                }
                if (contadorTiempos == 10) {
                    option = 9212;
                }

            }
            madera.reiniciarRecurso();
            peces.reiniciarRecurso();
            frutos.reiniciarRecurso();
            piedra.reiniciarRecurso();
        }

        //endregion

        /**-----Modo juego noche------**/

        public static void juego_deNoche(Personaje personaje, Fantasma fantasma, Azada azada, CaniaDePescar cania, Escudo escudo, Espada espada, Hacha hacha, Pico pico, Inventario inventario,int contadorTiempo){
            int option = 0;
            boolean puerta = true;

            LimpiarConsola();
            efectoTipoGrafia("Se hace de noche y decides entrar a la casa\n");
            while (option != 999) {
                efectoTipoGrafia("¿Que quieres hacer ahora?");
                if(puerta){
                    menuJuegoNocheC();
                }else{
                    menuJuegoNocheSinDormir();
                }

                System.out.println("Elijes: ");
                option = validador();

                switch (option) {
                    case 1: //Salir de la casa
                        contadorTiempo++;
                        puerta = true;
                        efectoTipoGrafia("Usted esta saliendo de la casa");
                        efectoTipoGrafia("Ves al fantasma de linux acercarse");
                        efectoTipoGrafia("Es momento de enseñarle al Fantasma de Linux quien manda..");

                        menuPelea(personaje, fantasma, espada, hacha, escudo);
                        break;

                    case 2: //Dormir

                        contadorTiempo = 8;
                        comprobarPuerta(fantasma, inventario, puerta);

                        break;

                    case 3: //Mejorar Instrumento
                        contadorTiempo += 2;

                        menuMejorar(azada, cania, escudo, espada, hacha, pico, inventario);
                        comprobarPuerta(fantasma, inventario, puerta);

                        break;


                    case 4: //Reparar Instrumento
                        contadorTiempo += 2;
                        menuReparar(azada, cania, escudo, espada, hacha, pico, inventario, contadorTiempo);
                        comprobarPuerta(fantasma, inventario, puerta);

                        break;
                    case 5: // Cerrar Puerta

                        if(puerta){
                            efectoTipoGrafia("Cierras la puerta con exito\n");
                            puerta = false;
                        }else{
                            efectoTipoGrafia("¿Por que no piensas bien antes de elelgir? estas perdiendo tiempo\n");
                        }
                        break;
                    default:
                        efectoTipoGrafia("Trata de elegir correctamente la opcion");
                        efectoTipoGrafia("O sufriras las consecuensias");
                        break;
                }
                if (contadorTiempo >= 8) {
                    option = 999;
                }
            }
        }

        public static void menuMejorar(Azada azada, CaniaDePescar cania, Escudo escudo, Espada espada, Hacha hacha, Pico pico, Inventario inventario){
            int option = 0;
            menuInstrumento(1);
            option = validador();
            switch (option) {

                case 1://Azada

                    System.out.println("Vamos a mejorar tu Azada\n");
                    System.out.println("Condicion actual: \n");
                    azada.mostrarInstrumento();
                    azada.mejorarInstrumento(inventario);
                    System.out.println("\nCondicion despues de ser mejorada: \n");
                    azada.mostrarInstrumento();
                    pausa();

                    break;

                case 2://CaniaDePescar

                    System.out.println("Vamos a mejorar tu Cania de Pescar...\n");
                    System.out.println("Condicion actual: \n");
                    cania.mostrarInstrumento();
                    cania.mejorarInstrumento(inventario);
                    System.out.println("\nCondicion despues de ser mejorada: \n");
                    cania.mostrarInstrumento();
                    pausa();

                    break;

                case 3://Escudo

                    System.out.println("Vamos a mejorar tu Escudo");
                    System.out.println("Condicion actual: \n");
                    escudo.mostrarInstrumento();
                    escudo.mejorarInstrumento(inventario);
                    System.out.println("\nCondicion despues de ser mejorada: ");
                    escudo.mostrarInstrumento();

                    break;

                case 4://Espada

                    System.out.println("Vamos a mejorar tu Espada");
                    System.out.println("Condicion actual: \n");
                    espada.mostrarInstrumento();
                    espada.mejorarInstrumento(inventario);
                    System.out.println("\nCondicion despues de ser mejorada: ");
                    espada.mostrarInstrumento();

                    break;
                case 5://Hacha

                    System.out.println("Vamos a mejorar tu Hacha");
                    System.out.println("Condicion actual: \n");
                    hacha.mostrarInstrumento();
                    hacha.mejorarInstrumento(inventario);
                    System.out.println("\nCondicion despues de ser mejorada: ");
                    hacha.mostrarInstrumento();

                    break;

                case 6://Pico

                    System.out.println("Vamos a mejorar tu Pico");
                    System.out.println("Condicion actual: \n");
                    pico.mostrarInstrumento();
                    pico.mejorarInstrumento(inventario);
                    System.out.println("\nCondicion despues de ser mejorada: ");
                    pico.mostrarInstrumento();

                    break;

                default:
                    efectoTipoGrafia("Le pedimos que use algunas de las opciones mencionadas");
                    efectoTipoGrafia("o sufrira las consecuensias");
                    pausa();
                    break;
            }


        }

        public static void menuReparar(Azada azada, CaniaDePescar cania, Escudo escudo, Espada espada, Hacha hacha, Pico pico, Inventario inventario,int contadorTiempo){
            int option = 0;
            menuInstrumento(0);
            option = validador();
            switch (option) {

                case 1://Azada

                    System.out.println("Vamos a reparar tu Azada");
                    System.out.println("Condicion actual: \n");
                    azada.mostrarInstrumento();
                    azada.repararInstrumento(inventario);
                    System.out.println("\nCondicion despues de ser reparada: ");
                    azada.mostrarInstrumento();

                    break;

                case 2://CaniaDePescar

                    System.out.println("Vamos a reparar tu Cania de Pescar...");
                    System.out.println("Condicion actual: \n");
                    cania.mostrarInstrumento();
                    cania.repararInstrumento(inventario);
                    System.out.println("\nCondicion despues de ser reparada: ");
                    cania.mostrarInstrumento();

                    break;

                case 3://Escudo

                    System.out.println("Vamos a reparar tu Escudo");
                    System.out.println("Condicion actual: \n");
                    escudo.mostrarInstrumento();
                    escudo.repararInstrumento(inventario);
                    System.out.println("\nCondicion despues de ser reparada: ");
                    escudo.mostrarInstrumento();

                    break;

                case 4://Espada

                    System.out.println("Vamos a reparar tu Espada");
                    System.out.println("Condicion actual: \n");
                    espada.mostrarInstrumento();
                    espada.repararInstrumento(inventario);
                    System.out.println("\nCondicion despues de ser reparada: ");
                    espada.mostrarInstrumento();

                    break;
                case 5://Hacha

                    System.out.println("Vamos a reparar tu Hacha");
                    System.out.println("Condicion actual: \n");
                    hacha.mostrarInstrumento();
                    hacha.repararInstrumento(inventario);
                    System.out.println("\nCondicion despues de ser reparada: ");
                    hacha.mostrarInstrumento();

                    break;

                case 6://Pico

                    System.out.println("Vamos a reparar tu Pico");
                    System.out.println("Condicion actual: \n");
                    pico.mostrarInstrumento();
                    pico.repararInstrumento(inventario);
                    System.out.println("\nCondicion despues de ser reparada: ");
                    pico.mostrarInstrumento();

                    break;

                default:
                    efectoTipoGrafia("Le pedimos que use algunas de las opciones mencionadas");
                    efectoTipoGrafia("o sufrira las consecuensias");
                    pausa();
                    break;
            }


        }

        public static void comprobarPuerta(Fantasma fantasma, Inventario inventario,boolean puerta){
            if (fantasma.destruir(inventario, puerta)) {   // En caso de no cerrar la puerta
                System.out.println("\n");
                efectoTipoGrafia("Perdiste, por no usar python");
                efectoTipoGrafia("Vuelves al Menu Principal\n");
                pausa();
                LimpiarConsola();
                correrjuego();
            }
        }

        //Determina si ataca primero el fantasma o el personaje
        public static void secuenciaDeAtaqueRandom(Personaje personaje, Fantasma fantasma, Espada espada, Hacha hacha, Escudo escudo){
            int numRand = 0;

            numRand = (int) (Math.random() * 1 + 1);
            if (numRand == 1) {
                atacaPersonaje(personaje, fantasma, espada, hacha, escudo);
                atacaFantasma(personaje, fantasma);
            } else {
                atacaFantasma(personaje, fantasma);
                atacaPersonaje(personaje, fantasma, espada, hacha, escudo);
            }

        }

        public static void menuPelea(Personaje personaje, Fantasma fantasma, Espada espada, Hacha hacha, Escudo escudo)
        {

            int opcion = 0;
            while (opcion != 999) {

                menuPeleaA();
                opcion = validador();
                switch (opcion) {

                    case 1: // Correr Derecha

                        secuenciaDeAtaqueRandom(personaje,fantasma,espada,hacha,escudo);

                        break;

                    case 2:// Correr Izquierda

                        secuenciaDeAtaqueRandom(personaje,fantasma,espada,hacha,escudo);

                        break;

                    case 3: // Correr Directo a el
                        atacaFantasma(personaje, fantasma);
                        atacaPersonaje(personaje, fantasma, espada, hacha, escudo);
                        break;

                    case 4: // Esperar a que se acerque
                        atacaPersonaje(personaje, fantasma, espada, hacha, escudo);
                        atacaFantasma(personaje, fantasma);
                        break;

                    default:
                        efectoTipoGrafia("Intentas romper el programa???");
                        efectoTipoGrafia("Puede que lo logres pero no en este momento");
                        pausa();
                        break;
                }
                if (fantasma.getVida() <= 0) {

                    opcion = 999;
                } else {
                    if (personaje.getVida() <= 0) {
                        opcion = 999;
                    }
                }
            }
            if (personaje.getVida() <= 0) {
                System.out.println("El fantasma se acerca a tu cuerpo y te mira riendose y colocando un pinguino en tu cabeza.\n");
                pausa();
                LimpiarConsola();
                correrjuego();
            } else if (fantasma.getVida() <= 0) {
                System.out.println("Te levantas del suelo cansado y con sangre en la ropa..ves al fantasma de linux tirado y gritas ¡¡¡WINDOWS!!!..\n");
                pausa();
                LimpiarConsola();
                correrjuego();
            }
        }


        //Realiza un ataque random del fantasma
        public static void atacaFantasma(Personaje personaje, Fantasma fantasma){
            int danio = 0;
            int numRand = (int)(Math.random()*4+1);
            efectoTipoGrafia("El fantasma se acerca y realiza un ataque\n");
            danio = fantasma.atacar(numRand);
            switch (numRand) {
                case 1:
                    System.out.println("El fantasma usa el comando mas peligroso.... ");
                    System.out.println(".......");
                    System.out.println(".......");
                    System.out.println(".......");
                    System.out.println(".......");
                    System.out.println("sudo...");
                    System.out.println("SUPERUSER DO");
                    System.out.println("Con esto logra realizar un golpe critico\n");
                    break;

                case 2:
                    System.out.println("El fantasma esta intentado arreglar su codigo interno");
                    System.out.println("nuevamente tiene problemas de compatibilidad\n");
                    System.out.println("Te riees de el mientra el sigue perdiendo el tiempo\n");
                    break;

                case 3:

                    System.out.println("El fantasma usa el comando zip");
                    System.out.println("logrando comprimir tu vida\n");
                    break;

                case 4:

                    System.out.println("El fantasma habla sobre la superioridad de linux como sistema operativo");
                    System.out.println("Pero ve tu collar de windows\n");
                    System.out.println("Se enfurece e intenta atacarte");
                    System.out.println("Pero gritas AGUANTE WINDOWS y tira su poder especial cd..");
                    System.out.println("Volviendo a su posicion anterior\n");
                    break;

                case 5:

                    System.out.println("El fantasma usa el comando rmdir");
                    System.out.println("Eliminando parte de tu vida....\n");
                    break;
                default:
                    break;
            }
            if (danio >= personaje.getResistencia()) {
                danio -= personaje.getResistencia();
                System.out.println("\nTu vida bajo de " + personaje.getVida() + " a " + (personaje.getVida() - danio));
                personaje.setVida(personaje.getVida() - danio);
            } else {
                efectoTipoGrafia("\nTu resistencia es mayor al daño del fantasma, resistes el golpe\n");
            }
        }

        //Realiza un ataque random del Personaje
        public static void atacaPersonaje(Personaje personaje, Fantasma fantasma, Espada espada, Hacha hacha, Escudo escudo){
            int danio = 0;
            int option = 0;
            efectoTipoGrafia("Te acercas a el fantasma y realizas un ataque\n");
            elegirArma();
            option = validador();
            switch (option) {
                case 1: // Espada
                    danio = espada.atacar();
                    if (danio >= fantasma.getResistencia()) {
                        danio -= fantasma.getResistencia();
                        System.out.println("\nLa vida del fantasma bajo de " + fantasma.getVida() + " a " + (fantasma.getVida() - danio));
                        fantasma.setVida(fantasma.getVida() - danio);
                    } else {
                        efectoTipoGrafia("La resistencia del fantasma es mayor que el poder de tu ataque\n");
                        efectoTipoGrafia("El fantasma no sufre ningun danio\n");
                    }
                    break;

                case 2: // Hacha
                    danio = hacha.atacar();
                    if (danio >= fantasma.getResistencia()) {
                        danio -= fantasma.getResistencia();
                        System.out.println("\nLa vida del fantasma bajo de " + fantasma.getVida() + " a " + (fantasma.getVida() - danio));
                        fantasma.setVida(fantasma.getVida() - danio);
                    } else {
                        efectoTipoGrafia("La resistencia del fantasma es mayor que el poder de tu ataque\n");
                        efectoTipoGrafia("El fantasma no sufre ningun danio\n");
                    }
                    break;

                case 3:
                    if (personaje.getResistencia() <= escudo.getResistencia()) {
                        efectoTipoGrafia("Te equipas el escudo\n");
                        personaje.setResistencia(personaje.getResistencia() + escudo.getResistencia());
                        efectoTipoGrafia("De esta manera aumentas tu resistencia a los ataques\n");
                    } else {
                        efectoTipoGrafia("acaso eres tonto ??");
                        efectoTipoGrafia("ya tienes el escudo equipado\n");
                    }

                    break;

                default:

                    efectoTipoGrafia("Le pedimos que use algunas de las opciones mencionadas");
                    efectoTipoGrafia("o sufrira las consecuensias");
                    pausa();

                    break;
            }

        }

}