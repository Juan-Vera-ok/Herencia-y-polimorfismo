
public class EspacioCurricular 
{
	protected String Codigo;
	protected String Nombre;
	
	
	
	public EspacioCurricular(String codigo, String nombre) {
		super();
		Codigo = codigo;
		Nombre = nombre;
	}

	protected void setCodigo(String codigo) 
	{this.Codigo=codigo;}

	protected String getCodigo() 
	{return this.Codigo;}
	
	protected void setNombre(String nombre)
	{this.Nombre=nombre;}
	
	protected String getNombre()
	{return this.Nombre;}
	
	
	
}
