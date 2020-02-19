package info.pablogiraldo.array;

public class Ej9 {

	public static void main(String[] args) {
		int[] numeros = { 70, 1000, 1, 40 };

		int mayor = numeros[0];

		int menor = numeros[0];

		int numCerosMayor = 0;
		int numCerosMenor = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > mayor) {
				mayor = numeros[i];
			}

			if (numeros[i] < menor) {
				menor = numeros[i];
			}
		}

		if (mayor % 10 == 0) {
			numCerosMayor = numCeros(mayor);
		}

		if (menor % 10 == 0) {
			numCerosMenor = numCeros(menor);
		}

		System.out.println("\n");

		System.out.println("Array:");
		for (int num : numeros) {
			System.out.print(num + " ");
		}

		System.out.println("\n");

		System.out.println("Mayor: " + mayor + ((numCerosMayor != 0) ? "   Número ceros: " + numCerosMayor : ""));
		System.out.println("Menor: " + menor + ((numCerosMenor != 0) ? "   Número ceros: " + numCerosMenor : ""));

		System.out.println("\n");
	}

	public static int numCeros(int num) {
		int div = 10;
		int ceros = 0;
		while (num / div >= 1) {
			ceros++;
			div *= 10;
		}

		return ceros;
	}

}
