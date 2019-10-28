package ejercicio5t6;

public class Ejercicio5T6 {

    public static void main(String[] args) {
        System.out.println("Este programa generará 50 numeros enteros entre el 100 y el 199, además calculara el max, min y la media de dichos numeros");
        
        //Declaracion de variables
        
        int num;
        int media;
        int max = 199;
        int min = 100;
        int suma = 0;
        
        //Procesos
        
        //Bucle para hacer 50 numeros aleatorios
        
        for(int i = 0; i <= 50; i++){
            
            //Numeros aleatorios entre 100 y 199
            
            num = (int)(Math.random() * 100) + 100;
            
            //Espacios entre numeros
            
            System.out.println(num + " ");
            
            suma += num;
            
            //Minimo
            if (num < min){
            
                min = num;
            }
            
            //Maximo
            
            if (num > max){
            
                max = num;
            }
        }
        
        //Media
        
        System.out.println("\nMínimo: " + min + "\nMáximo: " + max + "\nMedia: " + suma / 50);
        
        
    }
    
}
