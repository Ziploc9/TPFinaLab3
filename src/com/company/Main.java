package com.company;
import Personaje.Personaje;
import RecursoNatural.Recurso;

import java.util.Scanner;

import static java.awt.SystemColor.*;

public class Main {

    public static void main(String[] args) {

        correrjuego();
    }

        /**
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
        System.out.println("\n1- Ir por madera.");
        System.out.println("2- Ir por piedra.");
        System.out.println("3- Ir a la huerta");
        System.out.println("4- Ir a pescar");
        System.out.println("5- Caminar por el lugar");
        System.out.println("6- Estirar");
    }

    public static void intro(Scanner scan) {
        efectoTipoGrafia("9 am.. *suena tu telefono*");
        efectoTipoGrafia("*Te levantas de la cama y vas a buscar el telefono*");
        pausa();
        efectoTipoGrafia("-¿Hola?..");
        efectoTipoGrafia("Anonimo: No salgas de tu casa en la noche.");
        pausa();
        efectoTipoGrafia("-¿Como?..¿Quien habla?.. Hable mas fuerte que tengo una toalla.");
        efectoTipoGrafia("*El anonimo colgo*");
        pausa();
        efectoTipoGrafia("-Buuu..eno ¿Ahora que hago despierto a esta hora?..Me siento raro..como si alguien me observara o me controlara..Meh..debe ser la manaos y los memes de linux.");
        efectoTipoGrafia("*Sales de la casa, el sol te da plenamente*");
    }

    public static void pausa(){
        String seguir;
        Scanner scan = new Scanner(System.in);
        try {
            seguir = scan.nextLine();
        } catch (Exception e) {
        }
    }

    public static void LimpiarConsola(){
        for(int i=0; i<15;i++){
            System.out.println("\n");
        }
    }

    public static void efectoTipoGrafia(String message) {
        if (message == null)
            return;
        StringBuilder backspaceBuilder = new StringBuilder();
        for (int i = 0 ;  i < message.length() ; i++) {
            String sub = message.substring(0, i + 1);
            try {
                Thread.sleep(25L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(backspaceBuilder.toString() + sub);
            backspaceBuilder.append('\b');
        }
        System.out.println();
    }

    public static void menuMadera(){
        System.out.println("\n1- Observar.");
        System.out.println("2- Talar");
        System.out.println("3- Agarrar Madera");
        System.out.println("4- Dejar de buscar madera");
    }
    //endregion

    /**------- Crear personaje ---------*/

    //region [Crear Personaje]
    public static void crearPersonaje(Personaje personaje){
        personaje = new Personaje("Devian",200,10,10,10,false);
        nombrePersonaje(personaje);

    }

    public static void nombrePersonaje(Personaje personaje) {
        String nom="";
        String confirm="";
        Scanner scan = new Scanner(System.in);
        efectoTipoGrafia("Sincronizando estimulos y vista del personaje..");
        efectoTipoGrafia("Sistema cargado, pulse enter");
        pausa();
        efectoTipoGrafia("Hola..Mi nombre es Simba y sere tu guia.. ");
        efectoTipoGrafia("Primero dime el nombre que quieres que tu personaje tenga.. si no eliges tendre que hacerlo por ti.");
        efectoTipoGrafia("¿Quieres colocarle un nombre a tu personaje? (Y/N)");
        confirm=scan.nextLine();
        if("Y".equals(confirm) || "y".equals(confirm)){
            efectoTipoGrafia("Nombre del personaje: ");
            nom = scan.nextLine();
            personaje.setNombre(nom);
        }else{
            efectoTipoGrafia("Error en confirmacion..se auto seteara un nombre..disfruta la experiencia y recuerda es un juego.");
        }
        efectoTipoGrafia("Nombre: "+ personaje.getNombre());
        efectoTipoGrafia("Vida: "+personaje.getVida());
        efectoTipoGrafia("Fuerza: "+personaje.getDamage());
        efectoTipoGrafia("Resistencia: "+personaje.getResistencia());
        efectoTipoGrafia("Velocidad: "+personaje.getVelocidad());
        efectoTipoGrafia("Armas en mano: No");
        efectoTipoGrafia("*Sistema cargado* pulse enter");
    }


    //endregion

        /**------- Switch inicia el menu principal del juego----*/

    //region [Menu principal]
    public static void correrjuego(){
        Personaje personaje = new Personaje();
        int option = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("\n\nBienvenido a la Comarca");

        while (option != 11199207){

            menuStart();
            System.out.println("Tu opcion: ");
            option = scan.nextInt();

            switch (option) {

                case 1:
                    LimpiarConsola();
                    crearPersonaje(personaje);
                    pausa();
                    LimpiarConsola();
                    intro(scan);
                    pausa();
                    LimpiarConsola();
                    juego_deDia(personaje);
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

    public static int juego_deDia(Personaje personaje) {
        int option =0, contadorDia=0;
        Scanner scan = new Scanner(System.in);
        Recurso peces = new Recurso("peces", 10,true,8,10,9);
        Recurso frutos = new Recurso("frutos",5, true,5,7,20);
        Recurso piedra = new Recurso("piedra", true, 15, 20, 30);
        Recurso madera = new Recurso("madera",  true,10, 20, 25);
          while (option != 9212) {
              efectoTipoGrafia("¿Que quieres hacer ahora?");
              menuJuego();
              System.out.print("Elijes: ");
              option = scan.nextInt();
              switch (option) {

                  case 1:// Buscar madera
                        int optionRecurso=0;
                      //region [Madera]
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
                                      madera.recolectarRecurso(personaje.getArmaenMano(),20);

                                  } else {
                                      efectoTipoGrafia("Tomas el Hacha pero no encuentras ningun arbol para talar..");
                                  }
                                  break;

                              case 3:
                                  break;

                              case 4:
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


                      //endregion

                      break;

                  case 3: // Cultivar


                      break;

                  case 4: // Pescar

                      break;

                  case 5: // caminar por el lugar

                      break;

                  case 6: //estirarse

                      break;
                  case 7:
                        option = 9212;
                      break;
                  default:
                      System.out.println("¿Por que haces esto? Ahora le voy a subir la vida y el daño al enemigo, segui nomas.");
                      pausa();
                      //subir bida y daño al enemigo
                      break;

              }
              contadorDia++;
          }
            return contadorDia;
    }
}

