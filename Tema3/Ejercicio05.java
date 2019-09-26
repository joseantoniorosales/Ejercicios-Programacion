public class Ejercicio05 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce la base del rectangulo: ");
    linea = System.console().readLine();
    int Base;
    Base = Integer.parseInt( linea );

    System.out.print("introduce la altura del rectangulo, por favor: ");
    linea = System.console().readLine();
    int Altura;
    Altura = Integer.parseInt( linea );

    int Area = Base * Altura;

    System.out.println("La base del rectangulo es: " + Base);
    System.out.println("La altura del rectangulo es: " + Altura);
    System.out.print("El area del rectangulo es: ");
    System.out.println(Area);


  } 
}
