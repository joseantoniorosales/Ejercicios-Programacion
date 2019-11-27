package ejercicio15t8;

public class Ejercicio15T8 {

  public static void main(String[] args) {

    int n;
    
    for (n = 1; n <= 1000; n++) {
      
      if(esPrimo(n)){
      
        System.out.println(n +" ");
      
      }
      
    }
  }

  //funciones
   /**
   * Devuelve verdadero si el número que se pasa como parámetro es primo y falso
   * en caso contrario.
   * <p>
   * Un número primo es un número natural mayor que 1 y divisible únicamente
   * entre el mismo y entre 1.
   *
   * @param x número del que se quiere saber si es primo
   * @return verdadero si el número que se pasa como parámetro es primo y falso
   * en caso contrario
   */
  public static boolean esPrimo(long n) {
    if (n < 2) {
      return false;
    } else {
      for (long i = n / 2; i >= 2; i--) {
        if (n % i == 0) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * Devuelve verdadero si el número que se pasa como parámetro es primo y falso
   * en caso contrario.
   * <p>
   * Un número primo es un número natural mayor que 1 y divisible únicamente
   * entre el mismo y entre 1.
   *
   * @param x número del que se quiere saber si es primo
   * @return verdadero si el número que se pasa como parámetro es primo y falso
   * en caso contrario
   */
  public static boolean esPrimo(int n) {
    return esPrimo((long) n);
  }

  /**
   * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
   *
   * @param x un número entero
   * @return el menor primo que es mayor al número que se pasa como parámetro
   */
  public static int siguientePrimo(int x) {
    while (!esPrimo(++x)) {
    };

    return x;
  }

}
