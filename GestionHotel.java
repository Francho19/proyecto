import java.util.Scanner;

public class GestionHotel {

    // Datos de habitaciones: 3 pisos, 5 habitaciones por piso (matriz 3x5)
    static String[][] habitaciones = new String[3][5]; // null si está libre, nombre si está ocupada
    static int[][] noches = new int[3][5];
    static double[][] precios = new double[3][5];

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {
            System.out.println("\n===== MENÚ DE GESTIÓN DEL HOTEL =====");
            System.out.println("1. Registrar una reserva");
            System.out.println("2. Cancelar una reserva");
            System.out.println("3. Ver reporte de habitaciones");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarReserva();
                    break;
                case 2:
                    cancelarReserva();
                    break;
                case 3:
                    generarReporte();
                    break;
                case 4:
                    System.out.println("¡Gracias por usar el sistema de reservas!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }

    // Miembro 1: Registro de datos y almacenamiento
    public static void registrarReserva() {
        System.out.print("Ingrese piso (0-2): ");
        int piso = scanner.nextInt();
        System.out.print("Ingrese número de habitación (0-4): ");
        int hab = scanner.nextInt();

        if (habitaciones[piso][hab] != null) {
            System.out.println("La habitación ya está ocupada.");
            return;
        }

        scanner.nextLine(); // Limpiar buffer
        System.out.print("Nombre del cliente: ");
        String nombre = scanner.nextLine();

        System.out.print("Número de noches: ");
        int numNoches = scanner.nextInt();

        System.out.print("Precio por noche: ");
        double precioNoche = scanner.nextDouble();

        // Guardamos la reserva
        habitaciones[piso][hab] = nombre;
        noches[piso][hab] = numNoches;
        precios[piso][hab] = precioNoche;

        // Miembro 2: Cálculo del total
        double total = numNoches * precioNoche;
        System.out.println("Reserva registrada. Total a pagar: $" + total);
    }

    // Miembro 2: Cancelación de reservas
    public static void cancelarReserva() {
        System.out.print("Ingrese piso (0-2): ");
        int piso = scanner.nextInt();
        System.out.print("Ingrese número de habitación (0-4): ");
        int hab = scanner.nextInt();

        if (habitaciones[piso][hab] == null) {
            System.out.println("La habitación ya está libre.");
            return;
        }

        System.out.println("Reserva de " + habitaciones[piso][hab] + " cancelada.");
        habitaciones[piso][hab] = null;
        noches[piso][hab] = 0;
        precios[piso][hab] = 0;
    }

    // Miembro 3: Reporte de habitaciones
    public static void generarReporte() {
        int ocupadas = 0, libres = 0;

        System.out.println("\n===== REPORTE DEL HOTEL =====");
        for (int i = 0; i < habitaciones.length; i++) {
            for (int j = 0; j < habitaciones[i].length; j++) {
                if (habitaciones[i][j] != null) {
                    ocupadas++;
                    double total = noches[i][j] * precios[i][j];
                    System.out.println("Piso " + i + ", Habitación " + j + " - Ocupada por: " + habitaciones[i][j] + " - Total: $" + total);
                } else {
                    libres++;
                    System.out.println("Piso " + i + ", Habitación " + j + " - Disponible");
                }
            }
        }

        System.out.println("\nTotal de habitaciones ocupadas: " + ocupadas);
        System.out.println("Total de habitaciones disponibles: " + libres);
    }
}
