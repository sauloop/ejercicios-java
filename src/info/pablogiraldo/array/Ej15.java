package info.pablogiraldo.array;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] numAleatorios = new String[100];

		double randomDouble;
		int randomInt;

		int numActual = 0;

		int numNuevo = 0;

		for (int i = 0; i < numAleatorios.length; i++) {
			randomDouble = Math.random();
			randomInt = (int) (randomDouble * 20 + 1);

			numAleatorios[i] = String.valueOf(randomInt);
		}

		for (String num : numAleatorios) {
			System.out.print(num + " ");
		}

		System.out.println("\n");
		System.out.println("Número a cambiar:");
		numActual = sc.nextInt();

		System.out.println("\n");
		System.out.println("Cambiar por:");
		numNuevo = sc.nextInt();

		for (int i = 0; i < numAleatorios.length; i++) {
			if (numAleatorios[i].equals(String.valueOf(numActual))) {
				numAleatorios[i] = "\"" + String.valueOf(numNuevo) + "\"";
			}
		}
		System.out.println("\n");
		for (String num : numAleatorios) {
			System.out.print(num + " ");
		}
	}

}
