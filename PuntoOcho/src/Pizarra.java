
public class Pizarra 
{
	Figura[] elementos;
	int indice;
	String FondoPizarra;
	
	public Pizarra(String fondo) 
	{
		elementos= new Figura[10];
		indice=0;
		FondoPizarra=fondo;
	}

	protected void setFondoPizarra(String f) {
		this.FondoPizarra = f;
	}

	protected String getColorFondoPizarra() {
		return this.FondoPizarra;
	}
	
	
	public void mostrarFiguras() 
	{
		System.out.println("Figuras:");
		int aux=0;
		while(aux<10) {

			if(elementos[aux]!=null) 
			{
				if(elementos[aux]instanceof Linea) {
				Linea a=(Linea) elementos[aux];
				System.out.println(a.getNombre());
				}
				
				if(elementos[aux]instanceof Rectangulo) {
				Rectangulo b=(Rectangulo) elementos[aux];
				System.out.println(b.getNombre());
				}
				
				if(elementos[aux]instanceof Circunferencia) {
				Circunferencia c=(Circunferencia) elementos[aux];
				System.out.println(c.getNombre());
				}
			}
			else
				System.out.println("Vacio");

			aux=aux+1;
		}
	}
	
	
	
	public void agregarFigura(Figura f) 
	{
		if(indice<10) 
		{
			elementos[indice]=f;
			indice++;
		}
	}
	
	public void removeFigura(String figuName){
		 boolean found=false;
		 int count=0;
		 Figura aux;
		 while(!found && count<10){
		 if (elementos[count] != null) {
		 aux=elementos[count];
		 if (aux.getNombre().equals(figuName))
		 found=true;
		 }
		 count++;
		 }
		 if (found)
		 elementos[count-1]= null;
		}
	
	public void limpiarLista(){
		 int count=0;
		 while(count<10){
		 if (elementos[count] != null) {
		 elementos[count]=null;
		 }
		 count++;
		 }
		 count=0;
		}
	
	public double PerimetroPizarra()
	{
		double s=0;
		int aux=0;
		while(aux<10) 
		{
			if(elementos[aux]!=null) 
			{
			
				if(elementos[aux]instanceof Linea) 
				{
				Linea a=(Linea) elementos[aux];
				s=s+a.CalcularPerimetro();
				}
				
				if(elementos[aux]instanceof Rectangulo)
				{
				Rectangulo b=(Rectangulo) elementos[aux];
				s=s+b.CalcularPerimetro();
				}
				
				if(elementos[aux]instanceof Circunferencia) 
				{
				Circunferencia c=(Circunferencia) elementos[aux];
				s=s+c.CalcularPerimetro();
				}
			}
			aux=aux+1;
		}		
		return s;
	}
	
	
	
	public double SuperficiePizarra()
	{
		double s=0;
		int aux=0;
		while(aux<10) 
		{
			if(elementos[aux]!=null) 
			{
				if(elementos[aux]instanceof Linea) 
				{
				Linea a=(Linea) elementos[aux];
				s=s+(a.CalcularSuperficie());
				}
				
				if(elementos[aux]instanceof Rectangulo) 
				{
				Rectangulo b=(Rectangulo) elementos[aux];
				s=s+(b.CalcularSuperficie());
				}
				
				if(elementos[aux]instanceof Circunferencia) 
				{
				Circunferencia c=(Circunferencia) elementos[aux];
				s=s+(c.CalcularSuperficie());
				}
			}
			aux=aux+1;
		}		
		return s;
	}
	
	public void dibujarPizarra()
	{
		int aux=0;
		while(aux<10) 
		{

			if(elementos[aux]!=null) 
				{
			
					if(elementos[aux]instanceof Linea) 
					{
					Linea a=(Linea) elementos[aux];
					a.Dibujar(a);
					}
					
					if(elementos[aux]instanceof Rectangulo) 
					{
					Rectangulo b=(Rectangulo) elementos[aux];
					b.Dibujar(b);
					}
					
					if(elementos[aux]instanceof Circunferencia) 
					{
					Circunferencia c=(Circunferencia) elementos[aux];
					c.Dibujar(c);
					}
				}
			aux=aux+1;
		}
	}
	
	
}
