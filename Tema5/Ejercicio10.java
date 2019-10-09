public class Ejercicio10 { 
  public static void main(String[] args) {
    
    System.out.println("Este programa te dirá la media de una cantidad indefinida de numeros");
    
    System.out.printf("Introduce varios números (cuando quieras parar introduce un número negativo): ");
    double numeroInt = 0;
    double numeros = 0;
    double suma = 0;
    
    while(numeroInt >= 0){
      numeroInt = Double.parseDouble(System.console().readLine());
      numeros++;
      suma += numeroInt;
      }
      System.out.printf("La media de los números introducidos es: " + (suma - numeroInt)/ (numeros - 1));
    }
  }
