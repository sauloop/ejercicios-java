package info.pablogiraldo.metodo;

import java.util.Scanner;

public class Ej18Metodo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int base = 0;
		int exponente = 0;

		boolean resultado = false;

		System.out.println("Introduce base:");
		base = sc.nextInt();
		System.out.println("Introduce exponente:");
		exponente = sc.nextInt();

		sc.close();

		resultado = potenciaEsMayorDe10(base, exponente);

		if (resultado) {
			System.out.println("La potencia de " + base + " elevado a " + exponente + " es mayor a 10.");
		}

		else {
			System.out.println("La potencia de " + base + " elevado a " + exponente + " es menor a 10.");
		}

	}

	public static boolean potenciaEsMayorDe10(int base, int exponente) {

		double resultado = Math.pow(base, exponente);

		if (resultado > 10) {
			return true;
		} else {
			return false;
		}

	}

}
