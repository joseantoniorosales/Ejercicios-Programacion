
package ejercicio3t7;

import java.util.Scanner;

public class Ejercicio3T7 {
    public static void main(String[] args) {

        //Definicion del ejercicio
        
        System.out.println("Este programa generara 10 numeros y los mostrara de forma invertida");
        
        System.out.println();
        
        //Declaracion de variables
        
        Scanner s = new Scanner(System.in);
        
        int[] numero = new int[10];
        int contador;
        
         
        System.out.println("Introduzca 10 numeros enteros (pulsa ENTER tras cada uno)");
        
        //Procesos
        
        for(int i = 0; i < 10; i++){
        
            numero[i] = Integer.parseInt(s.nextLine());
        
        }
        
        //Numeros invertidos
        
        System.out.println();
        
        System.out.println("Los numeros invertidos son: ");
        
        System.out.println();
        
        for(int i = 9; i >= 0; i--){
        
            System.out.println(numero[i]);
        
        }
        
    }
    
}
