package info.pablogiraldo.practico;

public class Ej2PracticoB {

	// Ajuste cadenas B

	public static void main(String[] args) {

		final int numEspacios = 20;

		String[] cadenasA = { "ab", "10", "hola" };

		String[] cadenasB = { "abcdefg", "20", "hola" };

		System.out.println(ajuste(cadenasA, numEspacios));
		System.out.println(ajuste(cadenasB, numEspacios));

	}

	public static String ajuste(String[] cadenas, int numEspacios) {

		String cadenaAjustada = "";

//		int numEspacios = 10;

//		if (cadenas[0].length() < 10) {
//			numEspacios = numEspacios + (10 - cadenas[0].length());
//		}

//		else if (cadenas[0].length() < 10) {
//			numEspacios = numEspacios + (10 - cadenas[0].length());
//		}

		System.out.println();
		cadenaAjustada = String.format("%-" + numEspacios + "s", cadenas[0]);

		cadenaAjustada += String.format("%-" + numEspacios + "s", cadenas[1]);

		cadenaAjustada += cadenas[2];
		return cadenaAjustada;
	}

}
