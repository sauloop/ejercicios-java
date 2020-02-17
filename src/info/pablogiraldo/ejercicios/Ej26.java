package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;

		String[] nombresNum = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve" };

		do {
			System.out.println("\n");
			System.out.println("Introduce un número entre 1 y 9:");
			num = sc.nextInt();
		} while (num < 1 || num > 9);

		sc.close();

		System.out.println(nombresNum[num - 1]);

	}

}
