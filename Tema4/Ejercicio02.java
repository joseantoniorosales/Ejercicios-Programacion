public class Ejercicio02 {
  public static void main(String[] args) {

    System.out.print("Introduzca una hora del día (0 - 23) y procederé a saludarle apropiadamente: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("Buenos días por la mañana");
    }
        
    if ((hora >= 13) && (hora <= 20)) {
      System.out.println("Buenas tardes");
    }
      
    if ((hora >= 21) && (hora < 24)) {
      System.out.println("Buenas noches");
    }
    if ((hora >= 0) && (hora <= 5)) {
      System.out.println("Es de madrugada");
    }
      
    if ((hora >= 24) || (hora < 0)) {
      System.out.println("No es posible procesar esa información.");
    }
  }
}
