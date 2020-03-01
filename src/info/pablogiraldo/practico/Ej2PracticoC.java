package info.pablogiraldo.practico;

public class Ej2PracticoC {

	// Ajuste cadenas C

	public static void main(String[] args) {

		String[][] cadenas = { { "Fulano", "29", "hola" }, { "Mengano", "107", "hola" }, { "Zutano", "37", "hola" } };

		System.out.println(ajuste(cadenas));

	}

	public static String ajuste(String[][] cadenas) {

		String cadenaAjustada = "";
		int numEspacios = 20;

		System.out.println();

		for (int i = 0; i < cadenas.length; i++) {
			for (int j = 0; j < cadenas[i].length; j++) {
				cadenaAjustada += String.format("%-" + numEspacios + "s", cadenas[i][j]);
			}
			cadenaAjustada += "\n";
		}

		return cadenaAjustada;
	}

}
