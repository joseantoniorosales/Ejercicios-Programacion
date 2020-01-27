package ej17t9;

public class Rectangulo {

    private final int base;
    private final int altura;
    private static int cantidadRectangulos;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
        cantidadRectangulos++;
    }

    public static int getCantidadRectangulos() {
        return cantidadRectangulos;
    }

    @Override
    public String toString() {
        String cadena = "";

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                cadena += '*';
            }
            cadena += '\n';
        }
        return cadena;
    }
}
