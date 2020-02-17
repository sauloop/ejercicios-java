package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inicioRango = 0;
		int finalRango = 0;
		int div = 0;

		System.out.println("\n");
		System.out.println("Inicio rango:");
		inicioRango = sc.nextInt();

		System.out.println("Final rango:");
		finalRango = sc.nextInt();

		System.out.println("Mostrar números divisibles por:");
		div = sc.nextInt();
		System.out.println("\n");

		sc.close();

		for (int num = inicioRango; num <= finalRango; num++) {
			if (num % div == 0) {
				System.out.print(num + " ");
			}
		}

	}

}
