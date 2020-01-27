package ejercicio11t9;

public class TarjetaRegalo {

    double saldo;
    String numero;

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;

        //Numero de tarjeta aleatorio
        this.numero = "";
        for (int i = 0; i < 5; i++) {
            this.numero += (int) (Math.random() * 10);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {

        return "El saldo de la tarjeta nº " + numero + " es: " + saldo + "€";
    }

    public void gasta(double gasto) {

        if (gasto > saldo) {
            System.out.println("No tienes dinero para pagar " + gasto);

            System.out.println();
        } else {
            saldo = saldo - gasto;
        }
    }

    TarjetaRegalo fusion(TarjetaRegalo t) {

        double saldoFusion = this.getSaldo() + t.getSaldo();

        this.setSaldo(0);
        t.setSaldo(0);

        return new TarjetaRegalo(saldoFusion);
    }
}
