package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numA = 0;
		int numB = 0;

		int numAleatorio = 0;

		System.out.println("\n");
		System.out.println("Primer n�mero:");
		numA = sc.nextInt();

		System.out.println("Segundo n�mero:");
		numB = sc.nextInt();

		do {
			numAleatorio = (int) (Math.random() * 10);
		} while (!(numAleatorio > numA && numAleatorio < numB));

		sc.close();

		System.out.println(numAleatorio);

	}

}
