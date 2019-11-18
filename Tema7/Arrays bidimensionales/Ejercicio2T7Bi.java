package ejercicio2t7bi;

import java.util.Scanner;

public class Ejercicio2T7Bi {

  public static void main(String[] args) {

    //Definición del ejercicio
    System.out.println("Este programa pedirá 20 numeros al usuario y realizará las sumas parciales de las filas y las columnas");

    //Definción de variables
    Scanner s = new Scanner(System.in);
    int num[][] = new int[4][5];

    int fila;
    int columna;

    //Recorremos el array
    for (fila = 0; fila < 4; fila++) {

      for (columna = 0; columna < 6; columna++) {

        System.out.println("Filas: " + fila + " " + "Columna: " + columna);

        num[fila][columna] = Integer.parseInt(s.nextLine());

      }

    }

    //Operaciones
    //Suma Parcial Filas
    int sumaParcFila;
    
    for (fila = 0; fila < 4; fila++) {

      sumaParcFila = 0;

      for (columna = 0; columna < 6; columna++) {
        System.out.println(num[fila][columna]);
        sumaParcFila += num[fila][columna];
      }
      System.out.println(sumaParcFila);
    }

  }

}
