public class Deportista {
	private String nombre;
	private String apellido;
	private String correo;
	private int numero;
	private String deportePracticado;
	private String rolDeporte;
	public GestionClubDeportivo GestionClubDeportivo;
	private String deporte;

	public Deportista(String nombre, String apellido, int deporte, String numero) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.deporte = String.valueOf(deporte);
		this.numero = Integer.parseInt(numero);
	}

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

		this.nombre=nombre;
		this.apellido=apellido;
		this.correo=correo;
		this.numero=numero;
		this.deportePracticado=deportePracticado;
		this.rolDeporte=rolDeporte;

	}

	@Override
	public String toString() {
		return "Deportista [nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", numero=" + numero
				+ ", deportePracticado=" + deportePracticado + ", rolDeporte=" + rolDeporte + "]";
	}

}