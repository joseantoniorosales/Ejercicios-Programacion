package ej2t9array;

public class Ej2T9Array {

    public static void main(String[] args) {

        Gato[] g2 = new Gato[4];

        g2[0] = new Gato("G4TO", "Azul", "Persa");

        g2[1] = new Gato("Garfield", "Naranja", "Mestizo");

        g2[2] = new Gato("Doraemon", "Turquesa", "Robot");

        g2[3] = new Gato("Purloin", "Violeta", "Pokemon");

        for (int i = 0; i < 4; i++) {

            System.out.println("Nombre: " + g2[i].getNombre());

            System.out.println("Color: " + g2[i].getColor());

            System.out.println("Raza: " + g2[i].getRaza());

            System.out.println();

        }

    }

}
