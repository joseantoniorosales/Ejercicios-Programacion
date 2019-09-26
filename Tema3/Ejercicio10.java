public class Ejercicio10 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduzca la cantidad de megabytes que desea convertir: ");
    linea = System.console().readLine();
    double megas;
    megas = Integer.parseInt( linea );


    double factorDeConversion = 1000;
    double conversion = megas * factorDeConversion;

    System.out.println("Cantidad de megabytes introducida: " + megas);
    System.out.println("Factor de Conversion utilizado: " + factorDeConversion);
    System.out.print("Conversion final: " + conversion);


  } 
}
