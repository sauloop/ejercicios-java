package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int year;

//		year = 2020;
//
//		boolean esBis = year % 4 == 0 && year % 100 != 0;
//
//		System.out.println(esBis);

		System.out.println("\n");
		System.out.println("Introduce un año:");
		year = sc.nextInt();

		sc.close();

		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("Es bisiesto.");
		} else if (year % 400 == 0) {
			System.out.println("Es bisiesto.");
		} else {
			System.out.println("No es bisiesto.");
		}

	}

}
