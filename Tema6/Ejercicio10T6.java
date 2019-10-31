
package ejercicio10t6;

public class Ejercicio10T6 {

    public static void main(String[] args) {
        
        //Definicion del ejercicio
        System.out.println("Este programa nos dara una linea de caracteres aleatorios. Su longitud tambien sera aleatoria entre el 1 y el 40");
        
        //Declaracion de variables
        
        int caracter;
        int longitud;
        String relleno = "";
                
                
        //Procesos
        
        for(int i = 1; i < 40; i++){
            
            longitud = (int)(Math.random() * 40) + 1;
            
            caracter = (int)(Math.random() * 6);
            
            switch(caracter){
                case 0:
                    relleno = "*";
                break;
                
                case 1:
                    relleno = "-";
                break;
                
                case 2:
                    relleno = "=";
                break;
                
                case 3:
                    relleno = ".";
                break;
                
                case 4:
                    relleno = "|";
                break;
                
                case 5:
                    relleno = "@";
                break;
                
                default:
            }
            
        //Genera la linea
        
        for(int j = 1; j <= longitud; j++){
            System.out.println(relleno);
        }
            
        }
    
        
    }
    
}
