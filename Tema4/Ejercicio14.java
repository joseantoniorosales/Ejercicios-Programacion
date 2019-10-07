public class Ejercicio14 {

  public static void main(String[] args) {
        
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());

    if ((numero % 2) == 0) {
      System.out.print("El número es par");
    } else {
      System.out.print("El número es impar");
    }

    if ((numero % 5) == 0) {
      System.out.println(" y es posible dividirlo entre 5");
    } else {
      System.out.println(" y no se puede dividir entre 5");
    }
  }
}
