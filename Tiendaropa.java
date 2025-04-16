import java.util.Scanner;

public class Tiendaropa {
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        double precioCamiseta = 25;
        double precioPantalon = 30;
        System.out.print("ingrese la cantidad de camisetas");

        double cantidadCamisetas = scanner.nextDouble();
        System.out.print("Ingrese la cantidad de pantolones");

        double cantidadPantalones = scanner.nextDouble();
        double descuento = 0.15;
        double descuentoAdicional = 0.05;
        double descuentoCamiseta = precioCamiseta * (1 - descuento);
        double descuentoPantalon = precioPantalon * (1 - descuento);
        double totalCamisetas = descuentoCamiseta * cantidadCamisetas- (descuentoCamiseta * descuentoAdicional * (cantidadCamisetas - 1));
        double totalPantalones = descuentoPantalon * cantidadPantalones;
        double totalPagar = totalCamisetas + totalPantalones;
        System.out.printf("El total a pagar es : $%.2f ", totalPagar);
        scanner.close();
    }

}