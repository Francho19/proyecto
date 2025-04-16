import java.util.Scanner; // Importamos Scanner para la entrada del usuario

public class TiendaRopa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Objeto para leer entrada

        // Precios originales
        double precioCamiseta = 25;
        double precioPantalon = 30;

        // Descuentos
        double descuentoCamisa = 0.15;  // 15%
        double descuentoAdicional = 0.05; // 5% adicional en la segunda camiseta en adelante

        // Pedir cantidad de camisetas al usuario
        System.out.print("Ingrese la cantidad de camisetas que desea comprar: ");
        int cantidadCamisetas = scanner.nextInt();

        // Calcular el precio del pantalón con descuento
        double precioPantalonDescuento = precioPantalon * (1 - descuentoCamisa);

        // Calcular el precio total de las camisetas con descuentos aplicados
        double precioTotalCamisetas = 0;

        if (cantidadCamisetas > 0) {
            // Primera camiseta con 15% de descuento
            precioTotalCamisetas += precioCamiseta * (1 - descuentoCamisa);

            // Aplicar 5% adicional en la segunda camiseta y las siguientes
            for (int i = 1; i < cantidadCamisetas; i++) {
                precioTotalCamisetas += (precioCamiseta * (1 - descuentoCamisa)) * (1 - descuentoAdicional);
            }
        }

        // Calcular el total a pagar
        double total = precioTotalCamisetas + precioPantalonDescuento;

        // Mostrar resultados
        System.out.println("Cantidad de camisetas compradas: " + cantidadCamisetas);
        System.out.println("Precio del pantalón con descuento: $" + String.format("%.2f", precioPantalonDescuento));
        System.out.println("Precio total de camisetas con descuento: $" + String.format("%.2f", precioTotalCamisetas));
        System.out.println("Total a pagar: $" + String.format("%.2f", total));

        scanner.close(); // Cerrar el Scanner
    }
}
