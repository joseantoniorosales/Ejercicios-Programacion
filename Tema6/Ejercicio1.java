package ejercicio1;

public class Ejercicio1 {
   
    public static void main(String[] args) {
        
        System.out.println("Este programa hará 3 tiradas de dados y sumara los resultados");
        
        //Procesos
        for(int i = 0; i <= 3; i++){
            System.out.print(((int)(Math.random()*6) + 1 ) + " ");
        }
        System.out.println(" ");
    }
    
}
