package ejercicio13t6;

public class Ejercicio13T6 {

    public static void main(String[] args) {
        
        //Definicion del ejercicio
        System.out.println("Este programa hará tiradas de 2 dados y parara cuando sean ambos iguales");
        
        System.out.println(" ");
        
        //Declaracion de variables
        
        int dado1;
        int dado2;
        
        
        //Procesos
        do{
        
            dado1 = (int)(Math.random() * 6) + 1;
            
            dado2 = (int)(Math.random() * 6) + 1;
            
            System.out.println(dado1 + "" + dado2);
        
        }while(dado1 != dado2);
        
    }
    
}
