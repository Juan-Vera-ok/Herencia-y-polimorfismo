
public class Comercial extends Usuario
{
	private double DescuentoFijo;

	public Comercial(String d, String n) 
	{super(d, n);}
	
	
	double calculaFacturaci�n(double d) 
	{
		d=1-(d/100);
		DescuentoFijo=d;
		return super.calculaFacturaci�n()*DescuentoFijo;
	}
	
	
	
	

}
