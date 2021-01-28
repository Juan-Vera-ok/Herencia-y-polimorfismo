
public class GranUsuario extends Usuario
{
	public GranUsuario(String d, String n) 
	{super(d, n);}

	double periodoFacturacion(int p)
	{
		int aux=0;
		int Mayor=0;
		for(int i=0;i<p;i=i+1) 
		{
			int s=Console.readInt("Ingrese duración de la conexión");
			if(s>Mayor)
				Mayor=s;
			aux=aux+s;
		}
		int c=aux-Mayor;
		super.conexion(c);
		double MontoFinal=super.calculaFacturación();
		return MontoFinal;
	}
}
