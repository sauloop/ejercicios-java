package info.pablogiraldo.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//import java.io.IOException;
//import org.jdom.Attribute;
//import org.jdom.Document;
//import org.jdom.Element;
//import org.jdom.output.Format;

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
			System.out.println("2.Añadir pregunta");
			System.out.println("3.Instrucciones");
			System.out.println("4.Ver puntuaciones");
			System.out.println("0.Salir");

			System.out.println("\n");
			System.out.println("Opción:");
			usrIn = sc.nextLine();

			opcionMenu = Integer.parseInt(usrIn);

			switch (opcionMenu) {
			case 1:
				this.jugar(sc);
				break;

			case 2:
				this.addPregunta(sc);
				break;

			case 3:
				this.instrucciones();
				break;

			case 4:
				this.listarPuntuaciones();
				break;

			}

		} while (opcionMenu != 0);

		sc.close();
	}

	public void cargarPreguntas() {

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

	public void guardarPreguntas() {

		try {
			FileWriter fw = new FileWriter(rutaDatosPreguntas, false);
			BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < this.preguntas.size(); i++) {

				bw.write(this.preguntas.get(i).getPregunta() + "#" + this.preguntas.get(i).getOpcion1() + "#"
						+ this.preguntas.get(i).getOpcion2() + "#" + this.preguntas.get(i).getOpcion3() + "#"
						+ this.preguntas.get(i).getRespuesta() + "\n");

			}

			bw.close();
		} catch (Exception e) {
			System.out.println("Ha habido problemas: " + e.getMessage());
		}
	}

	public void guardarPuntuaciones() {

		try {
			FileWriter fw = new FileWriter(rutaDatosPuntuaciones, false);
			BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 0; i < this.puntuaciones.size(); i++) {

				bw.write(this.puntuaciones.get(i).getNombre() + "#" + this.puntuaciones.get(i).getPuntos() + "\n");

			}

			bw.close();
		} catch (Exception e) {
			System.out.println("Ha habido problemas: " + e.getMessage());
		}
	}

	public void addPregunta(Scanner sc) {

		Pregunta nuevaPregunta = new Pregunta();

		System.out.println("\n");
		System.out.println("Pregunta:");
		nuevaPregunta.setPregunta(sc.nextLine());
		System.out.println("Opción 1:");
		nuevaPregunta.setOpcion1(sc.nextLine());
		System.out.println("Opción 2:");
		nuevaPregunta.setOpcion2(sc.nextLine());
		System.out.println("Opción 3:");
		nuevaPregunta.setOpcion3(sc.nextLine());
		System.out.println("Respuesta:");
		nuevaPregunta.setRespuesta(Integer.parseInt(sc.nextLine()));

		this.preguntas.add(nuevaPregunta);

		this.guardarPreguntas();
	}

	public void jugar(Scanner sc) {

		this.puntos = 0;

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

		this.datosJugador(sc);

	}

	public void datosJugador(Scanner sc) {

		String nombre = "";

		System.out.println("\n");
		System.out.println("Nombre:");
		nombre = sc.nextLine();

		if (!this.nombresJugadores.contains(nombre)) {
			Puntuacion puntuacion = new Puntuacion(nombre, this.puntos);
			this.puntuaciones.add(puntuacion);

			this.guardarPuntuaciones();

		} else {
			for (int i = 0; i < this.puntuaciones.size(); i++) {
				if (puntuaciones.get(i).getNombre().equals(nombre) && puntuaciones.get(i).getPuntos() < this.puntos) {
					puntuaciones.get(i).setPuntos(this.puntos);
				}
			}

			this.guardarPuntuaciones();
		}

	}

	public void instrucciones() {
		System.out.println("\n");
		System.out.println("Introduce el número de opción para responder a las preguntas.");
	}

	public void listarPuntuaciones() {

		Collections.sort(this.puntuaciones);

		System.out.println("\n");
		System.out.println("Puntuaciones:");
		if (this.puntuaciones.size() > 0) {
			for (Puntuacion puntuacion : this.puntuaciones) {
				System.out.println(puntuacion);
			}

		} else {
			System.out.println("No hay puntuaciones guardadas.");
		}

	}

//	public void xmlExport() {
//
//		try {
//
//			Element company = new Element("company");
//			Document doc = new Document(company);
//			doc.setRootElement(company);
//
//			Element staff = new Element("staff");
//			staff.setAttribute(new Attribute("id", "1"));
//			staff.addContent(new Element("firstname").setText("yong"));
//			staff.addContent(new Element("lastname").setText("mook kim"));
//			staff.addContent(new Element("nickname").setText("mkyong"));
//			staff.addContent(new Element("salary").setText("199999"));
//
//			doc.getRootElement().addContent(staff);
//
//			Element staff2 = new Element("staff");
//			staff2.setAttribute(new Attribute("id", "2"));
//			staff2.addContent(new Element("firstname").setText("low"));
//			staff2.addContent(new Element("lastname").setText("yin fong"));
//			staff2.addContent(new Element("nickname").setText("fong fong"));
//			staff2.addContent(new Element("salary").setText("188888"));
//
//			doc.getRootElement().addContent(staff2);
//
//			// new XMLOutputter().output(doc, System.out);
//			XMLOutputter xmlOutput = new XMLOutputter();
//
//			// display nice nice
//			xmlOutput.setFormat(Format.getPrettyFormat());
//			xmlOutput.output(doc, new FileWriter("c:\\file.xml"));
//
//			System.out.println("File Saved!");
//		} catch (IOException io) {
//			System.out.println(io.getMessage());
//		}
//	}

}
