public class Ejercicio04 {
  public static void main(String[] args) {

    int pagaSemanal;

    System.out.print("¿Cuantas horas has trabajado esta semana?: ");
    
    int horasSemanales = Integer.parseInt(System.console().readLine());
    
    if (horasSemanales < 40) {
      pagaSemanal = 12 * horasSemanales;
    } else {
      pagaSemanal = (16 * horasSemanales) + (40 * 12);
    }
    System.out.println("El sueldo que le corresponde es de " + pagaSemanal + " euros.");
  }
}
