package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String frase = "";

		System.out.println("\n");
		System.out.println("Introduce una frase:");
		frase = sc.nextLine();

		sc.close();

		frase = frase.replaceAll("\\s+", "");

		System.out.println(frase);

	}

}
