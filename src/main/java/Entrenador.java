public class Entrenador {
	private int experienciaAnnos;
	private String especialidadDeportiva;
	private Equipo equipo;
	public GestionClubDeportivo unnamed_GestionClubDeportivo_;

	public int getExperienciaAnnos() {
		return this.experienciaAnnos;
	}

	public void setExperienciaAnnos(int experienciaAnnos) {
		this.experienciaAnnos = experienciaAnnos;
	}

	public String getEspecialidadDeportiva() {
		return this.especialidadDeportiva;
	}

	public void setEspecialidadDeportiva(String especialidadDeportiva) {
		this.especialidadDeportiva = especialidadDeportiva;
	}

	public Entrenador(int experienciaAnnos, String especialidadDeportiva) {
		this.experienciaAnnos=experienciaAnnos;
		this.especialidadDeportiva=especialidadDeportiva;
	}
}