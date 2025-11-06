package main.java.aventura.app;

import java.util.Scanner;

public class Juego {


    private static String descripcionJuego = "Estabas cagando en el baño de un Mercadona random, tenias mucho sueño porque habías estado toda la noche jugando al call of duty, de repente notas cómo tus parpados empiezan a cerrarse. Al final te quedas dormido por viciar toda la noche y resulta que, cuando te despiertas, en vez de estar sentado en aquel váter estas en una especie de sillón en una sala totalmente a oscuras. Cuando te levantas, se te enciende la sala en la que estás. Ya no estás en aquel baño cutre del mercadona, ahora estabas en un lugar totalmente desconocido. ";

    // El mapa de habitaciones.
    // TODO: (Skin) ¡Rellenad esto con vuestras descripciones!
    private static String[] habitaciones = {
            "Se enciende una luz de una lámpara muy vieja colgando del techo, apenas tenías visibilidad, pero lo único que veías era una puerta\n a tu derecha  y otra a tu izquierda, con una luz que parecía que venia desde la habitación o lo que fuera que estuviese tras esas puertas. ",  // Posición 0
            "Decidiste cruzar la puerta de la izq para ver qué te encontrarías. Por la cara ahora estas en una habitación cuadrada, pequeña, un poco vieja, pero con algunos\n objetos que podrían servirte en un futuro. Estas un poco empanado, pero se te ocurre la gran idea de enumerar las habitaciones que te vas a ir encontrando (por si acaso). Ahora te encuentras en la habitación 1 y\n la anterior era la 0. Ahora hay una puerta a tu derecha, pero no la vas a cruzar porque ves unos objetos alrededor de ti y\n decides mirar a ver si encuentras algo de info para saber en donde leches estás...", // Posición 1
            "Al llegar a la siguiente sala, ves que está nagada de agua, te llega hasta las rodillas.\n Otra vez tienes otra puerta a tu derecha.\n En la anterior habitación cogiste sin pensar unas botas pensando que te servirían para algo en un futuro y, aunque parecía que eras cortito,\n hiciste una buena elección. Entonces, te las pones para que no enfermes porque el agua estaba helada y no sentías apenas los pies.\n A todo esto, te pones a buscar... ", // Posición 2
            "Luego de cruzar esa puerta, estás en la siguiente sala, la cual está impoluta, totalmente diferente a las demás que has visto antes. \n Parecía que era como una sala que estaba en una época, sin ninguna duda, avanzadísima a la época en la que estás actualmente. Entras en la sala. Con las botas que tenías, como estaban mojadísimas y el suelo de la sala nueva estaba muy limpio, te resbalas. \n Te caes de culo, pero poco después ves que hay otra puerta  (sí, otra puerta, asi va esto) a tu izquierda, que estaba escondida tras un cuadro gigante. Aquella puerta era feísima, pero te da un poco igual. Como eres un curiosín, te pones a investigar...", // Posición 3
            "Cuando cruzas aquella puerta horrenda por no decir una bastada, ves otro escenario rarísimo. Estaba lleno de espejos.\n Hacían que te multiplicases tantas veces que ya no sabías si estabas drogado o estabas soñando (en un váter del Mercadona, recuerda). Esa locura era un laberinto y como seguías aturdido por haber llegado a este sitio, te sientas y te pones a ver vídeos de Thegrefg con el Clash Royale de los huevos.\n Un rato después, te decides y te pones a buscar la siguiente puerta. Luego de buscar un rato y tener la frente roja de tantos trancazos contra los espejos, la encuentras.\n Nueva puerta, por fin, y estaba a la derecha de donde venías. Esta puerta era un poco más bonita que el\n aborto de antes, aunque no eres un aficionado de las puertas. Antes de cruzar ya sabes que hacer...", // Posición 4
            "LLegas a la quinta habitación, ya estás hasta los huevos de cruzar puertas y coger papeletas con tonterías y no entender nada.\n Ahora estás en la sala de los patitos de goma. Cada vez que pisabas, fuera donde fuese, sonaba un agudísimo pitido que te estaba dejando sordo ya.\n Estas salas ya no tenian apenas decoración, eran como un escenario que estaban construyendo pero que no estaba terminado todavía.\n La puerta la tienes ahora a la derecha...", // Posición 5
            "Oye, esto no se acaba nunca. Estoy cansado ya... A ver, esta sala era... Bueno... Si viese lo que hay sería un detallazo, ¿no?\n Pasan 5 segundos y, en esa sala oscura que no se veía nada, se enciende una luz que estaba parpadeando por su estado deplorable que estaba a su vez\n sobre una puerta. Fíjate que esta puerta está muy simplona, pero no le das importancia, a lo que le das importancia es a un panel\n que tienes al lado de la puerta el cual te deja introducir unos dígitos, en concreto 4, y oye, tienes en posesión (a no ser que sigas siendo el empanado de siempre) cuatro papeles \n con cosas puestas que no sabes si quiera lo que son, pero parece cuadrar con esos papeles. Se te enciende una neurona y te acuerdas que al principio\n había una sala a la derecha a la que no habías entrado, y te preguntas\n qué habrá allí"// Posición 6
            // Borra las habitaciones y escribe las tuyas
    };

    // Los objetos que hay en cada habitación.
    // TODO: (Skin) Rellenad esto con vuestros objetos
    private static final int filaInicial = 2;
    private static final int columnaInicial = 1;
    private static final String[][] habitacionesMapa = {{"Habitacion Secreta", "Habitacion nº5", "Habitacion nº6"},{"Habitacion nº3","Habitación nº4","Habitacion Salida"}, {"Habitacion nº1", "Habitacion inicial", "Habitacion nº2"}};

    private static void pasar(String[][] habitaciones){
        String[] dirrecciones = new String[]{habitacionesMapa[filaInicial][columnaInicial]};
        for(int f = (f.lenght - 1); f >= 1; f--){
            for(int c = c-1; c<=c.[f]lenght; c++);
            dirrecciones[][] == habitacionesMapa[f][c];
            System.out.println();
        }

        }





    // El inventario del jugador. Tamaño fijo.
    private static String[] inventario = new String[10];
    private static final String codigoSalida = "5731";




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jugando = true;

        System.out.println("¡Bienvenido a 'TU PROPIA AVENTURA'!");
        System.out.println("------------------------------------------");

        // TODO 1a: Muestra la descripción general del juego

        // TODO 1b: Muestra la descripción de la primera habitación
        // Pista: System.out.println(habitaciones[...]);


        while (jugando) {
            System.out.print("\nAcciones disponibles: [A] Izquierda | [D] Derecha | [E] Recoger | [I] Inventario | [P] Ver Objeto Recogido\n> ");
            String entrada = scanner.nextLine().toUpperCase();

            scanner.close();
        }
    }
}