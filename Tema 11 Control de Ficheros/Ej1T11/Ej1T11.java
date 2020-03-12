package ej1t11;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Ej1T11 {

	public static void main(String[] args) {

		try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
			
			for (int i = 0; i < 501; i++) {
				
				if(esPrimo(i)) {
					
					bw.write(i + "\n");
				}
				
			}
			
			bw.close();
			
			System.out.println("Primos guardados satisfactoriamente");
			
			
			
		} catch (FileNotFoundException fnf) {
			
			System.out.println("Archivo no encontrado");
			
		} catch (IOException ioe) {
			
			System.out.println("No se puede escribir en el archivo.");
		}
		
	}

	//Funciones
	
	public static boolean esPrimo(int x) {
		for (int i = 2; i < x; i++) {
			if ((x % i) == 0) {
				return false;
			}
		}
		return true;
	}

}
