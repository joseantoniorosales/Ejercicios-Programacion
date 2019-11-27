package ejercicio1t8;

public class Ejercicio1T8 {

  public static void main(String[] args) {

  }

  /**
   * Función que indica si un número es primo o no
   *
   * @param x número entero
   * @return verdadero o falso
   */
  public static boolean esPrimo(int x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * Función que indica el siguiente número primo al número introducido
   *
   * @param x número entero
   * @return número primo siguiente
   */
  public static int siguientePrimo(int x) {

    while (!esPrimo(++x)) {

    };

    return x;
  }

  /**
   * Función que indica la cantidad de digitos introducidos
   *
   * @param x número entero (long)
   * @return número negativo (si la cantidad es menor que 0),1 (si los números
   * son igual que 0) o la cantidad de números
   */
  public static int digitos(long x) {

    if (x < 0) {

      x = -x;
    }

    if (x == 0) {

      return 1;
    } else {

      int aux = 0;
      while (x > 0) {

        x = x / 10;
        aux++;

      }
      return aux;
    }
  }

  /**
   * Función que invierte los números introducidos
   *
   * @param x número entero (long)
   * @return número introducido invertido
   */
  public static long voltea(long x) {

    if (x < 0) {

      x = -x;
    }

    if (x == 0) {

      return 1;
    } else {

      long inverso = 0;

      while (x > 0) {

        inverso = (inverso * 10) + (x % 10);

        x = x / 10;

      }
      return inverso;
    }
  }

  /**
   * Función que muestra el número n de un número introducido previamente
   * 
   * @param x número entero (long)
   * @param aux número entero
   * @return número n del número
   */
  public static long digitoN(long x, int aux) {

    x = voltea(x);

    while (x < 0) {

      x = x / 10;
    }
    return (int) x % 10;
  }
}

