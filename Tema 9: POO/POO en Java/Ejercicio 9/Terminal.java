package ej9t9;

public class Terminal {

    private String num;
    private int tiempoConver;

    Terminal(String num) {

        this.num = num;
        this.tiempoConver = tiempoConver;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getTiempoConver() {
        return tiempoConver;
    }

    public void setTiempoConver(int tiempoConver) {
        this.tiempoConver = tiempoConver;
    }

    @Override
    public String toString() {
        return "Tlf " + " - " + num + " tiempo de conversación: " + tiempoConver + "s";
    }

    public void llama(Terminal t, int segLlamada) {

        this.tiempoConver += segLlamada;
        t.tiempoConver += segLlamada;
    }

}
