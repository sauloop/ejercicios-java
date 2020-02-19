package info.pablogiraldo.array;

public class Ej10 {

	public static void main(String[] args) {
		int[] numeros = { 7, 5, 3, 5 };

		System.out.println("\n");

		System.out.println("Array:");
		for (int num : numeros) {
			System.out.print(num + " ");
		}

		System.out.println("\n");

		System.out.println("Primer número: " + numeros[0]);
		System.out.println("Último número: " + numeros[numeros.length - 1]);

		System.out.println("\n");
	}

}
