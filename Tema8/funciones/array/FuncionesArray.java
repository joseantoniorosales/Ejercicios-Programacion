package funciones.array;

import funciones.math.FuncionesMatematicas;

public class FuncionesArray {

   public static void pintaArray(int[] n) {
  
  for (int i : n) {
    
      System.out.print(i + " ");
      
    }
  }
 
  
  
  public static int[] convierteArrayEnNumero(long n) {
  
    
    int[] a = new int[digitos(n)];
    for(i = 0; i < digitos(n); i++) {
    
      a[i] = digitoN(n, i);
      
    }
  
  return a;
  }



}
