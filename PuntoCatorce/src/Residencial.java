
public class Residencial extends Usuario 
{

	public Residencial(String d, String n)
	{super(d, n);}
	
	void conexion(int s)
	{
		if (s<=180) 
			super.reset();
		else 
			super.conexion(s-180);
	}
}
