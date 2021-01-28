
public class EmpresaMedios 
{
	protected Medios m;
	
	public EmpresaMedios(Medios m) 
	{
		this.m = m;
	}

	public void MostrarDatosPrograma() 
	{
		
		System.out.println("Titulo:"+m.getTitulo());
		System.out.println("Persona responsable:"+m.getPersonaResponsables());
		System.out.println("Codigo:"+m.getCodigo());
		System.out.println("Duracion en minutos:"+m.getDuracion());
		System.out.println("Hora de inicio:"+m.getHoraInicio());
		System.out.println("Nombre de emisora:"+m.getNombreEmisora());
		
		
		if(m instanceof Radio) 
		{
			System.out.println("Responsable musicalizacion:"+((Radio) m).getResponsableMusicalizacion());
			System.out.println("Tiempo comercial en minutos:"+((Radio) m).getTiempoComercial());
		}
		
		if(m instanceof Television)
		{
			System.out.println("Cantidad de tandas:"+((Television) m).getCantidad_tandas());
			System.out.println("Cantidad de comerciales por tanda:"+((Television) m).getCantidad_comerciales_por_tanda());
			System.out.println("Tiempo por comercial en minutos:"+((Television) m).getTiempo_por_comercial());
		}
		
		System.out.println("--------------------------------------------");
		
	}
	
	
}
