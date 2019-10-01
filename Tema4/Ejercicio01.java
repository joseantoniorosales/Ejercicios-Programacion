public class Ejercicio01 {
  public static void main(String[] args) {

    String dia;

    System.out.print("Introduzca el dia de la semana que quiera conocer la primera hora: ");
    dia = (System.console().readLine()); 
    dia.toLowerCase();
    
    switch(dia) {
      case "Lunes":
        System.out.printf("Programación");
        break;
        
      case "Martes":
        System.out.printf("Entornos de Desarrollo");
        break;
        
      case "Miércoles":
        System.out.println("Programación");
        break;
        
      case "Jueves":
        System.out.println("Programación");
        break;
        
      case "Viernes":
        System.out.println("Sistemas Informáticos");
        break;
        
      default:
        System.out.println("No has introducido un día o no es lectivo.");
    }
  }
}
