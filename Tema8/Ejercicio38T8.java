package Ejercicio38T8;

import funciones.math.FuncionesMatematicas;
import funciones.array.FuncionesArray;

public class Ejercicio38T8 {

    public static void main (String[] args) {
        
        int[] array = FuncionesArray.generaArrayInt(20, 1, 1000);
        
        System.out.print("Array original: ");
        FuncionesArray.muestraArrayInt(array);
        
        System.out.print("Capicuas en el array: ");
        FuncionesArray.muestraArrayInt(FiltraCapicua(array)); 
        
        
    }//main
    
    public static int[] FiltraCapicua (int n[]) {
        
        int[] capicuas = new int[n.length];
        
        int cuentaCapicua = 0;
        
        for (int num : n) {
            if(FuncionesMatematicas.esCapicua(num)) {
                capicuas [cuentaCapicua++] = num;
            }
        }
        
        int[] resultado = new int[cuentaCapicua];
        
        for (int i = 0; i < cuentaCapicua; i++) {
            resultado [i] = capicuas [i];
        }
        
        return resultado;
    }
    
}
