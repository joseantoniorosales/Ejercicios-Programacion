package ej17t9;

public class Piramide {

    private final int altura;
    private static int cantidadPiramides;

    public Piramide(int altura) {
        this.altura = altura;
        cantidadPiramides++;
    }

    public static int getCantidadPiramides() {
        return cantidadPiramides;
    }

    @Override
    public String toString() {
        String cadena = "";
        int planta = 1;
        int longitudDeLinea = 1;
        int espacios = altura - 1;

        while (planta <= altura) {

            // inserta espacios
            for (int i = 1; i <= espacios; i++) {
                cadena += ' ';
            }

            // pinta la línea
            for (int i = 1; i <= longitudDeLinea; i++) {
                cadena += '*';
            }

            cadena += '\n';

            planta++;
            espacios--;
            longitudDeLinea += 2;
        }
        return cadena;
    }

}
