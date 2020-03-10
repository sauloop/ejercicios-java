package info.pablogiraldo.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class JuegoPreguntas {

	private int puntos;

	private String rutaDatosPreguntas;
	private String rutaDatosPuntuaciones;

	private ArrayList<Pregunta> preguntas;

	private ArrayList<Puntuacion> puntuaciones;

	private ArrayList<String> nombresJugadores;

	public JuegoPreguntas() {
		this.puntos = 0;
		this.rutaDatosPreguntas = "txt/preguntas.txt";
		this.rutaDatosPuntuaciones = "txt/puntuaciones.txt";
		this.preguntas = new ArrayList<Pregunta>();
		this.puntuaciones = new ArrayList<Puntuacion>();
		this.nombresJugadores = new ArrayList<String>();
	}

	public String getRutaDatosPreguntas() {
		return rutaDatosPreguntas;
	}

	public void setRutaDatosPreguntas(String rutaDatosPreguntas) {
		this.rutaDatosPreguntas = rutaDatosPreguntas;
	}

	public ArrayList<Pregunta> getPreguntas() {
		return preguntas;
	}

	public void setPreguntas(ArrayList<Pregunta> preguntas) {
		this.preguntas = preguntas;
	}

	public void cargarDatos() {
		this.cargarPreguntas();
		this.cargarPuntuaciones();
	}

	public void menu() {
		Scanner sc = new Scanner(System.in);

		String usrIn = "";
		int opcionMenu = -1;

		do {

			System.out.println("\n");
			System.out.println("1.Jugar");
			System.out.println("2.Instrucciones");
			System.out.println("3.Ver puntuaciones");
			System.out.println("0.Salir");

			usrIn = sc.nextLine();

			opcionMenu = Integer.parseInt(usrIn);

			switch (opcionMenu) {
			case 1:
				this.jugar();
				break;

			case 2:
				this.instrucciones();
				break;

			case 3:
				this.listarPuntuaciones();
				break;

			}

		} while (opcionMenu != 0);

		sc.close();
	}

	public void cargarPreguntas() {

//		System.out.println("Leyendo fichero...");

		try {
			FileReader fr = new FileReader(rutaDatosPreguntas);
			BufferedReader br = new BufferedReader(fr);

			String linea = br.readLine();

			while (linea != null) {
				String[] camposPregunta = linea.split("#");

				Pregunta pregunta = new Pregunta(camposPregunta[0], camposPregunta[1], camposPregunta[2],
						camposPregunta[3], Integer.parseInt(camposPregunta[4]));

				this.preguntas.add(pregunta);

				linea = br.readLine();
			}

			br.close();

		} catch (Exception e) {
			System.out.println("Ha habido problemas: " + e.getMessage());
		}
	}

	public void cargarPuntuaciones() {

//		System.out.println("Leyendo fichero...");

		try {
			FileReader fr = new FileReader(rutaDatosPuntuaciones);
			BufferedReader br = new BufferedReader(fr);

			String linea = br.readLine();

			while (linea != null) {
				String[] camposPuntuacion = linea.split("#");

				Puntuacion puntuacion = new Puntuacion(camposPuntuacion[0], Integer.parseInt(camposPuntuacion[1]));

				this.puntuaciones.add(puntuacion);

				this.nombresJugadores.add(puntuacion.getNombre());

				linea = br.readLine();
			}

			br.close();
		} catch (Exception e) {
			System.out.println("Ha habido problemas: " + e.getMessage());
		}
	}

	public void jugar() {
		Scanner sc = new Scanner(System.in);
		String nombre = "";

		for (int i = 0; i < this.preguntas.size(); i++) {
			Pregunta pregunta = this.preguntas.get(i);
			int respuesta = 0;

			System.out.println("\n");
			System.out.println(pregunta.getPregunta());
			System.out.println(pregunta.getOpcion1());
			System.out.println(pregunta.getOpcion2());
			System.out.println(pregunta.getOpcion3());
			System.out.println("\n");
			System.out.println("Respuesta:");
			respuesta = Integer.parseInt(sc.nextLine());

			if (respuesta == pregunta.getRespuesta()) {
				this.puntos++;
			}
		}

		System.out.println("Nombre:");
		nombre = sc.nextLine();

		if (!this.nombresJugadores.contains(nombre)) {
			Puntuacion puntuacion = new Puntuacion(nombre, this.puntos);
			this.puntuaciones.add(puntuacion);

		}

	}

	public void instrucciones() {
		System.out.println("\n");
		System.out.println("Introduce el número de opción para responder a las preguntas.");
	}

	public void listarPuntuaciones() {
		System.out.println("\n");
		System.out.println("Puntuaciones:");
		for (Puntuacion puntuacion : this.puntuaciones) {
			System.out.println(puntuacion);
		}
	}

}
