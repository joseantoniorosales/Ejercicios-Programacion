package ejercicio4t7;

public class Ejercicio4T7 {

    public static void main(String[] args) {

        //Definicion del programa
        
        System.out.println("Este programa mostrara 20 numeros entre 0 y 100, asi como sus cuadrados y sus cubos");
        
        System.out.println();
        
        //Declaracion de variables
        
        int numero[] = new int[20];
        int cuadrado[] = new int[20];
        int cubo[] = new int[20];
        
        int contador;
        
        for(int i = 0; i < 20; i++){
        
            numero[i] = (int)(Math.random() * 101);
            cuadrado[i] = numero[i] * numero[i];
            cubo[i] = numero[i] * numero[i] * numero[i];
        
        }
        
        System.out.println("Ahora se mostraran los numeros en 3 columnas");
        
        System.out.println("  n  │   n²  │    n³\n─────┼───────┼─────────");
        
        for(int i = 0; i < 20; i++){
        
            System.out.printf("%4d │ %5d │%8d\n", numero[i], cuadrado[i], cubo[i]);
        
        }
    }
    
}
