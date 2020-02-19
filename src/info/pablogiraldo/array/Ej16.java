package info.pablogiraldo.array;

public class Ej16 {

	public static void main(String[] args) {
		int[] numsA = { 5, 4, 2, 3, 8, 9, 7, 5, 6 };
		int[] numsB = { 5, 1, 2, 2, 8, 6, 3, 2, 6 };

		int coincidencias = 0;

		int ultimoResultado = -1;

		for (int i = 0; i < numsA.length; i++) {
			if (numsA[i] == numsB[i]) {
				coincidencias++;
			}
		}

		int[] resultados = new int[coincidencias];

		for (int i = 0; i < numsA.length; i++) {
			if (numsA[i] == numsB[i]) {
				ultimoResultado++;
				resultados[ultimoResultado] = numsA[i] + numsB[i];

			}
		}

		System.out.println("\n");
		System.out.println("Array A:");
		for (int num : numsA) {
			System.out.print(num + " ");
		}

		System.out.println("\n");
		System.out.println("Array B:");
		for (int num : numsB) {
			System.out.print(num + " ");
		}

		System.out.println("\n");
		System.out.println("Resultados:");
		for (int num : resultados) {
			System.out.print(num + " ");
		}

		System.out.println("\n");
	}

}
