package info.pablogiraldo.practico;

import java.util.Scanner;

public class Ej1Practico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int INTENTOS = 3;

		String nombre = "";
		String userPass = "";

		boolean acceso = false;
		int contador = 0;

		System.out.println("Nombre:");
		nombre = sc.nextLine();

		while (!acceso && contador < INTENTOS) {
			System.out.println("Contraseña:");
			userPass = sc.nextLine();
			acceso = login(userPass);
			contador++;
		}
		sc.close();
		if (acceso) {
			System.out.println("\n");
			System.out.println("Hola " + nombre + ".\nHas conseguido entrar. Número de intentos: " + contador);
		} else {
			System.out.println("\n");
			System.out.println("Acceso denegado.");
		}
	}

	public static boolean login(String userPass) {
		final String PASS = "abc";

		if (userPass.equals(PASS)) {
			return true;
		}

		return false;
	}

}
