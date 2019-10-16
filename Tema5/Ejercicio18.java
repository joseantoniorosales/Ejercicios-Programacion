package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

 
    public static void main(String[] args) {
        //Definición del programa
        
        System.out.println("Este programa obtendrá todos los números enteros comprendidos entre 2 numeros introducidos por teclado de 7 en 7");
        
        System.out.println(" ");
        
        //Declaración de variables
        
        Scanner s = new Scanner(System.in);
        
        //Introducción de datos
        
        System.out.printf("Introduce el primer número: ");
        int numeroInt1 = Integer.parseInt(s.nextLine());
        
        System.out.printf("Introduce el segundo número: ");
        int numeroInt2 = Integer.parseInt(s.nextLine());
        
        //Procesos
        
        //Si ambos números son iguales se muestra que no se puede realizar la operación
        
        do{
        if(numeroInt1 == numeroInt2){
            System.out.println("Los números deben ser diferentes");
            }
        
        
        }while(numeroInt1 == numeroInt2);
        
        
        //Si el primero es mayor que el segundo, se intercambian
        
        if(numeroInt1 > numeroInt2) {
        int aux = numeroInt1;
        numeroInt1 = numeroInt2;
        numeroInt2 = aux;
        }
        
        //Proceso Principal
        for(int i = numeroInt1; i <= numeroInt2; i +=7 ){
            System.out.println(" ");
            System.out.println(i + " ");
        
        }
        
        

    }
    
}
