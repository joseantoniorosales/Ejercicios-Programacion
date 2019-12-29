package ejercicio3t7arraybi;

public class Ejercicio3T7ArrayBi {

    public static void main(String[] args) {

        System.out.println("Este programa realizará las sumas parciales de filas y columnas del siguiente cuadrante");
        int[][] cuadrante = new int[4][5];

        int filas;
        int columnas;

        // Introduce valores aleatorios en el array
        for (filas = 0; filas < 4; filas++) {
            for (columnas = 0; columnas < 5; columnas++) {
                cuadrante[filas][columnas] = (int) (Math.random() * 900) + 100;
            }
        }

        // Muestra los datos y las sumas parciales de las filas
        int sumFilas;
        for (filas = 0; filas < 4; filas++) {
            sumFilas = 0;
            for (columnas = 0; columnas < 5; columnas++) {
                System.out.printf("%7d   ", cuadrante[filas][columnas]);
                sumFilas += cuadrante[filas][columnas];
            }
            System.out.printf("|%7d\n", sumFilas);
        }

        // Muestra las sumas parciales de las columnas
        for (columnas = 0; columnas < 5; columnas++) {
            System.out.print("----------");
        }
        System.out.println("-----------");

        int sumColumnas;
        int sumTotal = 0;

        for (columnas = 0; columnas < 5; columnas++) {
            sumColumnas = 0;
            for (filas = 0; filas < 4; filas++) {
                sumColumnas += cuadrante[filas][columnas];
            }

            sumTotal += sumColumnas;
            System.out.printf("%7d   ", sumColumnas);
        }
        System.out.printf("|%7d   ", sumTotal);

    }
}
