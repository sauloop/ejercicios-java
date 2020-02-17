package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("Introduce un número:");
		num = sc.nextInt();
		sc.close();
		System.out.println("\n");
		System.out.println("El doble es: " + num * 2);
		System.out.println("El triple es: " + num * 3);

	}

}
