import java.util.Scanner;

public class practicaArrays {
    public static void main(String[] args) {
        Scanner aleatorio= new Scanner(System.in);
        String [] nombres= new String [5];
        nombres [1] = "Frank ";
        nombres [0] = "Jose ";
        nombres [2] = "Luis ";
        nombres [3] = "Elder ";
        nombres [4] = "pechy ";
        for (int i=0 ; i<nombres.length; i++){
            System.out.println(nombres[i]);
        }
        int [] azar = new int [2];
        for (int i=0 ; i<azar.length; i++){
            System.out.println("dame un número");
            azar [i]= aleatorio.nextInt();
        }
        aleatorio.close();
    }
}
