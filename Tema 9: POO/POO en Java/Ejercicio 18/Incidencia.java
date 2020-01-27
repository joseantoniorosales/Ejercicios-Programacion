package ej18t9;

public class Incidencia {

    private int codInc;
    private String estado;
    private int numPuesto;
    private String problema;
    private String solucion;
    private String resolucion;

    private static int cuentaCodigo = 1;
    private static int probPendientes = 0;

    //Constructor
    public Incidencia(int numPuesto, String problema) {
        this.codInc = cuentaCodigo++;
        this.estado = "Pendiente";
        this.numPuesto = numPuesto;
        this.problema = problema;
        this.solucion = solucion;
        probPendientes++;
    }

    public static int getProbPendientes() {
        return probPendientes;
    }
    
    

    public void ResolverProblemas(String resolucion) {

        this.resolucion = resolucion;
        this.estado = "Solucionado";
        probPendientes--;

    }

    @Override
    public String toString() {
        return "Incidencia " + this.codInc + " - " + " puesto " + this.numPuesto + " - " + this.problema
                + " - " + this.estado;
    }

}
