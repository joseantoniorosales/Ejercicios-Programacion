package Ejercicio39T8;

import funciones.math.FuncionesMatematicas;
import java.util.Scanner;

public class Ejercicio39T8 {

    public static void main (String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int[] nums = new int[3];
        
        System.out.println("Dame 3 números y serán convertidos en sus correspondientes nombres");
        System.out.println();
        
        System.out.print("Escribe el primer número: ");
        nums[0] = Integer.parseInt(s.nextLine());
        
        
        System.out.print("Escribe el segundo número: ");
        nums[1] = Integer.parseInt(s.nextLine());
        
        
        System.out.print("Escribe el último número: ");
        nums[2] = Integer.parseInt(s.nextLine());
        
        
        for (int num : nums) {
            
            System.out.println(num);
            System.out.println(ConviertePalabras(num));
        }
        
        
        
        
    }//main
    
    
    public static String ConviertePalabras (int n) {
        
        String[] numChar = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};
        
        String resultado = "";
        
        for (int i = 0; i < FuncionesMatematicas.digitos(n) - 1; i++) {
            
            resultado += numChar[FuncionesMatematicas.digitoN(n, i)];
        }
        
        
        
        return resultado;
    }
    
}
