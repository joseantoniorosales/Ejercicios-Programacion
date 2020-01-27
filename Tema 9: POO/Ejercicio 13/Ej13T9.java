package ej13t9;

public class Ej13T9 {

    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente();
        CuentaCorriente cuenta2 = new CuentaCorriente(1500);
        CuentaCorriente cuenta3 = new CuentaCorriente(6000);

        System.out.println(cuenta1);

        System.out.println();

        System.out.println(cuenta2);

        System.out.println();

        System.out.println(cuenta3);

        System.out.println();

        cuenta1.ingresar(2000);
        cuenta2.retirar(600);
        cuenta3.ingresar(75);
        cuenta1.retirar(55);
        cuenta2.transferencia(cuenta3, 100);

        System.out.println(cuenta1);

        System.out.println();

        System.out.println(cuenta2);

        System.out.println();

        System.out.println(cuenta3);

        System.out.println();

    }

}
