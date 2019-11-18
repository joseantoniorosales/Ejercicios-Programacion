package ejercicio6t7;

import java.util.Scanner;

public class Ejercicio6T7 {

  public static void main(String[] args) {

    //Definicion del programa
    System.out.println("Este programa pedira 15 numeros al usuario y los rotara");

    System.out.println();

    //Declaracion de variables
    Scanner s = new Scanner(System.in);

    int numero[] = new int[15];

    //Procesos
    for (int i = 0; i < numero.length; i++) {

      numero[i] = Integer.parseInt(s.nextLine());

    }
    System.out.println();

    //Rotacion
    int aux = numero[14];

    for (int i = 14; i > 0; i--) {

      numero[1] = numero[i - 1];

    }
    //Array rotado
    
    System.out.println("Array rotado");
    for (int i = 0; i < 15; i++) {

      System.out.println(numero[i]);
    }
  }
}
