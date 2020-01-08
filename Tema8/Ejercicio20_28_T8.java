package Ejercicio20_28_T8;

import java.util.Scanner;
import funciones.array.FuncionesArray;

public class Ejercicio20_28_T8 {

  public static void main(String[] args) {

      //Scanner
      Scanner s = new Scanner (System.in);
      
      //Genera el array
      int[] array = FuncionesArray.generaArrayInt(20, 0, 100);
      
      //Muestra el array y calcula el máximo, el mínimo y la media del array
      FuncionesArray.muestraArrayInt(array);
      System.out.println("El máximo del array es: " + FuncionesArray.maximoArrayInt(array));
      System.out.println("El mínimo del array es: " + FuncionesArray.minimoArrayInt(array));
      System.out.println("La media del array es: " + FuncionesArray.mediaArrayInt(array));
      
      System.out.println();
      
      // Averigua si el número introducido por el usuario está en el array
      /*
      System.out.print("Dime un número y averiguare si está en el array: ");
      int num = Integer.parseInt(s.nextLine());
      
      if (FuncionesArray.estaEnArrayInt(array, num)) {
          System.out.println("El número está en el array");
      } else {
          System.out.println("El número no está en el array");
      }
      
      System.out.println();
      */
      //Indica la posición de un número en el array
      /*
      System.out.print("Dame un número y averiguare la posición que ocupa en el array: ");
      int num2 = Integer.parseInt(s.nextLine());
      
      System.out.println("El número está en: " + FuncionesArray.posicionEnArrayInt(array, num2));
      
      System.out.println();
      
      //Voltea el array
      
      System.out.println("Array original: ");
      FuncionesArray.muestraArrayInt(array);
      System.out.println();
      
      System.out.println("Array volteado: ");
      int[] arrayVolteado = FuncionesArray.volteaArrayInt(array);
      FuncionesArray.muestraArrayInt(arrayVolteado);
      
      System.out.println();
      */
      //Rotar array a la derecha
      
      System.out.println("Array original:");
      FuncionesArray.muestraArrayInt(array);
      
      System.out.println();
      
      System.out.print("Dime el número de rotaciones que quieres realizar: ");
      int numRotar = Integer.parseInt(s.nextLine());
      
      System.out.println();
      
      System.out.println("Array rotado:");
      int[] arrayRotado = FuncionesArray.rotaDerechaArrayInt(array, numRotar);
      
      FuncionesArray.muestraArrayInt(arrayRotado);
      
      System.out.println();
      
      //Rotar array a la izquierda
      
      System.out.println("Array original:");
      FuncionesArray.muestraArrayInt(array);
      
      System.out.println();
      
      System.out.print("Introduce el número de rotaciones: ");
      int numRotarIz = Integer.parseInt(s.nextLine());
      
      System.out.println();
      
      System.out.println("Array rotado a la izquierda:");
      int[] arrayRotadoIz = FuncionesArray.rotaIzquierdaArrayInt(array, numRotarIz);
      
      FuncionesArray.muestraArrayInt(arrayRotadoIz);
      
      
  }//main
}

