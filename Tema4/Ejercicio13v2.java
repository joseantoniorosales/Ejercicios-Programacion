
public class Ejercicio13v2 {

  public static void main(String[] args) {
    
    int aux;
        
    System.out.println("Este programa ordena tres números introducidos por teclado.");
    System.out.println("Introduce los 3 numeros (recuerda pulsar ENTER tras cada uno):");
    int numero1 = Integer.parseInt(System.console().readLine());
    int numero2 = Integer.parseInt(System.console().readLine());
    int numero3 = Integer.parseInt(System.console().readLine());

    
    if (numero1 > numero2) {
      aux = numero1;
      numero1 = numero2;
      numero2 = aux;
    }
    
   
    if (numero2 > numero3) {
      aux = numero2;
      numero2 = numero3;
      numero3 = aux;
    }
    
    if (numero1 > numero2) {
      aux = numero1;
      numero1 = numero2;
      numero2 = aux;
    }
        
    System.out.println("Los números introducidos ordenados de menor a mayor son " + numero1 + ", " + numero2 + ", " + numero3); 
  }
}
