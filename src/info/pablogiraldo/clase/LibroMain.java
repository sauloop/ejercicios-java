package info.pablogiraldo.clase;

public class LibroMain {

	public static void main(String[] args) {
		Libro lib1 = new Libro("Libro 1", "Fulano", 1, 0);
		Libro lib2 = new Libro("Libro 2", "Mengano", 2, 0);

		System.out.println("\n");
		System.out.println("Ejemplares libro 1: " + lib1.getNumEjemplares());
		System.out.println("Ejemplares libro 2: " + lib2.getNumEjemplares());

		System.out.println("\n");
		System.out.println("Libro 1 pr�stamo: " + lib1.prestamo());
		System.out.println("Libro 1 pr�stamo: " + lib1.prestamo());

		System.out.println("\n");
		System.out.println("Libro 2 pr�stamo: " + lib2.prestamo());
		System.out.println("Libro 2 pr�stamo: " + lib2.prestamo());
		System.out.println("Libro 2 pr�stamo: " + lib2.prestamo());

		System.out.println("\n");
		System.out.println("Libro 1 devoluci�n: " + lib1.devolucion());
		System.out.println("Libro 1 devoluci�n: " + lib1.devolucion());

		System.out.println("\n");
		System.out.println("Libro 2 devoluci�n: " + lib2.devolucion());
		System.out.println("Libro 2 devoluci�n: " + lib2.devolucion());
		System.out.println("Libro 2 devoluci�n: " + lib2.devolucion());
	}

}
