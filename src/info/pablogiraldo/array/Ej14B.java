package info.pablogiraldo.array;

public class Ej14B {

	public static void main(String[] args) {
		double randomDouble;
		int randomInt;

		int numElementos = 5;

		int[] numeros = new int[numElementos];

		int[] cuadrados = new int[numElementos];

		int[] cubos = new int[numElementos];

		for (int i = 0; i < numeros.length; i++) {
			randomDouble = Math.random();
			randomInt = (int) (randomDouble * 100 + 1);

			numeros[i] = randomInt;
		}

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
