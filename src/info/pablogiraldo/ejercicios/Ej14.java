package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int f = 0;
		int resultadoC = 0;

		int c = 0;
		int resultadoF = 0;

		System.out.println("\n");
		System.out.println("Temperatura en grados Fahrenheit:");
		f = sc.nextInt();
		resultadoC = (int) ((f - 32) / 1.8);
		System.out.println(f + " grados Fahrenheit son " + resultadoC + " grados Celsius.");

		System.out.println("\n");
		System.out.println("Temperatura en grados Celsius:");
		c = sc.nextInt();

		sc.close();

		resultadoF = (int) ((c * 1.8) + 32);
		System.out.println(c + " grados Celsius son " + resultadoF + " grados Fahrenheit.");

	}

}
