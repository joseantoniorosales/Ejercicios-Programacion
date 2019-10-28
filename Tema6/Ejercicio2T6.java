
package ejercicio2t6;

public class Ejercicio2T6 {

    public static void main(String[] args) {
        
        System.out.println("Este programa te dira al azar una carta de la baraja francesa");
        
        //procesos
        
        int palo = (int) (Math.random() * 4) + 1;
        
        int baraja = (int)((Math.random() * 8) + 2);
        
        int barajaEsp = (int)((Math.random() * 4) + 10);
        
        
        
        switch(baraja){
        
            case 2:
                System.out.println("2");
            
            break;
            
            case 3:
                System.out.println("3");
                
            break;
            
            case 4:
                System.out.println("4");
                
            break;
        
            case 5:
                System.out.println("5");
            break;
            
            case 6:
                System.out.println("6");
            break;
            
            case 7:
                System.out.println("7");
            break;
            
            case 8:
                System.out.println("8");
            break;
            
            case 9:
                System.out.println("9");
            break;
        }
        
        switch(palo){
            
            case 1:
                System.out.println("Picas");
            
            break;
            
            case 2:
                System.out.println("Corazones");
                
            break;
            
            case 3:
                System.out.println("Diamantes");
                
            break;
            
            case 4:
                System.out.println("Treboles");
            break;
        }
    }
    
}
