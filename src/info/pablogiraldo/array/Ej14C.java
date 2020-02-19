package info.pablogiraldo.array;

// En pruebas

public class Ej14C {

	public static void main(String[] args) {
		double randomDouble;
		int randomInt;

		int[] numeros = new int[20];

		int[] cuadrados = new int[20];

		int[] cubos = new int[20];

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
