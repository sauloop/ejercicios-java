package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;

		int numInicial = 0;

		System.out.println("\n");
		System.out.println("Introduce una número:");
		num = sc.nextInt();

		numInicial = num;

		sc.close();

		while (num <= numInicial * 10) {
			System.out.print(num + " ");
			num += numInicial;
		}

	}

}
