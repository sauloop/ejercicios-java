package info.pablogiraldo.array;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[10];

		for (int i = numeros.length - 1; i >= 0; i--) {

			System.out.println("Número:");
			numeros[i] = sc.nextInt();
		}
		sc.close();

		System.out.println("Array:");
		for (int num : numeros) {
			System.out.print(num + " ");
		}

	}

}
