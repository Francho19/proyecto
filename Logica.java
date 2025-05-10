package MamaderaDeRusted;

public class Logica {

    public void Suma(double Num1, double Num2) {

        System.out.print("El resultado de la suma es: ");
        System.out.print(Num1 + Num2);

    }

    public void Resta(double Num1, double Num2) {

        System.out.print("El resultado de la resta es: ");
        System.out.print(Num1 - Num2);

    }

    public void Multiplicacion(double Num1, double Num2) {

        System.out.print("El resultado de la multiplicacion es: ");
        System.out.print(Num1 * Num2);

    }

    public void Division(double Num1, double Num2) {

        try {

            System.out.print("El resultado de la division es: ");
            System.out.print(Num1 / Num2);

        } catch (MatchException e) {
            System.out.println(e);
        }

    }

}
