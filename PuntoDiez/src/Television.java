
public class Television extends Medios
{
	protected Tandas_comerciales []Numero_Tandas_Comerciales;
	protected int Cantidad_tandas;
	protected int Cantidad_comerciales_por_tanda;
	protected int Tiempo_por_comercial;

	public Television(String titulo, String personaResponsables, int codigo, int duracion, String horaInicio,
			String nombreEmisora,int ct,int cct,int tpc) {
		super(titulo, personaResponsables, codigo, duracion, horaInicio, nombreEmisora);
		this.Cantidad_tandas=ct;
		this.Numero_Tandas_Comerciales=new Tandas_comerciales[ct];
		this.Cantidad_comerciales_por_tanda=cct;
		this.Tiempo_por_comercial=tpc;
		
		for(int i=0;i<ct;i=i+1) 
		{
			Tandas_comerciales tanda=new Tandas_comerciales(tpc,cct);
			Numero_Tandas_Comerciales[i]=tanda;
		}
		
	}

	protected Tandas_comerciales[] getNumero_Tandas_Comerciales() {
		return Numero_Tandas_Comerciales;
	}

	protected void setNumero_Tandas_Comerciales(Tandas_comerciales[] numero_Tandas_Comerciales) {
		Numero_Tandas_Comerciales = numero_Tandas_Comerciales;
	}

	public int getCantidad_tandas() {
		return Cantidad_tandas;
	}

	protected void setCantidad_tandas(int cantidad_tandas) {
		Cantidad_tandas = cantidad_tandas;
	}

	public int getCantidad_comerciales_por_tanda() {
		return Cantidad_comerciales_por_tanda;
	}

	protected void setCantidad_comerciales_por_tanda(int cantidad_comerciales_por_tanda) {
		Cantidad_comerciales_por_tanda = cantidad_comerciales_por_tanda;
	}

	public int getTiempo_por_comercial() {
		return Tiempo_por_comercial;
	}

	protected void setTiempo_por_comercial(int tiempo_por_comercial) {
		Tiempo_por_comercial = tiempo_por_comercial;
	}
	
	
	
	
	
	
	
	
	
	
	

}
