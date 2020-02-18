package info.pablogiraldo.array;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numNombre = 0;

		String[] nombres = { "Fulano", "Mengano", "Zutano", "Perengano", "OtroFulano" };

		int[] edades = { 10, 12, 15, 11, 14 };

		for (int i = 0; i < nombres.length; i++) {
			System.out.println((i + 1) + "." + nombres[i]);
		}

		System.out.println("\n");
		System.out.println("Número nombre:");
		numNombre = sc.nextInt();

		sc.close();

		System.out.println(nombres[numNombre] + " tiene " + edades[numNombre] + " años.");

	}

}
