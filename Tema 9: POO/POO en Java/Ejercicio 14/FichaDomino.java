package ej14t9;

public class FichaDomino {

    private final int numPrimero;
    private final int numSegundo;

    public FichaDomino(int numPrimero, int numSegundo) {

        this.numPrimero = numPrimero;
        this.numSegundo = numSegundo;
    }

    @Override
    public String toString() {
        return "[" + this.numPrimero + "|" + this.numSegundo + "]";
    }

    FichaDomino voltea() {

        return new FichaDomino(numPrimero, numSegundo);
    }

    boolean encaja(FichaDomino ficha) {

        return (numPrimero == ficha.numPrimero) || (numPrimero == ficha.numSegundo)
                || (numSegundo == ficha.numSegundo) || (numSegundo == ficha.numSegundo);

    }

}
