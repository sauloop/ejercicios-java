package info.pablogiraldo.file;

import java.io.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ListFiles {

	public static void main(String[] args) {
		File f = new File("C:\\pruebas");

		Path path = Paths.get("C:\\pruebas");

		if (Files.exists(path)) {

			String[] arr = f.list();

			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);

				File f1 = new File("C:\\pruebas\\" + arr[i]);

				if (f1.isFile()) {
					System.out.print(" - archivo.\n");
				}

				else if (f1.isDirectory()) {
					System.out.print(" - directorio.\n");
				}

			}
			System.out.println("\nEntradas en el directorio: " + arr.length);
		} else {
			System.out.println("Directorio no encontrado.");
		}

	}

}
