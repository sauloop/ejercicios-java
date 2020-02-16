package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String frase = "";

		int espacios = 0;

		System.out.println("\n");
		System.out.println("Introduce una frase:");
		frase = sc.nextLine();

		sc.close();

		for (char c : frase.toCharArray()) {
			if (c == ' ') {
				espacios++;
			}
		}

		System.out.println("Espacios: " + espacios);

	}

}
