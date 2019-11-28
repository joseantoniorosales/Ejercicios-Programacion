package Ejercicio18T8;

import funciones.math.FuncionesMatematicas;
import java.util.Scanner;

public class Ejercicio18T8 {

  public static void main(String[] args) {
 
    Scanner s = new Scanner (System.in);
    
    System.out.print("Introduzca un número decimal para pasarlo a binario: ");
    int decimal = Integer.parseInt(s.nextLine());
    
    System.out.println(" ");
    
    System.out.println(decimal + " pasa a ser: " + decimalABinario(decimal) + " en binario.");
    
  }
  
  
  
  
  /**
   * Pasa un número decimal (en base 10) a binario (base 2).
   * 
   * @param decimal número entero en base 10
   * @return        número inicial pasado a binario
   */
  public static long decimalABinario(int decimal) {
  
    if (decimal == 0) {
      return 0;
    }
      
    long binario = 1;
    
    while (decimal > 1) {
      binario = FuncionesMatematicas.pegaPorDetras(binario, decimal % 2);
      decimal = decimal / 2;
    }
    binario = FuncionesMatematicas.pegaPorDetras(binario, 1);
    binario = FuncionesMatematicas.voltea(binario);
    binario = FuncionesMatematicas.quitaPorDetras(binario, 1);
    
    return binario;
  }
}


