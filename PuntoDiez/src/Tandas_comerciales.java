
public class Tandas_comerciales
{
	protected Comerciales []Tanda_Comercial;
	protected int Cantidad_de_comerciales;
	protected int Tiempo_comerciales;
	
	
	public Tandas_comerciales(int t,int cc) 
	{
		this.Tiempo_comerciales=t;
		this.Cantidad_de_comerciales=cc;
		Tanda_Comercial=new Comerciales[this.Cantidad_de_comerciales];
		
		for(int i=0;i<cc;i=i+1) 
		{
			Comerciales c=new Comerciales(t);
			Tanda_Comercial[i]=c;
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
