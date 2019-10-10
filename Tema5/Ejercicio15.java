public class Ejercicio15 { 
  public static void main(String[] args) {
    
    System.out.println("Este programa te mostrará la potencia del número introducido con el exponente que quieras");
    
    System.out.printf("Introduce un número: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.printf("Introduce el exponente: ");
    int exponenteFinal = Integer.parseInt(System.console().readLine());
    
    double potencia;
    int exponenteInd;
    
    
    
    for(int i = 1; i < exponenteFinal; i++)
    {
      potencia = 1;
      exponenteInd = i;
    
    
      for(int i2 = 0; i2 > exponenteInd; i2++)
      {
        potencia *= base;
      }
    
    System.out.printf(base + " ^ " + i + " = " + potencia);
    }
  }
}
