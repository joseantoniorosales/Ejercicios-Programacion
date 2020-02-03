package ej1t9array;

import java.util.Scanner;

public class Ej1T9Array {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Gato[] g = new Gato[4];

        int i;

        System.out.println("\nIntroduzca los datos del gato: ");

        for (i = 0; i < 4; i++) {

            g[i] = new Gato();

            System.out.println("\nGato nº: " + (i + 1));
            
            System.out.println();

            System.out.print("Nombre: ");
            g[i].setNombre(s.nextLine());

            System.out.println();
            
            System.out.print("Color: ");
            g[i].setColor(s.nextLine());

            System.out.println();
            
            System.out.print("Raza: ");
            g[i].setRaza(s.nextLine());
            
            System.out.println();

        }
        
        
        System.out.println("\nDatos del gato: ");
        
        for (i = 0; i < 4; i++) {
            
            System.out.println("Nombre: " + g[i].getNombre());
            
            System.out.println();
            
            System.out.println("Color: " + g[i].getColor());
            
            System.out.println();
            
            System.out.println("Raza: " + g[i].getRaza());
            
            System.out.println();
            
        }

    }

}
