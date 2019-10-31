
package ejercicio11t11;


public class Ejercicio11T6 {


    public static void main(String[] args) {
        
        //Definicion del ejercicio
        
        System.out.println("Este programa dira al azar 20 notas. Al final contara el numero de cada tipo");
        
        //Definicion de variables
        
        int suspenso = 0;
        int suficiente = 0;
        int bien = 0;
        int notable = 0;
        int sobresaliente = 0;
        int nota;
        
        
        //Procesos
        
        //Funcion aleatoria
        
        for(int i = 1; i < 20; i++){
        
            nota = (int)((Math.random() * 5) + 1);
            
        //Switch
        switch (nota){
            case 1:
                System.out.println("suspenso");
                suspenso++;
            break;
            
            case 2:
                System.out.println("suficiente");
                suficiente++;
            break;
            
            case 3:
                System.out.println("bien");
                bien++;
            break;
          
            case 4:
                System.out.println("notable");
                notable++;
            break;
            
            case 5:
                System.out.println("sobresaliente");
                sobresaliente++;
            break;
            default:

        }

        }
        
        //Mostrar datos
        System.out.println(" ");
        System.out.println("suspensos: " + suspenso);
        System.out.println("suficientes: " + suficiente);
        System.out.println("bien: " + bien);
        System.out.println("notables: " + notable);
        System.out.println("sobresaliente: " + sobresaliente);
        
        
        
        }
    }
    

