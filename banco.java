public class banco{ 
public static void main(String[] args) {
    int saldo = 1000;
    int retiroSemanal= 200;
    int retiroPrimerasemana= (saldo-retiroSemanal);
    System.out.println("El total retirado la primera semana fue de 200, el saldo total es " + retiroPrimerasemana);
    int retiroSegundasemana = (retiroPrimerasemana-retiroSemanal);
    System.out.println("El saldo de la cuenta en la segunda semana es de " + retiroSegundasemana);
    int retiroTerceraSemana = (retiroSegundasemana - retiroSemanal);
    System.out.println("El saldo de la cuenta en la tercera semana es de "+ retiroTerceraSemana);
    int retiroCuartaSemana = (retiroTerceraSemana- retiroSemanal);
    System.out.println("El saldo de la cuenta en la cuarta semana es de "+ retiroCuartaSemana);
    int cantidadCuentaMes = (saldo - (retiroSemanal * 4));
    System.out.println("El total de saldo en la cuenta al final del mes es de: "+ cantidadCuentaMes);
}
}
  
        

    