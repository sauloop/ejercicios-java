package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String frase = "";
		String fraseCambiada = "";

		System.out.println("\n");
		System.out.println("Introduce una frase:");
		frase = sc.nextLine();

		sc.close();

		fraseCambiada = frase.replace('a', 'e');

		System.out.println(fraseCambiada);

	}

}
