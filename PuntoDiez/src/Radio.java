
public class Radio extends Medios
{
	protected String ResponsableMusicalizacion;
	protected Comerciales ComercialesMinutos;
	protected int TiempoComercial;
	
	public Radio(String titulo, String personaResponsables, int codigo, int duracion, String horaInicio,
			String nombreEmisora,String Rm,Comerciales c) 
	{
		super(titulo, personaResponsables, codigo, duracion, horaInicio, nombreEmisora);
		this.ResponsableMusicalizacion=Rm;
		this.ComercialesMinutos=c;
		this.TiempoComercial=ComercialesMinutos.getTiempoMinutos();
	}

	protected String getResponsableMusicalizacion() {
		return ResponsableMusicalizacion;
	}

	protected void setResponsableMusicalizacion(String responsableMusicalizacion) {
		ResponsableMusicalizacion = responsableMusicalizacion;
	}

	protected Comerciales getComercialesMinutos() {
		return ComercialesMinutos;
	}

	protected void setComercialesMinutos(Comerciales comercialesMinutos) {
		ComercialesMinutos = comercialesMinutos;
	}

	protected int getTiempoComercial() {
		return TiempoComercial;
	}

	protected void setTiempoComercial(int tiempoComercial) {
		TiempoComercial = tiempoComercial;
	}
	
	
	
	
	
}
