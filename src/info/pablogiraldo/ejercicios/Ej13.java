package info.pablogiraldo.ejercicios;

public class Ej13 {

	public static void main(String[] args) {

		String nombreAp = "fulano de tal".toUpperCase();

		String[] nombreSplit = nombreAp.split(" ");

		char inicial = ' ';

		for (String nomPart : nombreSplit) {
			inicial = nomPart.charAt(0);
			System.out.print(inicial + " ");
		}

	}

}
