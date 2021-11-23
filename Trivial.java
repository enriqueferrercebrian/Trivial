package trivial;

import java.util.Scanner;

/**
 * @author Enrique
 */
public class Trivial {

    public static void main(String[] args) {

        final String NOMBRE_TRIVIAL = "Los Simpsons";
        final String PREGUNTA1 = "suna";
        final String PREGUNTA2 = "sdos";
        final String PREGUNTA3 = "ftres";
        final String PREGUNTA4 = "fcuatro";
        final String PREGUNTA5 = "scinco";
        final String PREGUNTA6 = "sseis";
        final String PREGUNTA7 = "fsiete";
        final String PREGUNTA8 = "focho";
        final String PREGUNTA9 = "snueve";
        final String PREGUNTA10 = "fDiez";
        final String RESPUESTA1 = "S";
        final String RESPUESTA2 = "S";
        final String RESPUESTA3 = "S";
        final String RESPUESTA4 = "S";
        final String RESPUESTA5 = "S";
        final String RESPUESTA6 = "F";
        final String RESPUESTA7 = "F";
        final String RESPUESTA8 = "F";
        final String RESPUESTA9 = "F";
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
        int numPreguntas = 0;
        int rangoMaximo = 100;   // ponemos el maximo a 9 para cuando todo funcione meternos con la pregunta 10 que es mas complicada.
        int rangoMinimo = 1;
        String numeroPreguntasText;
        double acertadas = 0;
        String respuesta;

        System.out.println("Bienvenidos al trivial de " + NOMBRE_TRIVIAL + ".");

        Scanner sc = new Scanner(System.in);

        while (numPreguntas < 3 || numPreguntas > 100) {
            System.out.println("NUMERO DE 3 A 10");
            numeroPreguntasText = sc.nextLine();

            try {
                numPreguntas = Integer.parseInt(numeroPreguntasText);
                if (numPreguntas < 3 || numPreguntas > 10) {
                    System.out.println("Porfavor, solo numeros del 3 al 10");
                }
            } catch (NumberFormatException ex) {
                System.out.println("SOLO NUMEROS");
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

                            acertadas = acertadas++;
                            break;
                        }
                        repetida1 = true;

                        break;

                    }
                case 2:
                    if (repetida2 != true) {
                        System.out.println(PREGUNTA2);
                        respuestausuario = sc.nextLine();
                        if (respuestausuario.equalsIgnoreCase(RESPUESTA2)) {

                            acertadas = acertadas++;
                            break;
                        }
                        repetida2 = true;

                        break;
                    }
                case 3:
                    if (repetida3 != true) {
                        System.out.println(PREGUNTA3);
                        respuestausuario = sc.nextLine();
                        if (respuestausuario.equalsIgnoreCase(RESPUESTA3)) {

                            acertadas++;
                            break;
                        }
                        repetida3 = true;

                        break;
                    }
                case 4:
                    if (repetida4 != true) {
                        System.out.println(PREGUNTA4);
                        respuestausuario = sc.nextLine();
                        if (respuestausuario.equalsIgnoreCase(RESPUESTA4)) {

                            acertadas++;
                            break;
                        }
                        repetida4 = true;

                        break;
                    }
                case 5:
                    if (repetida5 != true) {
                        System.out.println(PREGUNTA5);
                        respuestausuario = sc.nextLine();
                        if (respuestausuario.equalsIgnoreCase(RESPUESTA5)) {

                            acertadas++;
                            break;
                        }
                        repetida5 = true;

                        break;
                    }
                case 6:
                    if (repetida6 != true) {
                        System.out.println(PREGUNTA6);
                        respuestausuario = sc.nextLine();
                        if (respuestausuario.equalsIgnoreCase(RESPUESTA6)) {

                            acertadas++;
                            break;
                        }
                        repetida6 = true;

                        break;
                    }
                case 7:
                    if (repetida7 != true) {
                        System.out.println(PREGUNTA7);
                        respuestausuario = sc.nextLine();
                        if (respuestausuario.equalsIgnoreCase(RESPUESTA7)) {

                            acertadas++;
                            break;
                        }
                        repetida7 = true;

                        break;
                    }
                case 8:
                    if (repetida8 != true) {
                        System.out.println(PREGUNTA8);
                        respuestausuario = sc.nextLine();
                        if (respuestausuario.equalsIgnoreCase(RESPUESTA8)) {

                            acertadas++;
                            break;
                        }
                        repetida8 = true;

                        break;
                    }
                case 9:
                    if (repetida9 != true) {
                        System.out.println(PREGUNTA9);
                        respuestausuario = sc.nextLine();
                        if (respuestausuario.equalsIgnoreCase(RESPUESTA9)) {

                            acertadas++;
                            break;
                        }
                        repetida9 = true;

                        break;
                    }
                case 10:
                    if (repetida10 != true) {

                        System.out.println(PREGUNTA10);
                        respuestausuario = sc.nextLine();

                        if (respuestausuario.equalsIgnoreCase(RESPUESTA10)) {

                            acertadas++;
                            break;

                        } else {

                            if (RESPUESTA10.length() == respuestausuario.length()) {

                                if (RESPUESTA10.charAt(0) == respuestausuario.charAt(0)
                                        || RESPUESTA10.charAt(1) == respuestausuario.charAt(1)) {
                                    System.out.println("Casi, casi, venga te doy medio punto.");
                                    acertadas = acertadas + 0.5;
                                }
                            } else {
                                System.out.println("las palabras no tienen la misma longitud");
                            }
                        }
                        repetida10 = true;
                        break;
                    } else {

                        if (repetida1 != true) {
                            System.out.println(PREGUNTA1);
                            respuestausuario = sc.nextLine();
                            if (respuestausuario.equalsIgnoreCase(RESPUESTA1)) {

                                acertadas++;
                                break;
                            }
                            repetida1 = true;

                            break;
                        }

                        if (repetida2 != true) {
                            System.out.println(PREGUNTA2);
                            respuestausuario = sc.nextLine();
                            if (respuestausuario.equalsIgnoreCase(RESPUESTA2)) {

                                acertadas++;
                                break;
                            }
                            repetida2 = true;

                            break;
                        }

                        if (repetida3 != true) {
                            System.out.println(PREGUNTA3);
                            respuestausuario = sc.nextLine();
                            if (respuestausuario.equalsIgnoreCase(RESPUESTA3)) {

                                acertadas++;
                                break;
                            }
                            repetida3 = true;

                            break;
                        }

                        if (repetida4 != true) {
                            System.out.println(PREGUNTA4);
                            respuestausuario = sc.nextLine();
                            if (respuestausuario.equalsIgnoreCase(RESPUESTA4)) {

                                acertadas++;
                                break;
                            }
                            repetida4 = true;

                            break;
                        }

                        if (repetida5 != true) {
                            System.out.println(PREGUNTA5);
                            respuestausuario = sc.nextLine();
                            if (respuestausuario.equalsIgnoreCase(RESPUESTA5)) {

                                acertadas++;
                                break;
                            }
                            repetida5 = true;

                            break;
                        }

                        if (repetida6 != true) {
                            System.out.println(PREGUNTA6);
                            respuestausuario = sc.nextLine();
                            if (respuestausuario.equalsIgnoreCase(RESPUESTA6)) {

                                acertadas++;
                                break;
                            }
                            repetida6 = true;

                            break;
                        }

                        if (repetida7 != true) {
                            System.out.println(PREGUNTA7);
                            respuestausuario = sc.nextLine();
                            if (respuestausuario.equalsIgnoreCase(RESPUESTA7)) {

                                acertadas++;
                                break;
                            }
                            repetida7 = true;

                            break;
                        }

                        if (repetida8 != true) {
                            System.out.println(PREGUNTA8);
                            respuestausuario = sc.nextLine();
                            if (respuestausuario.equalsIgnoreCase(RESPUESTA8)) {

                                acertadas++;
                                break;
                            }
                            repetida8 = true;

                            break;
                        }

                        if (repetida9 != true) {
                            System.out.println(PREGUNTA9);
                            respuestausuario = sc.nextLine();
                            if (respuestausuario.equalsIgnoreCase(RESPUESTA9)) {

                                acertadas++;
                                break;
                            }
                            repetida9 = true;

                            break;
                        }

                    }

            }
        }
    }
}
