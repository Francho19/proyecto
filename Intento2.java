import java.util.Scanner;

public class Intento2 {
    // Constantes para evitar valores mágicos
    public static final byte MIN_HORA = 0;
    public static final byte MAX_HORA = 23;
    public static final byte MIN_MINUTO = 0;
    public static final byte MAX_MINUTO = 59;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean entradaValida = false; // Para controlar el bucle
        short horas = 0, minutos = 0;  // Uso de short

        // Bucle do-while para asegurar que se ingrese un formato válido
        do {
            System.out.print("Ingrese la hora en formato HH MM (24 horas): ");
            String entrada = input.nextLine();
            String[] partes = entrada.split(" ");

            // Validar formato
            if (partes.length == 2) {
                try {
                    horas = Short.parseShort(partes[0]);
                    minutos = Short.parseShort(partes[1]);

                    // Verificar si está en rango
                    if (horas >= MIN_HORA && horas <= MAX_HORA && minutos >= MIN_MINUTO && minutos <= MAX_MINUTO) {
                        entradaValida = true;
                    } else {
                        System.out.println("Error: Hora o minutos fuera de rango.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Entrada no válida.");
                }
            } else {
                System.out.println("Error: Formato incorrecto. Use HH MM.");
            }
        } while (!entradaValida);

        input.close();

        // Imprimir en formato 24 horas
        System.out.printf("Hora en formato 24 horas: %02d:%02d%n", horas, minutos);

        // Convertir a 12 horas
        byte hora12 = (byte) ((horas % 12 == 0) ? 12 : horas % 12);
        char periodo = (horas < 12) ? 'A' : 'P'; // Uso de char

        // Imprimir en formato 12 horas
        System.out.printf("Hora en formato 12 horas: %02d:%02d %cM%n", hora12, minutos, periodo);

        // Uso de switch para describir la parte del día
        switch (hora12) {
            case 12:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Es madrugada.");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                System.out.println("Es mañana.");
                break;
            default:
                System.out.println("Es tarde o noche.");
        }
    }
}
