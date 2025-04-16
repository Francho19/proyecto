import java.util.Arrays;

public class arrysInvertir {
     public static void main(String[] args) {
    int[] numeros = {10, 20, 30, 40, 50 };
    for (int i= 0; i<numeros.length/2; i++){
        int temp = numeros[i];
        numeros [  i]= numeros[numeros.length -1 -i];
        numeros[numeros.length -1 -i]=temp;
    }
    System.out.println("array  inverido  : " + Arrays.toString(numeros) );
 }
}
