
public class CongeNitro extends Congelados 
{
	
	protected String MetodoEmpleado;
	protected int TiempoEnSegundos;
	
	public CongeNitro(String a,String b,String c,int d, int e,String f,int g) {
		super(a, b, c, d, e);
		this.MetodoEmpleado=f;
		this.TiempoEnSegundos=g;
	}

	
	
	protected String getMetodoEmpleado() {
		return MetodoEmpleado;
	}
	protected void setMetodoEmpleado(String metodoEmpleado) {
		MetodoEmpleado = metodoEmpleado;
	}
	protected int getTiempoEnSegundos() {
		return TiempoEnSegundos;
	}
	protected void setTiempoEnSegundos(int tiempoEnSegundos) {
		TiempoEnSegundos = tiempoEnSegundos;
	}
	

}
