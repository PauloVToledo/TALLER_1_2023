public class Tenis extends Deporte {
	private String tipoSuperficie;
	private String tipoPartido;

	public String getTipoSuperficie() {
		return this.tipoSuperficie;
	}

	public void setTipoSuperficie(String tipoSuperficie) {
		this.tipoSuperficie = tipoSuperficie;
	}

	public String getTipoPartido() {
		return this.tipoPartido;
	}

	public void setTipoPartido(String tipoPartido) {
		this.tipoPartido = tipoPartido;
	}

	public Tenis(String tipoSuperficie, String tipoPartido) {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {

		return "Tenis";
	}
}