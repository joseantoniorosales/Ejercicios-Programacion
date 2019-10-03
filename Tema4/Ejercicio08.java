public class Ejercicio08 {

  public static void main(String[] args) {

    System.out.println("Este programa calcula la media de tres notas.");
    
    System.out.print("Introduzca la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduzca la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());

    double media = (nota1 + nota2 + nota3) / 3;

    System.out.println("La media total es: " + media);
    
    
    if(media < 5){
      System.out.printf("Suspenso");
    } else if((media >= 5) && (media < 6)){
      System.out.printf("Suficiente");
    } else if((media >= 6) && (media < 7)){
      System.out.printf("Bien");
    } else if((media >= 7) && (media < 9)){
      System.out.println("Notable");
    } else if((media >= 9) && (media <= 10)){
      System.out.printf("Sobresaliente");
    } else{
  System.out.printf("No se ha obtenido un dato válido");
    }
  }
  
}
