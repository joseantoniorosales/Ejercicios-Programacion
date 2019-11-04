package ejercicio15t6;

public class Ejercicio15T6 {

    public static void main(String[] args) {
        
        //Descripcion
        
        System.out.println("Este programa generará aleatoriamente una melodia diciendo sus notas");
        
        //Variables e instrucciones
        
        int notas = 4 * (int)((Math.random() * 7) + 1);
        String nota = "";
        String nota1 = "";
        
        for(int contadorNota = 1; contadorNota <= notas; contadorNota++){
        
        switch((int)(Math.random() * 7)){
        
            case 1:
                nota = "Do";
            break;
            
            case 2:
                nota = "Re";
            break;
            
            case 3:
                nota = "Mi";
            break;
            
            case 4:
               nota = "Fa";
            break;
            
            case 5:
                nota = "Sol";
            break;
            
            case 6:
                nota = "La";
            break;
            
            case 7:
                nota = "Si";
            break;
            
            default:
        }
        
        if (contadorNota == 1) {
        nota1 = nota;
      }

      if (contadorNota == notas) {
        nota = nota1;
      }

      System.out.print(nota + " ");

      if ( contadorNota == notas ) {
        System.out.print("||");
      } else if ( contadorNota % 4 == 0 ) {
        System.out.print("| ");
      }
      
    }
        
        }
        
    }
    

