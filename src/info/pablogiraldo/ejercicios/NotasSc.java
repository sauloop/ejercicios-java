package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class NotasSc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] notas = new int[2];

		int notaMedia = 0;

		int sumaNotas = 0;

		System.out.println("\n");
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
