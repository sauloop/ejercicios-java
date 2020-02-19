package info.pablogiraldo.array;

public class Ej11 {

	public static void main(String[] args) {
		int[] numeros = { 7, 5, 3, 5 };

		int resultado = 0;

		for (int i = 0; i < numeros.length; i++) {
			resultado += numeros[i];
		}

		System.out.println("\n");
		for (int num : numeros) {
			System.out.print(num + " ");
		}
		System.out.println("\n");
		System.out.println("Suma: " + resultado);
		if (resultado % 2 == 0) {
			System.out.println("Es par.");

		} else {
			System.out.println("Es impar.");
		}
		System.out.println("\n");

	}

}
