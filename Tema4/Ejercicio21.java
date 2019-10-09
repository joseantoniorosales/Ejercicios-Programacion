public class Ejercicio21 {
  public static void main(String[] args) {

    System.out.println("Este programa calculará la media de los examenes y nos dirá la nota. Si se ha suspendido te preguntará por la recuperación");
    System.out.print("Nota del primer control: ");
    double nota1 = Double.parseDouble(System.console().readLine());

    System.out.print("Nota del segundo control: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1 + nota2) / 2;
    
    if (media < 5) {
      System.out.print("¿Aprobaste la recuperación? (si/no): ");
      String recuperacion = System.console().readLine();
      if (recuperacion.equals("si")) {
        media = 5;
      }
    }
    
    System.out.print("Tu nota final es: " + media);
  }
}
