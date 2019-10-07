public class Ejercicio15 {

  public static void main(String[] args) {
        
    System.out.println("Este programa pintará una pirámide según lo indiques");
    System.out.print("Introduzca el carácter con el que desea rellenar la piramide: ");
    String interiorPiramide = System.console().readLine();
    System.out.println("Elija un tipo de pirámide: ");
    System.out.println("1.- Con el vértice hacia arriba");
    System.out.println("2.- Con el vértice hacia abajo");
    System.out.println("3.- Con el vértice hacia la izquierda");
    System.out.println("4.- Con el vértice hacia la derecha");
    int opcion = Integer.parseInt(System.console().readLine());

    switch(opcion) {
      case 1:
        System.out.println("  " + interiorPiramide);
        System.out.println(" " + interiorPiramide + interiorPiramide + interiorPiramide);
        System.out.println(interiorPiramide + interiorPiramide + interiorPiramide + interiorPiramide + interiorPiramide);
        break;
      
      case 2:
        System.out.println(interiorPiramide + interiorPiramide + interiorPiramide + interiorPiramide + interiorPiramide);
        System.out.println(" " + interiorPiramide + interiorPiramide + interiorPiramide);
        System.out.println("  " + interiorPiramide);
        break;
      
      case 3:
        System.out.println("    " + interiorPiramide);
        System.out.println("  " + interiorPiramide + " " + interiorPiramide);
        System.out.println(interiorPiramide + " " + interiorPiramide + " " + interiorPiramide);
        System.out.println("  " + interiorPiramide + " " + interiorPiramide);
        System.out.println("    " + interiorPiramide);
        break;
      
      case 4:
        System.out.println(interiorPiramide);
        System.out.println(interiorPiramide + " " + interiorPiramide);
        System.out.println(interiorPiramide + " " + interiorPiramide + " " + interiorPiramide);
        System.out.println(interiorPiramide + " " + interiorPiramide);
        System.out.println(interiorPiramide);
        break;
      
      default:
    }
    System.out.printf("Introduzca una de las opciones indicadas para poder procesar la información");
  }
}
