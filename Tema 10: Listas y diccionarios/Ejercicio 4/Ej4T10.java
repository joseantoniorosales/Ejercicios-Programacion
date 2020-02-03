package ej4t10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ej4T10 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ArrayList<String> a = new ArrayList();

        System.out.println("Añade 10 palabras (Pulsa ENTER cada vez que escribas uno): ");

        for (int i = 0; i < 10; i++) {
            a.add(s.nextLine());
        }

        Collections.sort(a);
        System.out.println("Lista ordenada: ");

        for (String string : a) {

            System.out.println(string);

        }

    }

}
