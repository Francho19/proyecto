import java.util.Scanner;
public class relojHHMM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      int horas= -1;
      int minutos=-1;
       boolean validarEntrada=false;
        while (!validarEntrada) {
         System.out.println("ingrese la hora en formato 24 horas");
                if (input.hasNextInt()) {
                    horas = input.nextInt();
                    if(input.hasNextInt()){
                        minutos =input.nextInt();
                         if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59){
                            validarEntrada=true;
                         }
                    }
                 }
                 input.nextLine();
                 if (!validarEntrada) {
                    System.out.println("El número que ingreso no esta en formato 24 horas ");
                 }
         }
         input.close();
         System.out.printf("Hora en formato en 24 horas: %02d:%02d%n", horas, minutos);
         int formato12= (horas%12==0) ? 12 : horas % 12;
         String periodo = (horas < 12) ? "am" : "pm";
         System.out.printf("Hora en formato 12 horas: %02d:%02d %s%n", formato12, minutos, periodo);
    }
    
}
