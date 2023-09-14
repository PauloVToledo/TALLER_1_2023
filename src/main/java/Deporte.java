import java.util.ArrayList;

public abstract class Deporte {
	private ArrayList<Deportista> deportistas = new ArrayList<Deportista>();
	private ArrayList<Equipo> equipos = new ArrayList<Equipo>();

	public abstract String getTipo();
}