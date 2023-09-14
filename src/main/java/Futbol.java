public class Futbol extends Deporte {
	private String tipoCampo;
	private String tipoPartido;

	public String getTipoCampo() {
		return this.tipoCampo;
	}

	public void setTipoCampo(String tipoCampo) {
		this.tipoCampo = tipoCampo;
	}

	public String getTipoPartido() {
		return this.tipoPartido;
	}

	public void setTipoPartido(String tipoPartido) {
		this.tipoPartido = tipoPartido;
	}

	public Futbol(String tipoCampo, String tipoPartido) {
		this.tipoCampo=tipoCampo;
		this.tipoPartido=tipoPartido;
	}

	public String getTipo() {
		return "Futbol";
	}
}

/*
el tipo de campo puede ser natural o sintético.
el partido local o visitante.
 */