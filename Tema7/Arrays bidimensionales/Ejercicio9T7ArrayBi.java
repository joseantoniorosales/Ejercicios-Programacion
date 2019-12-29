package ejercicio9t7arraybi;

public class Ejercicio9T7ArrayBi {

    public static void main(String[] args) {

        System.out.println("Este programa rotará un tablero de 12 x 12 en el sentido de las agujas del reloj");
        System.out.println();

        //Declaración de variables
        int[][] tablero = new int[12][12];

        int capa;
        int i;
        int j;

        int aux1;
        int aux2;

        //Procesos
        //Genera el array y lo muestra
        System.out.println("Tablero original");
        System.out.println("------------------------------------------------------------");
        System.out.println("");

        for (i = 0; i < 12; i++) {

            for (j = 0; j < 12; j++) {
                tablero[i][j] = (int) (Math.random() * 101);
                System.out.printf("%5d", tablero[i][j]);
            }
            System.out.println();
        }

        //Rotación
        for (capa = 0; capa < 6; capa++) {

            //Rotar por arriba
            aux1 = tablero[capa][11 - capa];
            for (i = 11 - capa; i > capa; i--) {

                tablero[capa][i] = tablero[capa][i - 1];
            }

            //Rotar por la derecha
            aux2 = tablero[11 - capa][11 - capa];
            for (i = 11 - capa; i > capa + 1; i--) {
                tablero[i][11 - capa] = tablero[i - 1][11 - capa];
            }
            tablero[capa + 1][11 - capa] = aux1;

            //Rotar por abajo
            aux1 = tablero[11 - capa][capa];
            for (i = capa; i < 11 - capa - 1; i++) {
                tablero[11 - capa][i] = tablero[11 - capa][i + 1];
            }
            tablero[11 - capa][11 - capa - 1] = aux2;

            // rota por la izquierda
            for (i = capa; i < 11 - capa - 1; i++) {
                tablero[i][capa] = tablero[i + 1][capa];
            }
            tablero[11 - capa - 1][capa] = aux1;

        } //Se cierra el for capa

        System.out.println();

        //Mostrar el array rotado
        System.out.println("\n\nArray rotado en el sentido de las agujas del reloj");
        System.out.println("------------------------------------------------------------");

        for (i = 0; i < 12; i++) {
            for (j = 0; j < 12; j++) {
                System.out.printf("%5d", tablero[i][j]);
            }
            System.out.println();
        }
    }
}
