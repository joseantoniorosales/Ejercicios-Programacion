package ej7t9;

public class Zona {

    private int entradasRestantes;

    public Zona(int num1) {
        entradasRestantes = num1;
    }

    public int getEntradasRestantes() {
        return entradasRestantes;
    }

    /* Vende un número de entradas */
    
    public void vender(int num2) {
        if (this.entradasRestantes == 0) {
            System.out.println("Lo siento, las entradas para esa zona están agotadas.");
        } else if (this.entradasRestantes < num2) {
            System.out.println("Sólo me quedan " + this.entradasRestantes
                    + " entradas para esa zona.");
        }
        if (this.entradasRestantes>= num2) {
            entradasRestantes -= num2;
            System.out.println("Tome sus " + num2 + " entradas, gracias por su compra.");
        }
    }
}
