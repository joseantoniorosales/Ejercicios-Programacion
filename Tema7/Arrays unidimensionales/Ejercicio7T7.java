package ejercicio7t7;

import java.util.Scanner;

public class Ejercicio7T7 {

  public static void main(String[] args) {
    //Definicion del programa
    System.out.println("Este programa generara 100 numeros aleatorios entre el 0 y el 20 y cambiara el seleccionado por otro a su elección");

    //Declaracion de variables
    Scanner s = new Scanner(System.in);
    int numero[] = new int[100];

    //Procesos
    //Aleatorizacion
    for (int i = 0; i < 100; i++) {

      int aleatorio = (int) (Math.random() * 21);
      
      System.out.print(aleatorio + " ");
      
      numero[i] = aleatorio;
    }
    
    //Pedir datos
    System.out.println("\nIntroduce el numero que quieres intercambiar: ");
    int seleccion = Integer.parseInt(s.nextLine());

    System.out.println("\nIntroduce el numero por el que lo quieres cambiar");
    int intercambio = Integer.parseInt(s.nextLine());

    System.out.println();

    System.out.println("Array intercambiado: ");

    System.out.println();

    //Intercambio
    for (int i = 0; i < 100; i++) {

      if (numero[i] == seleccion) {
        numero[i] = intercambio;

        System.out.print("\"" + numero[i] + "\" ");
      } else {

        System.out.print(numero[i] + " ");
      }

      

    }

  }

}
