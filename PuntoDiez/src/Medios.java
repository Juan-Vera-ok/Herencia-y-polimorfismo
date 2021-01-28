
public abstract class Medios 
{
	protected String Titulo;
	protected String PersonaResponsables;
	protected int Codigo;
	protected int Duracion;
	protected String HoraInicio;
	protected String NombreEmisora;
	
	
	
	
	
	public Medios(String titulo, String personaResponsables, int codigo, int duracion, String horaInicio,
			String nombreEmisora) {
		super();
		Titulo = titulo;
		PersonaResponsables = personaResponsables;
		Codigo = codigo;
		Duracion = duracion;
		HoraInicio = horaInicio;
		NombreEmisora = nombreEmisora;
	}
	public String getTitulo() {
		return Titulo;
	}
	protected void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getPersonaResponsables() {
		return PersonaResponsables;
	}
	protected void setPersonaResponsables(String personaResponsables) {
		PersonaResponsables = personaResponsables;
	}
	public int getCodigo() {
		return Codigo;
	}
	protected void setCodigo(int codigo) {
		Codigo = codigo;
	}
	public int getDuracion() {
		return Duracion;
	}
	protected void setDuracion(int duracion) {
		Duracion = duracion;
	}
	public String getHoraInicio() {
		return HoraInicio;
	}
	protected void setHoraInicio(String horaInicio) {
		HoraInicio = horaInicio;
	}
	public String getNombreEmisora() {
		return NombreEmisora;
	}
	protected void setNombreEmisora(String nombreEmisora) {
		NombreEmisora = nombreEmisora;
	}
}
