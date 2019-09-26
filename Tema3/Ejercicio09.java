public class Ejercicio09 {
  public static void main(String[] args) {

    String linea;

    System.out.print("Por favor, radio del cono: ");
    linea = System.console().readLine();
    int radio;
    radio = Integer.parseInt( linea );

    System.out.print("introduce la altura del cono, por favor: ");
    linea = System.console().readLine();
    int altura;
    altura = Integer.parseInt( linea );

    double π = 3.14;
    double area = (π * (radio * radio) * altura) / 3;

    System.out.println("El radio vale: " + radio);
    System.out.println("La altura vale: " + altura);
    System.out.print("El area total es: " + area);


  } 
}
