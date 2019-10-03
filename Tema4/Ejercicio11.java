public class Ejercicio11 {

  public static void main(String[] args) {

    System.out.println("Este programa te dirá cuanto falta para medianoche dependiendo de la hora");
    
    System.out.println("Deberás introducir primero una hora y después los minutos");
    
    System.out.print("Introduzca la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    
    System.out.print("Introduzca los minutos: ");
    int minuto = Integer.parseInt(System.console().readLine());
    
    int segundosHoraEstablecida = (hora * 3600) + (minuto * 60);
    
    int segundosMedianoche = (24 * 3600) - (segundosHoraEstablecida);
    
    
    
    System.out.println("Desde las " + hora + ":" + minuto + " " + "hasta media noche hay " + segundosHoraEstablecida + " " + "segundos" );
  }
}
