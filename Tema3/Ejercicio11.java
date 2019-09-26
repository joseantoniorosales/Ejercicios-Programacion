public class Ejercicio11 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduzca la cantidad de megabytes que desea convertir: ");
    linea = System.console().readLine();
    double kylobytes;
    kylobytes = Integer.parseInt( linea );


    double factorDeConversion = 1000;
    double conversion = kylobytes / factorDeConversion;

    System.out.println("Cantidad de kylobytes introducida: " + kylobytes);
    System.out.println("Factor de Conversion utilizado: " + factorDeConversion);
    System.out.print("Conversion final: " + conversion);


  } 
}
