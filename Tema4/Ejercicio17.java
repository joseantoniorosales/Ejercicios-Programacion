public class Ejercicio17 {

  public static void main(String[] args) {
    
    System.out.println("Este programa te dirá cual es la ultima cifra del numero completo introducido");
    System.out.print("Introduzca un número entero: ");
    int numero = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número introducido es el " + (numero % 10));
  }
}
