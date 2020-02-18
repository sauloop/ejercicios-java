package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class JuegoPreguntasMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numPreguntas = 0;

		int aciertos = 0;

		String[] preguntas = { "¿Color caballo blanco?", "¿Color caballo rosa?" };

		numPreguntas = preguntas.length;

		String[][] opciones = { { "1.blanco", "2.rosa", "3.azul" }, { "1.rosa", "2.verde", "3.blanco" } };

		int[] respuestas = { 1, 1 };

		int respuesta = 0;

		System.out.println("\n");

		for (int i = 0; i < numPreguntas; i++) {

			System.out.println(preguntas[i]);

			for (int j = 0; j < opciones[0].length; j++) {
				System.out.println(opciones[i][j]);
			}

			do {

				System.out.println("Respuesta:");
				respuesta = sc.nextInt();

			} while (!(respuesta > 0 && respuesta < opciones[0].length));

			if (respuesta == respuestas[i]) {
				aciertos++;
			}
		}

		sc.close();

		System.out.println("Número aciertos: " + aciertos);

	}

}
