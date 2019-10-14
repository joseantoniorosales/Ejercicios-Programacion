public class Ejercicio17 { 
  public static void main(String[] args) {
    
    System.out.println("Este programa te mostrará si el numero introducido es primo o no");
    
    System.out.printf("Introduce un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    
    boolean primo = true;
    
    
    
    for(int i = 2; i < numero; i++)
    {
      if(numero % i == 0){
        primo = false;
        }
      }
      if(primo){
        System.out.println("El numero es primo");
        }else{
          System.out.println("El numero no es primo");}
  }
}
