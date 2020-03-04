package info.pablogiraldo.clase;

public class Contador {

	private int cuenta;

	public Contador() {
	}

	public Contador(int cuenta) {

		if (cuenta > 0) {
			this.cuenta = cuenta;
		} else {
			this.cuenta = 0;
		}
	}

	public int getCuenta() {
		return cuenta;
	}

	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}

	public void incrementar() {
		this.cuenta++;
	}

	public void decrementar() {
		if (this.cuenta > 0) {
			this.cuenta--;
		} else {
			this.cuenta = 0;
		}

	}

}
