package info.pablogiraldo.file;

import java.io.*;

public class DeleteFolder {
	public static void main(String[] args) {
		File myObj = new File("C:\\pruebas\\dirtest_b");
		if (myObj.delete()) {
			System.out.println("Deleted the folder: " + myObj.getName());
		} else {
			System.out.println("Failed to delete the folder.");
		}
	}
}
