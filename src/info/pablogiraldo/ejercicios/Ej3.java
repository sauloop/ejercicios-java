package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int numA;
		int numB;

		Scanner sc = new Scanner(System.in);

		System.out.println("\n");
		System.out.println("Primer número: ");
		numA = sc.nextInt();

		System.out.println("Segundo número: ");
		numB = sc.nextInt();

		sc.close();

		if (numA > numB) {
			System.out.println("Mayor.");
		}

		else if (numA - numB != 0) {
			System.out.println("Menor.");
		}

		else {
			System.out.println("Igual.");
		}

	}

}
