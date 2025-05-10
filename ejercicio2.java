import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingresé su primer número ");
        int a = input.nextInt();
        System.out.println("ingresé su segundo número ");
        int b = input.nextInt();
        System.out.println("ingres su tercer número ");
        int c = input.nextInt();
        int mayor = a; 

        if (b > mayor) {
            mayor = b;
        }

        if (c > mayor) {
            mayor = c;
        }
        System.out.println("Entre los números " + a +  ", "+ b + " y "+ c + " el número mayor es " + mayor );
        input.close();
    }

}
