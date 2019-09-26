public class Ejercicio06 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, introduce la base del triangulo: ");
    linea = System.console().readLine();
    int Base;
    Base = Integer.parseInt( linea );

    System.out.print("introduce la altura del triangulo, por favor: ");
    linea = System.console().readLine();
    int Altura;
    Altura = Integer.parseInt( linea );

    double Area = (Base * Altura) / 2;

    System.out.println("La base del triangulo es: " + Base);
    System.out.println("La altura del triangulo es: " + Altura);
    System.out.print("El area del triangulo es: ");
    System.out.println(Area);


  } 
}
