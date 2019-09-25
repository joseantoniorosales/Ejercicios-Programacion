// Ejercicio 1 de variables
public class OperacionesSimples {
  public static void main(String[] args) {
    int variable1;
    int variable2;
    double suma;
    double resta;
    double producto;
    double division;
    
    variable1 = 144;
    System.out.println("El valor actual de mi variable es " + variable1);

    variable2 = 999;
    System.out.println("y el de la segunda variable es " + variable2);
    suma = variable1 + variable2;
    System.out.println("La suma de las variables es: " + suma);
    resta = variable1 - variable2;
    System.out.println("La resta de las variables es: " + resta);
    producto = variable1 * variable2;
    System.out.println("El producto de las variables es: " + producto);
    division = variable1 / variable2;
    System.out.println("La division de las variables es: " + division);
  }
}
