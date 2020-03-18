package ej4t11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Ej4T11 {

	public static void main(String[] args) {

		if (args.length != 1) {

			System.out.println("Uso del programa: Ej4T11 palabras.txt");
			System.exit(-1);
		}

		try {

			BufferedReader br = new BufferedReader(new FileReader("palabras.txt"));

			String linea = "";

			ArrayList<String> lista = new ArrayList<>();

			do {

				lista.add(linea);
				linea = br.readLine();
			} while (linea != null);

			br.close();

			Collections.sort(lista);
			BufferedWriter bw = new BufferedWriter(new FileWriter("palabras.txt" + "_sort.txt"));

			for (String string : lista) {

				bw.write(string + "\n");

			}

			bw.close();

		} catch (FileNotFoundException fnf) {

			System.out.println("No se encontro el fichero especificado");

		} catch (IOException ioe) {

			System.out.println("Error de lectura/escritura");

		}

	}

}
