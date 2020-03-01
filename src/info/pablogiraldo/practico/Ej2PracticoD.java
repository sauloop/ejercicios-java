package info.pablogiraldo.practico;

public class Ej2PracticoD {

	// Ajuste cadenas D

	public static void main(String[] args) {

		String[][] cadenas = { { "Fulano De Tal", "29", "hola" }, { "Mengano", "107", "hola" },
				{ "Zutano", "37", "hola" } };

		System.out.println(ajuste(cadenas));

	}

	public static String ajuste(String[][] cadenas) {

		String cadenaAjustada = "";
		int numEspacios;

		System.out.println();

		for (int i = 0; i < cadenas.length; i++) {

			for (int j = 0; j < cadenas[i].length; j++) {
				numEspacios = 20;

				if (cadenas[i][j].length() > 10) {
					numEspacios = numEspacios - (cadenas[i][j].length() - numEspacios);
				}

				else if (cadenas[i][j].length() < 10) {
					numEspacios = numEspacios + (numEspacios - cadenas[i][j].length());
				}
				cadenaAjustada += cadenas[i][j];
				for (int n = 0; n < numEspacios; n++) {
					cadenaAjustada += " ";
				}
			}
			cadenaAjustada += "\n";
		}

		return cadenaAjustada;
	}

}
