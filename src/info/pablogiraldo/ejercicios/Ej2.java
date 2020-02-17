package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.print("\n");

		System.out.print("Introduce un número:");

		System.out.print("\n");
		num = sc.nextInt();

		sc.close();

		if (num == 0) {
			System.out.println("Es cero.");
			System.exit(1);

		}

		boolean opBool = numCheck(num);

		if (opBool) {
			System.out.println("Par.");
		}

		else {
			System.out.println("Impar.");
		}
		System.exit(1);

	}

	static boolean numCheck(int num) {
		boolean opBool = (num % 2 == 0);

		return opBool;
	}

}
