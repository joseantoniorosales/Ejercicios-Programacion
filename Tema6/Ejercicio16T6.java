package ejercicio16t6;

public class Ejercicio16T6 {

    public static void main(String[] args) {
        
        //Descripcion
        
        System.out.println("Este programa simulara una maquina tragaperras simplificada");
        
        //Variables e instrucciones
        
        int dibujo;
        int dibujo1 = 0;
        int dibujo2 = 0;
        int dibujo3 = 0;
        
        
        //Procesos
        
        
        for(int i = 0; i < 3; i++){
            dibujo = ((int)(Math.random() * 5) + 1);
            
            
            switch(dibujo){
            
                case 1:
                    System.out.println("Lemon");
                break;
                
                case 2:
                    System.out.println("Diamond");
                break;
                
                case 3:
                    System.out.println("horseshoe");
                break;
                
                case 4:
                    System.out.println("Heart");
                break;
                
                case 5:
                    System.out.println("Bell");
                break;
                
                default:
            }
            switch(i){
            
                case 1:
                    dibujo1 = dibujo;
                break;
                
                case 2:
                    dibujo2 = dibujo;
                break;
                
                case 3:
                    dibujo3 = dibujo;
                break;
                
                default:
                    
            
            }
        }
        
        if(dibujo1 == dibujo2 && dibujo2 == dibujo3 && dibujo1 == dibujo3){
        
            System.out.println(dibujo1 + " " + dibujo2 + " " + dibujo3);
            
            System.out.println("YOU WON! Claim your reward");
        
        }else if(dibujo1 == dibujo2 && dibujo2 != dibujo3 && dibujo1 != dibujo3){
        
            System.out.println("2 figures match, proceeding to give back your money");
        
        }else if(dibujo1 == dibujo2 && dibujo2 != dibujo3 && dibujo1 == dibujo3){
            
            System.out.println("2 figures match, proceeding to give back your money");

        }else if(dibujo1 != dibujo2 && dibujo2 != dibujo3 && dibujo1 == dibujo3){
       
            System.out.println("2 figures match, proceeding to give back your money");

        
        }else if(dibujo1 != dibujo2 && dibujo2 != dibujo3){
    
            System.out.println("You lost");
    }
        
        
    }
}

