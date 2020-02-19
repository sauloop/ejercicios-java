package info.pablogiraldo.array;

public class Ej14 {

	public static void main(String[] args) {
		int[] numeros = { 2, 4 };

		int[] cuadrados = new int[2];

		int[] cubos = new int[2];

		for (int i = 0; i < numeros.length; i++) {
			cuadrados[i] = (int) Math.pow(numeros[i], 2);
			cubos[i] = (int) Math.pow(numeros[i], 3);
		}

		for (int num : numeros) {
			System.out.print(num + " ");
		}

		System.out.print("   ");

		for (int num : cuadrados) {
			System.out.print(num + " ");
		}

		System.out.print("   ");
		for (int num : cubos) {
			System.out.print(num + " ");
		}

		System.out.println("\n");

	}

}
