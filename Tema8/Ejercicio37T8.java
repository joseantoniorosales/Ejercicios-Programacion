package Ejercicio37T8;

import funciones.math.FuncionesMatematicas;
import java.util.Scanner;

public class Ejercicio37T8 {
    
    public static void main (String[] args) {
        
        Scanner s = new Scanner (System.in);
        
        int[] nums = new int[3];
        
        System.out.println("Dame 3 números y te los convertiré a código morse: ");
        
        System.out.print("Dame el primer número: ");
        nums[0] = Integer.parseInt(s.nextLine());
        
        System.out.println("");
        
        System.out.print("Dame el segundo número: ");
        nums[1] = Integer.parseInt(s.nextLine());
        
        System.out.println();
        
        System.out.print("Dame el último número: ");
        nums[2] = Integer.parseInt(s.nextLine());
        
        System.out.println();
        
        for(int num : nums) {
            System.out.println("El " + num + " en código morse es: { " + ConvierteMorse(num) + " }");
        }
        
        
    }//main
    
    
    
    public static String ConvierteMorse (int n) {
        
        String[] morse = { "_ _ _ _ _", ". _ _ _ _", ". . _ _ _", ". . . _ _", ". . . . _", ". . . . .", "_ . . . .", "_ _ . . .", "_ _ _ . .",
        "_ _ _ _ ." };
        
        String resultado = "";
        
        for (int i = 0; i < FuncionesMatematicas.digitos(n); i++) {
            resultado += morse[FuncionesMatematicas.digitoN(n, i)];
        }
        return resultado;
    }
}
