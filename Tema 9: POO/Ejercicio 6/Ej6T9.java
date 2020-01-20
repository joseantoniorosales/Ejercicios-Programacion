package ej6t9;

public class Ej6T9 {

    public static void main(String[] args) {

        Tiempo primero = new Tiempo(1, 20, 30);
        Tiempo segundo = new Tiempo(0, 30, 40);
        Tiempo tercero = new Tiempo(0, 35, 20);
        
        System.out.println();

        System.out.println(primero + " + " + segundo + " = " + primero.suma(segundo));
        
        System.out.println();
        
        System.out.println(segundo + " - " + tercero + " = " + segundo.resta(tercero));
        
        System.out.println();
    }
}

    

