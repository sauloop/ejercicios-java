package info.pablogiraldo.metodo;

import java.util.Arrays;
import java.util.Scanner;

public class Ej16Metodo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] vocales = { "a", "e", "i", "o", "u" };

		System.out.println("Introduce una frase:");
		String frase = sc.nextLine();
		sc.close();

		int[] resultados = numVocales(frase);

		System.out.println(Arrays.toString(resultados));

		for (int i = 0; i < vocales.length; i++) {
			System.out.println("Número " + vocales[i] + "'s:");
			System.out.println(resultados[i]);
		}

	}

	public static int[] numVocales(String frase) {
		String[] vocales = { "a", "e", "i", "o", "u" };

		int[] resultados = new int[5];

		for (int i = 0; i < vocales.length; i++) {
			int index = frase.indexOf(vocales[i]);
			resultados[i] = 0;
			while (index != -1) {
				if (frase.substring(index, index + vocales[i].length()).equals(vocales[i])) {
					frase = frase.substring(index + vocales[i].length());
					index = frase.indexOf(vocales[i]);
					resultados[i]++;
				}
			}

		}

		return resultados;

	}

}
