package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String frase = "";

		String fraseInvertida = "";

		System.out.println("\n");
		System.out.println("Introduce una frase:");
		frase = sc.nextLine();

		sc.close();

		for (int i = frase.length() - 1; i >= 0; i--) {
			fraseInvertida += frase.charAt(i);
		}

		System.out.println("Frase invertida:\n" + fraseInvertida);

	}

}
