package trivial;

import java.util.Scanner;

/**
 * @author Enrique
 */
public class Trivial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Declaramos la variables a utilizar
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
        final String RESPUESTA10 = "MG"; // Generamos una pregunta con dos posibles opciones ya que M es un char y G es otro char a utilizar como respuesta.
        //Inicializamos todas las variables Boolean en una frase para ahorrar espacio.
        boolean repetida1 = false, repetida2 = false, repetida3 = false, repetida4 = false, repetida5 = false, repetida6 = false, repetida7 = false, repetida8 = false, repetida9 = false, repetida10 = false;
        // inicializo las String sin nada dentro para que no me de error de iniciacion.
        String usuario1 = "", primerPuesto = "";
        String usuario2 = "", segundoPuesto = "";
        String usuario3 = "", tercerPuesto = "";
        String usuario4 = "", cuartoPuesto = "";
        // Aqui creamos y inicializamos el contador de jugadores y la variables de jugadores, la cual generara bucles segun jugadores seamos.
        int numeroJugadores = 0;
        int contadorJugadores = 0;
        //Esta variable nos seria para hacer un condicional por si queremos conservar el mismo numero de jugadores o volver a pedirlo.
        String mismosJugadores;
        // La variable ranking nos permite concatenar, como nosotros queramos, el resultado final del trivial.
        String ranking = "";
        String fallo = "Has fallado, ";
        String respuestaUsuario;
        final String ERRORPARSEINTEXCEPTION = "Error inesperado."; // creo las variables de mensaje de las Excepciones
        String volverAJugar;
        //Aqui se almacenaran los aciertos de los posibles 4 jugadores.
        double aciertos1 = 0;
        double aciertos2 = 0;
        double aciertos3 = 0;
        double aciertos4 = 0;
        boolean jugar = true; // Variable que define si se sige jugando o no (True o False)
        int contadorPreguntas = 0;
        int numRamdon;
        int numPreguntas;
        /* generamos el maximo y el minimoo para el contador de preguntas, ojo, no para el numero de preguntas a realizar
        si no  para sacar la pregunta aleatoriamente.*/
        final int RANGO_MAXIMO = 10;
        final int RANGO_MINIMO = 1;
        String numeroPreguntasText;
        /* esta variable nos permite dos cosas, comprobar que la longitud de las respuestas sea la correcta o 
        que convierta a un formato correcto, ademas en la pregunta 10, nos permite corregir las respuestas char por char
        pudiendo otorgar medio punto si la mitad esta bien.
         */
        int longitudRespuesta = 0;
        double aciertos;
        double tmpAciertos;
        String tmpUsuario;
        double porcentajeDeAciertos;
        System.out.println("Bienvenidos al trivial de " + NOMBRE_TRIVIAL + ". \n----------------------------------------------------\n");
        /*Tenemos la variable jugar que mientras sea true sigue jugando, es el bucle principal, donde TODO se ejecuta,
        ademas, reseteamos las variables para volver a generar una nueva partida sin tener que reiniciar el programa. */
        while (jugar != false) {
            contadorPreguntas = 0;
            numPreguntas = 0;
            aciertos = 0;
            repetida1 = repetida2 = repetida3 = repetida4 = repetida5 = repetida6 = repetida7 = repetida8 = repetida9 = repetida10 = false;
            usuario1 = "";
            usuario2 = "";
            usuario3 = "";
            usuario4 = "";
            aciertos1 = 0;
            aciertos2 = 0;
            aciertos3 = 0;
            aciertos4 = 0;
            /*aqui entramos en el primer bucle con jugadores a 0 cn lo cual nos preguntara y comprobara que jugadores
            sea del 1 al 4, este bucle engloba todo el juego en su interior repitiendolo tantas veces como 
            jugadores hayan.
             */
            while (numeroJugadores < 1 || numeroJugadores > 4) {
                System.out.println("Cuantos jugadores vais a jugar? maximo 4 minimo 1 \n----------------------------------------------------\n");
                try {
                    numeroJugadores = Integer.parseInt(sc.nextLine());
                    if (numeroJugadores < 1 || numeroJugadores > 4) {
                        System.out.println("Porfavor, solo de 1 a 4 jugadores. \n----------------------------------------------------\n");

                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Porfavor, inserte numeros no letras. \n----------------------------------------------------\n");
                } catch (Exception ex) {
                    System.out.println(ERRORPARSEINTEXCEPTION);
                }
            }
            /*accederemos, segun el contador de jugadores, a crear la variable de cada jugador, 
            guardando asi todos los nombres de los jugadores en sus variables individuales,
            ademas, como podeos observar, apartir del jugador 2 restaura las variables que tengan que 
            ver con los haciertos y repeticiones de preguntas, para que pueda acceder, cada jugador, 
            al juego en su totalidad.
             */
            while (contadorJugadores < numeroJugadores) {
                if ((contadorJugadores + 1) == 1) {
                    System.out.println("Cual es tu nombre jugador " + (contadorJugadores + 1) + "\n----------------------------------------------------\n");
                    contadorJugadores++;
                    usuario1 = sc.nextLine();

                } else if ((contadorJugadores + 1) == 2) {
                    contadorPreguntas = 0;
                    aciertos = 0;
                    repetida1 = repetida2 = repetida3 = repetida4 = repetida5 = repetida6 = repetida7 = repetida8 = repetida9 = repetida10 = false;
                    System.out.println("Cual es tu nombre jugador " + (contadorJugadores + 1) + "\n----------------------------------------------------\n");
                    contadorJugadores++;
                    usuario2 = sc.nextLine();

                } else if ((contadorJugadores + 1) == 3) {
                    System.out.println("Cual es tu nombre jugador " + (contadorJugadores + 1) + "\n----------------------------------------------------\n");
                    contadorPreguntas = 0;
                    aciertos = 0;
                    repetida1 = repetida2 = repetida3 = repetida4 = repetida5 = repetida6 = repetida7 = repetida8 = repetida9 = repetida10 = false;
                    contadorJugadores++;
                    usuario3 = sc.nextLine();

                } else if ((contadorJugadores + 1) == 4) {
                    System.out.println("Cual es tu nombre jugador " + (contadorJugadores + 1) + "\n----------------------------------------------------\n");
                    contadorPreguntas = 0;
                    aciertos = 0;
                    repetida1 = repetida2 = repetida3 = repetida4 = repetida5 = repetida6 = repetida7 = repetida8 = repetida9 = repetida10 = false;
                    contadorJugadores++;
                    usuario4 = sc.nextLine();
                }
                /*Aqui entramos ya al bucle de preguntas la cual comprueba que metamos siempre de 3 a 10 preguntas, y como 
                por defecto esta en 0 entra hasta que seleccionemos de 3 a 10 preguntas, ademas esta variable no cambiara
                con otros jugadores, todos los jugadores realizaran el mismo numero de preguntas en cada juego.
                
                 */

                while (numPreguntas < 3 || numPreguntas > 10) {
                    System.out.println("¿Cuantas preguntas quieres hacer? De 3 a 10 preguntas. \n----------------------------------------------------\n");
                    numeroPreguntasText = sc.nextLine();

                    try {
                        numPreguntas = Integer.parseInt(numeroPreguntasText);
                        if (numPreguntas < 3 || numPreguntas > 10) {
                            System.out.println("Porfavor, solo numeros del 3 al 10 \n----------------------------------------------------\n");
                        }
                    } catch (NumberFormatException ex) {
                        System.out.println("Porfavor, inserte numeros no letras. \n----------------------------------------------------\n");
                    } catch (Exception ex) {
                        System.out.println(ERRORPARSEINTEXCEPTION);
                    }
                }
                System.out.println("Responde a las preguntas con S (si) o N (No) \n----------------------------------------------------\n");
                /*
                Generamos el numero random
                 */
                while (contadorPreguntas < numPreguntas) {
                    numRamdon = (int) Math.floor(Math.random() * (RANGO_MAXIMO - RANGO_MINIMO + 1) + RANGO_MINIMO);

                    /*
                    Aqui, como muchos de mis compañeros, empece haciendo un switch, pero me generaba problemas con el ultimo 
                    case, haciendome bucles infinitos, podria haber generado un String a modo de array para no repetir, 
                    pero opte por hacer algo diferente, que es una secuencia de comprobaciones la cual si la pregunta 
                    aleatoria estaba repetida pasaba a la siguiente, siendo asi igual de aleatorio.
                    */
                    if (numRamdon == 1 && !repetida1) {
                        // asigno la pregunta como que ha salido ya
                        repetida1 = true;
                        // aumento el contador de preguntas.
                        contadorPreguntas++;
                        System.out.println(PREGUNTA1);
                        respuestaUsuario = sc.nextLine();
                        // compruebo que insertan lo que les pido.
                        while (!respuestaUsuario.equalsIgnoreCase("NO") && !respuestaUsuario.equalsIgnoreCase("N")
                                && !respuestaUsuario.equalsIgnoreCase("SI") && !respuestaUsuario.equalsIgnoreCase("S")) {
                            System.out.println("Por favor, Responda Si o No");
                            respuestaUsuario = sc.nextLine();
                        }
                        // hago posibles las opciones SI,S,No ,N.
                        longitudRespuesta = respuestaUsuario.length();
                        if (longitudRespuesta == 2) {
                            if (respuestaUsuario.equalsIgnoreCase("No")) {
                                respuestaUsuario = "N";
                            } else if (respuestaUsuario.equalsIgnoreCase("Si")) {
                                respuestaUsuario = "S";
                            }
                        }

                        if (respuestaUsuario.equalsIgnoreCase(RESPUESTA1)) {
                            aciertos++;
                                // genero un mensaje en singular o plural segun la cantidad de puntos que lleve el usuario.
                            if (aciertos > 1) {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                            } else {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                            }
                            
                        } else {
                                // si el usuario no acierta, le muetro la respuesta correcta.
                            System.out.println("\n"+ fallo +  "Son 5: Homer, Marge, Bart, Maggie y Lisa \n----------------------------------------------------\n");
                        }
                    } else if (numRamdon == 2 && !repetida2) {
                        repetida2 = true;
                        contadorPreguntas++;
                        System.out.println(PREGUNTA2);
                        respuestaUsuario = sc.nextLine();

                        while (!respuestaUsuario.equalsIgnoreCase("NO") && !respuestaUsuario.equalsIgnoreCase("N")
                                && !respuestaUsuario.equalsIgnoreCase("SI") && !respuestaUsuario.equalsIgnoreCase("S")) {
                            System.out.println("Por favor, Responda Si o No");
                            respuestaUsuario = sc.nextLine();
                        }
                        longitudRespuesta = respuestaUsuario.length();
                        if (longitudRespuesta == 2) {
                            if (respuestaUsuario.equalsIgnoreCase("No")) {
                                respuestaUsuario = "N";
                            } else if (respuestaUsuario.equalsIgnoreCase("Si")) {
                                respuestaUsuario = "S";
                            }
                        }

                        if (respuestaUsuario.equalsIgnoreCase(RESPUESTA2)) {
                            aciertos++;
                            if (aciertos > 1) {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                            } else {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                            }
                        } else {
                            System.out.println("\n"+ fallo +  "Realmente fue ella quien disparó, asi que si. \n----------------------------------------------------\n");
                        }
                    } else if (numRamdon == 3 && !repetida3) {
                        repetida3 = true;
                        contadorPreguntas++;
                        System.out.println(PREGUNTA3);
                        respuestaUsuario = sc.nextLine();
                        while (!respuestaUsuario.equalsIgnoreCase("NO") && !respuestaUsuario.equalsIgnoreCase("N")
                                && !respuestaUsuario.equalsIgnoreCase("SI") && !respuestaUsuario.equalsIgnoreCase("S")) {
                            System.out.println("Por favor, Responda Si o No");
                            respuestaUsuario = sc.nextLine();
                        }
                        longitudRespuesta = respuestaUsuario.length();
                        if (longitudRespuesta == 2) {
                            if (respuestaUsuario.equalsIgnoreCase("No")) {
                                respuestaUsuario = "N";
                            } else if (respuestaUsuario.equalsIgnoreCase("Si")) {
                                respuestaUsuario = "S";
                            }
                        }

                        if (respuestaUsuario.equalsIgnoreCase(RESPUESTA3)) {
                            aciertos++;
                            if (aciertos > 1) {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                            } else {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                            }
                        } else {
                            System.out.println("\n"+ fallo +  "La ciudad rival de Springfield es shelbyville \n----------------------------------------------------\n");

                        }
                    } else if (numRamdon == 4 && !repetida4) {
                        repetida4 = true;
                        contadorPreguntas++;
                        System.out.println(PREGUNTA4);
                        respuestaUsuario = sc.nextLine();

                        while (!respuestaUsuario.equalsIgnoreCase("NO") && !respuestaUsuario.equalsIgnoreCase("N")
                                && !respuestaUsuario.equalsIgnoreCase("SI") && !respuestaUsuario.equalsIgnoreCase("S")) {
                            System.out.println("Por favor, Responda Si o No");
                            respuestaUsuario = sc.nextLine();
                        }
                        longitudRespuesta = respuestaUsuario.length();
                        if (longitudRespuesta == 2) {
                            if (respuestaUsuario.equalsIgnoreCase("No")) {
                                respuestaUsuario = "N";
                            } else if (respuestaUsuario.equalsIgnoreCase("Si")) {
                                respuestaUsuario = "S";
                            }
                        }

                        if (respuestaUsuario.equalsIgnoreCase(RESPUESTA4)) {
                            aciertos++;
                            if (aciertos > 1) {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                            } else {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                            }
                        } else {
                            System.out.println("\n"+ fallo +  "No son pareja, aunque siempre aparecen juntos, se trata de dos buenos amigos.\n----------------------------------------------------\n");
                        }
                    } else if (numRamdon == 5 && !repetida5) {
                        repetida5 = true;
                        contadorPreguntas++;
                        System.out.println(PREGUNTA5);
                        respuestaUsuario = sc.nextLine();
                        while (!respuestaUsuario.equalsIgnoreCase("NO") && !respuestaUsuario.equalsIgnoreCase("N")
                                && !respuestaUsuario.equalsIgnoreCase("SI") && !respuestaUsuario.equalsIgnoreCase("S")) {
                            System.out.println("Por favor, Responda Si o No");
                            respuestaUsuario = sc.nextLine();
                        }
                        longitudRespuesta = respuestaUsuario.length();
                        if (longitudRespuesta == 2) {
                            if (respuestaUsuario.equalsIgnoreCase("No")) {
                                respuestaUsuario = "N";
                            } else if (respuestaUsuario.equalsIgnoreCase("Si")) {
                                respuestaUsuario = "S";
                            }
                        }

                        if (respuestaUsuario.equalsIgnoreCase(RESPUESTA5)) {
                            aciertos++;
                            if (aciertos > 1) {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                            } else {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                            }
                        } else {
                            System.out.println("\n"+ fallo +  "Los simpsons viajan a Japon con unos billetes que le roban a Ned Flanders.\n----------------------------------------------------\n");
                        }
                    } else if (numRamdon == 6 && !repetida6) {
                        repetida6 = true;
                        contadorPreguntas++;
                        System.out.println(PREGUNTA6);
                        respuestaUsuario = sc.nextLine();
                        while (!respuestaUsuario.equalsIgnoreCase("NO") && !respuestaUsuario.equalsIgnoreCase("N")
                                && !respuestaUsuario.equalsIgnoreCase("SI") && !respuestaUsuario.equalsIgnoreCase("S")) {
                            System.out.println("Por favor, Responda Si o No");
                            respuestaUsuario = sc.nextLine();
                        }
                        longitudRespuesta = respuestaUsuario.length();
                        if (longitudRespuesta == 2) {
                            if (respuestaUsuario.equalsIgnoreCase("No")) {
                                respuestaUsuario = "N";
                            } else if (respuestaUsuario.equalsIgnoreCase("Si")) {
                                respuestaUsuario = "S";
                            }
                        }

                        if (respuestaUsuario.equalsIgnoreCase(RESPUESTA6)) {
                            aciertos++;
                            if (aciertos > 1) {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                            } else {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                            }
                        } else {
                            System.out.println("\n"+ fallo +  "Tiene un hermano, el cual le pidio dinero para hacer un traductor de bebes, lo invento y triunfó. \n----------------------------------------------------\n");

                        }
                    } else if (numRamdon == 7 && !repetida7) {
                        repetida7 = true;
                        contadorPreguntas++;
                        System.out.println(PREGUNTA7);
                        respuestaUsuario = sc.nextLine();
                        while (!respuestaUsuario.equalsIgnoreCase("NO") && !respuestaUsuario.equalsIgnoreCase("N")
                                && !respuestaUsuario.equalsIgnoreCase("SI") && !respuestaUsuario.equalsIgnoreCase("S")) {
                            System.out.println("Por favor, Responda Si o No");
                            respuestaUsuario = sc.nextLine();
                        }
                        longitudRespuesta = respuestaUsuario.length();
                        if (longitudRespuesta == 2) {
                            if (respuestaUsuario.equalsIgnoreCase("No")) {
                                respuestaUsuario = "N";
                            } else if (respuestaUsuario.equalsIgnoreCase("Si")) {
                                respuestaUsuario = "S";
                            }
                        }

                        if (respuestaUsuario.equalsIgnoreCase(RESPUESTA7)) {
                            aciertos++;
                            if (aciertos > 1) {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                            } else {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                            }
                        } else {
                            System.out.println("\n"+ fallo +  "Bart tiene un hermano gemelo llamado Hugo, el cual aparecio en un episodio de hallowen. \n----------------------------------------------------\n");
                        }
                    } else if (numRamdon == 8 && !repetida8) {
                        repetida8 = true;
                        contadorPreguntas++;
                        System.out.println(PREGUNTA8);
                        respuestaUsuario = sc.nextLine();
                        while (!respuestaUsuario.equalsIgnoreCase("NO") && !respuestaUsuario.equalsIgnoreCase("N")
                                && !respuestaUsuario.equalsIgnoreCase("SI") && !respuestaUsuario.equalsIgnoreCase("S")) {
                            System.out.println("Por favor, Responda Si o No");
                            respuestaUsuario = sc.nextLine();
                        }
                        longitudRespuesta = respuestaUsuario.length();
                        if (longitudRespuesta == 2) {
                            if (respuestaUsuario.equalsIgnoreCase("No")) {
                                respuestaUsuario = "N";
                            } else if (respuestaUsuario.equalsIgnoreCase("Si")) {
                                respuestaUsuario = "S";
                            }
                        }

                        if (respuestaUsuario.equalsIgnoreCase(RESPUESTA8)) {
                            aciertos++;
                            if (aciertos > 1) {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                            } else {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                            }
                        } else {
                            System.out.println("\n"+ fallo +  "Segun un Brujo adivino, jefe de un casino, que predie el futuro\n ");
                            System.out.println("en los Simpsons, Lisa acabaria de Presidenta de los EE.UU \n----------------------------------------------------\n");
                        }
                    } else if (numRamdon == 9 && !repetida9) {
                        repetida9 = true;
                        contadorPreguntas++;
                        System.out.println(PREGUNTA9);
                        respuestaUsuario = sc.nextLine();
                        while (!respuestaUsuario.equalsIgnoreCase("NO") && !respuestaUsuario.equalsIgnoreCase("N")
                                && !respuestaUsuario.equalsIgnoreCase("SI") && !respuestaUsuario.equalsIgnoreCase("S")) {
                            System.out.println("Por favor, Responda Si o No");
                            respuestaUsuario = sc.nextLine();
                        }
                        longitudRespuesta = respuestaUsuario.length();
                        if (longitudRespuesta == 2) {
                            if (respuestaUsuario.equalsIgnoreCase("No")) {
                                respuestaUsuario = "N";
                            } else if (respuestaUsuario.equalsIgnoreCase("Si")) {
                                respuestaUsuario = "S";
                            }
                        }

                        if (respuestaUsuario.equalsIgnoreCase(RESPUESTA9)) {
                            aciertos++;
                            if (aciertos > 1) {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                            } else {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                            }
                        } else {
                            System.out.println("\n"+ fallo +  "Realmente si, Dios y Jesucristo, aparecen resprentados con 5 dedos. \n----------------------------------------------------\n");

                        }
                    } else if (numRamdon == 10 && !repetida10) {
                        repetida10 = true;
                        contadorPreguntas++;
                        System.out.println(PREGUNTA10);
                        respuestaUsuario = sc.nextLine();
                        if (respuestaUsuario.equalsIgnoreCase(RESPUESTA10)) {
                            aciertos++;
                            if (aciertos > 1) {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                            } else {
                                System.out.println("\nCorrecto, Llevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                            }
                        } else {
                            // aqui compruebo caracter a caracter la respuesta del usuario.
                            if (RESPUESTA10.length() == respuestaUsuario.length()) {
                                respuestaUsuario = respuestaUsuario.toUpperCase();
                                if (RESPUESTA10.charAt(0) == respuestaUsuario.charAt(0)
                                        || RESPUESTA10.charAt(1) == respuestaUsuario.charAt(1)) {
                                    repetida10 = true;
                                    // aqui si el usuario acierta una de las dos uniciales le sumo medio punto.
                                    System.out.println("\nCasi, casi, venga te doy medio punto. \n----------------------------------------------------\n");
                                    aciertos = aciertos + 0.5;
                                    if (aciertos > 1) {
                                        System.out.println("\nLlevas un total de " + aciertos + " Puntos, Animo!. \n----------------------------------------------------");
                                    } else {
                                        System.out.println("\nLlevas un total de " + aciertos + " Punto, Animo!. \n----------------------------------------------------");

                                    }
                                } else {
                                    System.out.println("\n"+ fallo +  "El pelo y la oreja de homer forman las iniciales del creador MG. \n----------------------------------------------------\n");

                                }
                            } else {
                                  //si el usuario pone mas de 2 letras le digo la respuesta tambien.
                                System.out.println("\n"+ fallo +  "las palabras no tienen la misma longitud, creo que no te la sabes... El pelo y la oreja de homer forman las iniciales del creador MG. \n----------------------------------------------------\n");
                            }
                        }
                    }
                    // aqui almaceno por cada bucle, el numero de aciertos de el jugador que esta jugando en ese momento.
                    switch (contadorJugadores) {
                        case 1:
                            aciertos1 = aciertos;
                        case 2:
                            aciertos2 = aciertos;
                        case 3:
                            aciertos3 = aciertos;
                        case 4:
                            aciertos4 = aciertos;

                    }

                }
                /* genero el pordentaje de haciertos segun las preguntas que han elegido ademas de 
                una frase segun los 4 tramos de porcentaje que hayan optenido.
                */
                porcentajeDeAciertos = (aciertos * 100) / numPreguntas;
                if (porcentajeDeAciertos <= 33) {
                    System.out.print("Subscribete a Disney plus y empiezala de nuevo.\n----------------------------------------------------\n");
                } else if (porcentajeDeAciertos <= 66) {
                    System.out.print("No prestaste mucha atención a la serie.\n----------------------------------------------------\n");
                } else if (porcentajeDeAciertos <= 99.9) {
                    System.out.print("Veo que te gusta la serie, enhorabuena.\n----------------------------------------------------\n");
                } else if (porcentajeDeAciertos <= 100) {
                    System.out.print("¿Eres Matt Groening? PER-FEC-TO!\n----------------------------------------------------\n");
                }
                // le muestro el porcentaje de aciertos.
                System.out.println(String.format("Has acertado el  %.02f", porcentajeDeAciertos) + "% de las preguntas.\n----------------------------------------------------");

            }
            /*
            Aqui para hacer el ranking, entra en cada uno de los if, segun los jugadores que esten jugando,
            si solo hay un jugador, no ordena ni hace el ranking, solo lo realiza apartir de 2 jugadores,
            para realizar el ordenamiento de los aciertos y los nombre por orden.
            
            Lo explico mejor en el caso 4 que es mas extenso.
            */
            if (numeroJugadores == 1) {
                System.out.println("");

            } else if (numeroJugadores == 2) {

                if (aciertos1 < aciertos2) {
                    tmpAciertos = aciertos1;
                    tmpUsuario = usuario1;
                    aciertos1 = aciertos2;
                    usuario1 = usuario2;
                    aciertos2 = tmpAciertos;
                    usuario2 = tmpUsuario;

                }

                System.out.println("Este es el ranking: " + "\n" + " " + aciertos1 + " " + usuario1 + " \n " + aciertos2 + " " + usuario2 + "\n----------------------------------------------------");
            } else if (numeroJugadores == 3) {

                if (aciertos1 < aciertos2) {
                    tmpAciertos = aciertos1;
                    tmpUsuario = usuario1;
                    aciertos1 = aciertos2;
                    usuario1 = usuario2;
                    aciertos2 = tmpAciertos;
                    usuario2 = tmpUsuario;

                }

                if (aciertos1 < aciertos3) {

                    tmpAciertos = aciertos1;
                    tmpUsuario = usuario1;

                    aciertos1 = aciertos3;
                    usuario1 = usuario3;

                    aciertos3 = tmpAciertos;
                    usuario3 = tmpUsuario;

                }

                if (aciertos2 < aciertos3) {

                    tmpAciertos = aciertos2;
                    tmpUsuario = usuario2;

                    aciertos2 = aciertos3;
                    usuario2 = usuario3;

                    aciertos3 = tmpAciertos;
                    usuario3 = tmpUsuario;
                }
                System.out.println("Este es el ranking: " + "\n" + " " + aciertos1 + " " + usuario1 + " \n " + aciertos2 + " " + usuario2 + " \n " + aciertos3 + " " + usuario3 + "\n----------------------------------------------------");
            } else if (numeroJugadores == 4) {

                if (aciertos1 < aciertos2) {  // si aciertos 1 es menos que aciertos 2.
                    tmpAciertos = aciertos1; // guardo aciertos 1 en una variable temporal.
                    tmpUsuario = usuario1;  // hacemos lo mismo con el usuario al que pertenece
                    
                    aciertos1 = aciertos2 ; // intercambiamos el valor de aciertos 1 por el de 2
                    usuario1 = usuario2;   // lo mismo con el nombre
                    
                    aciertos2 = tmpAciertos;  // le asignamos a aciertos dos el valor inicial de aciertos 1
                    usuario2 = tmpUsuario;   // lo mismo con el nombre

                    // de esta forma conseguimos que se ordenen los jugadores y las puntuaciones
                }
                // haremos lo mismo con todas las posibilidades comparativas.
                if (aciertos3 < aciertos4) {
                    tmpAciertos = aciertos3;
                    tmpUsuario = usuario3;
                    
                    aciertos3 = aciertos4;
                    usuario3 = usuario4;
                    
                    aciertos4 = tmpAciertos;
                    usuario4 = tmpUsuario;
                }

                if (aciertos1 < aciertos3) {

                    tmpAciertos = aciertos1;
                    tmpUsuario = usuario1;

                    aciertos1 = aciertos3;
                    usuario1 = usuario3;

                    aciertos3 = tmpAciertos;
                    usuario3 = tmpUsuario;

                }

                if (aciertos2 < aciertos4) {
                    tmpAciertos = aciertos2;
                    tmpUsuario = usuario2;

                    aciertos2 = aciertos4;
                    usuario2 = usuario4;

                    aciertos4 = tmpAciertos;
                    usuario4 = tmpUsuario;

                }
                if (aciertos2 < aciertos3) {

                    tmpAciertos = aciertos2;
                    tmpUsuario = usuario2;

                    aciertos2 = aciertos3;
                    usuario2 = usuario3;

                    aciertos3 = tmpAciertos;
                    usuario3 = tmpUsuario;
                }
                System.out.println("Este es el ranking: " + "\n" + " " + aciertos1 + " " + usuario1 + " \n " + aciertos2 + " " + usuario2 + " \n " + aciertos3 + " " + usuario3 + " \n " + aciertos4 + " " + usuario4 + "\n----------------------------------------------------");
            }

            /* aqui le preguntamos al usuario si quiere volver a jugar, modificando el boolean del bucle principal
            el cual sigue ejecutando el juego hasta que esta variable de abajo cambie a false.
            */
            
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
            
            /* Si el numero de jugadores es mayor a 1, le damos la posibilidad
            de que el numero de jugadores sea el mismo, si dice que no, volveremos a 
            preguuntar que cuantos jugadores van a jugar.
            
            */
            if (numeroJugadores > 1) {
                System.out.println("¿Sereis los mismos jugadores?");
                mismosJugadores = sc.nextLine();
                if (mismosJugadores.equalsIgnoreCase("NO")) {
                    numeroJugadores = 0;

                }
            }
            /* Ponemos a 0 el contador de jugadores para que ejecute, de nuevo, 
            cantidad de Bubles como jugadores haya en ese momento, si no lo pusieramos
            a 0 seria como si los jugadores hubieran hecho ya sus rondas.
            */
            
            contadorJugadores = 0;
        }

    }
}
