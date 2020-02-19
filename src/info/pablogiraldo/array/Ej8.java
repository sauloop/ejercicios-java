package info.pablogiraldo.array;

public class Ej8 {

	public static void main(String[] args) {
		int[] numeros = { -5, -10, 5, 10 };

		int sumaPositivos = 0;
		int sumaNegativos = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] >= 0) {
				sumaPositivos += numeros[i];
			} else {
				sumaNegativos += numeros[i];
			}
		}

		System.out.println("\n");

		System.out.println("Array:");
		for (int num : numeros) {
			System.out.print(num + " ");
		}

		System.out.println("\n");

		System.out.println("Suma positivos: " + sumaPositivos + "   Suma negativos: " + sumaNegativos);

		System.out.println("\n");
	}

}
