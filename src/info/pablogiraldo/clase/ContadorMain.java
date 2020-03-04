package info.pablogiraldo.clase;

public class ContadorMain {

	public static void main(String[] args) {

		Contador contNoInit = new Contador();
		Contador contInit = new Contador(5);
		Contador contNegInit = new Contador(-7);

		System.out.println("\n");
		System.out.println("Inicialización:");
		presentar(contNoInit, contInit, contNegInit);

		contNoInit.incrementar();
		contInit.incrementar();
		contNegInit.incrementar();

		System.out.println("Llamada a incrementar:");
		presentar(contNoInit, contInit, contNegInit);

		contNoInit.decrementar();
		contInit.decrementar();
		contNegInit.decrementar();

		System.out.println("Llamada a decrementar:");
		presentar(contNoInit, contInit, contNegInit);

		contNoInit.decrementar();
		contInit.decrementar();
		contNegInit.decrementar();

		System.out.println("Otra llamada a decrementar:");
		presentar(contNoInit, contInit, contNegInit);
	}

	public static void presentar(Contador contNoInit, Contador contInit, Contador contNegInit) {
		System.out.println("Contador A: " + contNoInit.getCuenta());
		System.out.println("Contador B: " + contInit.getCuenta());
		System.out.println("Contador C: " + contNegInit.getCuenta());
		System.out.println("\n");
	}

}
