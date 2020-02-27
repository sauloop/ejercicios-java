package info.pablogiraldo.metodo;

import java.util.Arrays;

public class Ej17Metodo {

	public static void main(String[] args) {
		String[] cadenas = { "ab", "abc", "a" };

		int longitudCadenaMayor = cuentaLongitudCadenas(cadenas);

		System.out.println(Arrays.toString(cadenas));

		System.out.println("La longitud de la mayor cadena es: " + longitudCadenaMayor);

	}

	public static int cuentaLongitudCadenas(String[] cadenas) {

		int longitudCadenaMayor = 0;

		for (String cadena : cadenas) {
			if (cadena.length() > longitudCadenaMayor)
				longitudCadenaMayor = cadena.length();
		}

		return longitudCadenaMayor;
	}

}
