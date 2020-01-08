package Ejercicio51T8;

import funciones.array.FuncionesArray;
import funciones.math.FuncionesMatematicas;

public class Ejercicio51T8 {
    
    public static void main (String[] args) {
        
        //Genera array
        
        int[] array = FuncionesArray.generaArrayInt(10, 2, 100);
        
        //Muestra el array generado
        
        System.out.println("Array generado: ");
        FuncionesArray.muestraArrayInt(array);
        
        System.out.println();
        
        //Comprueba si es primo
        
        for (int num : array) {
            if (FuncionesMatematicas.esPrimo(num)) {
                System.out.print("El número " + num + " es primo,");
            } else {
                System.out.print("El número " + num + " no es primo,");
            }
            
            //Comprueba si es capicua
            
            if (FuncionesMatematicas.esCapicua(num)) {
                System.out.println(" y es capicua");
                System.out.println();
            } else {
                System.out.println(" y no es capicua");
                System.out.println();
            }
        }
        
        
        
    }//main
    
    
    

}
