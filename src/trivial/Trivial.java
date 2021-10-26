package trivial;

import java.util.Scanner;

/**
 * @author Enrique
 */
public class Trivial {

    public static void main(String[] args) {

        final String NOMBRE_TRIVIAL = "Los Simpsons";
        final String PREGUNTA1 = "¿La Familia Simpson se componia de 6 Miembos?";
        final String PREGUNTA2 = "¿Maggie tuvo algo que ver con el disparo hacia Sr. Burns?";
        final String PREGUNTA3 = "¿Es Washington la ciudad rival de Springfield?";
        final String PREGUNTA4 = "¿Lenny y Carl son pareja?";
        final String PREGUNTA5 = "¿Han viajado a Japon alguna vez los simpsons?";
        final String PREGUNTA6 = "¿Tiene Homer un hermano?";
        final String PREGUNTA7 = "¿Tiene Bart otro hermano, aparte de Maggie y Lisa?";
        final String PREGUNTA8 = "¿Llega Lisa a ser presidenta de Estados Unidos?";
        final String PREGUNTA9 = "¿Hay algun personaje con 5 dedos en la serie?";
        final String PREGUNTA10 = "¿Cuales Son las iniciales que aparecen, disimuladamente, en la cabeza de Homer? Ponmelas juntas (XX)";
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
        boolean repetida1 = false;
        boolean repetida2 = false;
        boolean repetida3 = false;
        boolean repetida4 = false;
        boolean repetida5 = false;
        boolean repetida6 = false;
        boolean repetida7 = false;
        boolean repetida8 = false;
        boolean repetida9 = false;
        boolean repetida10 = false;

        String respuestausuario;
        String volverAJugar;
        boolean jugar = false;
        int numPreguntas;
        int rangoMaximo = 10;   // ponemos el maximo a 9 para cuando todo funcione meternos con la pregunta 10 que es mas complicada.
        int rangoMinimo = 1;
        String numeroPreguntasText;
        double acertadas;
        double porcentaje;
        System.out.println("Bienvenidos al trivial de " + NOMBRE_TRIVIAL + ".");

        while (jugar != true) {

            Scanner sc = new Scanner(System.in);
            numPreguntas = 0;
            acertadas = 0;
            while (numPreguntas < 3 || numPreguntas > 10) {
                System.out.println("¿Cuantas preguntas quieres hacer? De 3 a 10 preguntas.");
                numeroPreguntasText = sc.nextLine();
                System.out.println("Responde a las preguntas con S (si) o N (No)");

                try {
                    numPreguntas = Integer.parseInt(numeroPreguntasText);
                    if (numPreguntas < 3 || numPreguntas > 10) {
                        System.out.println("Porfavor, solo numeros del 3 al 10");
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Porfavor, inserte numeros no letras.");
                } catch (Exception ex) {
                    System.out.println("Error inesperado.");
                }
            }

            for (int i = 0; i < numPreguntas; i++) {
                int numRamdon = (int) (Math.random() * rangoMaximo + rangoMinimo);
                // System.out.println(numRamdon);
                switch (numRamdon) {
                    case 1:
                        if (repetida1 != true) {

                            System.out.println(PREGUNTA1);
                            respuestausuario = sc.nextLine();
                            if (respuestausuario.equalsIgnoreCase(RESPUESTA1)) {

                                acertadas++;
                                repetida1 = true;
                                break;
                            }
                            System.out.println("Son 5: Homer, Marge, Bart, Maggie y Lisa");

                            break;

                        }
                    case 2:
                        if (repetida2 != true) {

                            System.out.println(PREGUNTA2);
                            respuestausuario = sc.nextLine();
                            if (respuestausuario.equalsIgnoreCase(RESPUESTA2)) {

                                acertadas++;
                                repetida2 = true;
                                break;
                            }
                            System.out.println("Realmente fue ella quien disparó, asique si.");

                            break;

                        }
                    case 3:
                        if (repetida3 != true) {
                            System.out.println(PREGUNTA3);
                            respuestausuario = sc.nextLine();
                            if (respuestausuario.equalsIgnoreCase(RESPUESTA3)) {

                                acertadas++;
                                repetida3 = true;
                                break;
                            }
                            System.out.println("La ciudad rival de Springfield es shelbyville");

                            break;
                        }
                    case 4:
                        if (repetida4 != true) {
                            System.out.println(PREGUNTA4);
                            respuestausuario = sc.nextLine();
                            if (respuestausuario.equalsIgnoreCase(RESPUESTA4)) {

                                acertadas++;
                                repetida4 = true;

                                break;
                            }
                            System.out.println("No son pareja, aunque siempre aparecen juntos, se trata de dos buenos amigos.");

                            break;
                        }
                    case 5:
                        if (repetida5 != true) {
                            System.out.println(PREGUNTA5);
                            respuestausuario = sc.nextLine();
                            if (respuestausuario.equalsIgnoreCase(RESPUESTA5)) {

                                acertadas++;
                                repetida5 = true;
                                break;
                            }
                            
                            System.out.println("Los simpsons viajan a Japon con unos billetes que le roban a Ned Flanders.");
                            break;
                        }
                    case 6:
                        if (repetida6 != true) {
                            System.out.println(PREGUNTA6);
                            respuestausuario = sc.nextLine();
                            if (respuestausuario.equalsIgnoreCase(RESPUESTA6)) {

                                acertadas++;
                                repetida6 = true;
                                  break;
                            }
                             System.out.println("Tiene un hermano, el cual le pidio dinero para hacer un traductor de bebes, lo invento y triunfó.");


                            break;
                        }
                    case 7:
                        if (repetida7 != true) {
                            System.out.println(PREGUNTA7);
                            respuestausuario = sc.nextLine();
                            if (respuestausuario.equalsIgnoreCase(RESPUESTA7)) {

                                acertadas++;
                                repetida7 = true;
                                break;
                            }
                            System.out.println("Bart tiene un hermano gemelo llamado Hugo, el cual aparecio en un episodio de hallowen.");

                            break;
                        }
                    case 8:
                        if (repetida8 != true) {
                            System.out.println(PREGUNTA8);
                            respuestausuario = sc.nextLine();
                            if (respuestausuario.equalsIgnoreCase(RESPUESTA8)) {

                                acertadas++;
                                 repetida8 = true;
                                break;
                            }
                            System.out.println("Segun un Brujo adivino, jefe de un casino, que predie el futuro ");
                                  System.out.println("en los Simpsons, Lisa acabaria de Presidenta de los EE.UU");

                            break;
                        }
                    case 9:
                        if (repetida9 != true) {
                            System.out.println(PREGUNTA9);
                            respuestausuario = sc.nextLine();
                            if (respuestausuario.equalsIgnoreCase(RESPUESTA9)) {

                                acertadas++;
                                repetida9 = true;
                                break;
                            }
                            System.out.println("Realmente si, Dios y Jesucristo, aparecen resprentados con 5 dedos.");

                            break;
                        }
                    case 10:
                        if (repetida10 != true) {

                            System.out.println(PREGUNTA10);
                            respuestausuario = sc.nextLine();

                            if (respuestausuario.equalsIgnoreCase(RESPUESTA10)) {

                                acertadas++;
                                repetida10 = true;
                                break;

                            } else {

                                if (RESPUESTA10.length() == respuestausuario.length()) {

                                    if (RESPUESTA10.charAt(0) == respuestausuario.charAt(0)
                                            || RESPUESTA10.charAt(1) == respuestausuario.charAt(1)) {
                                        System.out.println("Casi, casi, venga te doy medio punto.");
                                        acertadas = acertadas + 0.5;
                                         repetida10 = true;
                                    }
                                } else {
                                    System.out.println("las palabras no tienen la misma longitud, creo que no te la sabes...");
                                }
                            }
                            System.out.println("El pelo y la oreja de homer forman las iniciales del creador MG.");
                            break;
                        } else {

                            if (repetida1 != true) {
                                System.out.println(PREGUNTA1);
                                respuestausuario = sc.nextLine();
                                if (respuestausuario.equalsIgnoreCase(RESPUESTA1)) {

                                    acertadas++;
                                    repetida1 = true;
                                    break;
                                }
                                
                                break;
                            }

                            if (repetida2 != true) {
                                System.out.println(PREGUNTA2);
                                respuestausuario = sc.nextLine();
                                if (respuestausuario.equalsIgnoreCase(RESPUESTA2)) {

                                    acertadas++;
                                    repetida2 = true;
                                    break;
                                }
                                
                                break;
                            }

                            if (repetida3 != true) {
                                System.out.println(PREGUNTA3);
                                respuestausuario = sc.nextLine();
                                if (respuestausuario.equalsIgnoreCase(RESPUESTA3)) {

                                    acertadas++;
                                    repetida3 = true;
                                    break;
                                }
                                

                                break;
                            }

                            if (repetida4 != true) {
                                System.out.println(PREGUNTA4);
                                respuestausuario = sc.nextLine();
                                if (respuestausuario.equalsIgnoreCase(RESPUESTA4)) {

                                    acertadas++;
                                     repetida4 = true;
                                    break;
                                }
                               

                                break;
                            }

                            if (repetida5 != true) {
                                System.out.println(PREGUNTA5);
                                respuestausuario = sc.nextLine();
                                if (respuestausuario.equalsIgnoreCase(RESPUESTA5)) {

                                    acertadas++;
                                     repetida5 = true;
                                    break;
                                }
                               

                                break;
                            }

                            if (repetida6 != true) {
                                System.out.println(PREGUNTA6);
                                respuestausuario = sc.nextLine();
                                if (respuestausuario.equalsIgnoreCase(RESPUESTA6)) {

                                    acertadas++;
                                     repetida6 = true;
                                    break;
                                }
                               

                                break;
                            }

                            if (repetida7 != true) {
                                System.out.println(PREGUNTA7);
                                respuestausuario = sc.nextLine();
                                if (respuestausuario.equalsIgnoreCase(RESPUESTA7)) {

                                    acertadas++;
                                     repetida7 = true;
                                    break;
                                }
                               

                                break;
                            }

                            if (repetida8 != true) {
                                System.out.println(PREGUNTA8);
                                respuestausuario = sc.nextLine();
                                if (respuestausuario.equalsIgnoreCase(RESPUESTA8)) {

                                    acertadas++;
                                     repetida8 = true;

                                    break;
                                }

                                break;
                            }

                            if (repetida9 != true) {
                                System.out.println(PREGUNTA9);
                                respuestausuario = sc.nextLine();
                                if (respuestausuario.equalsIgnoreCase(RESPUESTA9)) {

                                    acertadas++;
                                    repetida9 = true;
                                    break;

                                }

                                break;
                            }

                        }

                }
                System.out.println("Llevas un total de " + acertadas + " Puntos, Animo!.");
            }

            porcentaje = (acertadas * 100) / numPreguntas;
            if (porcentaje <= 33) {
                System.out.println("Subscribete a Disney plus y empiezala de nuevo.");
            } else if (porcentaje <= 66) {
                System.out.println("No prestaste mucha atención a la serie.");
            } else if (porcentaje <= 99.9) {
                System.out.println("Veo que te gusta la serie, enhorabuena.");
            } else if (porcentaje <= 100) {
                System.out.println("¿Eres Matt Groening? PER-FEC-TO!");
            }

            System.out.println(String.format("%.02f", porcentaje) + "%");
            System.out.println("¿Quieres volver a jugar?");
            volverAJugar = sc.nextLine();
            if (volverAJugar.equalsIgnoreCase("NO") || volverAJugar.equalsIgnoreCase("N")) {
                jugar = true;
                System.out.println("Gracias por jugar.");
                break;
            }
        }
    }

}


