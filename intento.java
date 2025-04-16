import java.util.Scanner;

public class intento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la hora en formato HH MM (24 horas):");

        // Leer entrada
        String entrada = input.nextLine();
        input.close();

        // Dividir la entrada en dos partes (horas y minutos)
        String[] partes = entrada.split(" ");

        // Verificar que la entrada tenga exactamente dos partes
        if (partes.length != 2) {
            System.out.println("Formato no válido");
            return;
        }

        try {
            // Convertir las partes a números
            int horas = Integer.parseInt(partes[0]);
            int minutos = Integer.parseInt(partes[1]);

            // Verificar que las horas y minutos estén dentro del rango válido
            if (horas < 0 || horas > 23 || minutos < 0 || minutos > 59) {
                System.out.println("Formato no válido");
                return;
            }

            // Mostrar la hora en formato de 24 horas
            System.out.printf("Hora en formato 24 horas: %02d:%02d%n", horas, minutos);

            // Convertir a formato de 12 horas
            int hora12 = (horas % 12 == 0) ? 12 : horas % 12;
            String periodo = (horas < 12) ? "AM" : "PM";

            // Mostrar la hora en formato de 12 horas
            System.out.printf("Hora en formato 12 horas: %02d:%02d %s%n", hora12, minutos, periodo);

        } catch (NumberFormatException e) {
            System.out.println("Formato no válido");
        }
    }
}
