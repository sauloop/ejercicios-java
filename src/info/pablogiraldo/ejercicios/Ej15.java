package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String frase = "";

		int usrOp = 0;

		System.out.println("\n");
		System.out.println("Frase:");
		frase = sc.nextLine();

		System.out.println("Pasar a:\n1.mayúsculas\n2.minúsculas");
		usrOp = sc.nextInt();

		sc.close();

		if (usrOp == 1) {
			System.out.println(frase.toUpperCase());
		} else {
			System.out.println(frase.toLowerCase());
		}

	}

}
