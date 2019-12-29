package ejercicio8t7arraybi;

import java.util.Scanner;

public class Ejercicio8T7ArrayBi {

    public static void main(String[] args) {

        System.out.println("Este programa nos dirá en que posiciones se puede mover un alfil en un tablero de ajedrez de 64 casillas en"
                + "una determinada posición");

        //Clase Scanner
        Scanner s = new Scanner(System.in);

        //Definicion de variables
        String posicionAlfil;
        int columnaAlfil;
        int filaAlfil;

        int fila;
        int columna;

        //Procesos
        System.out.print("\nIntroduzca la posición inicial del alfil, por ejemplo d5: ");
        posicionAlfil = s.nextLine();
        columnaAlfil = (int) (posicionAlfil.charAt(0)) - 96;
        filaAlfil = (int) (posicionAlfil.charAt(1)) - 48;

        System.out.print("El alfil puede moverse a: ");

        for (fila = 8; fila >= 1; fila--) {
            for (columna = 1; columna <= 8; columna++) {
                if ((Math.abs(filaAlfil - fila) == Math.abs(columnaAlfil - columna))
                        && (!((filaAlfil == fila) && (columnaAlfil == columna)))) {
                    System.out.print((char) (columna + 96) + "" + fila + " ");
                }
            }
        }
    }
}
