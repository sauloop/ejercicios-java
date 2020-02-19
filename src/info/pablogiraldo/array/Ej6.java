package info.pablogiraldo.array;

public class Ej6 {

	public static void main(String[] args) {
		String[] nombres = { "Fulano", "Mengano", "Zutano", "Perengano", "OtroFulano" };

		int[] edades = { 10, 12, 15, 11, 14 };

		System.out.print("\n");

		System.out.println("Array:");
		for (String nombre : nombres) {
			System.out.print(nombre + " ");
		}

		System.out.print("\n\n");
		System.out.println("Alumnos en posiciones pares:");

		for (int i = 0; i < nombres.length; i++) {
			if ((i + 1) % 2 == 0) {
				System.out.println(nombres[i] + " tiene " + edades[i] + " años.");
			}

		}

		System.out.print("\n");

	}

}
