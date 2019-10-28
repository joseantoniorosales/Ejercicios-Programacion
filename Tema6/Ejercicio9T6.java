package ejercicio9t6;

public class Ejercicio9T6 {

    public static void main(String[] args) {
        
        //Definicion del ejercicio
        
        System.out.println("Este ejercicio generara numeros aleatorios pares entre el 0 y el 100 hasta que salga el 24");
        
        //Declaracion de variables
        
        int num = 0;
        int contador = 0;
        
        //procesos
        
        while(num != 24){
        
            num = (int)(Math.random() * 51) * 2;
            System.out.print(num + " ");
            contador++;
        }
        System.out.println("Se han generado " + contador + " numeros");
    }
    
}
