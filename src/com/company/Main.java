package com.company;
import Personaje.Personaje;
import RecursoNatural.Recurso;

import javax.management.timer.Timer;
import java.util.*;
import java.util.Random;

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
        System.out.println("-> 4- Dejar de talar\n");
    }

    public static void menuPiedra(){
        System.out.println("-> 1- Observar.");
        System.out.println("-> 2- Picar");
        System.out.println("-> 3- Guardar piedra");
        System.out.println("-> 4- Dejar la mineria\n");
    }

    public static void menuPeces(){
        System.out.println("-> 1- Observar.");
        System.out.println("-> 2- Pescar");
        System.out.println("-> 3- Guardar Pescado");
        System.out.println("-> 4- Dejar la pesca\n");
    }

    public static void menuFrutos(){
        System.out.println("-> 1- Observar.");
        System.out.println("-> 2- Recolectar frutos");
        System.out.println("-> 3- Guardar frutos");
        System.out.println("-> 4- Dejar la huerta\n");
    }
    //endregion

    /**------- Crear personaje ---------*/

    //region [Crear Personaje]
    public static void crearPersonaje(Personaje personaje){
        personaje = new Personaje("Devian",200,10,10,10,true);
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
        Personaje personaje = new Personaje();
        int option = 0;
        Scanner scan = new Scanner(System.in);
        Timer tiempo = new Timer();
        System.out.println("\n\nBienvenido a la Comarca");
        Recurso peces = new Recurso("peces", 10,true,8,10,9);
        Recurso frutos = new Recurso("frutos",5, true,5,7,20);
        Recurso piedra = new Recurso("piedra", 0,true, 15, 20, 30);
        Recurso madera = new Recurso("madera", 0 ,true,10, 20, 25);
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
                    juego_deDia(personaje,madera,piedra,frutos,peces);

                    /**
                    TimerTask dia = new TimerTask() {
                        @Override
                        public void run() {
                            juego_deDia(personaje,madera,piedra,frutos,peces);
                        }
                    };
                    tiempo.
                   */
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

    public static void juego_deDia(Personaje personaje,Recurso madera, Recurso piedra, Recurso frutos, Recurso peces) {
        int option =0,optionRecurso=0,acumuladorRecurso=0;
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
                                      acumuladorRecurso = madera.recolectarRecurso(personaje.getArmaenMano(), 20);

                                  } else {
                                      efectoTipoGrafia("Tomas el Hacha pero no encuentras ningun arbol para talar..");
                                  }

                                  break;

                              case 3:

                                  if (acumuladorRecurso > 0) {
                                      //Agregar inventario
                                  } else {
                                      System.out.println("Debes tener al menos 1 del recurso quieres explotar..");
                                  }
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
                                      acumuladorRecurso = piedra.recolectarRecurso(personaje.getArmaenMano(), 20);
                                      acumuladorRecurso = 2;
                                  } else {
                                      efectoTipoGrafia("Tomas el pico pero no encuentras ninguna piedra para minar..");
                                  }
                                  break;

                              case 3:
                                  if (acumuladorRecurso > 0) {
                                      //**** guardar inventario ****
                                  } else {
                                      System.out.println("Debes tener al menos 1 del recurso quieres explotar..");
                                  }
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
                                      //****guardar inventario*****
                                  } else {
                                      System.out.println("Debes tener al menos 1 del recurso quieres explotar..");
                                  }
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

                  case 4: // Pescar
                      //region [Pesca]
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
                                      acumuladorRecurso = peces.recolectarRecurso(personaje.getArmaenMano(), 20);
                                  } else {
                                      efectoTipoGrafia("Tomas la cania de pescar pero no encuentras ningun pez..");
                                  }
                                  break;

                              case 3:
                                  if (acumuladorRecurso > 0) {
                                      //****guardar inventario****
                                  } else {
                                      System.out.println("Debes tener al menos 1 del recurso quieres explotar..");
                                  }
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

                  case 5: // caminar por el lugar
                      efectoTipoGrafia("Caminas al rededor de tu casa y ves que todo esta bien");
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
}