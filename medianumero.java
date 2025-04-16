package trabajosclase;
import java.util.Scanner;

public class medianumero {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("ingresea tres números");
        Float num1 = input.nextFloat();
        Float num2 = input.nextFloat();
        Float num3 = input.nextFloat();
        Float media = (num1+num2+ num3)/3f;
        System.out.println("el promedio es "+ media);

input.close();
    }
    
}
