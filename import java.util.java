import java.util.Scanner;

public class Calculadora { public static void main(String[] args) {
 
 Scanner scanner = new Scanner(System.in);

System.out.print("Ingrese el primer número: ");
    double num1 = scanner.nextDouble();
    
    System.out.print("Ingrese el operador (+, -, *, /): ");
    char operador = scanner.next().charAt(0);
    
    System.out.print("Ingrese el segundo número: ");
    double num2 = scanner.nextDouble();
    
    double resultado;
    
    switch (operador) {
        case '+':
            resultado = num1 + num2;
            break;
        case '-':
            resultado = num1 - num2;
            break;
        case '*':
            resultado = num1 * num2;
            break;
        case '/':
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Error: División por cero.");
                return;
            }
            break;
        default:
            System.out.println("Operador no válido.");
            return;
    }
    
    System.out.println("El resultado es: " + resultado);
    scanner.close();
}





        
        
        
        
        
        
        
        
        
    }