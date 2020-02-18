package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class JuegoPreguntas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numPreguntas = 0;

		int aciertos = 0;

		String[] preguntas = { "¿Color caballo blanco?", "¿Color caballo rosa?", "¿Color caballo azul?" };

		numPreguntas = preguntas.length;

		String[] respuestas = { "blanco", "rosa", "azul" };

		String respuesta = "";

		System.out.println("\n");

		for (int i = 0; i < numPreguntas; i++) {
			System.out.println(preguntas[i]);
			respuesta = sc.nextLine().toLowerCase();

			if (respuesta.equals(respuestas[i])) {
				aciertos++;
			}

		}

		sc.close();

		System.out.println("Número aciertos: " + aciertos);

	}

}
