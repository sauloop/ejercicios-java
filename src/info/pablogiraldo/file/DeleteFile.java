package info.pablogiraldo.file;

import java.io.*;

public class DeleteFile {
	public static void main(String[] args) {
		File myObj = new File("C:\\pruebas\\artest_b.txt");
		if (myObj.delete()) {
			System.out.println("Deleted the file: " + myObj.getName());
		} else {
			System.out.println("Failed to delete the file.");
		}
	}
}