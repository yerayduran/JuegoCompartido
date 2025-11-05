import java.util.Scanner;

public class Juego {


    private static String descripcionJuego = "Estabas cagando en el baño de un mercadona random, tenias mucho sueño porque habias estado toda la noche jugando al call of duty, de repente notas cómo tus parpados empiezan a cerrarse. Al final te quedas dormido por viciar toda la noche y resulta que, cuando te despiertas, en vez de estar sentado en aquel váter estas en una especie de sillón en una sala totalmente a oscuras. Cuando te levantas, se te enciende la sala en la que estás. Ya no estás en aquel baño cutre del mercadona, ahora estabas en un lugar totalmente desconocido. ";

    // El mapa de habitaciones.
    // TODO: (Skin) ¡Rellenad esto con vuestras descripciones!
    private static String[] habitaciones = {
            "Se enciende una luz de una lampara muy vieja colgando del techo, apenas tenías visibilidad, pero lo unico que veias era una puerta con una luz que parecia que venia desde la habitacion o lo que fuera que estuviese tras esa puerta. ",  // Posición 0
            "Decidiste cruzar aquella puerta para ver qué te encontrarias. Por la cara ahora estas en una habitacion cuadrada, pequeña, un poco vieja, pero con algunos objetos que podrian servirte en un futuro. Estas un poco empanado, pero se te ocurre la gran idea de enumerar las habitaciones que te vas a ir encontrando. Ahora te encuentras en la habitacion 1 y la anterior era la 0. Ahora hay una puerta frente a ti, pero no la vas a cruzar porque ves unos objetos alrededor de ti y decides mirar a ver si encuentras algo de info para saber en donde leches estás.", // Posición 1
            "Estás en el aula 105. Hay una puerta a la IZQUIERDA y has visto una 'llave' en una mesa.", // Posición 2
            // Borra las habitaciones y escribe las tuyas
    };

    // Los objetos que hay en cada habitación.
    // TODO: (Skin) Rellenad esto con vuestros objetos
    private static String[][] objetosMapa = {
            {null, null},           // Objetos en Habitación 0
            {null, null},           // Objetos en Habitación 1
            {"llave", "nota"},      // Objetos en Habitación 2
    };

    // El inventario del jugador. Tamaño fijo.
    private static String[] inventario = new String[10];
    private static int habitacionActual = 0;
    private static final int habitacionFinal = 5;
    private static final String codigoSalida = "5731";



    private static void avanzar() {  //Funcion de W para pasar a la siguiente habitación
        if (habitacionActual < habitacionFinal) {
            habitacionActual++;
            System.out.println("Avanzas a la habitación " + habitacionActual);
            System.out.println(habitaciones[habitacionActual]);
        } else {  //Si llegas a la ultima habitación y intentas pasar te solicitara un codigo para salir la cual el codigo se debe de averiguar por pistas pasadas
            System.out.println("Estás en la última habitación. Introduce el código para escapar:");
            Scanner scanner = new Scanner(System.in);
            String codigo = scanner.nextLine();
            if (codigo.equals(codigoSalida)) {
                System.out.println("¡Código correcto! Has escapado del juego.");
                System.exit(0);
            } else {
                System.out.println("Código incorrecto. Intenta de nuevo.");
            }
        }
    }

    private static void retroceder() {  //Funcion de la S para ir a una habitacion anterior
        if (habitacionActual > 0) {
            habitacionActual--;
            System.out.println("Retrocedes a la habitación " + habitacionActual);
            System.out.println(habitaciones[habitacionActual]);
        } else { //Si estas en la habitacion 1 te indica que estas en el principio y no retrocedes en la habitacion 1
            System.out.println("Ya estás en la habitación inicial.");
        }
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jugando = true;

        System.out.println("¡Bienvenido a 'TU PROPIA AVENTURA'!");
        System.out.println("------------------------------------------");

        // TODO 1a: Muestra la descripción general del juego

        // TODO 1b: Muestra la descripción de la primera habitación
        // Pista: System.out.println(habitaciones[...]);


        while (jugando) {
            System.out.print("\nAcciones disponibles: [W] Avanzar | [S] Retroceder | [A] Mirar Izquierda | [D] Mirar Derecha | [E] Recoger | [I] Inventario | [P] Ver Objeto Recogido\n> ");
            String entrada = scanner.nextLine().toUpperCase();

            switch (entrada) {
                case "W":
                    avanzar();
                    break;
                case "S":
                    retroceder();
                    break;
                case "A":
                    mostrarEntorno("izquierda");
                    break;
                case "D":
                    mostrarEntorno("derecha");
                    break;
                case "E":
                    recoger();
                    break;
                case "I":
                    mostrarInventario();
                    break;
                case "P":
                    abrirPista();
                    break;
                default:
                    System.out.println("Comando no reconocido. Usa W, S, A, D, E, I o P.");
            }
            scanner.close();
        }
    }
}