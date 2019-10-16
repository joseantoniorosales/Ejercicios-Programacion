package ejercicio19;

import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
       
        //Funcionamiento del programa
        System.out.println("Este programa formará una piramide con la altura que introduzcas");
        
        //Declaración de variables
        
        Scanner s = new Scanner(System.in);
        int altura;
        String relleno;
        int base;
        int longitud;
        int espacio;
        
        //Introducción de datos
        
        System.out.println("Dime la altura de la pirámide (líneas): ");
        altura = Integer.parseInt(s.nextLine());
        
        System.out.println("Introduzca el caracter de relleno: ");
        relleno = s.nextLine();
        
        //Asignación de variables
        
        base = 1;
        longitud = 1;
        espacio = altura - 1;
        
        //procesos
        
        while(base <= altura){
        
            //Espacios
            for(int i = 1; i <= espacio; i++){
                System.out.println(" ");
            
            }
            
            //Linea
            for(int i = 1; i <= longitud; i++){
            
                System.out.println(relleno);
            
            }
            
        base++;
        longitud += 2;
        espacio--;
        }
        
        
        
        
        
    }
    
}
