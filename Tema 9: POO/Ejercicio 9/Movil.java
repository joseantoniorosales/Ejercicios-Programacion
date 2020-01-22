package ej9t9;

import java.text.DecimalFormat;
import java.util.Locale;

public class Movil extends Terminal {

    private String tarifa;
    private double totalTarifa;

    public Movil(String num, String tarifa) {
        super(num);
        this.tarifa = tarifa;
        this.totalTarifa = 0;
    }

    @Override
    public void llama(Terminal t, int segLlamada) {

        super.llama(t, segLlamada);
        double minutos = (double) segLlamada / 60;

        switch (tarifa) {
            case "rata":
                this.totalTarifa += minutos * 0.06;
                break;

            case "mono":
                this.totalTarifa += minutos * 0.12;
                break;

            case "bisonte":
                this.totalTarifa += minutos * 0.30;
                break;

            default:
        }
    }

    @Override
    public String toString() {

        DecimalFormat formatoEuro = new DecimalFormat("0,00");

        return this.getNum() + " - " + "tiempo de conversación: " + getTiempoConver()
                + "s" + " - " + totalTarifa + "€";
    }

}
