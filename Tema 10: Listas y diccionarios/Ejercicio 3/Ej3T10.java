package ej3t10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Ej3T10 {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList();

        System.out.println("Añade 10 números (Pulsa ENTER cada vez que escribas uno): ");

        for (int i = 0; i < 10; i++) {
            a.add(s.nextInt());
        }

        Collections.sort(a);
        System.out.println("Lista ordenada: ");

        for (Integer integer : a) {

            System.out.println(integer);

        }


    }
    
}
