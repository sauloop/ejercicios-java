package info.pablogiraldo.array;

public class Ej4 {

	public static void main(String[] args) {
		String[] nombres = { "Fulano", "Mengano", "Zutano", "Perengano", "OtroFulano" };

		int[] edades = { 10, 12, 15, 11, 14 };

		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i] + " tiene " + edades[i] + " años.");
		}

	}

}
