package com.company;


import Inventario.*;
import RecursoNatural.*;
import RecursoNatural.Recurso;
import Herramientas.*;
import java.util.Random;
import Personaje.*;


import java.io.*;
import java.util.Random;
import java.io.FileWriter;
import com.google.gson.Gson;

import javax.swing.text.html.parser.Parser;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.FileReader;


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
        System.out.println("-> 5- Salir juego");
    }

    public static void controles() {

    }

    public static void menuJuego() {
        System.out.println("-> 1- Ir por madera.");
        System.out.println("-> 2- Ir por piedra.");
        System.out.println("-> 3- Ir a la huerta");
        System.out.println("-> 4- Ir a pescar");
        System.out.println("-> 5- Caminar por el lugar");
        System.out.println("-> 6- Estirar");
    }


    /**------- Switch inicia el menu principal del juego----*/

    public static void intro(Scanner scan) {
            efectoTipoGrafia("9 am.. suena tu telefono");
            efectoTipoGrafia("Te levantas de la cama y vas a buscar el telefono\n");

            efectoTipoGrafia("-¿Hola?..");
            efectoTipoGrafia("Anonimo: No salgas de tu casa en la noche.\n");

            efectoTipoGrafia("-¿Cristian?..¿Sos vos?.. Ya te dije que no me interesa tener Linux.");
            efectoTipoGrafia("El anonimo colgo\n");

            efectoTipoGrafia("-Dios..me hacen despertar temprano.. mejor voy afuera, de lo que se pierden estos de no estar en Necochea papa..");
            efectoTipoGrafia("Sales de la casa, el sol te da plenamente\n");
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

    public static void menuSeleccion(){
        System.out.println("-> 1- Nueva Partida");
        System.out.println("-> 2- Cargar Partida");
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
        System.out.println("-> 5- Dejar la pesca");
    }

    public static void menuFrutos(){
        System.out.println("-> 1- Observar.");
        System.out.println("-> 2- Recolectar frutos");
        System.out.println("-> 3- Guardar frutos");
        System.out.println("-> 4- Ver Inventario");
        System.out.println("-> 5- Dejar la huerta");
    }

    public static void menuJuegoNocheA(){
        System.out.println("1- Entrar a la Casa");
        System.out.println("2- Buscar Mounstro");
    }

    public static void menuJuegoNocheC(){
        System.out.println("1- Salir de la Casa para pelear con el mounstro");
        System.out.println("2- Dormir");
        System.out.println("3- Mejorar Instrumento");
        System.out.println("4- Reparar Instrumento");
        System.out.println("5- Cerrar Puerta");

    }

    public static void menuInstrumento(){
        System.out.println("1- Azada");
        System.out.println("2- Cania de Pescar");
        System.out.println("3- Escudo");
        System.out.println("4- Espada");
        System.out.println("5- Hacha");
        System.out.println("6- Pico");

    }

    public static void menuPeleaA(){

        System.out.println("1- Correr hacia la derecha.\n");
        System.out.println("2- Correr hacia la izquierda.\n");
        System.out.println("3- Correr directo a el.\n");
        System.out.println("4- Esperar a que se acerque a ti.\n");
    }

    public static void elegirArma(){
        System.out.println("1- Agarrar la espada.\n");
        System.out.println("2- Agarrar el hacha.\n");
        System.out.println("3- Agarrar el escudo.\n");
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

    public static void guardarPersonaje(Personaje personaje){
        Gson gson = new Gson();
        String json = gson.toJson(personaje);

        try {
            FileWriter fw = new FileWriter("Personajes.Json");
            fw.write(json);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void guardarInventario(Inventario inventario){
        Gson gson = new Gson();
        String json = gson.toJson(inventario);

        try {
            FileWriter fw = new FileWriter("Inventario.json");
            fw.write(json);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void guardarAzada(Azada azada){
        Gson gson = new Gson();
        String json = gson.toJson(azada);

        try {
            FileWriter fw = new FileWriter("Azada.json");
            fw.write(json);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void guardarCania(CaniaDePescar cania){
        Gson gson = new Gson();
        String json = gson.toJson(cania);

        try {
            FileWriter fw = new FileWriter("Cania.json");
            fw.write(json);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void guardarEscudo(Escudo escudo){
        Gson gson = new Gson();
        String json = gson.toJson(escudo);

        try {
            FileWriter fw = new FileWriter("Escudo.json");
            fw.write(json);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void guardarEspada(Espada espada){
        Gson gson = new Gson();
        String json = gson.toJson(espada);

        try {
            FileWriter fw = new FileWriter("Espada.json");
            fw.write(json);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void guardarHacha(Hacha hacha){
        Gson gson = new Gson();
        String json = gson.toJson(hacha);

        try {
            FileWriter fw = new FileWriter("Hacha.json");
            fw.write(json);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void guardarPico(Pico pico){
        Gson gson = new Gson();
        String json = gson.toJson(pico);

        try {
            FileWriter fw = new FileWriter("Pico.json");
            fw.write(json);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cargarMadera(Recurso recurso){
        try {
            File file = new File("Madera.json");
            BufferedReader br = new BufferedReader(new FileReader(file));
            Gson gson1 = new Gson();
            recurso = gson1.fromJson(br, Recurso.class);
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void cargarPiedra(Recurso recurso){
        try {
            File file = new File("Piedra.json");
            BufferedReader br = new BufferedReader(new FileReader(file));
            Gson gson1 = new Gson();
            recurso = gson1.fromJson(br, Recurso.class);
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cargarFrutos(Recurso recurso){
        try {
            File file = new File("Frutos.json");
            BufferedReader br = new BufferedReader(new FileReader(file));
            Gson gson1 = new Gson();
            recurso = gson1.fromJson(br, Recurso.class);
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cargarPeces(Recurso recurso){
        try {
            File file = new File("Peces.json");
            BufferedReader br = new BufferedReader(new FileReader(file));
            Gson gson1 = new Gson();
            recurso = gson1.fromJson(br, Recurso.class);
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cargarEscudo(Escudo escudo){
        try {
            File file = new File("Escudo.json");
            BufferedReader br = new BufferedReader(new FileReader(file));
            Gson gson1 = new Gson();
            escudo = gson1.fromJson(br, Escudo.class);
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }



        /**------- Switch inicia el menu principal del juego----*/

    //region [Menu principal]
    public static void correrjuego(){
        int option = 0, contadorTiempos=0, contadorDias=0;
        int option1 = 0;
        Scanner scan = new Scanner(System.in);

        efectoTipoGrafia("¿Que quieres?");
        menuSeleccion();
        System.out.print("Elijes: ");
        option = scan.nextInt();

        System.out.println("\n\nBienvenido a la Comarca");

        Personaje personaje = new Personaje("ENZO",1850,10,10,10);
        Fantasma fantasma = new Fantasma("CHALM",120,20,10,5);

        Recurso peces = new Recurso("peces", 10,true,8,10,9);
        Recurso frutos = new Recurso("frutos",5, true,5,7,20);
        Recurso piedra = new Recurso("piedra", 0,true, 15, 20, 30);
        Recurso madera = new Recurso("madera", 0 ,true,10, 20, 25);

        /*Recurso peces = new Recurso();
        Recurso frutos = new Recurso();
        Recurso piedra = new Recurso();
        Recurso madera = new Recurso();*/


        Azada azada = new Azada(10,20,25,"Azada");
        CaniaDePescar cania = new CaniaDePescar(10,20,25,"Cania");
        //Escudo escudo = new Escudo(0,20,50,"Escudo");
        Escudo escudo = new Escudo();
        Espada espada = new Espada(25,25,15,"Espada");
        Hacha hacha = new Hacha(20,20,15,"Hacha");
        Pico pico = new Pico(10,20,15,"Pico");



        Inventario inventario = new Inventario();

        // CARGAR INVENTARIO
        try {
            File file = new File("Inventario.json");
            BufferedReader br = new BufferedReader(new FileReader(file));
            Gson gson1 = new Gson();
            inventario = gson1.fromJson(br, Inventario.class);
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        guardarAzada(azada);
        guardarCania(cania);

        guardarEspada(espada);
        guardarHacha(hacha);
        guardarPico(pico);

        // CARGAR ESCUDO
        try {
            File file = new File("Escudo.json");
            BufferedReader br = new BufferedReader(new FileReader(file));
            Gson gson1 = new Gson();
            escudo = gson1.fromJson(br, Escudo.class);
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        switch (option1){

            case 1://Nueva Partida

                break;

            case 2://Cargar Partida


                break;
        }







       /* try {
            File file = new File(nombreArchivo);
            BufferedReader br = new BufferedReader(new FileReader(file));
            Gson gson1 = new Gson();
            personaje = gson1.fromJson(br, Personaje.class);
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        while (option != 11199207){
            menuStart();
            System.out.println("Tu opcion: ");
            option = scan.nextInt();

            switch (option) {

                case 1:

                    /*LimpiarConsola();
                    nombrePersonaje(personaje);
                    pausa();
                    LimpiarConsola();
                    intro(scan);
                    pausa();
                    LimpiarConsola();*/


                    while(contadorDias <= 5) {
                        juego_deDia(personaje, madera, piedra, frutos, peces, inventario,contadorTiempos);

                        contadorTiempos=0;
                        juego_deNoche(personaje, fantasma, azada, cania, escudo, espada, hacha, pico, inventario,contadorTiempos);
                        contadorDias++;
                        contadorTiempos=0;
                    }



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
                    pausa();
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
    //region [De Dia]
    public static void juego_deDia(Personaje personaje,Recurso madera, Recurso piedra, Recurso frutos, Recurso peces,Inventario inventario,int contadorTiempos) {
        int option =0, contadorDia=0, optionRecurso=0,acumuladorRecurso=0;
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
                      acumuladorRecurso=0;
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
                                  contadorTiempos ++;
                                  if (madera.comprobarRecurso()) {
                                      efectoTipoGrafia("Caminas entre los arboles y compruebas que no esten humedos..");
                                      efectoTipoGrafia("Encuentras un arbol perfecto para talar..");
                                  } else {
                                      efectoTipoGrafia("No encontraste ningun arbol listo para talar..");
                                  }
                                  pausa();
                                  break;
                              case 2:
                                  contadorTiempos ++;
                                  if (madera.comprobarRecurso()) {
                                      /*Reemplazar el 20 por el getDanio del arma*/
                                      acumuladorRecurso = acumuladorRecurso + madera.recolectarRecurso(20);

                                  } else {
                                      efectoTipoGrafia("Tomas el Hacha pero no encuentras ningun arbol para talar..");
                                  }

                                  break;

                              case 3:
                                  contadorTiempos ++;
                                  if(acumuladorRecurso > 0){
                                        inventario.agregarAlInventario(madera,acumuladorRecurso);
                                        acumuladorRecurso=0;
                                  }else{
                                      System.out.println("Debes tener al menos 1 del recurso quieres explotar..");
                                  }

                                  break;

                              case 4:
                                  contadorTiempos ++;
                                  inventario.verInventario();
                                  break;

                              case 5:
                                  contadorTiempos ++;
                                        optionRecurso = 9124;
                                  break;
                              default:
                                  System.out.println("Restringete a las opciones que te damos.");
                                  break;
                          }
                          if(contadorTiempos==20){
                              optionRecurso=9124;
                          }
                      }
                      //endregion
                      break;

                  case 2: // Minar
                      //region [Minar]
                      acumuladorRecurso=0;
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
                                  contadorTiempos++;
                                  if (piedra.comprobarRecurso()) {
                                      efectoTipoGrafia("Caminas entre algunas piedras buscando la perfecta para picar..");
                                      efectoTipoGrafia("Encuentras una piedra perfecta para picar..");
                                  } else {
                                      efectoTipoGrafia("No encontraste ninguna piedra de para picar..");
                                  }
                                  pausa();
                                  break;
                              case 2:
                                  contadorTiempos++;
                                  if (piedra.comprobarRecurso()) {
                                      /**Reemplazar el 20 por el getDanio del arma*/
                                      acumuladorRecurso = acumuladorRecurso + piedra.recolectarRecurso(20);

                                  } else {
                                      efectoTipoGrafia("Tomas el pico pero no encuentras ninguna piedra para minar..");
                                  }
                                  break;

                              case 3:
                                  contadorTiempos++;
                                  if(acumuladorRecurso > 0){
                                      inventario.agregarAlInventario(piedra,acumuladorRecurso);
                                      acumuladorRecurso=0;
                                  }else{
                                      System.out.println("Debes tener al menos 1 del recurso quieres explotar..");
                                  }
                                  break;

                              case 4:
                                  contadorTiempos++;
                                  inventario.verInventario();
                                  break;

                              case 5:
                                  contadorTiempos++;
                                  optionRecurso = 9124;
                                  break;
                              default:
                                  System.out.println("Restringete a las opciones que te damos.");
                                  break;
                          }
                          if(contadorTiempos==20){
                              optionRecurso=9124;
                          }
                      }

                      //endregion

                      break;

                  case 3: // Cultivar
                      //region [Cultivo]
                      acumuladorRecurso=0;
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
                                  contadorTiempos++;
                                  if (frutos.comprobarRecurso()) {
                                      efectoTipoGrafia("Te acercas a la huerta y te pones en cuclillas para ver los frutos..");
                                      efectoTipoGrafia("Ves los frutos que estan maduros..");
                                  } else {
                                      efectoTipoGrafia("Los frutos que viste no estaban listos..");
                                  }
                                  pausa();
                                  break;
                              case 2:
                                  contadorTiempos++;
                                  if (frutos.comprobarRecurso()) {
                                      acumuladorRecurso = acumuladorRecurso + frutos.recolectarRecurso();
                                  } else {
                                      efectoTipoGrafia("Llegaste a la huerta pero no habia ningun fruto maduro..");
                                  }
                                  break;

                              case 3:
                                  contadorTiempos++;
                                  if(acumuladorRecurso > 0){
                                      inventario.agregarAlInventario(frutos,acumuladorRecurso);
                                      acumuladorRecurso=0;
                                  }else{
                                      System.out.println("Debes tener al menos 1 del recurso quieres explotar..");
                                  }
                                  break;

                              case 4:
                                  contadorTiempos++;
                                  inventario.verInventario();
                                  break;
                              case 5:
                                  contadorTiempos++;
                                  optionRecurso = 9124;
                                  break;
                              default:
                                  System.out.println("Restringete a las opciones que te damos.");
                                  break;
                          }
                          if(contadorTiempos==20){
                              optionRecurso=9124;
                          }
                      }

                      //endregion
                      break;

                  case 4: // Pescar
                      //region [Pesca]
                      acumuladorRecurso=0;
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
                                  contadorTiempos++;
                                  if (peces.comprobarRecurso()) {
                                      efectoTipoGrafia("Caminas hacia el lago para ver si hay peces..");
                                      efectoTipoGrafia("Encuentras algunos peces nadando en el lago..");
                                  } else {
                                      efectoTipoGrafia("No encontraste ningun pez en el lago..");
                                  }
                                  pausa();
                                  break;
                              case 2:
                                  contadorTiempos++;
                                  if (peces.comprobarRecurso()) {
                                      /**Reemplazar el 20 por el getDanio del arma*/
                                      acumuladorRecurso = acumuladorRecurso + peces.recolectarRecurso(20);
                                  } else {
                                      efectoTipoGrafia("Tomas la cania de pescar pero no encuentras ningun pez..");
                                  }
                                  break;

                              case 3:
                                  contadorTiempos++;
                                  if(acumuladorRecurso > 0){
                                      inventario.agregarAlInventario(peces,acumuladorRecurso);
                                      acumuladorRecurso=0;
                                  }else{
                                      System.out.println("Debes tener al menos 1 del recurso quieres explotar..");
                                  }
                                  break;

                              case 4:
                                  contadorTiempos++;
                                  inventario.verInventario();
                                  break;
                              case 5:
                                  contadorTiempos++;
                                  optionRecurso = 9124;
                                  break;
                              default:
                                  System.out.println("Restringete a las opciones que te damos.");
                                  break;
                          }
                          if(contadorTiempos==20){
                              optionRecurso=9124;
                          }
                      }

                      //endregion
                      break;

                  case 5: // caminar por el lugar
                      contadorTiempos++;
                      efectoTipoGrafia("Caminas al rededor de tu casa y ves que todo esta bien\n");
                      break;

                  case 6: //estirarse
                      contadorTiempos++;
                        if(numeroRandom.nextInt() == 8){
                            efectoTipoGrafia("Te estiras un poco asi descontracturante y ganando 1 punto de vida..\n");
                            personaje.setVida(personaje.getVida()+1);
                        }else{
                            efectoTipoGrafia("Te estiras para relajarte un poco..\n");
                        }
                      break;
                  case 7://pasar a la noche
                        option = 9212;
                      break;
                  default:
                      System.out.println("¿Por que haces esto? Ahora le voy a subir la vida y el daño al enemigo, segui nomas.");
                      pausa();
                      //subir vida y daño al enemigo
                      break;

              }
              if(contadorTiempos==20){
                  option=9212;
              }

          }
          madera.reiniciarRecurso();
          peces.reiniciarRecurso();
          frutos.reiniciarRecurso();
          piedra.reiniciarRecurso();
    }

    //endregion


    /**-----Modo juego noche------**/

    public static void juego_deNoche(Personaje personaje,Fantasma fantasma,Azada azada, CaniaDePescar cania, Escudo escudo, Espada espada, Hacha hacha, Pico pico,Inventario inventario,int contadorTiempo){
        int option = 0;
        boolean puerta = true;

        Scanner scan = new Scanner(System.in);
        LimpiarConsola();
        efectoTipoGrafia("Se hace de noche y decides entrar a la casa");
        while (option != 999){
            efectoTipoGrafia("¿Que quieres hacer ahora?");
            menuJuegoNocheC();
            System.out.println("Elijes: ");
            option = scan.nextInt();
            switch (option){
                case 1: //Salir de la casa
                    contadorTiempo++;
                    puerta=true;
                    efectoTipoGrafia("Usted esta saliendo de la casa");
                    efectoTipoGrafia("Ves al fantasma de linux acercarse");
                    efectoTipoGrafia("Es momento de enseñarle al Fantasma de Linux quien manda..\n");
                    menuPelea(personaje,fantasma,espada,hacha,escudo);
                    break;

                case 2: //Dormir
                    contadorTiempo = 8;
                    break;

                case 3: //Mejorar Instrumento
                    contadorTiempo += 2;

                        menuMejorar(azada, cania, escudo, espada, hacha, pico, inventario,contadorTiempo);
                        if(fantasma.destruir(inventario,puerta)){   // En caso de no cerrar la puerta
                            efectoTipoGrafia("");
                            efectoTipoGrafia("Perdiste, por no usar python");
                            efectoTipoGrafia("Vuelves al Menu Principal");
                            correrjuego();
                        }

                        break;


                case 4: //Reparar Instrumento
                    contadorTiempo += 2;
                    menuReparar(azada, cania, escudo, espada, hacha, pico,inventario,contadorTiempo);
                    if(fantasma.destruir(inventario,puerta)){
                        efectoTipoGrafia("Perdiste, por no usar python");
                        efectoTipoGrafia("Vuelves al Menu Principal");
                        correrjuego();
                    }

                    break;

                case 5: // Cerrar Puerta

                    efectoTipoGrafia("Cierras la puerta con exito");
                    puerta = false;

                    break;






            }
            if(contadorTiempo >= 8){
                option = 999;
            }
        }
    }

    public static void menuMejorar(Azada azada, CaniaDePescar cania, Escudo escudo, Espada espada, Hacha hacha, Pico pico,Inventario inventario,int contadorTiempo){

        /*Azada azada = new Azada(10,20,25,"Azada Inicial");
        CaniaDePescar cania = new CaniaDePescar(10,20,25,"Cania Inicial");
        Escudo escudo = new Escudo(0,20,50,"Escudo Inical");
        Espada espada = new Espada(25,25,15,"Esoada Inicial");
        Hacha hacha = new Hacha(20,20,15,"Hacha Inicial");
        Pico pico = new Pico(10,20,15,"Pico Inical");*/

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
                azada.mejorarInstrumento(inventario);
                System.out.println("Condicion despues de ser mejorada: ");
                azada.mostrarInstrumento();

                break;

            case 2://CaniaDePescar

                System.out.println("Vamos a mejorar tu Cania de Pescar...");
                System.out.println("Condicion actual: ");
                cania.mostrarInstrumento();
                cania.mejorarInstrumento(inventario);
                System.out.println("Condicion despues de ser mejorada: ");
                cania.mostrarInstrumento();

                break;

            case 3://Escudo

                System.out.println("Vamos a mejorar tu Escudo");
                System.out.println("Condicion actual: ");
                escudo.mostrarInstrumento();
                escudo.mejorarInstrumento(inventario);
                System.out.println("Condicion despues de ser mejorada: ");
                escudo.mostrarInstrumento();

                break;

            case 4://Espada

                System.out.println("Vamos a mejorar tu Espada");
                System.out.println("Condicion actual: ");
                espada.mostrarInstrumento();
                espada.mejorarInstrumento(inventario);
                System.out.println("Condicion despues de ser mejorada: ");
                espada.mostrarInstrumento();

                break;
            case 5://Hacha

                System.out.println("Vamos a mejorar tu Hacha");
                System.out.println("Condicion actual: ");
                hacha.mostrarInstrumento();
                hacha.mejorarInstrumento(inventario);
                System.out.println("Condicion despues de ser mejorada: ");
                hacha.mostrarInstrumento();

                break;

            case 6://Pico

                System.out.println("Vamos a mejorar tu Pico");
                System.out.println("Condicion actual: ");
                pico.mostrarInstrumento();
                pico.mejorarInstrumento(inventario);
                System.out.println("Condicion despues de ser mejorada: ");
                pico.mostrarInstrumento();

                break;
        }


    }

    public static void menuReparar(Azada azada, CaniaDePescar cania, Escudo escudo, Espada espada, Hacha hacha, Pico pico,Inventario inventario,int contadorTiempo){

        int option = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Elije la herramienta a reparar: ");
        menuInstrumento();
        System.out.println("Elijes: ");
        option = scan.nextInt();
        switch (option){

            case 1://Azada

                System.out.println("Vamos a reparar tu Azada");
                System.out.println("Condicion actual: ");
                azada.mostrarInstrumento();
                azada.repararInstrumento(inventario);
                System.out.println("Condicion despues de ser reparada: ");
                azada.mostrarInstrumento();

                break;

            case 2://CaniaDePescar

                System.out.println("Vamos a reparar tu Cania de Pescar...");
                System.out.println("Condicion actual: ");
                cania.mostrarInstrumento();
                cania.repararInstrumento(inventario);
                System.out.println("Condicion despues de ser reparada: ");
                cania.mostrarInstrumento();

                break;

            case 3://Escudo

                System.out.println("Vamos a reparar tu Escudo");
                System.out.println("Condicion actual: ");
                escudo.mostrarInstrumento();
                escudo.repararInstrumento(inventario);
                System.out.println("Condicion despues de ser reparada: ");
                escudo.mostrarInstrumento();

                break;

            case 4://Espada

                System.out.println("Vamos a reparar tu Espada");
                System.out.println("Condicion actual: ");
                espada.mostrarInstrumento();
                espada.repararInstrumento(inventario);
                System.out.println("Condicion despues de ser reparada: ");
                espada.mostrarInstrumento();

                break;
            case 5://Hacha

                System.out.println("Vamos a reparar tu Hacha");
                System.out.println("Condicion actual: ");
                hacha.mostrarInstrumento();
                hacha.repararInstrumento(inventario);
                System.out.println("Condicion despues de ser reparada: ");
                hacha.mostrarInstrumento();

                break;

            case 6://Pico

                System.out.println("Vamos a reparar tu Pico");
                System.out.println("Condicion actual: ");
                pico.mostrarInstrumento();
                pico.repararInstrumento(inventario);
                System.out.println("Condicion despues de ser reparada: ");
                pico.mostrarInstrumento();

                break;
        }


    }


    public static void menuPelea(Personaje personaje, Fantasma fantasma, Espada espada, Hacha hacha, Escudo escudo){
        int num = 0;
        int numRand = 0;
        int opcion = 0;
        Scanner scan = new Scanner(System.in);
        while (opcion != 999){

            menuPeleaA();
            num = scan.nextInt();
            switch (num){

                case 1: // Correr Derecha

                    numRand = (int)(Math.random()*1+1);
                    if(numRand == 1){
                        atacaPersonaje(personaje,fantasma,espada,hacha,escudo);
                        atacaFantasma(personaje,fantasma);
                    }else{
                        atacaFantasma(personaje,fantasma);
                        atacaPersonaje(personaje,fantasma,espada,hacha,escudo);
                    }
                    break;

                case 2:// Correr Izquierda

                    numRand = (int)(Math.random()*1+1);
                    if(numRand == 1){
                        atacaPersonaje(personaje,fantasma,espada,hacha,escudo);
                        atacaFantasma(personaje,fantasma);
                    }else{
                        atacaFantasma(personaje,fantasma);
                        atacaPersonaje(personaje,fantasma,espada,hacha,escudo);
                    }
                    break;

                case 3: // Correr Directo a el
                    atacaFantasma(personaje,fantasma);
                    atacaPersonaje(personaje,fantasma,espada,hacha,escudo);
                    break;

                case 4: // Esperar a que se acerque
                    atacaPersonaje(personaje,fantasma,espada,hacha,escudo);
                    atacaFantasma(personaje,fantasma);
                    break;
            }
            if(fantasma.getVida()<=0){

                opcion = 999;
            }else{
                if (personaje.getVida() <= 0){
                    opcion = 999;
                }
            }
        }
        if(personaje.getVida()<=0){

            System.out.println("El fantasma se acerca a tu cuerpo y te mira riendose y colocando un pinguino en tu cabeza.\n");
            correrjuego();
        }else if(fantasma.getVida()<=0){
            System.out.println("Te levantas del suelo cansado y con sangre en la ropa..ves al fantasma de linux tirado y gritas ¡¡¡WINDOWS!!!..");
            correrjuego();
        }
    }

    public static void atacaFantasma(Personaje personaje, Fantasma fantasma){
        int danio = 0;
        efectoTipoGrafia("El fantasma se acerca y realiza un ataque");
        danio = fantasma.atacar();
        if( danio >= personaje.getResistencia()){
            danio -= personaje.getResistencia();
            System.out.println("Tu vida bajo de "+personaje.getVida()+" a "+(personaje.getVida()-danio));
            personaje.setVida(personaje.getVida()-danio);
        }else{
            efectoTipoGrafia("Tu resistencia es mayor al daño del fantasma, resistes el golpe");
        }
    }

    public static void atacaPersonaje(Personaje personaje, Fantasma fantasma, Espada espada, Hacha hacha, Escudo escudo){
        int danio = 0;
        int option = 0;
        Scanner scan = new Scanner(System.in);
        efectoTipoGrafia("Te acercas a el fantasma y realizas un ataque");
        efectoTipoGrafia("Que arma deseas usar?");
        elegirArma();
        System.out.println("Elijes: ");
        option = scan.nextInt();
        switch (option){
            case 1: // Espada
                danio = espada.atacar();
                if( danio >= fantasma.getResistencia()){
                    danio -= fantasma.getResistencia();
                    System.out.println("La vida del fantasma bajo de "+fantasma.getVida()+" a "+(fantasma.getVida()-danio));
                    fantasma.setVida(fantasma.getVida()-danio);
                }else{
                    efectoTipoGrafia("La resistencia del fantasma es mayor que el poder de tu ataque");
                    efectoTipoGrafia("El fantasma no sufre ningun danio");
                }
                break;

            case 2: // Hacha
                danio = hacha.atacar();
                if( danio >= fantasma.getResistencia()){
                    danio -= fantasma.getResistencia();
                    System.out.println("La vida del fantasma bajo de "+fantasma.getVida()+" a "+(fantasma.getVida()-danio));
                    fantasma.setVida(fantasma.getVida()-danio);
                }else{
                    efectoTipoGrafia("La resistencia del fantasma es mayor que el poder de tu ataque");
                    efectoTipoGrafia("El fantasma no sufre ningun danio");
                }
                break;

            case 3:
                if(personaje.getResistencia() <= escudo.getResistencia()){
                    efectoTipoGrafia("Te equipas el escudo");
                    personaje.setResistencia(personaje.getResistencia()+ escudo.getResistencia());
                    efectoTipoGrafia("De esta manera aumentas tu resistencia a los ataques");
                }else{
                    efectoTipoGrafia("acaso eres tonto ??");
                    efectoTipoGrafia("ya tienes el escudo equipado");
                }

                break;
        }

    }
}



