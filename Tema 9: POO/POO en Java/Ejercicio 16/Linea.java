package ej16t9;

public class Linea {

    private final Punto pOrigen;
    private final Punto pFinal;

    //Constructor
    public Linea(Punto pOrigen, Punto pFinal) {
        this.pOrigen = pOrigen;
        this.pFinal = pFinal;
    }

    @Override
    public String toString() {
        return "Linea formada por los puntos " + this.pOrigen + " y " + this.pFinal;
    }

}
