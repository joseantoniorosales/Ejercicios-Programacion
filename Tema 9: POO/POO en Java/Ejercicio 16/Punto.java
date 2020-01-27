package ej16t9;

public class Punto {

    //Variables privadas
    private double coordenada1;
    private double coordenada2;

    //Constructor
    public Punto(double coordenada1, double coordenada2) {
        this.coordenada1 = coordenada1;
        this.coordenada2 = coordenada2;
    }

    public double getCoordenada1() {
        return coordenada1;
    }

    public double getCoordenada2() {
        return coordenada2;
    }

    @Override
    public String toString() {
        return "(" + this.coordenada1  + this.coordenada2 + ")";
    }

}
