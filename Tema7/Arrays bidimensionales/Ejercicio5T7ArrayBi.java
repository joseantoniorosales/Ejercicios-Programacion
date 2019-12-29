package ejercicio5t7arraybi;

public class Ejercicio5T7ArrayBi {

    public static void main(String[] args)
            throws InterruptedException {

        
        System.out.println("Este programa genera números aleatorios del 0 al 1000 (incluidos) en un cuadrante de 6x10 y calcula el número"
                + "máximo y mínimo");
        //Declaración de variables
       
        int[][] cuadrante = new int[6][10];

        int fila;
        int columna;

        int minimo = Integer.MAX_VALUE;
        int filaMinimo = 0;
        int columnaMinimo = 0;

        int maximo = Integer.MIN_VALUE;
        int filaMaximo = 0;
        int columnaMaximo = 0;

        System.out.print("\n      ");
        for (columna = 0; columna < 10; columna++) {
            System.out.print("   " + columna + "  ");
        }
        System.out.println();

        System.out.print("    ┌");
        for (columna = 0; columna < 10; columna++) {
            System.out.print("──────");
        }
        System.out.println("┐");

        for (fila = 0; fila < 6; fila++) {
            System.out.print("  " + fila + " │");
            for (columna = 0; columna < 10; columna++) {
                cuadrante[fila][columna] = (int) (Math.random() * 1001);
                System.out.printf("%5d ", cuadrante[fila][columna]);
                Thread.sleep(100);

                // Calcula el mínimo y guarda sus coordenadas
                if (cuadrante[fila][columna] < minimo) {
                    minimo = cuadrante[fila][columna];
                    filaMinimo = fila;
                    columnaMinimo = columna;
                }

                // Calcula el máximo y guarda sus coordenadas
                if (cuadrante[fila][columna] > maximo) {
                    maximo = cuadrante[fila][columna];
                    filaMaximo = fila;
                    columnaMaximo = columna;
                }
            }
            System.out.println("│");
        }
        System.out.print("    └");
        for (columna = 0; columna < 10; columna++) {
            System.out.print("──────");
        }

        System.out.println("┘\n\nEl máximo es " + maximo + " y está en la fila " + filaMaximo + ", columna " + columnaMaximo);
        System.out.println("El mínimo es " + minimo + " y está en la fila " + filaMinimo + ", columna " + columnaMinimo);
    }
}
