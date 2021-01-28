import java.util.Vector;
public class Universidad 
{
	private String Nombre;
	protected Vector vecEspaciosCurriculares;
	protected int CantidadDeEspacios;
	
	
	public Universidad(String nombre, int cantidadDeEspacios) 
	{
		Nombre = nombre;
		this.vecEspaciosCurriculares= new Vector (cantidadDeEspacios);
	
		CantidadDeEspacios = cantidadDeEspacios;
	}
	
	
	public void addEspacioCurricular(EspacioCurricular ec) 
	{
		this.vecEspaciosCurriculares.addElement(ec);
	}
	
	
	
	
	
	public int CantidadAsignaturas() 
	{
		int ca=0;
		for(int i=0;i<this.vecEspaciosCurriculares.size();i=i+1) 
		{
			EspacioCurricular a=(EspacioCurricular)this.vecEspaciosCurriculares.elementAt(i);
			if(a instanceof Asignatura)
			{ca=ca+1;}
		}
		
		return ca;
	}
	
	public int CantidadTalleres() 
	{
		int ct=0;
		for(int i=0;i<this.vecEspaciosCurriculares.size();i=i+1) 
		{
			EspacioCurricular b=(EspacioCurricular)this.vecEspaciosCurriculares.elementAt(i);
			if(b instanceof Taller)
			{ct=ct+1;}
		}
		
		return ct;
	}
	
	
	public double CantidadHorasPromedioTalleres() 
	{
		double ht=0;
		int p=0;
		for(int i=0;i<this.vecEspaciosCurriculares.size();i=i+1) 
		{
			EspacioCurricular c=(EspacioCurricular)this.vecEspaciosCurriculares.elementAt(i);
			if(c instanceof Taller) 
			{
				p=p+1;
				ht=ht+((Taller) c).getHoras();
			}	
		}
		return ht/p;
	}
	
	public void NombreYCodigoEspaciosCurriculares() 
	{
		for(int i=0;i<this.vecEspaciosCurriculares.size();i=i+1) 
		{
			EspacioCurricular d=(EspacioCurricular)this.vecEspaciosCurriculares.elementAt(i);
			if(d instanceof Asignatura) {
				System.out.println("Asignatura");
			System.out.println(d.getNombre());
			System.out.println(d.getCodigo());
			System.out.println("------------------");}
			
			if(d instanceof Taller) {
				System.out.println("Taller");
			System.out.println(d.getNombre());
			System.out.println(d.getCodigo());
			System.out.println("------------------");}
			
		}
	}
	
	public int CantidadAsignaturasSemetralesYOptativas() 
	{
		int so=0;
		for(int i=0;i<this.vecEspaciosCurriculares.size();i=i+1) 
		{
			EspacioCurricular e=(EspacioCurricular)this.vecEspaciosCurriculares.elementAt(i);
			if(e instanceof Asignatura) 
			{
				
				if(((Asignatura) e).getEsAnual()==false&&((Asignatura) e).getEsObligatoria()==false) 
				{so=so+1;}
			}
		}
		return so;
	}
	
	
	

}
