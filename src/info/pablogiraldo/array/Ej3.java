package info.pablogiraldo.array;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {

//		RESTO	0	1	2	3	4	5	6	7	8	9	10	11	12	13	14	15	16	17	18	19	20	21	22
//		LETRA	T	R	W	A	G	M	Y	F	P	D	X	B	N	J	Z	S	Q	V	H	L	C	K	E

		Scanner sc = new Scanner(System.in);

		int numDni = 0;

		int resto = 0;

//		String todasLetras = "TRWAGMYFPDXBNJZSQVHLCKE";

		char[] todasLetrasB = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
				'V', 'H', 'L', 'C', 'K', 'E' };

		char letra = ' ';

		System.out.println("\n");
		System.out.println("Introduce número DNI sin letra:");
		numDni = sc.nextInt();

		sc.close();

		resto = numDni % 23;

		letra = todasLetrasB[resto];

		System.out.println("DNI completo:\n" + numDni + "-" + letra);

	}

}
