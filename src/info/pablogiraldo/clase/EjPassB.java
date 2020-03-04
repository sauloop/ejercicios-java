package info.pablogiraldo.clase;

import java.util.Scanner;

public class EjPassB {

	public static String nombreIn = "";
	public static String claveIn = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Usuario usr = new Usuario("", "");

		final int INTENTOS = 3;

		boolean acceso = false;
		int contador = 0;

		System.out.println("Registrar usuario:");
		System.out.println("Nombre:");
		nombreIn = sc.nextLine();

		System.out.println("Clave:");
		claveIn = sc.nextLine();

		System.out.println("\n");
		System.out.println("Entrar:");

		while (!acceso && contador < INTENTOS) {
			System.out.println("Nombre:");
			usr.setNombre(sc.nextLine());
			System.out.println("Clave:");
			usr.setClave(sc.nextLine());
			acceso = login(usr);
			contador++;
		}
		sc.close();
		if (acceso) {
			System.out.println("\n");
			System.out.println("Hola " + usr.getNombre() + ".\nHas conseguido entrar. Número de intentos: " + contador);
		} else {
			System.out.println("\n");
			System.out.println("Acceso denegado.");
		}
	}

	public static boolean login(Usuario usr) {

		boolean acceso = (usr.getNombre().equals(nombreIn)) && (usr.getClave().equals(claveIn));

		return acceso;
	}

}
