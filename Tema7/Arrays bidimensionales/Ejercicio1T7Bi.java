package ejercicio1t7bi;

public class Ejercicio1T7Bi {

  public static void main(String[] args) {

    //Definición del programa
    System.out.println("Este programa realizará una tabla compuestas por arrays");

    //Definición de variables
    int num[][] = new int[3][6];

    num[0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][0] = 75;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;
    
    int fila;
    int columna;
//Recorremos el array
    
    for (columna = 0; columna < 6; columna++) {
      
      System.out.println("Columnas = " + columna);

    }
    for(fila = 0; fila < 3; fila++){
    
      System.out.println("Filas = " + fila);
    
    }
    
    for(columna = 0; columna < 6; columna++){
    
      System.out.println(num[fila][columna]);
      
    }
  }

}
