package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		float precio;

		Scanner sc = new Scanner(System.in);

		System.out.println("\n");
		System.out.println("Introduce un precio:");
		precio = sc.nextFloat();

		sc.close();

		System.out.println("\n");
		System.out.println("El precio con IVA es: " + aplIva(precio));
	}

	public static float aplIva(float precio) {

		precio += precio * 21 / 100;

		return precio;
	}

}
