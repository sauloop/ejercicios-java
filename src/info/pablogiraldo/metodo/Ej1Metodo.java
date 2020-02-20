package info.pablogiraldo.metodo;

import java.util.Scanner;

import info.pablogiraldo.metodo.ConsoleColors;

public class Ej1Metodo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int op1, op2, resultado;

		String operacion;

		System.out.print("\n");

		System.out.print(ConsoleColors.GREEN + "Elige operación (suma/resta):" + ConsoleColors.RESET);

		System.out.print("\n");
		operacion = sc.nextLine();

		boolean opBool = opCheck(operacion);

		while (opBool == false) {

			System.out.print(ConsoleColors.RED + "Elige operación (suma/resta):" + ConsoleColors.RESET);

			System.out.print("\n");
			operacion = sc.nextLine();
			opBool = opCheck(operacion);

		}

		System.out.print(ConsoleColors.GREEN + "Introduce primer número:" + ConsoleColors.RESET);
		System.out.print("\n");
		op1 = sc.nextInt();

		System.out.print(ConsoleColors.GREEN + "Introduce segundo número:" + ConsoleColors.RESET);
		System.out.print("\n");
		op2 = sc.nextInt();

		sc.close();

		resultado = calcular(operacion, op1, op2);

		imprime("Resultado: ", resultado);

	}

	static boolean opCheck(String operacion) {
		boolean opBool = operacion.equals("suma") || operacion.equals("resta");

		return opBool;
	}

	static void imprime(String texto, int resultado) {
		System.out.println(texto + resultado);
	}

	static int calcular(String operacion, int numA, int numB) {

		int resultado = 0;

		if (operacion.equals("suma")) {
			resultado = suma(numA, numB);
		}

		else {
			resultado = resta(numA, numB);
		}

		return resultado;
	}

	static int suma(int a, int b) {

		return a + b;

	}

	static int resta(int a, int b) {

		return a - b;

	}

}
