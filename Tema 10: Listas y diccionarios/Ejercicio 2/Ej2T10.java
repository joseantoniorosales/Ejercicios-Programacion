package ej2t10;

import java.util.ArrayList;

public class Ej2T10 {

    public static void main(String[] args) {

        int tamanno = (int) (Math.random() * ((20 - 10) + 1) + 10);
        int suma = 0;
        int max = 0;
        int min = 500;

        ArrayList<Integer> a = new ArrayList<>((int) (Math.random() * 100));

        for (int i = 0; i < tamanno; i++) {

            int num = (int) (Math.random() * 100);
            a.add(num);

            //Suma
            suma += num;

            //Max
            if (num > max) {
                max = num;
            }

            //Min
            if (num < min) {
                min = num;
            }

        }

        System.out.println("Numero de elementos: " + a.size());
        
        System.out.println();

        System.out.println("Listado: ");

        for (int nums : a) {

            System.out.println(nums);
            System.out.println();

        }

        System.out.println("Suma: " + suma);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Media: " + (double) suma / tamanno);
    }

}
