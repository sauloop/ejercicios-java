package info.pablogiraldo.ejercicios;

import java.util.Scanner;

public class Ej30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numUsr = 0;

		int contador = 0;

		System.out.println("Introduce un n�mero:");
		numUsr = sc.nextInt();
		sc.close();

		while (contador < numUsr) {
			contador++;
		}

		System.out.println("N�mero de veces que se ha recorrido el bucle: " + contador);

	}

}
