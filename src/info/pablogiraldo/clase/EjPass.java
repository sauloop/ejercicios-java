package info.pablogiraldo.clase;

import java.util.Scanner;

public class EjPass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Usuario usrRegistrado;
		Usuario usr = new Usuario("", "");

		final int INTENTOS = 3;

		String nombreIn = "";
		String claveIn = "";

		boolean acceso = false;
		int contador = 0;

		System.out.println("Registrar usuario:");
		System.out.println("Nombre:");
		nombreIn = sc.nextLine();

		System.out.println("Clave:");
		claveIn = sc.nextLine();

		usrRegistrado = new Usuario(nombreIn, claveIn);

		System.out.println("\n");
		System.out.println("Entrar:");

		while (!acceso && contador < INTENTOS) {
			System.out.println("Nombre:");
			usr.setNombre(sc.nextLine());
			System.out.println("Clave:");
			usr.setClave(sc.nextLine());
			acceso = login(usr, usrRegistrado);
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

	public static boolean login(Usuario usr, Usuario usrRegistrado) {

		boolean acceso = (usr.getNombre().equals(usrRegistrado.getNombre()))
				&& (usr.getClave().equals(usrRegistrado.getClave()));

		return acceso;
	}

}
