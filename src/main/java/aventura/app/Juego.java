package main.java.aventura.app;

import java.util.Scanner;

public class Juego {


    private static String descripcionJuego = "Estabas cagando en el baño de un Mercadona random, tenias mucho sueño porque habías estado toda la noche jugando al call of duty, de repente notas cómo tus parpados empiezan a cerrarse. Al final te quedas dormido por viciar toda la noche y resulta que, cuando te despiertas, en vez de estar sentado en aquel váter estas en una especie de sillón en una sala totalmente a oscuras. Cuando te levantas, se te enciende la sala en la que estás. Ya no estás en aquel baño cutre del mercadona, ahora estabas en un lugar totalmente desconocido. ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jugando = true;

        System.out.println("¡Bienvenido a 'TU PROPIA AVENTURA'!");
        System.out.println("------------------------------------------");



        // TODO 1b: Muestra la descripción de la primera habitación
        // Pista: System.out.println(habitaciones[...]);


        while (jugando) {
            System.out.print("\nAcciones disponibles: [A] Izquierda | [D] Derecha | [E] Recoger | [I] Inventario | [P] Ver Objeto Recogido\n> ");
            String entrada = scanner.nextLine().toUpperCase();

            scanner.close();
        }
    }
}