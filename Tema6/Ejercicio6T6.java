package ejercicio6t6;

import java.util.Scanner;

public class Ejercicio6T6 {

    public static void main(String[] args) {
        
        System.out.println("Este programa generara un nº del 0 al 100. Tienes 5 intentos para adivinarlo");
        
        
        
        
        //Declaracion de variables
        Scanner s = new Scanner(System.in);
        int numAdivinar = (int)(Math.random() * 101);
        int numInt;
        boolean acierto = false;
        int numTry = 5;
        
        //Instrucciones para el usuario
        
        System.out.println("Adivina el numero que estoy pensando. El intervalo esta entre el 0 y el 100. Te doy 5 intentos.");
        
        
        //procesos
        do{
            System.out.println("Introduce tu respuesta: ");
            numInt = Integer.parseInt(s.nextLine());
            numTry--;
            
            if(numInt > numAdivinar){
            
                System.out.println("Te has pasado, baja el " + numInt);
                
                System.out.println("Con esto te quedan " + numTry + " intentos");  
            }
            
            if (numInt < numAdivinar){
            
                System.out.println("Aun te falta, aumenta el " + numInt);
            
                System.out.println("Con esto te quedan " + numTry + " intentos");  
            }
            
            if (numInt == numAdivinar){
            
                acierto = true;
                System.out.println("Toma! Que has acertado!");
            
            }
        
        }while (!acierto && (numTry > 0));
        
        
        if (!acierto) {
      System.out.println("Vaya hombre, no has sido capaz de descubrir el " + numAdivinar);
    }
        
        
    }

}
