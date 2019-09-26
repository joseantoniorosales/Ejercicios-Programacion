public class Ejercicio03 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce el numero de pesetas que desea convertir: ");
    linea = System.console().readLine();
    int Pesetas;
    Pesetas = Integer.parseInt( linea );

    double FactorConversion = 166.366;
    

    double total;
    total = Pesetas / FactorConversion;

    System.out.println("El numero de pesetas introducidas es: " + Pesetas);
    System.out.println("La conversion a euros es: ");
    System.out.print(total);   
  } 
}
