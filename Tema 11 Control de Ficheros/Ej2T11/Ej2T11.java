package ej2t11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ej2T11 {

	public static void main(String[] args) {

		try {

			BufferedReader br = new BufferedReader(new FileReader("primos.dat"));
			
			String linea = "";
			
			while (linea != null) {
				
				System.out.println(linea);
				linea = br.readLine();
			}

		} catch (FileNotFoundException fnf) {

			System.out.println("Archivo no encontrado.");

		} catch (IOException ioe) {

			System.out.println("El archivo no se puede leer.");
			
		} catch (Exception e) {
			
			System.out.println("Error.");
		}

	}

}
