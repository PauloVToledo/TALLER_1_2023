public class PartidoJugado {
	private String equipoOponente;
	private String resultado;
	private String fecha;
	private String lugarPartido;
	private Equipo equipo;

	public String getEquipoOponente() {
		return this.equipoOponente;
	}

	public void setEquipoOponente(String equipoOponente) {
		this.equipoOponente = equipoOponente;
	}

	public String getResultado() {
		return this.resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getLugarPartido() {
		return this.lugarPartido;
	}

	public void setLugarPartido(String lugarPartido) {
		this.lugarPartido = lugarPartido;
	}

	public PartidoJugado(String equipoOponente, String resultado, Object fecha, Object string, String lugarPartido) {
		throw new UnsupportedOperationException();
	}
}