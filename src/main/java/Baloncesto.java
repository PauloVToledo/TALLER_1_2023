public class Baloncesto extends Deporte {
	private String tipoCancha;
	private int numeroTiemposJugados;

	public String getTipoCancha() {
		return this.tipoCancha;
	}

	public void setTipoCancha(String tipoCancha) {
		this.tipoCancha = tipoCancha;
	}

	public int getNumeroTiemposJugados() {
		return this.numeroTiemposJugados;
	}

	public void setNumeroTiemposJugados(int numeroTiemposJugados) {
		this.numeroTiemposJugados = numeroTiemposJugados;
	}

	public Baloncesto(String tipoCancha, int numeroTiemposJugados) {
		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		throw new UnsupportedOperationException();
	}
}