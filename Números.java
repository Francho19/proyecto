import java.util.Scanner;

public class Números {
     static Scanner input  = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("ingrese el primer número ");
        int Inicio = input.nextInt();
        System.out.println("Ingrese el segundo número ");
        int fin = input.nextInt();
        System.out.println("el primer número es " + Inicio + " el segundo número es " + fin);
        if (Inicio<0 || fin<Inicio){
            System.out.println("Rango no valido ");
            input.close();
            return;

        }
        ;
        int contPrimos = 0;
        for (int i = Inicio; i<= fin; i++){
            if (i<=1) {
                continue;
            }
            if (i==2) {
                contPrimos += 1;
                System.out.println(i);
                
            }
            if (i%2==1) {
                contPrimos+=1;
                System.out.println(i);
                
            }
        }
        System.out.println("Hay " + (int) (Math.floor(contPrimos/2)) + "pares de primos en total ");


    }
}