public class Ejercicio11 { 
  public static void main(String[] args) {
    
    System.out.println("Este programa te dirá el cuadrado y el cubo de los 5 primeros números del introducido");
    
    System.out.printf("Introduce un número: ");
    int numeroInt = Integer.parseInt(System.console().readLine());
    
    for(int i = numeroInt; i < numeroInt + 5; i++){
      System.out.printf("Cuadadro de " + i + " = " + i * i + ", y su cubo es " + i * i * i + " ");
      }
    }
  }
