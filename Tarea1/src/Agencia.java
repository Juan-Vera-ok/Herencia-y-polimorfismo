import java.util.Vector;

public class Agencia 
{
private String nameAgencia;
private Vector b;

		
	
	public Agencia(String nameAgencia, int size) 
	{
	this.nameAgencia = nameAgencia;
	this.b = new Vector(size);
	}

	
	
	public void addBoleto(Boleto aux) 
	{b.addElement(aux);}
	
	public void removeBoleto() 
	{b.remove(b.lastElement());}
	
	public void removeAllBoletos() 
	{b.removeAllElements();}

	public int BoletosTotalAerolinea(String a)
	{	
		int Total=0;
		
		for(int i=0;i<b.size();i=i+1) 
		{
			if(b.elementAt(i) instanceof PrimeraClase) 
			{
				PrimeraClase aux = (PrimeraClase) b.elementAt(i);
				if(aux.getAerolinea().equals(a))
				{Total=Total+1;}
			}
		}
		for(int i=0;i<b.size();i=i+1) 
		{
			if(b.elementAt(i) instanceof Turista) 
			{
				Turista aux = (Turista) b.elementAt(i);
				if(aux.getAerolinea().equals(a))
				{Total=Total+1;}
			}
		}
		for(int i=0;i<b.size();i=i+1) 
		{
			if(b.elementAt(i) instanceof ClaseEconomica) 
			{
			ClaseEconomica aux = (ClaseEconomica) b.elementAt(i);
			if(aux.getAerolinea().equals(a))
			{Total=Total+1;}
			}
		}
		
		return Total;
	}
	
	
	public double recaudadoPorEconomica() 
	{
		double CE=0;
		for(int i=0;i<b.size();i=i+1) 
		{
			if(b.elementAt(i) instanceof ClaseEconomica) 
			{
				ClaseEconomica a= (ClaseEconomica) b.elementAt(i);
				CE=CE+a.getImporte();
			}
		}
		
		return CE;
	}
	
	public double recaudadoPorPrimera() 
	{
		double PC=0;
		for(int i=0;i<b.size();i=i+1) 
		{
			if(b.elementAt(i) instanceof PrimeraClase) 
			{
			PrimeraClase a= (PrimeraClase) b.elementAt(i);
			PC=PC+a.getImporte();
			}
		}
		
		return PC;
	}
	
	public double recaudadoPorTurista() 
	{
		double T=0;
		for(int i=0;i<b.size();i=i+1) 
		{
			if(b.elementAt(i) instanceof Turista) 
			{
				Turista a= (Turista) b.elementAt(i);
				T=T+a.getImporte();
			}
		}
		return T;
	}
	
	public Boleto buscarPasajeroDni(String c) 
	{
		Boleto a;
		int i=0;
		boolean Bandera=false;
		do {
		a= (Boleto) b.elementAt(i);
			if(a.getDniPasajero().equals(c))
			Bandera=true;
			i=i+1;
			
		}while(Bandera==false||i>b.size());
		return a;
	}
	
	public void listaClaseEconomicaAerolinea(String a) 
	{
		boolean Bandera=false;
		for(int i=0;i<b.size();i=i+1) 
		{
			Boleto c=(Boleto) b.elementAt(i);
			if(c instanceof ClaseEconomica&&c.getAerolinea().equals(a)) 
			{
	
					System.out.println("Clase Economica");
					System.out.println(c.NombrePasajero);
					System.out.println(c.DniPasajero);
					System.out.println(c.getDestino());
					System.out.println(c.getAerolinea());
					System.out.println(c.getImporte());
					System.out.println("------------------");
				Bandera=true;
			}if(Bandera==false) {System.out.println("No hay clase Economica Y/o destino buscado");}
		}
	}
	
	public void listaClaseTuristaDestino(String a) 
	{
		boolean Bandera=false;
		for(int i=0;i<b.size();i=i+1) 
		{
			Boleto c=(Boleto) b.elementAt(i);
			if(c instanceof Turista&&c.getDestino().equals(a)) 
			{
					System.out.println("Clase turista");
					System.out.println(c.NombrePasajero);
					System.out.println(c.DniPasajero);
					System.out.println(c.getDestino());
					System.out.println(c.getAerolinea());
					System.out.println(c.getImporte());
					System.out.println("------------------");
				Bandera=true;
			}
		
		}if(Bandera==false) {System.out.println("No hay clase turista y/o destino buscado");}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
		
}
