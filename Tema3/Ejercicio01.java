public class Ejercicio01 {
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

    int total = Numero1 * Numero2;

    System.out.println("El primer número introducido es: " + Numero1);
    System.out.println("El segundo es: " + Numero2);
    System.out.print("La multiplicacion de ambos es: ");
    System.out.print(total);   
  } 
}
