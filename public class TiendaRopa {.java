import java.util.Scanner;

public class TiendaRopa {
    public static void main(String[] args) {
        double preciocamisa = 25;
        double precioPantalon = 30;
        double descuentoCamisa = 0.15;
        double descuentodoscamisa = 0.05;
        double precioCamisetaDescuento = precioCamisa * (1 - descuentocamisa);
        double precioPantalonDescuento = precioPantalon * (1 - descuentocamisa);
        double precioSegundaCamiseta = precioCamisetaDescuento * (1 - descuentodoscamisa);
        double total = precioCamisetaDescuento + precioPantalonDescuento + precioSegundaCamiseta;
        System.out.println("cantidad de camisetas compradas:  $ " + cantidadcamiseta);
        System.out.println(
                "precio del pantalón con su descuento incluído:  $ " + String.format("%.2f", precioPantalonDescuento));
        System.out.println("Precio de la segunda camiseta con descuento adicional: $"
                + String.format("%.2f", precioSegundaCamiseta));
        System.out.println("Total a pagar es de: $" + String.format("%.2f", total));
        scanner.close();
    }
}