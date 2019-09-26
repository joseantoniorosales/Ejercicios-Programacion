public class Ejercicio02 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce el numero de euros que desea convertir: ");
    linea = System.console().readLine();
    int Euros;
    Euros = Integer.parseInt( linea );

    double FactorConversion = 166.366;
    

    double total;
    total = Euros * FactorConversion;

    System.out.println("El numero de Euros introducidos es: " + Euros);
    System.out.println("La conversion a pesetas es: ");
    System.out.print(total);   
  } 
}
