public class Ejercicio14 { 
  public static void main(String[] args) {
    
    System.out.println("Este programa te mostrará la potencia del número introducido con el exponente que quieras");
    
    System.out.printf("Introduce un número: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.printf("Introduce el exponente: ");
    int exponente = Integer.parseInt(System.console().readLine());
    
    double potencia = 1;
    
    if(exponente == 0)
    {
      potencia = 1;
    }
      
    if(exponente > 0)
    {
      for(int i = 0; i < exponente; i++)
      {
        potencia *= base;
      }
    }else if(exponente < 0)
      {
        for(int i = 0; i < -exponente; i++)
        {
          potencia *= base;
        }
      potencia = 1/base;
      }
      
    
    System.out.printf(base + " ^ " + exponente + " = " + potencia);
  }
}
