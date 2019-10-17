package ejercicio19v3;

import java.util.Scanner;

public class Ejercicio19v3 {

  public static void main(String[] args) {
    
    //Definición del programa
    
      System.out.println("Este programa creará una pirámide a partir de la altura y el carácter introducido");
      
    //Clase Scanner
    
    Scanner s = new Scanner(System.in);
      
    System.out.print("Introduce la altura de la pirámide: ");
    int altura = Integer.parseInt(s.nextLine());

    System.out.print("Introduce el carácter de relleno: ");
    String relleno = s.nextLine();
    
    //Declaración de variables
    
    int planta = 1;
    int longitud = 1;
    int espacios = altura-1;
    
    while (planta <= altura) {
      
      // Espacios
      
      for (int i = 1; i <= espacios; i++) {
        System.out.print(" ");
      }

      // pinta la línea
      for (int i = 1; i <= longitud; i++) {
        System.out.print(relleno);
      }

      System.out.println();

      planta++;
      espacios--;
      longitud += 2;
    }
  }
}