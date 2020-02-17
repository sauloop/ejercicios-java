package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String frase = "";

		String fraseCambiada = "";

		char ch = ' ';

		System.out.println("\n");
		System.out.println("Introduce una frase:");
		frase = sc.nextLine();

		sc.close();

//		frase = frase.replace('a', 'e');
//
//		System.out.println(frase);

		for (int i = 0; i < frase.length(); i++) {
			ch = frase.charAt(i);

			if (ch == 'a') {
				ch = 'e';
			}

			fraseCambiada += ch;

		}

		System.out.println(fraseCambiada);

	}

}
