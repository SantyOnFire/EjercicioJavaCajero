import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declarmamos variables
        String tipoAtacante;
        String tipoDefensor;
        int ataque;
        int defensa;
        double efectividad = 1.0;
        double dano;


        Scanner lector = new Scanner(System.in);

        System.out.println("CALCULADORA DE DANO POKEMON");
        System.out.println("--------------------------");

        System.out.println("Escribe el tipo del Pokemon atacante (Agua, Fuego, Planta o Electrico):");
        tipoAtacante = lector.nextLine();

        System.out.println("Escribe el tipo del Pokemon defensor (Agua, Fuego, Planta o Electrico):");
        tipoDefensor = lector.nextLine();

        System.out.println("Escribe el valor de ataque (1-100):");
        ataque = lector.nextInt();

        System.out.println("Escribe el valor de defensa (1-100):");
        defensa = lector.nextInt();

        if (tipoAtacante.equalsIgnoreCase("Agua")) {
            if (tipoDefensor.equalsIgnoreCase("Fuego")) {
                efectividad = 2.0;
            }
            if (tipoDefensor.equalsIgnoreCase("Planta")) {
                efectividad = 0.5;
            }
            if (tipoDefensor.equalsIgnoreCase("Agua")) {
                efectividad = 0.5;
            }
        }

        if (tipoAtacante.equalsIgnoreCase("Fuego")) {
            if (tipoDefensor.equalsIgnoreCase("Planta")) {
                efectividad = 2.0;
            }
            if (tipoDefensor.equalsIgnoreCase("Agua")) {
                efectividad = 0.5;
            }
            if (tipoDefensor.equalsIgnoreCase("Fuego")) {
                efectividad = 0.5;
            }
        }

        if (tipoAtacante.equalsIgnoreCase("Planta")) {
            if (tipoDefensor.equalsIgnoreCase("Agua")) {
                efectividad = 2.0;
            }
            if (tipoDefensor.equalsIgnoreCase("Fuego")) {
                efectividad = 0.5;
            }
            if (tipoDefensor.equalsIgnoreCase("Planta")) {
                efectividad = 0.5;
            }
        }

        if (tipoAtacante.equalsIgnoreCase("Electrico")) {
            if (tipoDefensor.equalsIgnoreCase("Agua")) {
                efectividad = 2.0;
            }
            if (tipoDefensor.equalsIgnoreCase("Planta")) {
                efectividad = 0.5;
            }
            if (tipoDefensor.equalsIgnoreCase("Electrico")) {
                efectividad = 0.5;
            }
        }

        dano = 50 * (ataque / (double)defensa) * efectividad;

        System.out.println("--------------------------");
        System.out.println("Resultado:");
        System.out.println("Tipo atacante: " + tipoAtacante);
        System.out.println("Tipo defensor: " + tipoDefensor);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
        System.out.println("Efectividad: " + efectividad);
        System.out.println("Daño causado: " + (int)dano);

        lector.close();
    }
}
