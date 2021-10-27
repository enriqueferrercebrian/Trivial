package trivial;

import java.util.Scanner;

/**
 * @author Enrique
 */
public class Trivial {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String NOMBRE_TRIVIAL = "Los Simpsons";
        final String PREGUNTA1 = "\n¿La Familia Simpson se componia de 6 Miembos?";
        final String PREGUNTA2 = "\n¿Maggie tuvo algo que ver con el disparo hacia Sr. Burns?";
        final String PREGUNTA3 = "\n¿Es Washington la ciudad rival de Springfield?";
        final String PREGUNTA4 = "\n¿Lenny y Carl son pareja?";
        final String PREGUNTA5 = "\n¿Han viajado a Japon alguna vez los simpsons?";
        final String PREGUNTA6 = "\n¿Tiene Homer un hermano?";
        final String PREGUNTA7 = "\n¿Tiene Bart otro hermano, aparte de Maggie y Lisa?";
        final String PREGUNTA8 = "\n¿Llega Lisa a ser presidenta de Estados Unidos?";
        final String PREGUNTA9 = "\n¿Hay algun personaje con 5 dedos en la serie?";
        final String PREGUNTA10 = "\n¿Cuales Son las iniciales que aparecen, disimuladamente, en la cabeza de Homer? Ponmelas juntas (XX)";
        final String RESPUESTA1 = "N";
        final String RESPUESTA2 = "S";
        final String RESPUESTA3 = "N";
        final String RESPUESTA4 = "N";
        final String RESPUESTA5 = "S";
        final String RESPUESTA6 = "S";
        final String RESPUESTA7 = "S";
        final String RESPUESTA8 = "S";
        final String RESPUESTA9 = "S";
        final String RESPUESTA10 = "MG"; // me diga las dos iniciales a la vez
        boolean repetida1 = false, repetida2 = false, repetida3 = false, repetida4 = false, repetida5 = false, repetida6 = false, repetida7 = false, repetida8 = false, repetida9 = false, repetida10 = false;

        String respuestaUsuario;
       final String ERRORPARSEINTEXCEPTION = "Error inesperado.";
        String volverAJugar;
        boolean jugar = true;
        int i = 0;
        int numRamdon;
        int numPreguntas;
       final int RANGOMAXIMO = 10;   // ponemos el maximo a 9 para cuando todo funcione meternos con la pregunta 10 que es mas complicada.
       final int RANGOMINIMO = 1;
        String numeroPreguntasText;
        double aciertos;
        double porcentaje;
        System.out.println("Bienvenidos al trivial de " + NOMBRE_TRIVIAL + ".");

        while (jugar != false) {

            numPreguntas = 0;
            aciertos = 0;
            repetida1 = repetida2 = repetida3 = repetida4 = repetida5 = repetida6 = repetida7 = repetida8 = repetida9 = repetida10 = false;

            while (numPreguntas < 3 || numPreguntas > 10) {
                System.out.println("¿Cuantas preguntas quieres hacer? De 3 a 10 preguntas.");
                numeroPreguntasText = sc.nextLine();
                numPreguntas = Integer.parseInt(numeroPreguntasText);

                try {
                    numPreguntas = Integer.parseInt(numeroPreguntasText);
                    if (numPreguntas < 3 || numPreguntas > 10) {
                        System.out.println("Porfavor, solo numeros del 3 al 10");
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Porfavor, inserte numeros no letras.");
                } catch (Exception ex) {
                    System.out.println(ERRORPARSEINTEXCEPTION);
                }
            }
            System.out.println("Responde a las preguntas con S (si) o N (No)");

            while (i < numPreguntas) {
                numRamdon = (int) Math.floor(Math.random() * (RANGOMAXIMO - RANGOMINIMO + 1) + RANGOMINIMO);

                // Mostramos pregunta según numero random
                if (numRamdon == 1 && !repetida1) {
                    repetida1 = true;
                    i++;
                    System.out.println(PREGUNTA1);
                    respuestaUsuario = sc.nextLine();
                    if (respuestaUsuario != null && respuestaUsuario.equalsIgnoreCase(RESPUESTA1)) {
                        aciertos++;
                        if (aciertos > 1) {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                        } else {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                        }
                    } else {
                        System.out.println("\nSon 5: Homer, Marge, Bart, Maggie y Lisa");
                    }
                } else if (numRamdon == 2 && !repetida2) {
                    repetida2 = true;
                    i++;
                    System.out.println(PREGUNTA2);
                    respuestaUsuario = sc.nextLine();
                    if (respuestaUsuario != null && respuestaUsuario.equalsIgnoreCase(RESPUESTA2)) {
                        aciertos++;
                        if (aciertos > 1) {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                        } else {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                        }
                    } else {
                        System.out.println("\nRealmente fue ella quien disparó, asique si.");
                    }
                } else if (numRamdon == 3 && !repetida3) {
                    repetida3 = true;
                    i++;
                    System.out.println(PREGUNTA3);
                    respuestaUsuario = sc.nextLine();
                    if (respuestaUsuario != null && respuestaUsuario.equalsIgnoreCase(RESPUESTA3)) {
                        aciertos++;
                        if (aciertos > 1) {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                        } else {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                        }
                    } else {
                        System.out.println("\nLa ciudad rival de Springfield es shelbyville");

                    }
                } else if (numRamdon == 4 && !repetida4) {
                    repetida4 = true;
                    i++;
                    System.out.println(PREGUNTA4);
                    respuestaUsuario = sc.nextLine();
                    if (respuestaUsuario != null && respuestaUsuario.equalsIgnoreCase(RESPUESTA4)) {
                        aciertos++;
                        if (aciertos > 1) {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                        } else {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                        }
                    } else {
                        System.out.println("\nNo son pareja, aunque siempre aparecen juntos, se trata de dos buenos amigos.");
                    }
                } else if (numRamdon == 5 && !repetida5) {
                    repetida5 = true;
                    i++;
                    System.out.println(PREGUNTA5);
                    respuestaUsuario = sc.nextLine();
                    if (respuestaUsuario != null && respuestaUsuario.equalsIgnoreCase(RESPUESTA5)) {
                        aciertos++;
                        if (aciertos > 1) {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                        } else {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                        }
                    } else {
                        System.out.println("\nLos simpsons viajan a Japon con unos billetes que le roban a Ned Flanders.");
                    }
                } else if (numRamdon == 6 && !repetida6) {
                    repetida6 = true;
                    i++;
                    System.out.println(PREGUNTA6);
                    respuestaUsuario = sc.nextLine();
                    if (respuestaUsuario != null && respuestaUsuario.equalsIgnoreCase(RESPUESTA6)) {
                        aciertos++;
                        if (aciertos > 1) {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                        } else {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                        }
                    } else {
                        System.out.println("\nTiene un hermano, el cual le pidio dinero para hacer un traductor de bebes, lo invento y triunfó.");

                    }
                } else if (numRamdon == 7 && !repetida7) {
                    repetida7 = true;
                    i++;
                    System.out.println(PREGUNTA7);
                    respuestaUsuario = sc.nextLine();
                    if (respuestaUsuario != null && respuestaUsuario.equalsIgnoreCase(RESPUESTA7)) {
                        aciertos++;
                        if (aciertos > 1) {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                        } else {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                        }
                    } else {
                        System.out.println("\nBart tiene un hermano gemelo llamado Hugo, el cual aparecio en un episodio de hallowen.");
                    }
                } else if (numRamdon == 8 && !repetida8) {
                    repetida8 = true;
                    i++;
                    System.out.println(PREGUNTA8);
                    respuestaUsuario = sc.nextLine();
                    if (respuestaUsuario != null && respuestaUsuario.equalsIgnoreCase(RESPUESTA8)) {
                        aciertos++;
                        if (aciertos > 1) {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                        } else {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                        }
                    } else {
                        System.out.println("\nSegun un Brujo adivino, jefe de un casino, que predie el futuro ");
                        System.out.println("en los Simpsons, Lisa acabaria de Presidenta de los EE.UU");
                    }
                } else if (numRamdon == 9 && !repetida9) {
                    repetida9 = true;
                    i++;
                    System.out.println(PREGUNTA9);
                    respuestaUsuario = sc.nextLine();
                    if (respuestaUsuario != null && respuestaUsuario.equalsIgnoreCase(RESPUESTA9)) {
                        aciertos++;
                        if (aciertos > 1) {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                        } else {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                        }
                    } else {
                        System.out.println("\nRealmente si, Dios y Jesucristo, aparecen resprentados con 5 dedos.");

                    }
                } else if (numRamdon == 10 && !repetida10) {
                    repetida10 = true;
                    i++;
                    System.out.println(PREGUNTA10);
                    respuestaUsuario = sc.nextLine();
                    if (respuestaUsuario != null && respuestaUsuario.equalsIgnoreCase(RESPUESTA10)) {
                        aciertos++;
                        if (aciertos > 1) {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                        } else {
                            System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                        }
                    } else {

                        if (RESPUESTA10.length() == respuestaUsuario.length()) {

                            if (RESPUESTA10.charAt(0) == respuestaUsuario.charAt(0)
                                    || RESPUESTA10.charAt(1) == respuestaUsuario.charAt(1)) {
                                repetida10 = true;
                                System.out.println("\nCasi, casi, venga te doy medio punto.");
                                aciertos = aciertos + 0.5;
                                if (aciertos > 1) {
                                    System.out.println("\nLlevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                                } else {
                                    System.out.println("\nLlevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                                }
                            }
                        } else {
                            System.out.println("\nlas palabras no tienen la misma longitud, creo que no te la sabes...");
                        }
                    }
                    System.out.println("\nEl pelo y la oreja de homer forman las iniciales del creador MG.");
                }

            }
            porcentaje = (aciertos * 100) / numPreguntas;
            if (porcentaje <= 33) {
                System.out.print("\n----------------------------------------------------\nSubscribete a Disney plus y empiezala de nuevo.\n----------------------------------------------------\n");
            } else if (porcentaje <= 66) {
                System.out.print("\n----------------------------------------------------\nNo prestaste mucha atención a la serie.\n----------------------------------------------------\n");
            } else if (porcentaje <= 99.9) {
                System.out.print("\n----------------------------------------------------\nVeo que te gusta la serie, enhorabuena.\n----------------------------------------------------\n");
            } else if (porcentaje <= 100) {
                System.out.print("\n----------------------------------------------------\n¿Eres Matt Groening? PER-FEC-TO!\n----------------------------------------------------\n");
            }
            System.out.println(String.format("Has acertado el  %.02f", porcentaje) + "% de las preguntas.");
            System.out.println("\n¿Quieres volver a jugar?");
            volverAJugar = sc.nextLine();
            while (!volverAJugar.equalsIgnoreCase("NO") && !volverAJugar.equalsIgnoreCase("N")
                    && !volverAJugar.equalsIgnoreCase("SI") && !volverAJugar.equalsIgnoreCase("S")) {
                System.out.println("Por favor, Responda Si o No");
                volverAJugar = sc.nextLine();
            }
            if (volverAJugar.equalsIgnoreCase("NO") || volverAJugar.equalsIgnoreCase("N")) {
                jugar = false;
                System.out.println("Gracias por jugar.");
                break;
            } else if (volverAJugar.equalsIgnoreCase("SI") || volverAJugar.equalsIgnoreCase("S")) {
                System.out.println("Allá vamos!");
            }
        }

    }

}
