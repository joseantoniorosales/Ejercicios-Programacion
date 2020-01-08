package Ejercicio35T8;

import funciones.math.FuncionesMatematicas;
import java.util.Scanner;

public class Ejercicio35T8 {
    
    public static void main (String[] args) {
        
        /*int[] nums = {470213, 0, 11, 24, 867024}; */
        
        Scanner s = new Scanner (System.in);
        
        int[] nums = new int[4];
        
        System.out.print("Dame el primer número: ");
        nums[0] = Integer.parseInt(s.nextLine());
        
        System.out.println();
        
        System.out.print("Dame el segundo número: ");
        nums[1] = Integer.parseInt(s.nextLine());
        
        System.out.println();
        
        System.out.print("Dame el tercer número: ");
        nums[2] = Integer.parseInt(s.nextLine());
        
        System.out.println();
        
        System.out.print("Dame el último número: ");
        nums[3] = Integer.parseInt(s.nextLine());
        
        System.out.println();
        
        for (int num : nums) {
            System.out.println("El " + num + " es el { " + conviertePalotes(num) + " } en el sistema de palotes");
            
        }
        
    } //main
    
    
    public static String conviertePalotes (int n) {
        
        String resultado = "";
        
        for(int i = 0; i < FuncionesMatematicas.digitos(n); i++) {
            for (int j = 0; j < FuncionesMatematicas.digitoN(n, i); j++) {
                resultado += "|";
            }
            if (i < FuncionesMatematicas.digitos(n)) {
                resultado += "-";
            }
        }
        return resultado;
    }
}
