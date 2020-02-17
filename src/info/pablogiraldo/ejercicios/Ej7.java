package info.pablogiraldo.ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dia = "";

		String[] laborales = { "lunes", "martes", "miércoles", "jueves", "viernes" };
		String[] festivos = { "sábado", "domingo" };

//		boolean esLaboral = false;
//		boolean esFestivo = false;

		System.out.println("\n");
		System.out.println("Introduce un día de la semana:");

		dia = sc.nextLine().toLowerCase();

		sc.close();

//		esLaboral = Arrays.stream(laborales).anyMatch(dia::equals);
//		esFestivo = Arrays.stream(festivos).anyMatch(dia::equals);
//
//		while ((esLaboral || esFestivo) == false) {
//			System.out.println("Introduce un día de la semana:\n");
//			dia = sc.nextLine().toLowerCase();
//		}
//
//		if (esLaboral) {
//			System.out.println("Laboral.");
//
//		} else {
//			System.out.println("Festivo.");
//		}

		if (Arrays.stream(laborales).anyMatch(dia::equals)) {
			System.out.println("Laboral.");
		}

		else if (Arrays.stream(festivos).anyMatch(dia::equals)) {
			System.out.println("Festivo.");
		}

		else {
			System.out.println("Texto incorrecto.");
		}
	}

}
