package ejercicio7t6;

public class Ejercicio7T6 {

    public static void main(String[] args) {
        
        //Definicion del ejercicio
        
        System.out.println("Este programa realizara 15 apuestas en la quiniela al azar");
        
        //Declaración de variables
        
        int resultado;
        int columna = 3;
        
        //Procesos
        
        for (int fila = 1; fila <= 15; fila++){
        
            System.out.printf("%4d. |", fila);
            
            if(fila == columna){
            
                columna = 1;
            
            }
            for(int apuesta = 1; apuesta <= columna; apuesta++){
                resultado = (int)(Math.random() * 3) + 1;
                
                switch(resultado){
                
                    case 1:
                        System.out.println("  1 |  ");
                    break;
                    
                    case 2:
                        System.out.println("  2|  ");
                    break;
                    
                    case 3:
                        System.out.println("  |  x  ");
                    default:
                
                
                
                
                }
                System.out.println();
            }
        }
    }
    
}
