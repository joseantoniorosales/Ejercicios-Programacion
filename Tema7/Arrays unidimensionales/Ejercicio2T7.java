package ejercicio2t7;

public class Ejercicio2T7 {
    public static void main(String[] args) {
        
        //Definicion del ejercicio
        
        System.out.println("Este programa mostrara un array de 10 caracteres teniendo algun valor vacio");
        
        System.out.println();
        
        //Declaracion de variables
        
        char simbolo[] = new char[10];
        
        
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[7] = '+';
        simbolo[8] = 'Q';
        
        //procesos
        
        for(int i = 0; i < 10; i++){
        
            System.out.println("simbolo[" + i + "]: " + simbolo[i]);
        
        }
    }
    
}
