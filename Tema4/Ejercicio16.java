public class Ejercicio16 {

  public static void main(String[] args) {
    
    String respuesta;
    int puntos = 0;
    
    System.out.println("TEST DE FIDELIDAD: PROBABILIDAD DE QUE TU PAREJA TE SEA INFIEL");

    System.out.print("1.- Tu pareja parece estar más nerviosa de lo común en una situación común.(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if (respuesta.equals("v")) {
      puntos += 3;
    }

    System.out.print("2.- Ha comenzado a comprar ropa cara y bonita compulsivamente.(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("3.- Ha perdido el interés que mostraba anteriormente por ti de forma repentina.(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }

    System.out.print("4.- Ha aumentado el nivel de higiene (afeitado, peinados extravagantes y bonitos) de forma brusca.(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("5.- No te deja que mires su teléfono móvil.(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("6.- A veces tiene llamadas que dice no querer contestar cuando estás tú delante.(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
        
    System.out.print("7.- Últimamente se preocupa más en cuidar la línea.(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("8.- Muchos días llega bastante tarde después de trabajar porque dice tener mucho más trabajo.(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("9.- Has notado que últimamente se perfuma más.(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("10.- Se confunde y te dice que ha estado en sitios donde no ha ido contigo.(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
  
  
    
    if ( puntos <= 10 ) {
      System.out.print("No te preocupes, tu pareja no te engaña");
    }
    
    if ( (puntos > 11 ) && (puntos <= 22) ) {
      System.out.print("Lo mismo tu pareja esta pensando en otra persona, aunque no parece que te engañe aun. Intenta ser mejor pareja y verás como se arregla");    
    }
    
    if ( puntos >= 22 ) {
      System.out.print("ALERTA! ALERTA! PROBABLE INFIDELIDAD DETECTADA! Se recomienda investigar la situación");
    }
  }
}
