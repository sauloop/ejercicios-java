package info.pablogiraldo.file;

public class JuegoPreguntasMain {

	public static void main(String[] args) {

		JuegoPreguntas juegoPreguntas = new JuegoPreguntas();

//		juegoPreguntas.cargarPreguntas();
//		juegoPreguntas.cargarPuntuaciones();

		juegoPreguntas.cargarDatos();

		juegoPreguntas.menu();

	}

}
