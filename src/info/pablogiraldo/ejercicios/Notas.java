package info.pablogiraldo.ejercicios;

public class Notas {

	public static void main(String[] args) {

		int[] notas = { 0, 10 };

		int notaMedia = 0;

		int sumaNotas = 0;

		for (int i = 0; i < notas.length; i++) {
			sumaNotas += notas[i];
		}

		notaMedia = sumaNotas / notas.length;

		System.out.println("La nota media es: " + notaMedia);

	}

}
