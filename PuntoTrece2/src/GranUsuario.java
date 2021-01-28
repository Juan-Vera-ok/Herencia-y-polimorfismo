import java.util.Vector;
public class GranUsuario extends Usuario
{
	public GranUsuario(String d, String n) 
	{super(d, n);}

	double periodoFacturacion(Vector v)
	{
		int aux=0;
		int Mayor=0;
		
		for(int i=0;i<v.size();i=i+1) 
		{
			int a=(int)v.elementAt(i);
			if(a>Mayor) 
				{Mayor=a;}
			aux=aux+a;
		}
		int c=aux-Mayor;
		super.conexion(c);
		double MontoFinal=super.calculaFacturación();
		return MontoFinal;
	}
}
