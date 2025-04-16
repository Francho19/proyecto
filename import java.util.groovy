import java.util.Scanner;

public class TiendaRopa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir precios y descuentos
        double precioCamisa = 25.0;
        double precioPantalon = 30.0;
        double descuentoCamisa = 0.15;
        double descuentoSegundaCamisa = 0.05;

        // Pedir al usuario la cantidad de productos comprados
        System.out.print("Ingrese la cantidad de camisetas compradas: ");
        int cantidadCamisas = scanner.nextInt();

        System.out.print("Ingrese la cantidad de pantalones comprados: ");
        int cantidadPantalones = scanner.nextInt();

        // Cálculo de precios con descuentos
        double precioCamisaDescuento = precioCamisa * (1 - descuentoCamisa);
        double precioPantalonDescuento = precioPantalon * (1 - descuentoCamisa);

        // Cálculo del precio total de camisas
        double totalCamisas = 0;
        if (cantidadCamisas == 1) {
            totalCamisas = precioCamisaDescuento;
        } else if (cantidadCamisas >= 2) {
            totalCamisas = precioCamisaDescuento + (precioCamisaDescuento * (1 - descuentoSegundaCamisa)) + (cantidadCamisas - 2) * precioCamisaDescuento;
        }

        // Calcular total a pagar
        double totalPantalones = cantidadPantalones * precioPantalonDescuento;
        double totalPagar = totalCamisas + totalPantalones;

        // Imprimir resultados
        System.out.println("Cantidad de camisetas compradas: " + cantidadCamisas);
        System.out.println("Cantidad de pantalones comprados: " + cantidadPantalones);
        System.out.println("Precio del pantalón con su descuento incluido: $" + String.format("%.2f", precioPantalonDescuento));
        if (cantidadCamisas >= 2) {
            System.out.println("Precio de la segunda camiseta con descuento adicional: $" + String.format("%.2f", precioCamisaDescuento * (1 - descuentoSegundaCamisa)));
        }
        System.out.println("Total a pagar es de: $" + String.format("%.2f", totalPagar));

        // Cerrar scanner
        scanner.close();
    }
}
