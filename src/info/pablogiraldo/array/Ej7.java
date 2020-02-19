package info.pablogiraldo.array;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int posicion = 0;

		String[] nombres = { "Fulano", "Mengano", "Zutano", "Perengano", "OtroFulano" };

		int[] edades = { 10, 12, 15, 11, 14 };

		System.out.print("\n");
		System.out.println("1.Par");
		System.out.println("2.Impar");
		System.out.println("Posición:");
		posicion = sc.nextInt();

		sc.close();

		System.out.print("\n");

		System.out.println("Array:");
		for (String nombre : nombres) {
			System.out.print(nombre + " ");
		}

		System.out.print("\n\n");

		if (posicion == 1) {
			System.out.println("Alumnos en posiciones pares:");
		} else {
			System.out.println("Alumnos en posiciones impares:");
		}

		for (int i = 0; i < nombres.length; i++) {

			if (posicion == 1) {
				if ((i + 1) % 2 == 0) {
					System.out.println(nombres[i] + " tiene " + edades[i] + " años.");
				}
			} else {
				if ((i + 1) % 2 != 0) {
					System.out.println(nombres[i] + " tiene " + edades[i] + " años.");
				}
			}

		}

		System.out.print("\n");

	}

}
