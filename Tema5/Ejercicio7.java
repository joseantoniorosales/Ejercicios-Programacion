public class Ejercicio7 { 
  public static void main(String[] args) {
    
    System.out.println("Este programa abrirá una caja fuerte con el código correcto. Tienes 4 oportunidades");
    
    int intentos = 4;
    int codigoIntroducido;
    boolean acierto = false;
    
    do{
      System.out.println("Introduzca el código de la caja: ");
      
      codigoIntroducido = Integer.parseInt(System.console().readLine());
      
      if(codigoIntroducido == 1234){
        acierto = true;
        }else {
          System.out.println("Código incorrecto");}
        }
          
          while(intentos > 0 && (!acierto));
          if(acierto){
            System.out.println("Ahora si has abierto la caja fuerte");
            } else{
              System.out.println("ALERTA INTRUSO! ALERTA INTRUSO! AGOTADOS INTENTOS!");}
    }
  }

