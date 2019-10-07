public class Ejercicio19 {

  public static void main(String[] args) {
    
    int numero, digitos = 0;
    
    System.out.println("Este programa mostrará cuantas cifras tiene un número (tanto positivo como negativo con un máximo de 5 dígitos)");
    System.out.print("Introduzca un número entero: ");
    numero = Integer.parseInt(System.console().readLine());
    
    if ( numero < 10 ) {
      digitos = 1;
    }
    
    if (( numero >= 10 ) && ( numero < 100 )) {
      digitos = 2;
    }
    
    if (( numero >= 100 ) && ( numero < 1000 )) {
      digitos = 3;
    }
    
    if (( numero >= 1000 ) && ( numero < 10000 )) {
      digitos = 4;
    }
    
    if ( numero >= 10000 ) {
      digitos = 5;
    }
    
    System.out.println("Las cifra del número introducido son: " + digitos);
  }
}
