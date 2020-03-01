package info.pablogiraldo.practico;

public class Ej2Practico {

	// Ajuste cadenas

	public static void main(String[] args) {

		String[] cadenasA = { "ab", "10", "hola" };

		String[] cadenasB = { "abcdefg", "20", "hola" };

		System.out.println(ajuste(cadenasA));
		System.out.println(ajuste(cadenasB));

	}

	public static String ajuste(String[] cadenas) {

		String cadenaAjustada = "";
		int numEspacios = 20;

		System.out.println();

		for (int i = 0; i < cadenas.length; i++) {
			cadenaAjustada += String.format("%-" + numEspacios + "s", cadenas[i]);
		}

		return cadenaAjustada;
	}

}
