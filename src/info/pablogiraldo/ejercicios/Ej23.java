package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String frase = "";
		String objetivo = "";

		System.out.print("\n");
		System.out.print("Introduce una frase:\n");

		frase = sc.nextLine();
		String fraseConsola = frase;

		System.out.print("\n");

		System.out.print("Introduce una cadena a buscar:\n");
		objetivo = sc.nextLine();

		sc.close();

		int index = frase.indexOf(objetivo);
		int strAparece = 0;
		while (index != -1) {
			if (frase.substring(index, index + objetivo.length()).equals(objetivo)) {
				frase = frase.substring(index + objetivo.length());
				index = frase.indexOf(objetivo);
				strAparece++;
			}
		}

		System.out.print("\n");
		System.out
				.println("\"" + objetivo + "\" aparece " + strAparece + ((strAparece > 1) ? " veces en:" : " vez en:"));
		System.out.println(fraseConsola);
	}
}
