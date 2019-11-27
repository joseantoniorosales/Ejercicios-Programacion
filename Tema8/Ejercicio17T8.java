package Ejercicio17T8;

import funciones.math.FuncionesMatematicas;
import java.util.Scanner;

public class Ejercicio17T8 {
  public static void main(String[] args) {

   Scanner s = new Scanner (System.in);
   long decimal = 0;
    
    System.out.print("Introduzca un número binario: ");
    long binario = Long.parseLong(s.nextLine());
    
    int bits = FuncionesMatematicas.digitos(binario);
    
    for(int i = 0; i < bits; i++) {
      decimal += FuncionesMatematicas.digitoN(binario, bits - i - 1) * FuncionesMatematicas.potencia(2, i);
    }
    
    System.out.println(binario + " en binario es " + decimal + " en decimal.");
  
  }
  
}

