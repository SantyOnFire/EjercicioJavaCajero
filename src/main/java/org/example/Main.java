import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Aca Declaramos las variables de tipo doble, entero y boolean
        double saldo = 50000.0;
        boolean continuar = true;
        Scanner teclado = new Scanner(System.in);
        int opcion;

        // Damos el Mensaje de bienvenida
        System.out.println("Bienvenido al Cajero Automático");

        // Bucle principal del programa
        while (continuar) {
            // Mostramos el menú
            System.out.println("\n MENU DEL CAJERO");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            // Leemos la opción elegida
            try {
                opcion = teclado.nextInt();

                // Procesamos la opción
                switch (opcion) {
                    case 1: // Consultar saldo
                        System.out.println("Tu saldo actual es: $" + saldo);
                        break;

                    case 2: // Ingresar dinero
                        System.out.print("¿Cuánto dinero quieres ingresar? $");
                        double ingreso = teclado.nextDouble();
                        if (ingreso > 0) {
                            saldo += ingreso;
                            System.out.println("Has ingresado $" + ingreso);
                            System.out.println("Tu nuevo saldo es: $" + saldo);
                        } else {
                            System.out.println("Cantidad no válida");
                        }
                        break;

                    case 3: // Retirar dinero
                        System.out.print("¿Cuánto dinero quieres retirar? $");
                        double retiro = teclado.nextDouble();
                        if (retiro > 0 && retiro <= saldo) {
                            saldo -= retiro;
                            System.out.println("Has retirado $" + retiro);
                            System.out.println("Tu nuevo saldo es: $" + saldo);
                        } else {
                            System.out.println("No puedes retirar esa cantidad");
                        }
                        break;

                    case 4: // Opcion de Salir
                        System.out.println("Gracias por usar el cajero. ¡Hasta pronto!");
                        continuar = false;
                        break;

                    default: // Opción no válida
                        System.out.println("Opción no válida, intenta de nuevo");
                }
            } catch (Exception e) {
                System.out.println("Error: Ingresa un número válido");
                teclado.next(); // Limpiar el buffer de entrada para evitar un bucle infinito
            }
        }

        teclado.close();
    }
}
