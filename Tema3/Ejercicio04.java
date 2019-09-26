public class Ejercicio04 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce un número: ");
    linea = System.console().readLine();
    int Numero1;
    Numero1 = Integer.parseInt( linea );

    System.out.print("introduce otro, por favor: ");
    linea = System.console().readLine();
    int Numero2;
    Numero2 = Integer.parseInt( linea );

    int multiplicacion = Numero1 * Numero2;
    int suma = Numero1 + Numero2;
    int resta = Numero1 - Numero2;
    double division = Numero1 / Numero2;

    System.out.println("El primer número introducido es: " + Numero1);
    System.out.println("El segundo es: " + Numero2);
    System.out.print("La multiplicacion de ambos es: ");
    System.out.println(multiplicacion);
    System.out.println("La suma de ambos es: " + suma);
    System.out.println("La resta de ambos es: " + resta);
    System.out.println("La division de ambos es: " + division);

  } 
}
