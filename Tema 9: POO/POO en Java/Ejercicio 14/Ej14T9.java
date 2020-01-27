package ej14t9;

public class Ej14T9 {

    public static void main(String[] args) {

        FichaDomino ficha1 = new FichaDomino(6, 1);
        FichaDomino ficha2 = new FichaDomino(0, 4);
        FichaDomino ficha3 = new FichaDomino(3, 3);
        FichaDomino ficha4 = new FichaDomino(0, 1);

        System.out.println(ficha1);

        System.out.println();

        System.out.println(ficha2);

        System.out.println();

        System.out.println(ficha3);

        System.out.println();

        System.out.println(ficha4);

        System.out.println();

        System.out.println(ficha2.voltea());

        System.out.println();

        System.out.println(ficha2.encaja(ficha4));

        System.out.println();

        System.out.println(ficha1.encaja(ficha4));

        System.out.println();

        System.out.println(ficha1.encaja(ficha3));

        System.out.println();

        System.out.println(ficha1.encaja(ficha2));

        System.out.println();

    }

}
