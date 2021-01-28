
public class Figura 
{
	
	//*Cada tipo de figura tiene un método para su dibujo.
	//* A una figura se le puede calcular el perímetro
	//* A una figura se le puede calcular la superficie
	//* Una figura tiene un color de fondo
	//* Una figura tiene un color de borde
	

	protected String Nombre;
	protected double Perimetro;
	protected double Superficie;
	protected String ColorFondo;
	protected String ColorBorde;
	
	public Figura (String n,String colorFondo, String colorBorde) 
	{
		Nombre = n;
		ColorFondo = colorFondo;
		ColorBorde = colorBorde;
	}

	
	protected String getNombre() {
		return this.Nombre;
	}


	protected void setNombre(String nombre) {
		Nombre = nombre;
	}


	public void Dibujar(Figura f) {
		System.out.println("Dibujando "+f.getNombre());
		}
	
	
	protected double getPerimetro() {
		return Perimetro;
	}

	protected void setPerimetro(double perimetro) {
		Perimetro = perimetro;
	}

	protected double getSuperficie() {
		return Superficie;
	}

	protected void setSuperficie(double superficie) {
		this.Superficie = superficie;
	}

	protected String getColorFondo() {
		return ColorFondo;
	}

	protected void setColorFondo(String colorFondo) {
		ColorFondo = colorFondo;
	}

	protected String getColorBorde() {
		return ColorBorde;
	}

	protected void setColorBorde(String colorBorde) {
		ColorBorde = colorBorde;
	}
	
	protected double CalcularPerimetro() 
	{
		return 0;
	}
	
	protected double CalcularSuperficie()
	{
		return 0;
	}
	
	
	
	
}
