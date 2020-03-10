package info.pablogiraldo.file;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FicheroEscribir {

	public static void main(String[] args) {
		System.out.println("Escribiendo fichero...");

		try {
			FileWriter fw = new FileWriter("ficheros/salida.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("¿De qué color es el caballo blanco de Santiago?#negro#rojo#blanco#3\n");
			bw.write("linea 2\n");

			bw.close();
		} catch (Exception e) {
			System.out.println("Ha habido problemas: " + e.getMessage());
		}
	}

}