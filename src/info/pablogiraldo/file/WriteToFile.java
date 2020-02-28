package info.pablogiraldo.file;

import java.io.*;

public class WriteToFile {

	public static void main(String[] args) {
		try {
			FileWriter myWriter = new FileWriter("C:\\pruebas\\artest.txt");
			myWriter.write("Texto de prueba.");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

}
