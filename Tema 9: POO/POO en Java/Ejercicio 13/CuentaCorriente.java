package ej13t9;

public final class CuentaCorriente {

    private static double transDinero;

    private String numCuenta = "";
    private double saldo = 0;

    //Constructor
    public CuentaCorriente(double saldo) {

        this.generaNum();
        this.saldo = saldo;

    }

    public CuentaCorriente() {

        this.generaNum();
    }

    //Genera un numero de cuenta aleatorio
    public void generaNum() {

        for (int i = 0; i < 10; i++) {
            numCuenta += (int) (Math.random() * 10);
        }
    }

    @Override
    public String toString() {
        return "La cuenta nº " + this.numCuenta + " tiene un saldo de: " + this.saldo;
    }

    public double ingresar(double dineros) {

        return this.saldo = this.saldo + dineros;

    }

    public double retirar(double dineros) {

        return this.saldo = this.saldo - dineros;
    }

    public void transferencia(CuentaCorriente transDinero, double dineros) {

        this.saldo = this.saldo - dineros;
        CuentaCorriente.transDinero = CuentaCorriente.transDinero + dineros;

    }

}
