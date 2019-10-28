package ejercicio4t6;

public class Ejercicio4T6 {

    public static void main(String[] args) {
        
        System.out.println("Este programa generará 20 numeros enteros entre el 0 y el 10");
        
        //Procesos
        
        for(int i = 0; i <= 20; i++){
            System.out.print((int)(Math.random() * 11) + " ");
            
        }
    }
    
}
