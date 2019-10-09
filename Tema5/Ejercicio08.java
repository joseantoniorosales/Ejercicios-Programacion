public class Ejercicio08 { 
  public static void main(String[] args) {
    
    System.out.printf("Introduce el número del cual deseas saber la tabla de multiplicar: ");
    int numeroTabla = Integer.parseInt(System.console().readLine());
    
    
    for(int tabla = 0; tabla <= 10; tabla++){
      System.out.println(numeroTabla + "x" + tabla + "=" + numeroTabla * tabla);
      }
    }
  }
