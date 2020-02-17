package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String pass = "abc";

		String userPass = "";

		int intentos = 3;

		int contador = 0;

		System.out.println("\n");

		do {
			System.out.println("Contraseña:");
			userPass = sc.nextLine();
			contador++;
		} while (!userPass.equals(pass) && contador < intentos);

		sc.close();

		if (userPass.equals(pass)) {
			System.out.println("Enhorabuena.");
		} else {
			System.out.println("Número de intentos superado.");
		}

	}

}
