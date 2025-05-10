import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingresé  su primer número ");
        int a = input.nextInt();
        System.out.println("ingresé su segundo número ");
        int b = input.nextInt();
        System.out.println("ingresé su tercer número ");
        int c = input.nextInt();
        if (a>b && a>c) {
            System.out.println("El número mayor es "+ a ); 
        }else{
            if (b>a && b>c) {
                System.out.println("El número mayor es "+ b ); 
            }else{
                if (c>a && c>b) {
                    System.out.println("El número mayor es "+ c ); 
                }
            }
        }
        input.close();
    }

}