// Ejercicio 6 de variables


public class Factura {
  public static void main(String[] args) {
    
    float baseImponible = 12;
    double IVA = 0.21;
    double precioConIVA = baseImponible * IVA;
    double total = baseImponible + precioConIVA;
    
    System.out.println("La factura total es: " + total);
  }
}
