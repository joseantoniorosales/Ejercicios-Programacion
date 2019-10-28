package ejercicio3t2;

public class Ejercicio3T2 {
    
    public static void main(String[] args) {
       
            System.out.println("Este programa te dira al azar una carta de la baraja de Españita");

            //procesos

            int palo = (int) (Math.random() * 4) + 1;

            int baraja = (int)((Math.random() * 6) + 2);

            int barajaEsp = (int)((Math.random() * 4) + 10);



            switch(baraja){

                case 2:
                    System.out.println("2");

                break;

                case 3:
                    System.out.println("3");

                break;

                case 4:
                    System.out.println("4");

                break;

                case 5:
                    System.out.println("5");
                break;

                case 6:
                    System.out.println("6");
                break;

                case 7:
                    System.out.println("7");
                break;

            }

            switch(palo){

                case 1:
                    System.out.println("Bastos");

                break;

                case 2:
                    System.out.println("Espadas");

                break;

                case 3:
                    System.out.println("Copas");

                break;

                case 4:
                    System.out.println("Oro");
                break;
                }
        }
    
    
}

 
