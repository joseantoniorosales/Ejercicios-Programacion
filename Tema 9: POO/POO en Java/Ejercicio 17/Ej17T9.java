package ej17t9;

public class Ej17T9 {

    public static void main(String[] args) {

        Piramide p = new Piramide(4);
        Rectangulo r1 = new Rectangulo(4, 3);
        Rectangulo r2 = new Rectangulo(6, 2);

        System.out.println(p);
        System.out.println(r1);
        System.out.println(r2);

        System.out.println("Cantidad de piramides creadas: " + Piramide.getCantidadPiramides());
        System.out.println("Cantidad de rectángulos creados: " + Rectangulo.getCantidadRectangulos());
    }

}
