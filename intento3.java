import java.util.Scanner;

public class intento3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horas = -1, minutos = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print("Ingrese la hora en formato HH MM (24 horas): ");
            if (input.hasNextInt()) {
                horas = input.nextInt();
                if (input.hasNextInt()) {
                    minutos = input.nextInt();
                    if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59) {
                        entradaValida = true; // Condición para salir del bucle
                    }
                }
            }
            input.nextLine(); // Limpiar entrada inválida
            if (!entradaValida) {
                System.out.println("Error: Ingrese una hora válida (HH MM).");
            }
        }
        input.close();

        // Mostrar en formato 24h
        System.out.printf("Hora en formato 24 horas: %02d:%02d%n", horas, minutos);

        // Convertir y mostrar en formato 12h
        int hora12 = (horas % 12 == 0) ? 12 : horas % 12;
        String periodo = (horas < 12) ? "AM" : "PM";
        System.out.printf("Hora en formato 12 horas: %02d:%02d %s%n", hora12, minutos, periodo);
    }
}
 
    

