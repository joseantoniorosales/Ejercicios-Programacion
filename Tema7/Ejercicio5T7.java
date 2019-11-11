package ejercicio5t7;

import java.util.Scanner;

public class Ejercicio5T7 {

    public static void main(String[] args) {

        //Definicion del programa
        
        System.out.println("Este programa mostrara 10 numeros introducidos por el usuario y dira cual es el maximo y el minimo");
        
        //Declaracion de variables
        
        Scanner s = new Scanner(System.in);
        
        int numero[] = new int[10];
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        
        int contador;
        
        //procesos
        
        for(int i = 0; i < 10; i++){
        
            numero[i] = Integer.parseInt(s.nextLine());
            
            if(numero[i] > max){
            
                max = numero[i];
            }
            
            if(numero[i] < min){
            
                min = numero[i];
                
            }
            
        }
        System.out.println();
        
        for(int i = 0; i < 10; i++){
            
            System.out.println(numero[i]);
            if(numero[i] == max){
            
                System.out.println("Maximo");
            }
            if(numero[i] == min){
            
                System.out.println("Minimo");
            }
            
            }
        
    }
    
}