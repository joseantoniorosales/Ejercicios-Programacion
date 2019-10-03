public class Ejercicio10 {

  public static void main(String[] args) {

    System.out.println("Este programa te dirá tu horóscopo según tu nacimiento");
    
    String horoscopo = "";
    
    System.out.print("Introduzca el día que nació: ");
    int diaNacimiento = Integer.parseInt(System.console().readLine());
    
    
    System.out.print("Introduzca su mes de nacimiento (1-12): ");
    int mesNacimiento = Integer.parseInt(System.console().readLine());    
    
    switch(mesNacimiento) {
      
      case 1:
        if (diaNacimiento < 21) {
          horoscopo = "Capricornio";
        } else {
          horoscopo = "Acuario";
        }
        break;
      case 2:
        if (diaNacimiento < 20) {
          horoscopo = "Acuario";
        } else {
          horoscopo = "Piscis";
        }
        break;
      case 3:
        if (diaNacimiento < 21) {
          horoscopo = "Piscis";
        } else {
          horoscopo = "Aries";
        }
        break;
      case 4:
        if (diaNacimiento < 21) {
          horoscopo = "Aries";
        } else {
          horoscopo = "Tauro";
        }
        break;
      case 5:
        if (diaNacimiento < 20) {
          horoscopo = "Tauro";
        } else {
          horoscopo = "Géminis";
        }
        break;
      case 6:
        if (diaNacimiento < 22) {
          horoscopo = "Géminis";
        } else {
          horoscopo = "Cáncer";
        }
        break;
      case 7:
        if (diaNacimiento < 22) {
          horoscopo = "Cáncer";
        } else {
          horoscopo = "Leo";
        }
        break;
      case 8:
        if (diaNacimiento < 24) {
          horoscopo = "Leo";
        } else {
          horoscopo = "Virgo";
        }
        break;
      case 9:
        if (diaNacimiento < 23) {
          horoscopo = "Virgo";
        } else {
          horoscopo = "Libra";
        }
        break;
      case 10:
        if (diaNacimiento < 23) {
          horoscopo = "Libra";
        } else {
          horoscopo = "Escorpio";
        }
        break;
      case 11:
        if (diaNacimiento < 23) {
          horoscopo = "Escorpio";
        } else {
          horoscopo = "Sagitario";
        }
        break;
      case 12:
        if (diaNacimiento < 21) {
          horoscopo = "Sagitario";
        } else {
          horoscopo = "Capricornio";
        }
        break;
      default:
   
    }
  System.out.printf("Tu signo en el horóscopo es: " + horoscopo);
  }
}
