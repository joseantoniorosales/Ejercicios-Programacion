public class Ejercicio13 { 
  public static void main(String[] args) {
    
    System.out.println("Este programa te mostrará una lista de 10 números y distinguirá si son positivos o negativos");
    
    int positivos = 0;
    int negativos = 0;
   
    
    for( int i = 0; i <= 10; i++){
     if(Integer.parseInt(System.console().readLine()) < 0){
      negativos++; 
      } else {
      positivos++;}
    }
      System.out.printf("Has introducido " + positivos + " números positivos y " + negativos + 
      " negativos");
  }
}
