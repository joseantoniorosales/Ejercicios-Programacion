package ejemplosarrays;

import java.util.Scanner;

public class Ejercicio1T7 {

    public static void main(String[] args) {

        //Definicion del programa
        
        System.out.println("Este programa generara un array de 12 numeros estando algunos valores vacios");
        
        System.out.println();
        
        //Declaracion de variables
        
        int[] numero = new int[12];
        
        Scanner s = new Scanner(System.in);
        
        numero[0] = 39;
        numero[1] = -2;
        numero[4] = 0;
        numero[6] = 14;
        numero[8] = 5;
        numero[9] = 120;
        
        for(int i = 0; i < 12; i++){
            
            System.out.printf("num[%2d]: %d \n", i, numero[i]);
        
        }
        
        
        
    }
    
}
