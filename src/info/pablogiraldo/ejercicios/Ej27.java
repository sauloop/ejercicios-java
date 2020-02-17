package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;

		System.out.println("\n");
		do {

			System.out.println("Introduce un número mayor o igual a 0:");
			num = sc.nextInt();
		} while (num < 0);

		sc.close();

		System.out.println(num);

	}

}
