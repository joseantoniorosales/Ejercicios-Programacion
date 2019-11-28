package Ejercicio19T8;

import funciones.math.FuncionesMatematicas;
import static funciones.math.FuncionesMatematicas.digitoN;
import static funciones.math.FuncionesMatematicas.digitos;
import static funciones.math.FuncionesMatematicas.pegaPorDetras;
import static funciones.math.FuncionesMatematicas.quitaPorDetras;
import static funciones.math.FuncionesMatematicas.voltea;
import java.util.Scanner;

public class Ejercicio19T8 {

  public static void main(String[] args) {

    Scanner s = new Scanner (System.in);
    
    long numInt = 0;
    
    String resultado = "";
    
    System.out.println("Programa conversor Binario/Decimal/Octal/Hexadecimal");

    System.out.println(" ");
    
    //Pedir datos
    System.out.println(" 1) Binario -> Octal");
    System.out.println(" 2) Binario -> Decimal");
    System.out.println(" 3) Binario -> Hexadecimal");
    System.out.println(" 4) Octal -> Binario");
    System.out.println(" 5) Octal -> Decimal");
    System.out.println(" 6) Octal -> Hexadecimal");
    System.out.println(" 7) Decimal -> Binario");
    System.out.println(" 8) Decimal -> Octal");
    System.out.println(" 9) Decimal -> Hexadecimal");
    System.out.println("10) Hexadecimal -> Binario");
    System.out.println("11) Hexadecimal -> Octal");
    System.out.println("12) Hexadecimal -> Decimal");
    System.out.print("Elija una opción: ");
    int opcion = Integer.parseInt(s.nextLine());
    
    switch(opcion) {
    
      case 1:
        resultado = Long.toString(ConversorOctalABinario(numInt));
      break;
      
      case 2:
        resultado = Long.toString(ConvertirBinarioADecimal(numInt));
      break;
      
      case 3:
        resultado = ConversorBinarioAHexa(numInt);
      break;
      
      case 4:
        resultado = Long.toString(ConversorOctalABinario(numInt));
      break;
      
      case 5:
        resultado = Long.toString(ConversorOctalABinario(numInt));
      break;
      
      case 6:
        resultado = ConversorBinarioAHexa(ConversorOctalABinario(numInt));
        
      break;
      
      case 7:
        resultado = Long.toString((ConvertirDecimalABinario((int)(numInt))));
      break;
      
      case 8:
        resultado =
    
    
    
    
    }
    
    
  } //Main

  //Funciones
  
  public static long binarioAOctal(long binario) {
    long octal = 1;
  
    while (binario > 0) {
      octal = octal * 10 + (FuncionesMatematicas.ConvertirBinarioADecimal(binario % 1000));
      binario = binario / 1000;
    };
  
    octal = FuncionesMatematicas.pegaPorDetras(octal, 1);
    octal = FuncionesMatematicas.voltea(octal);
    octal = FuncionesMatematicas.quitaPorDetras(octal, 1);
    octal = FuncionesMatematicas.quitaPorDelante(octal, 1);
    
    return octal;
  }
  
  /**
   * Conversor de Octal (base 8) a Binario (base 2)
   *
   * @param x número en base 8
   * @return número convertido a binario
   */
  public static long ConversorOctalABinario(long x) {

    long binario = 0;

    for (int i = 0; i < FuncionesMatematicas.digitos(x); i++) {

      binario = binario * 1000 + FuncionesMatematicas.ConvertirDecimalABinario((int) FuncionesMatematicas.digitoN(x, i));

    }

    return binario;
  }

  /**
   * Conversor de Binario (base 2) a Hexadecimal (base 16)
   *
   * @param x número binario
   * @return número convertido a hexadecimal
   */
  public static String ConversorBinarioAHexa(long x) {

    String hexadecimal = "";
    String digitosHexa = "0123456789ABCDEF";
    long binario = 0;

    while (binario > 0) {
      hexadecimal = digitosHexa.charAt((int) FuncionesMatematicas.ConvertirBinarioADecimal(binario % 10000)) + hexadecimal;
      binario = binario / 10000;
    };

    return hexadecimal;
  }
  
  
/**
 * Conversor de hexadecimal (base 16) a Binario (base 2)
 * @param x Número Hexadecimal
 * @return Número convertido a binario
 */
  public static long ConversorHexaABinario(long x) {

    String digitosHexa = "0123456789ABCDEF";
    long binario = 0;
    String hexadecimal = "";

    for (int i = 0; i < hexadecimal.length(); i++) {
      binario = binario * 10000 + FuncionesMatematicas.ConvertirDecimalABinario(digitosHexa.indexOf(hexadecimal.charAt(i)));
    }

    return binario;
  }
  

  /**
   * Pasa un número decimal (en base 10) a binario (base 2).
   * 
   * @param decimal número decimal
   * @return        número inicial pasado a binario
   */
  public static long ConvertirDecimalABinario(int x) {
  
    if (x == 0) {
      return 0;
    }
      
    long binario = 1;
    
    while (x > 1) {
      binario = FuncionesMatematicas.pegaPorDetras(binario, x % 2);
      x = x / 2;
    }
    binario = pegaPorDetras(binario, 1);
    binario = voltea(binario);
    binario = quitaPorDetras(binario, 1);
    
    return binario;
  }
  
  public static long ConvertirBinarioADecimal(long x) {
  Scanner s = new Scanner (System.in);
   long decimal = 0;
    
    System.out.print("Introduzca un número binario: ");
    long binario = Long.parseLong(s.nextLine());
    
    int bits = digitos(binario);
    
    for(int i = 0; i < bits; i++) {
      decimal += digitoN(binario, bits - i - 1) * FuncionesMatematicas.potencia(2, i);
    }
    
    return binario;
  
  }
}
