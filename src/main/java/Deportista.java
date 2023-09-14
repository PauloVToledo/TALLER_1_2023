public class Deportista {
	private String nombre;
	private String apellido;
	private String correo;
	private int numero;
	private String deportePracticado;
	private String rolDeporte;
	public GestionClubDeportivo unnamed_GestionClubDeportivo_;
	private Deporte deporte;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getDeportePracticado() {
		return this.deportePracticado;
	}

	public void setDeportePracticado(String deportePracticado) {
		this.deportePracticado = deportePracticado;
	}

	public String getRolDeporte() {
		return this.rolDeporte;
	}

	public void setRolDeporte(String rolDeporte) {
		this.rolDeporte = rolDeporte;
	}

	public Deportista(String nombre, String apellido, String correo, int numero, String deportePracticado, String rolDeporte) {
		throw new UnsupportedOperationException();
	}
}