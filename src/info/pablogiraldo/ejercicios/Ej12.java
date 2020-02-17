package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numUsr = 0;

		int contador = 0;

		System.out.println("\n");
		System.out.println("Introduce un número:\n");
		numUsr = sc.nextInt();

		sc.close();

		for (int num = 0; num <= numUsr; num++) {
			if (num % 2 != 0) {
				System.out.print(num + " ");
				contador++;
			}
		}

		System.out.println("\n" + contador + " Números impares.");

	}

}
