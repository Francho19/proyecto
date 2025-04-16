package trabajosclase;
import java.util.Scanner;

public class Datospersonales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su nombre ");
        String nombre = scanner.nextLine();
        System.out.println("ingrese su edad");
        int edad = scanner.nextInt();
        System.out.println("ingrese su altura en metros");
        double altura = scanner.nextDouble();
        System.out.println("hola " + nombre + ". Tienes " + edad + " años y mides " + altura + "metros.");

        scanner.close();
    }
}
