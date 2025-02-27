import java.util.Random;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Random random = new Random(); // Creamos un objeto Random para generar valores aleatorios
        int puntosJugador1 = 0;
        int puntosJugador2 = 0;

        // Bucle principal que sigue hasta que uno de los jugadores alcance 2 puntos
        while (puntosJugador1 < 2 && puntosJugador2 < 2) {
            int eleccionJugador1 = random.nextInt(3) + 1; // Genera un número entre 1 y 3 para Jugador 1
            int eleccionJugador2 = random.nextInt(3) + 1; // Genera un número entre 1 y 3 para Jugador 2

            // Convertimos la elección numérica en texto para mostrarla
            String opcionJugador1 = (eleccionJugador1 == 1) ? "Piedra" : (eleccionJugador1 == 2) ? "Papel" : "Tijera";
            String opcionJugador2 = (eleccionJugador2 == 1) ? "Piedra" : (eleccionJugador2 == 2) ? "Papel" : "Tijera";

            // Mostramos las elecciones de los jugadores
            System.out.println("Jugador 1 elige: " + opcionJugador1);
            System.out.println("Jugador 2 elige: " + opcionJugador2);

            // Verificamos el resultado de la ronda
            if (eleccionJugador1 == eleccionJugador2) {
                System.out.println("Empate!");
            } else if ((eleccionJugador1 == 1 && eleccionJugador2 == 3) ||
                    (eleccionJugador1 == 2 && eleccionJugador2 == 1) ||
                    (eleccionJugador1 == 3 && eleccionJugador2 == 2)) {
                System.out.println("Jugador 1 gana esta ronda!");
                puntosJugador1++; // Si incrementa el puntaje de Jugador 1
            } else {
                System.out.println("Jugador 2 gana esta ronda!");
                puntosJugador2++; // si incrementa el puntaje de Jugador 2
            }

            // Se muestra el puntaje actual
            System.out.println("Puntaje - Jugador 1: " + puntosJugador1 + " | Jugador 2: " + puntosJugador2);
            System.out.println("--------------------------------");

        }

        // Determinamos el ganador final y  se ejecuta automaticamente
        if (puntosJugador1 == 2) {
            System.out.println("¡Jugador 1 es el ganador!");
        } else {
            System.out.println("¡Jugador 2 es el ganador!");
        }
    }
}
