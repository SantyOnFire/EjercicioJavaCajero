import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Productos y precios
        String[] productos = {"Agua", "Galletas", "Chocolate", "Refresco", "Papas"};
        int[] precios = {10, 15, 20, 18, 12};

        System.out.println("Bienvenido a la maquina expendedora!");

        // Mostrar productos
        System.out.println("Productos disponibles:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println((i+1) + ". " + productos[i] + " - $" + precios[i]);
        }

        // Seleccionar producto
        System.out.print("Seleccione un producto (1-5): ");
        int seleccion = teclado.nextInt();

        // Validar selección
        if (seleccion < 1 || seleccion > 5) {
            System.out.println("Opcion no valida");
            teclado.close();
            return;
        }

        int precio = precios[seleccion-1];
        String producto = productos[seleccion-1];

        // Pedir dinero
        System.out.println("Precio de " + producto + ": $" + precio);
        System.out.print("Ingrese dinero: $");
        int dinero = teclado.nextInt();

        // Verificar pago
        if (dinero >= precio) {
            int cambio = dinero - precio;
            System.out.println("Gracias por su compra!");
            System.out.println("Su cambio es: $" + cambio);
        } else {
            System.out.println("Dinero insuficiente");
        }

        teclado.close();
    }
}