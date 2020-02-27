package info.pablogiraldo.metodo;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej15Metodo {

//	– mayor numero introducido
//	– menor numero introducido
//	– suma de todos los números
//	– suma de los números positivos
//	– suma de los números negativos
//	– media de la suma de todos los números

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		while (num != -1) {
			System.out.println("Número (-1 para salir):");
			num = sc.nextInt();

			numeros.add(num);
		}

		sc.close();

		if (numeros.size() == 1) {
			System.out.println("\n");
			System.out.println("No has introducido números");
		}

		else {
			int[] mayorMenorNumeroIntroducido = mayorMenorNumeroIntroducido(numeros);
			int suma = suma(numeros);
			int sumaPositivos = sumaPositivos(numeros);
			int sumaNegativos = sumaNegativos(numeros);

			System.out.println("\n");
			System.out.println("Números introducidos:");
			for (int numOut : numeros) {
				if (numOut != -1) {
					System.out.print(numOut + " ");
				}
			}

			System.out.println("\n");
			System.out.println("Mayor número: " + mayorMenorNumeroIntroducido[0]);
			System.out.println("Menor número: " + mayorMenorNumeroIntroducido[1]);
			System.out.println("Suma: " + suma);
			System.out.println("Suma positivos: " + sumaPositivos);
			System.out.println("Suma negativos: " + sumaNegativos);
			System.out.println("Media: " + (suma / (numeros.size() - 1)));

		}

	}

	public static int[] mayorMenorNumeroIntroducido(ArrayList<Integer> numeros) {
		int mayorNum = numeros.get(0);
		int menorNum = numeros.get(0);

		for (int num : numeros) {

			if (num != -1) {
				if (num > mayorNum) {
					mayorNum = num;
				}

				if (num < menorNum) {
					menorNum = num;
				}
			}

		}

		int[] resultados = { mayorNum, menorNum };
		return resultados;
	}

	public static int suma(ArrayList<Integer> numeros) {

		int sumaNumeros = 0;

		for (int num : numeros) {

			if (num != -1) {
				sumaNumeros += num;
			}

		}

		return sumaNumeros;
	}

	public static int sumaPositivos(ArrayList<Integer> numeros) {

		int sumaNumeros = 0;

		for (int num : numeros) {

			if (num != -1 && num > 0) {
				sumaNumeros += num;
			}

		}

		return sumaNumeros;
	}

	public static int sumaNegativos(ArrayList<Integer> numeros) {

		int sumaNumeros = 0;

		for (int num : numeros) {

			if (num != -1 && num < 0) {
				sumaNumeros += num;
			}

		}

		return sumaNumeros;
	}

}
