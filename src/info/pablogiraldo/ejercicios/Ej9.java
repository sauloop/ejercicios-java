package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {

//		Meses con 30 d�as: Abril, Junio, Septiembre y Noviembre.
//		Meses con 31 d�as: Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre.
//		Meses con 28 d�as: Febrero (Menos cuando es bisiesto que tiene 29 d�as).

		Scanner sc = new Scanner(System.in);

		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };

		int[] diasMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		int posMes;

		String mes = "";

		int numDias;

		System.out.println("\n");
		System.out.println("Introduce el n�mero de mes:");
		posMes = sc.nextInt();

		while (posMes < 1 || posMes > 12) {
			System.out.println("Introduce el n�mero de mes:");
			posMes = sc.nextInt();
		}

		sc.close();

		mes = meses[posMes - 1];
		numDias = diasMes[posMes - 1];

		System.out.println(mes + " tiene " + numDias + " d�as.");

	}

}
