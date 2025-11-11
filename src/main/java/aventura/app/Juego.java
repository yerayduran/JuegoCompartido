package main.java.aventura.app;

import java.util.Scanner;

public class Juego {

    private static String descripcionJuego = "Estabas cagando en el baño de un Mercadona random, tenías mucho sueño porque habías estado\n toda la noche jugando al call of duty, de repente notas cómo tus parpados empiezan a cerrarse. Al final te quedas dormido por viciar toda\n la noche y resulta que, cuando te despiertas, en vez de estar sentado en aquel váter estas en una especie de sillón\n en una sala totalmente a oscuras. Cuando te levantas, se te enciende la sala en la que estás. Ya no estás en aquel baño cutre del Mercadona,\n ahora estabas en un lugar totalmente desconocido. ";

    // Array con nombres de habitaciones
    private static String[] nombresHabitaciones = {
            "HABITACION INICIAL",
            "HABITACION 1",
            "HABITACION 2",
            "HABITACION 3",
            "HABITACION 4",
            "HABITACION 5",
            "HABITACION 6",
            "HABITACION SALIDA"
    };

    // Array con descripciones de habitaciones
    private static String[] habitaciones = {
            "Se enciende una luz de una lámpara muy vieja colgando del techo, apenas tenías visibilidad, pero lo único que veías era una puerta\n a tu izquierda, con una luz que parecía que venia desde la habitación o lo que fuera que estuviese tras esa puerta. ", // Posición 0
            "Decidiste cruzar la puerta de la izq para ver qué te encontrarías. Por la cara ahora estas en una habitación cuadrada, pequeña, un poco vieja, pero con algunos\n objetos que podrían servirte en un futuro. Estas un poco empanado, pero se te ocurre la gran idea de enumerar las habitaciones que te vas a ir encontrando (por si acaso). Ahora te encuentras en la habitación 1 y\n la anterior era la 0. Ahora hay una puerta a tu derecha, pero no la vas a cruzar porque ves unos objetos alrededor de ti y\n decides mirar a ver si encuentras algo de info para saber en donde leches estás...",// Posición 1
            "Al llegar a la siguiente sala, ves que está nagada de agua, te llega hasta las rodillas.\n Otra vez tienes otra puerta a tu derecha.\n En la anterior habitación cogiste sin pensar unas botas pensando que te servirían para algo en un futuro y, aunque parecía que eras cortito,\n hiciste una buena elección. Entonces, te las pones para que no enfermes porque el agua estaba helada y no sentías apenas los pies.\n A todo esto, te pones a buscar... ", // Posición 2
            "Luego de cruzar esa puerta, estás en la siguiente sala, la cual está impoluta, totalmente diferente a las demás que has visto antes. \n Parecía que era como una sala que estaba en una época, sin ninguna duda, avanzadísima a la época en la que estás actualmente. Entras en la sala. Con las botas que tenías, como estaban mojadísimas y el suelo de la sala nueva estaba muy limpio, te resbalas. \n Te caes de culo, pero poco después ves que hay otra puerta  (sí, otra puerta, asi va esto) a tu izquierda, que estaba escondida tras un cuadro gigante. Aquella puerta era feísima, pero te da un poco igual. Como eres un curiosín, te pones a investigar...", // Posición 3
            "Cuando cruzas aquella puerta horrenda por no decir una bastada, ves otro escenario rarísimo. Estaba lleno de espejos.\n Hacían que te multiplicases tantas veces que ya no sabías si estabas drogado o estabas soñando (en un váter del Mercadona, recuerda). Esa locura era un laberinto y como seguías aturdido por haber llegado a este sitio, te sientas y te pones a ver vídeos de Thegrefg con el Clash Royale de los huevos.\n Un rato después, te decides y te pones a buscar la siguiente puerta. Luego de buscar un rato y tener la frente roja de tantos trancazos contra los espejos, la encuentras.\n Nueva puerta, por fin, y estaba a la derecha de donde venías. Esta puerta era un poco más bonita que el\n aborto de antes, aunque no eres un aficionado de las puertas. Antes de cruzar ya sabes que hacer...", // Posición 4
            "LLegas a la quinta habitación, ya estás hasta los huevos de cruzar puertas y coger papeletas con tonterías y no entender nada.\n Ahora estás en la sala de los patitos de goma. Cada vez que pisabas, fuera donde fuese, sonaba un agudísimo pitido que te estaba dejando sordo ya.\n Estas salas ya no tenían apenas decoración, eran como un escenario que estaban construyendo pero que no estaba terminado todavía.\n La puerta la tienes ahora a la derecha...", // Posición 5
            "Oye, esto no se acaba nunca. Estoy cansado ya... A ver, esta sala era... Bueno... Si viese lo que hay sería un detallazo, ¿no?\n Pasan 5 segundos y, en esa sala oscura que no se veía nada, se enciende una luz que estaba parpadeando por su estado deplorable que estaba a su vez\n sobre una puerta. Fíjate que esta puerta está muy simplona, pero no le das importancia, a lo que le das importancia es a un panel\n que tienes al lado de la puerta el cual te deja introducir unos dígitos, en concreto 4, y oye, tienes en posesión (a no ser que sigas siendo el empanado de siempre) cuatro objetos \n con cosas puestas que no sabes si quiera lo que son, pero parece cuadrar con esos papeles."// Posición 6
    };

    // Array con objetos de cada habitación
    private static String[][] objetosMapa = {
            {null, null, null},
            {"Reloj Marcando las 6AM", "Folio con cinco rayas", "Cantidad de cartas en la mano de un juego de brisca"},
            {"Nota: recuerda este patron (Agua, Circulo, Cartas)", null, null},
            {"Botas de Agua (Talla 41)", null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null}
    };

    // Array con nombres de habitaciones en el mapa 2D
    private static final String[][] habitacionesMapa = {
            {null, "Habitacion nº4", "Habitacion nº5"},
            {"Habitacion nº2", "Habitación nº3", "Habitacion Salida"},
            {"Habitacion nº1", "Habitacion inicial", null}
    };

    // El inventario del jugador. Tamaño fijo. Y código de salida.
    private static final String[] inventario = new String[11];

    // Posición actual del jugador
    private static int filaActual = 2;
    private static int columnaActual = 1;
    private static final String codigoSalida = "4163";

    // Variable para mapear posición a número de habitación
    private static int habitacionActual = 0;

    private static void mostrarHabitacionActual() {
        System.out.println("\n========================================");
        System.out.println("HABITACION ACTUAL: " + nombresHabitaciones[habitacionActual]);
        System.out.println("========================================");
        System.out.println(habitaciones[habitacionActual]);
        System.out.println("========================================\n");
    }

    private static void mover(String direccionMovimiento) {
        int nuevaFila = filaActual;
        int nuevaColumna = columnaActual;

        switch (direccionMovimiento) {
            case "A": //Ir izquierda
                nuevaColumna--;
                break;
            case "D": //Ir derecha
                nuevaColumna++;
                break;
            case "W": //Ir adelante
                nuevaFila--;
                break;
            case "S": //Ir atrás
                nuevaFila++;
                break;
            default:
                System.out.println("Dirección no válida.");
                return;
        }

        // Bloquear paso directo de (1,1) a (1,2), que es la habSalida
        if (filaActual == 1 && columnaActual == 1 && nuevaFila == 1 && nuevaColumna == 2) {
            System.out.println("Por aquí no es...");
            return;
        }
        if (filaActual == 1 && columnaActual == 2 && nuevaFila == 1 && nuevaColumna == 1) {
            System.out.println("Por aquí no es...");
            return;
        }
        if (filaActual == 2 && columnaActual == 1 && nuevaFila == 1 && nuevaColumna == 1) {
            System.out.println("Por aquí no es...");
            return;
        }
        if (filaActual == 1 && columnaActual == 1 && nuevaFila == 2 && nuevaColumna == 1) {
            System.out.println("Por aquí no es...");
            return;
        }

        if (nuevaFila >= 0 && nuevaFila < habitacionesMapa.length &&
                nuevaColumna >= 0 && nuevaColumna < habitacionesMapa[0].length &&
                habitacionesMapa[nuevaFila][nuevaColumna] != null) {

            filaActual = nuevaFila;
            columnaActual = nuevaColumna;

            // Actualizar la habitación actual según la posición
            actualizarHabitacion();

            System.out.println("Te has movido a: " + habitacionesMapa[filaActual][columnaActual]);
            mostrarHabitacionActual();
        } else {
            System.out.println("No puedes moverte por aquí");
        }

        if (filaActual == 1 && columnaActual == 2) {
            intentarSalir();
        }
    }

    // Función para actualizar qué habitación estamos visitando
    private static void actualizarHabitacion() {
        if (filaActual == 2 && columnaActual == 0) {
            habitacionActual = 1; // Habitación 1
        } else if (filaActual == 2 && columnaActual == 1) {
            habitacionActual = 0; // Habitación inicial
        } else if (filaActual == 1 && columnaActual == 0) {
            habitacionActual = 2; // Habitación 2
        } else if (filaActual == 1 && columnaActual == 1) {
            habitacionActual = 3; // Habitación 3
        } else if (filaActual == 1 && columnaActual == 2) {
            habitacionActual = 7; // Habitación salida
        } else if (filaActual == 0 && columnaActual == 0) {
            habitacionActual = 4; // Habitación 4
        } else if (filaActual == 0 && columnaActual == 1) {
            habitacionActual = 5; // Habitación 5
        } else if (filaActual == 0 && columnaActual == 2) {
            habitacionActual = 6; // Habitación 6
        }
    }

    // Con esto se puede habilitar la opción de recoger un objeto.
    private static void recogerObjeto() {
        String objeto = objetosMapa[habitacionActual][0]; // Primer objeto disponible

        if (objeto == null) {
            System.out.println("No hay objetos para recoger aquí.");
            return;
        }

        añadirAlInventario(objeto);

        // Remover el objeto recogido y desplazar los demás
        for (int i = 0; i < objetosMapa[habitacionActual].length - 1; i++) {
            objetosMapa[habitacionActual][i] = objetosMapa[habitacionActual][i + 1];
        }
        objetosMapa[habitacionActual][objetosMapa[habitacionActual].length - 1] = null;

        System.out.println("Has recogido: " + objeto);
    }

    private static void intentarSalir() {
        if (filaActual == 1 && columnaActual == 2) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Estás en la salida. Introduce el código para escapar:");
            String entrada = scanner.nextLine();
            if (entrada.equals(codigoSalida)) {
                System.out.println("¡Código correcto! Has escapado del juego.");
                System.exit(0);
            } else {
                System.out.println("Código incorrecto. Intenta de nuevo.");
            }
        } else {
            System.out.println("No estás en la salida.");
        }
    }

    private static void añadirAlInventario(String objeto) {
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i] == null) {
                inventario[i] = objeto;
                return;
            }
        }
        System.out.println("Tu inventario está lleno.");
    }

    private static void mostrarInventario() {
        System.out.println("\nInventario:");
        boolean vacio = true;
        for (String item : inventario) {
            if (item != null) {
                System.out.println("- " + item);
                vacio = false;
            }
        }
        if (vacio) {
            System.out.println("(vacío)");
        }
    }

    // Esto permite salir cuando quieras.
    private static void salir() {
        System.out.println("Hasta luego máquina!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jugando = true;

        System.out.println("¡Bienvenido a 'TU PROPIA AVENTURA'!");
        System.out.println("------------------------------------------");
        System.out.println(descripcionJuego);

        // Mostrar la habitación inicial
        mostrarHabitacionActual();

        while (jugando) {
            System.out.print("\nAcciones disponibles:\n [W] Adelante | [A] Izquierda | [S] Ir atrás | [D] Derecha | [E] Recoger todo | [I] Inventario | [X] Salir \n > ");
            String comando = scanner.nextLine().toUpperCase();

            switch (comando) {
                case "A":
                    mover("A");
                    break;
                case "D":
                    mover("D");
                    break;
                case "W":
                    mover("W");
                    break;
                case "S":
                    mover("S");
                    break;
                case "E":
                    recogerObjeto();
                    break;
                case "I":
                    mostrarInventario();
                    break;
                case "X":
                    salir();
                    jugando = false;
                    break;
                default:
                    System.out.println("Comando no reconocido.");
            }
        }
        scanner.close();
    }
}