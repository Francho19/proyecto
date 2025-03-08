package trabajosclase;
import java.util.Scanner;

public class ejemplojava {

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        System.out.println("Mi nombre es el pechyplayer");
        String nombre = scanner.nextLine();
        System.out.println("INgrese su edad :");
        int edad= scanner.nextInt();
        System.out.println("Hola " + nombre + ". Tienes " + edad + " años ");
scanner.close();
    }
}