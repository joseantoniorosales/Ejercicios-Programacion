public class Ejercicio11 { 
  public static void main(String[] args) {
    
    System.out.println("Este programa te dirá el cuadrado y el cubo de los 5 primeros números del introducido");
    
    System.out.printf("Introduce un números: ");
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
