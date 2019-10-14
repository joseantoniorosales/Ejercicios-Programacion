public class Ejercicio17 { 
  public static void main(String[] args) {
    
    System.out.println("Este programa te mostrará los 100 numeros siguientes al numero (entero y positivo) introducido");
    
    System.out.println("");
    int numero = 0;
    
    do{
      System.out.printf("Introduce un numero: ");
      numero = Integer.parseInt(System.console().readLine());
      
      if(numero < 0){
        System.out.printf("No es posible procesar esa informacion");
        }
      }
      while(numero < 0);
      
    int suma = 0;
    
    for(int i = numero; i < numero + 100; i++){
      suma += i;
   }
  
  System.out.println("Los 100 numeros siguientes a " + numero + " son: " + suma);
  
  }
}
