package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String frase = "";
		String objetivo = "";

		System.out.println("\n");
		System.out.println("Introduce una frase:");
		frase = sc.nextLine();
		System.out.println("Texto a buscar:");
		objetivo = sc.nextLine();

		sc.close();

//		System.out.println("\"" + frase + "\"" + (frase.contains(objetivo) ? " contiene " : " no contiene ") + "\""
//				+ objetivo + "\"");

		System.out.println("\"" + frase + "\"" + (frase.indexOf(objetivo) != -1 ? " contiene " : " no contiene ") + "\""
				+ objetivo + "\"");

	}

}
