package funciones.math;

/**
 * Funciónes que realizan cálculos matemáticos
 */
public class FuncionesMatematicas {

  /**
   * Calcula la media de 3 números con decimales
   *
   * @param x1 Un número con decimales
   * @param x2 Un número con decimales
   * @param x3 Un número con decimales
   * @return Media x1, x2 y x3
   */
  public static double media(double x1, double x2, double x3) {

    return (x1 + x2 + x3) / 3;

  }

  /**
   * Calcula la media de 2 números con decimales
   *
   * @param x1 Número con decimales
   * @param x2 Número con decimales
   * @return Media x1 y x2
   */
  public static double media(double x1, double x2) {

    return (x1 + x2) / 2;
  }
  
  public static double media(double[] a) {

    double suma = 0;
    
    for (double d : a[]++) {
    
      suma += d;
    }
    return suma;
  }

  /**
   * Generá un numero aleatorio
   *
   * @param min número entero
   * @param max número entero
   * @return número aleatorio entre los valores introducidos
   */
  public static int aleatorio(int min, int max) {

    return (int) (Math.random() * (max - min + 1) + min);
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
   * Le da la vuelta a un número.
   *
   * @param x número al que se le quiere dar la vuelta
   * @return  número volteado (al revés)
   */
  public static int voltea(int x) {
    return (int)voltea((long)x);
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
  
  /**
  /* Devuelve el dígito que está en la posición n de un número entero. Se
   * empieza contando por el 0 y de izquierda a derecha.
   *
   * @param x número entero
   * @param n posición dentro del número
   * @return  dígito que está en la posición n del número
   *          empezando a contar por el 0 y de izquierda a derecha
   */
  public static int digitoN(int x, int n) {
    return (int) digitoN((long)x, n);
  }

  
  /**
   * Devuelve verdadero si el número que se pasa como parámetro es capicúa y
     falso en caso contrario.
   * 
   * Un número capicúa es el que se lee igual de izquierda a derecha que de
   * derecha a izquierda.
   * 
   * @param x número del que se quiere saber si es capicúa
   * @return  verdadero si el número que se pasa como parámetro es capicúa y
   *          falso en caso contrario
   */
  public static boolean esCapicua(long x) {
    return x == voltea(x);
  }

  /**
   * Devuelve verdadero si el número que se pasa como parámetro es capicúa y
   * falso en caso contrario.
   * 
   * Un número capicúa es el que se lee igual de izquierda a derecha que de
   * derecha a izquierda.
   *
   * @param x número del que se quiere saber si es capicúa
   * @return  verdadero si el número que se pasa como parámetro es capicúa y
   *          falso en caso contrario
   */
  public static boolean esCapicua(int x) {
    return esCapicua((long)x);
  }

  /**
   * Devuelve verdadero si el número que se pasa como parámetro es primo y falso
   * en caso contrario.
   * <p>
   * Un número primo es un número natural mayor que 1 y divisible únicamente
   * entre el mismo y entre 1.
   *
   * @param x número del que se quiere saber si es primo
   * @return  verdadero si el número que se pasa como parámetro es primo y falso
   *          en caso contrario
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
   * @return  verdadero si el número que se pasa como parámetro es primo y falso
   *          en caso contrario
   */
  public static boolean esPrimo(int n) {
    return esPrimo((long) n);
  }
  
  /**
   * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
   *
   * @param x un número entero
   * @return  el menor primo que es mayor al número que se pasa como parámetro
   */
  public static int siguientePrimo(int x) {
    while (!esPrimo(++x)) {};

    return x;
  }

  /**
   * Dada una base y un exponente, devuelve la potencia.
   *
   * @param base      base de la potencia
   * @param exponente exponente de la potencia
   * @return          número resultante de elevar la base a la potencia indicada
   */
  public static double potencia(int base, int exponente) {
    if (exponente == 0) {
      return 1;
    }

    if (exponente < 0) {
      return 1/potencia(base, -exponente);
    }

    int n = 1;

    for (int i = 0; i < Math.abs(exponente); i++) {
      n = n * base;
    }

    return n;
  }

  /**
   * Cuenta el número de dígitos de un número entero.
   *
   * @param x número al que se le quieren contar los dígitos
   * @return  número de dígitos que tiene el número que se pasa como parámetro
   */
  

  /**
   * Cuenta el número de dígitos de un número entero.
   *
   * @param x número al que se le quieren contar los dígitos
   * @return  número de dígitos que tiene el número que se pasa como parámetro
   */
  public static int digitos(int x) {
    return digitos((long)x);
  }


  
  /**
   * Da la posición de la primera ocurrencia de un dígito dentro de un número
   * entero. Si no se encuentra, devuelve -1.
   *
   * @param x número entero
   * @param d dígito a buscar dentro del número
   * @return  posición de la primera ocurrencia del dígito dentro del número o
   *          -1 si no se encuentra
   */
  public static int posicionDeDigito(long x, int d) {
    int i;

    for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {};

    if (i == digitos(x)) {
      return -1;
    } else {
      return i;
    }
  }

  /**
   * Da la posición de la primera ocurrencia de un dígito dentro de un número
   * entero. Si no se encuentra, devuelve -1.
   *
   * @param x número entero
   * @param d dígito a buscar dentro del número
   * @return  posición de la primera ocurrencia del dígito dentro del número o
   *          -1 si no se encuentra
   */
  public static int posicionDeDigito(int x, int d) {
    return posicionDeDigito((long)x, d);
  }

  /**
   * Le quita a un número dígitos por detrás (por la derecha). 
   *
   * @param x número entero
   * @param n número de dígitos que se le van a quitar
   * @return  número inicial con dígitos menos
   *          quitados de la derecha
   */
  public static long quitaPorDetras(long x, int n) {
    return x / (long)potencia(10, n);
  }

  /**
   * Le quita a un número dígitos por detrás (por la derecha). 
   *
   * @param x número entero
   * @param n número de dígitos que se le van a quitar
   * @return  número inicial con dígitos menos
   *          quitados de la derecha
   */
  public static int quitaPorDetras(int x, int n) {

    return (int)quitaPorDetras((long) x, n);
  }

  /**
   * Le quita a un número dígitos por delante (por la izquierda).                                                 *
   * @param x número entero
   * @param n número de dígitos que se le van a quitar
   * @return  número inicial con dígitos menos
   *          quitados de la izquierda
   */
  public static long quitaPorDelante(long x, int n) {
    x = pegaPorDetras(x, 1); // "cierra" el número por si acaso termina en 0
    x = voltea(quitaPorDetras(voltea(x), n));
    x = quitaPorDetras(x, 1);
    return x;
  }

  /**
   * Le quita a un número dígitos por delante (por la izquierda).                                                 *
   * @param x número entero
   * @param n número de dígitos que se le van a quitar
   * @return  número inicial con dígitos menos
   *          quitados de la izquierda
   */
  public static int quitaPorDelante(int x, int n) {
    return (int)quitaPorDelante((long)x, n);
  }

  /**
   * Añade un dígito a un número por detrás (por la derecha).
   *
   * @param x número entero
   * @param d dígito que se le va a pegar por la derecha
   * @return  número inicial con el dígito pegado
   *          por la derecha
   */
  public static long pegaPorDetras(long x, int d) {
    return juntaNumeros(x, d);
  }

  /**
   * Añade un dígito a un número por detrás (por la derecha).
   *
   * @param x número entero
   * @param d dígito que se le va a pegar por la derecha
   * @return  número inicial con el dígito pegado
   *          por la derecha
   */
  public static int pegaPorDetras(int x, int d) {
    return (int)pegaPorDetras((long)x, d);
  }

  /**
   * Añade un dígito a un número por delante (por la izquierda).
   *
   * @param x número entero
   * @param d dígito que se le va a pegar por la izquierda
   * @return  número inicial con el dígito pegado
   *          por la izquierda
   */
  public static long pegaPorDelante(long x, int d) {
    return juntaNumeros(d, x);
  }

  /**
   * Añade un dígito a un número por delante (por la izquierda).
   *
   * @param x número entero
   * @param d dígito que se le va a pegar por la izquierda
   * @return  número inicial con el dígito pegado
   *          por la izquierda
   */
  public static int pegaPorDelante(int x, int d) {
    return (int)pegaPorDelante((long)x, d);
  }

  /**
   * Toma como parámetros las posiciones inicial y final dentro de un número y
   * devuelve el trozo correspondiente.
   * 
   * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
   *
   * @param x      número entero
   * @param inicio posición inicial
   * @param fin    posición final
   * @return       trozo de número compuesto por todos los dígitos que van desde
   *               la posición inicial a la posición final incluyendo ambos
   */
  public static long trozoDeNumero(long x, int inicio, int fin) {
    int longitud = digitos(x);
    x = quitaPorDelante(x, inicio);
    x = quitaPorDetras(x, longitud - fin - 1);
    return x;
  }

  /**
   * Toma como parámetros las posiciones inicial y final dentro de un número y
   * devuelve el trozo correspondiente.
   * 
   * Las posiciones se cuentan de izquierda a derecha comenzando por el cero.
   *
   * @param x      número entero
   * @param inicio posición inicial
   * @param fin    posición final
   * @return       trozo de número compuesto por todos los dígitos que van desde
   *               la posición inicial a la posición final incluyendo ambos
   */
  public static int trozoDeNumero(int x, int inicio, int fin) {
    return (int)trozoDeNumero((long)x, inicio, fin);
  }

  /**
   * Pega dos números para formar uno solo.
   *
   * @param x trozo que se pegará por la izquierda
   * @param y trozo que se pegará por la derecha
   * @return  número compuesto de los trozos
   */
  public static long juntaNumeros(long x, long y) {
    return (long)(x * potencia(10, digitos(y))) + y;
  }

  /**
   * Pega dos números para formar uno solo.
   *
   * @param x trozo que se pegará por la izquierda
   * @param y trozo que se pegará por la derecha
   * @return  número compuesto de los trozos
   */
  public static int juntaNumeros(int x, int y) {
    return (int)(juntaNumeros((long)x, (long)y));
  }
}
