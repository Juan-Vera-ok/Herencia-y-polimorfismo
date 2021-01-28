
public class Comercial extends Usuario
{
	private double DescuentoFijo;

	public Comercial(String d, String n) 
	{super(d, n);}
	
	
	double calculaFacturación(double d) 
	{
		d=1-(d/100);
		DescuentoFijo=d;
		return super.calculaFacturación()*DescuentoFijo;
	}
	
	
	
	

}
