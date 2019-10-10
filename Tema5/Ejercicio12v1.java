public class Ejercicio12v1 { 
  public static void main(String[] args) {
    
    System.out.println("Este programa te mostrará n términos de la sucesión de Fibonacci");
    
    System.out.printf("Introduce un número: ");
    int numeroInt = Integer.parseInt(System.console().readLine());
    
    int numero1 = 0;
    int numero2 = 1;
    int serieFib;
    int contador = 0;
    int aux;
    do {
      aux = (numero2 + 1);
      serieFib = numero2 + aux;
      contador++;
      serieFib++;
      System.out.println("La serie de Fibonacci hasta " + numeroInt + " es " + numero1 + " " + numero2 + " " + serieFib);
      
      } while(contador <= numeroInt);
      
    }
  }
