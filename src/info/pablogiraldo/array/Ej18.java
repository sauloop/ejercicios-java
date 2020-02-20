package info.pablogiraldo.array;

import java.util.Arrays;

public class Ej18 {

	public static void main(String[] args) {
		int[] numeros = new int[5];

		Arrays.fill(numeros, 3);

		int[] numerosCopia = Arrays.copyOf(numeros, 5);

		System.out.println(Arrays.toString(numerosCopia));

	}

}
