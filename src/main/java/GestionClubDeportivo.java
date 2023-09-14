import java.util.ArrayList;

public class GestionClubDeportivo {
	public Deportista unnamed_Deportista_;
	public Entrenador unnamed_Entrenador_;
	public Equipo unnamed_Equipo_;
	ArrayList<Deportista> deportistas;
	ArrayList<Entrenador> entrenadores;

	public ArrayList<Deportista> registrarDeportista(String nombre, String apellido, String numero, int deporte) {
		for (Deportista d : this.deportistas) {
			if (d.equals(new Deportista(nombre, apellido, deporte, numero))) {
				throw new IllegalArgumentException("El deportista ya existe");
			}
		}
		Deportista deportista = new Deportista(nombre, apellido, deporte, numero);

		this.deportistas.add(deportista);

		return this.deportistas;
	}

	public ArrayList<Entrenador> registrarEntrenador(int experienciaAnnos, String especialidadDeportiva) {
		// Revisar que el entrenador no exista previamente
		for (Entrenador e : this.entrenadores) {
			if (e.equals(new Entrenador(experienciaAnnos, especialidadDeportiva))) {
				throw new IllegalArgumentException("El entrenador ya existe");
			}
		}

		Entrenador entrenador = new Entrenador(experienciaAnnos, especialidadDeportiva);

		this.entrenadores.add(entrenador);

		return this.entrenadores;
	}

	public Equipo crearEquipo(Equipo equipo) {
		throw new UnsupportedOperationException();
	}

	public PartidoJugado registrarPartidosJugados(PartidoJugado partido) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Deportista> obtenerEstadisticasJugador(Deportista deportista) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Equipo> obtenerEstadisticasEquipo(Equipo equipo) {
		throw new UnsupportedOperationException();
	}
}