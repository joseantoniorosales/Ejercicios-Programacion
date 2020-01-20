package ej7t9;

import java.util.Scanner;

public class Ej7T9 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Zona principal = new Zona(1000);
        Zona compraVenta = new Zona(200);
        Zona vip = new Zona(25);

        int opcion = 0;
        int opcion2 = 0;
        int num = 0;

        do {
            System.out.println("EXPOCOCHES CAMPANILLAS");

            System.out.println();

            System.out.println("1. Mostrar número de entradas libres");

            System.out.println();

            System.out.println("2. Vender entradas");

            System.out.println();

            System.out.println("3. Salir");

            System.out.println();

            System.out.println("Elige una opción: ");

            opcion = Integer.parseInt(s.nextLine());

            if (opcion == 1) {
                System.out.println("\n\nEn la zona principal hay " + principal.getEntradasRestantes());
                System.out.println("En la zona de compra venta hay " + compraVenta.getEntradasRestantes());
                System.out.println("En la zona vip hay " + vip.getEntradasRestantes());
                System.out.println();
            }

            if (opcion == 2) {
                System.out.println("\n\n1.- Principal");
                System.out.println("2.- Compra-venta");
                System.out.println("3.- Vip");
                
                System.out.println();
                
                System.out.print("Elija la zona para la que quiere comprar las entradas: ");

                opcion2 = Integer.parseInt(s.nextLine());

                System.out.println();
                
                System.out.print("¿Cuántas entradas quiere? ");
                num = Integer.parseInt(s.nextLine());
                
                System.out.println();

                switch (opcion2) {
                    case 1:
                        principal.vender(num);
                        break;
                    case 2:
                        compraVenta.vender(num);
                        break;
                    case 3:
                        vip.vender(num);
                        break;
                    default:
                }
                System.out.println();
            }
        } while (opcion < 3);
    }
}
