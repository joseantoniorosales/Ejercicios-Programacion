
package Ejercicio16T8;

import funciones.math.FuncionesMatematicas;

public class Ejercicio16T8 {
  public static void main(String[] args){
  
    for(int i = 1; i < 1000000; i++) {
    
      if(FuncionesMatematicas.esCapicua(i)) {
      
        System.out.println(i + "");
      }
    
    }
  
  }

}
