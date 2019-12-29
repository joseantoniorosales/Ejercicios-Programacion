package ejercicio10t7arraybi;

public class Ejercicio10T7ArrayBi {

    public static void main(String[] args) {
    
        System.out.println("Este programa mostrará un array de números aleatorios de 10x10, mostrará los números que hay"
                + "en la diagonal y realizará la media de la misma");
        
        System.out.println();
        
        //Declaración de variables
        
        int[][] tablero = new int[10][10];
        
        int max = 200;
        int  min = 300;
        int suma = 0;
        
        int i;
        int j;
        
        int num;
        
        //Muestra el array original
        
        System.out.println("Cuadrante de números aleatorios: ");
        System.out.println();
        
        for(i = 0; i < 10; i++) {
            for(j = 0; j < 10; j++) {
                tablero[i][j] = (int)(Math.random() * 101) + 200;
                System.out.printf("%5d", tablero[i][j]);
            }
            System.out.println();
            System.out.println();
        }
        
        //Diagonal
        
        System.out.print("\nDiagonal desde la esquina superior izquierda ");
        System.out.println("a la esquina inferior derecha: ");
        System.out.println();
        
        for(i = 0; i < 10; i++) {
           num = tablero[i][i];
            System.out.println(num + " ");
            if(num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            suma += num;
            System.out.println();
        }
        
        System.out.println("\nMáximo: " + max);
        System.out.println();
        System.out.println("Mínimo: " + min);
        System.out.println();
        System.out.println("Media: " + ((double)suma / 10));
        System.out.println();
    }
    
}
