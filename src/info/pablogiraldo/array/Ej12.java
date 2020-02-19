package info.pablogiraldo.array;

public class Ej12 {

	public static void main(String[] args) {
		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int[] numerosB = new int[10];

		for (int i = 0; i < numeros.length; i++) {
			if (i != numeros.length - 1) {
				numerosB[i + 1] = numeros[i];
			}

			numerosB[0] = numeros[i];
		}

		System.out.println("\n");
		for (int num : numeros) {
			System.out.print(num + " ");
		}

		System.out.println("\n");
		for (int num : numerosB) {
			System.out.print(num + " ");
		}

		System.out.println("\n");

	}

}
