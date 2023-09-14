import java.util.ArrayList;

public class Equipo {
	private String historialPartidos;
	private Deporte deporte;
	public GestionClubDeportivo unnamed_GestionClubDeportivo_;
	private Entrenador entrenador;
	private ArrayList<PartidoJugado> partidosJugados = new ArrayList<PartidoJugado>();

	public ArrayList<Deportista> jugadores(Deportista deporte) {
		throw new UnsupportedOperationException();
	}

	public String getHistorialPartidos() {
		return this.historialPartidos;
	}

	public void setHistorialPartidos(String historialPartidos) {
		this.historialPartidos = historialPartidos;
	}

	public Equipo(String historialPartidos) {
		throw new UnsupportedOperationException();
	}
}