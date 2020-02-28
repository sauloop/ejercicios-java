package info.pablogiraldo.file;

import java.io.*;

public class FileTest {
	public static void main(String[] args) {
		try {
			FileWriter wr = new FileWriter("C:\\pruebas\\artest_b.txt");

		
			wr.write("Texto A.");
			wr.close();
			System.out.println("Texto escrito.");

		} catch (Exception e) {
			System.out.println("Error.");
			e.printStackTrace();
		}
	}
}