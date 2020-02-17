package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;

		int div = 10;

		int cifras = 1;

		System.out.println("\n");
		System.out.println("Introduce un número:");
		num = sc.nextInt();

		while (num < 0) {
			System.out.println("Introduce un número entero positivo:");
			num = sc.nextInt();
		}

		sc.close();

		while (num / div >= 1) {
			cifras++;
			div *= 10;
		}

		System.out.println("El número de cifras de " + num + " es " + cifras + ".");

	}

}
