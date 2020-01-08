package Ejercicio29_34_T8;

import funciones.array.FuncionesArrayBi;
import funciones.array.FuncionesArray;
import java.util.Scanner;

public class Ejercicio29_34_T8 {
    
    public static void main (String[] args) {
        
        
        //Scanner
        Scanner s = new Scanner (System.in);
        
        
        System.out.println("Este programa realizara diversas operaciones en un array bidimensional");
        System.out.println();
        
        
        //generar array
        
        int[][] array = FuncionesArrayBi.generaArrayBiInt(5, 8, 0, 100);
        
        //Muestra el arrray
        
        FuncionesArrayBi.muestraArrayBiInt(array);
        System.out.println();
        
        //Muestra una fila completa del array
        
        System.out.print("Dame el número de la fila que quieras saber: ");
        int numFila = Integer.parseInt(s.nextLine());
        
        FuncionesArray.muestraArrayInt(FuncionesArrayBi.filaDeArrayBiInt(array, numFila));
        System.out.println();
        
        //Muestra una columna del array
        
        System.out.print("Dame el número de la columna que quieras saber: ");
        int numColum = Integer.parseInt(s.nextLine());
        
        FuncionesArray.muestraArrayInt(FuncionesArrayBi.columnaDeArrayBiInt(array, numColum));
        System.out.println();
        
        //Indica las coordenadas de un punto del array
        
        System.out.print("Introduce un número del array y te diré las coordenadas del mismo: ");
        int numCoord = Integer.parseInt(s.nextLine());
        
        FuncionesArray.muestraArrayInt(FuncionesArrayBi.coordenadasEnArrayBiInt(array, numCoord));
        
        System.out.println();
        
        //Muestra la diagonal del array
        
        System.out.println("A continuación, se te pedirán diferentes datos para determinar la diagonal que prefieras: ");
        
        System.out.print("Introduce la fila: ");
        int fila = Integer.parseInt(s.nextLine());
        
        System.out.print("Introduce la columna: ");
        int columna = Integer.parseInt(s.nextLine());
        
        System.out.print("Dame una dirección (nose/neso): ");
        String direccion = s.nextLine();
        
        FuncionesArray.muestraArrayInt(FuncionesArrayBi.diagonal(array, fila, columna, direccion));
   
    }
    
}
