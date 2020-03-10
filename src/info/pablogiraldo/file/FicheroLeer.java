package info.pablogiraldo.file;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.IOException;

public class FicheroLeer {

	public static void main(String[] args) {
		System.out.println("Leyendo fichero...");

		try {
			FileReader fr = new FileReader("ficheros/salida.txt");
			BufferedReader br = new BufferedReader(fr);

			String linea = br.readLine();

			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			System.out.println("Ha habido problemas: " + e.getMessage());
		}

	}

}
