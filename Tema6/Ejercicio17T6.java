package ejercicio17t6;

import java.util.Scanner;

public class Ejercicio17T6 {

    public static void main(String[] args) {

        //Descripcion
        
        System.out.println("Este programa mostrara una 'pecera' con un 'pez' dentro en una posicion aleatoria");
        
        //Variables y pedir datos
        Scanner s = new Scanner(System.in);
        
        int posicion = 0;
        
        
        
        System.out.print("Introduzca la altura de la pecera (min 4): ");
        int altura = Integer.parseInt(s.nextLine());
        
        System.out.print("Ahora mete la anchura (min 4): ");
        int anchura = Integer.parseInt(s.nextLine());
        
        int posicionPez = (int)(Math.random() * (altura - 2) * (anchura - 2));
        
        
        //procesos
        
        //parte de arriba
        for(int i = 0; i < anchura; i++){
        
            System.out.print("*");
        
        }
        
        System.out.println();
        
        //parte central
        
        for(int j = 2; j < altura; j++){
        
            System.out.print("*");
            
            for(int k = 2; k < anchura; k++){
            
                if(posicion == posicionPez){
                
                    System.out.print("&");
                
                }else{
                
                    System.out.print(" ");
                    
                    posicion++;
                }
                System.out.print("*");
            }
        
        }
        
        for(int l = 0; l < anchura; l++){
        
            System.out.print("*");
        
        }
    }
    
}
