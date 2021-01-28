
public class Comercial extends Usuario
{
	private double DescuentoFijo;

	public Comercial(String d, String n) 
	{super(d, n);}
	
	
	double calculaFacturación(double d) 
	{
		do
		{d=Console.readDouble("Ingrese 1 número entre 0 y 100");}while(d<0||d>100);
		d=1-(d/100);
		DescuentoFijo=d;
		return super.calculaFacturación()*DescuentoFijo;
	}
	
	
	
	

}
