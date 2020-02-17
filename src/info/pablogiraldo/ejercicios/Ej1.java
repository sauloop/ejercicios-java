package info.pablogiraldo.ejercicios;

public class Ej1 {

	public static void main(String[] args) {
		int numA = 10;
		int numB = 4;

		int suma = suma(numA, numB);
		int resta = resta(numA, numB);

		imprime("Suma: ", suma);
		imprime("Resta: ", resta);

	}

	static void imprime(String texto, int num) {
		System.out.println(texto + num);
	}

	static int suma(int a, int b) {

		return a + b;

	}

	static int resta(int a, int b) {

		return a - b;

	}

	static int calcular(String operacion, int numA, int numB) {

		int resultado = 0;

		if (operacion == "suma") {
			resultado = suma(numA, numB);
		}

		else if (operacion == "resta") {
			resultado = resta(numA, numB);
		}

		return resultado;
	}

}
