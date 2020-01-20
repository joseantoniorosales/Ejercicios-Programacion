package ej5t9;

public class Pizza {

    private static int Pedidas = 0;
    private static int Servidas = 0;

    private String tamano;
    private String tipo;
    private String estado;

    public Pizza(String tipo, String tamano) {
        this.tipo = tipo;
        this.tamano = tamano;
        this.estado = "pedida";
        Pizza.Pedidas++;
    }

    public String toString() {
        return "pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
    }

    public static int getTotalPedidas() {
        return Pizza.Pedidas;
    }

    public static int getTotalServidas() {
        return Pizza.Servidas;
    }

    /* Sirve la pizza. Si ya está servida indica que ya lo está */
    
    public void sirve() {
        if (this.estado.equals("pedida")) {
            this.estado = "servida";
            Pizza.Servidas++;
        } else {
            System.out.println("esa pizza ya ha sido servida");
        }
    }
}


