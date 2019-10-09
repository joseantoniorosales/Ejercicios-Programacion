public class Ejercicio09 { 
  public static void main(String[] args) {
    
    System.out.println("Este programa te dirá la cantidad de dígitos del numero introducido");
    
    System.out.printf("Introduce un número: ");
    int numeroInt = Integer.parseInt(System.console().readLine());
    
    while(numeroInt > 10){
      numeroInt /= 10;
      numeroInt++;
      }
      System.out.println("El numero introducido tiene " + numeroInt + " cifras");
    }
  }
