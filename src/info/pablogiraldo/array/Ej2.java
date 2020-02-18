package info.pablogiraldo.array;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numNotas = 0;

		int notaMedia = 0;

		int sumaNotas = 0;

		System.out.println("\n");

		System.out.println("Número de notas a calcular:");
		numNotas = sc.nextInt();
		int[] notas = new int[numNotas];

		for (int i = 0; i < notas.length; i++) {
			System.out.println("Nota" + (i + 1) + ":");
			notas[i] = sc.nextInt();

			sumaNotas += notas[i];
		}

		sc.close();

		notaMedia = sumaNotas / notas.length;

		System.out.println("La nota media es: " + notaMedia);

	}

}
