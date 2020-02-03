package ej1t10;

import java.util.ArrayList;

public class Ej1T10 {

    public static void main(String[] args) {
        
        ArrayList<String> a = new ArrayList<>();
        
        a.add("José Antonio");
        a.add("Juan");
        a.add("Pedro");
        a.add("Ramón");
        a.add("Ana");
        a.add("Laura");
        
        System.out.println("El número de alumnos es: " + a.size());
        System.out.println();
        
        for (String alumno : a) {
            
            System.out.println(alumno);
            System.out.println();
            
        }
    }
    
}
