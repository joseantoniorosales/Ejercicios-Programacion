package ej8t10;

import java.util.ArrayList;
import java.util.Collections;

public class Ej8T10 {
    
    public static void main(String[] args) {
        
        ArrayList<Carta> ca = new ArrayList<Carta>();
        
        Carta carta = new Carta();
        ca.add(carta);
        
        for (int i = 0; i < 9; i++) {
            do {
                carta = new Carta();
            } while (ca.contains(carta));
            
            ca.add(carta);
        }
        
        for (Carta nuevaCarta : ca) {
            System.out.println(nuevaCarta);
            System.out.println();
        }
        
        Collections.sort(ca);
        
        for (Carta nuevaCarta : ca) {
            System.out.println(nuevaCarta);
        }
    }
}
