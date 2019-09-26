public class Ejercicio07 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce el primer articulo: ");
    linea = System.console().readLine();
    int Articulo1;
    Articulo1 = Integer.parseInt( linea );

    System.out.print("introduce el segundo articulo, por favor: ");
    linea = System.console().readLine();
    int Articulo2;
    Articulo2 = Integer.parseInt( linea );

    double IVA = 0.21;
    double Articulo1ConIVA = (Articulo1 * IVA) + Articulo1;
    double Articulo2ConIVA = (Articulo2 * IVA) + Articulo2;
    double Total = Articulo1ConIVA + Articulo2ConIVA;

    System.out.println("El primer articulo vale: " + Articulo1);
    System.out.println("El segundo articulo vale: " + Articulo2);
    System.out.println("El primer articulo con IVA vale: " + Articulo1ConIVA);
    System.out.println("El segundo articulo con IVA vale: " + Articulo2ConIVA);
    System.out.print("El precio total es: " + Total);


  } 
}
