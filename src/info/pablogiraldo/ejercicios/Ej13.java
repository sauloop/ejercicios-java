package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nombreAp = "";

//		String nombreAp = "fulano de tal".toUpperCase();
//
//		String[] nombreSplit = nombreAp.split(" ");

		char inicial = ' ';

		System.out.println("\n");
		System.out.println("Nombre y apellidos:");
		nombreAp = sc.nextLine().toUpperCase();

		sc.close();

		String[] nombreSplit = nombreAp.split(" ");

		for (String nomPart : nombreSplit) {
			inicial = nomPart.charAt(0);
			System.out.print(inicial + " ");
		}

	}

}
