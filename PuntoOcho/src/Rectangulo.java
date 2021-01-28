
public class Rectangulo extends Figura
{

	protected double Base;
	protected double Altura;
	
	public Rectangulo(String n, String colorFondo, String colorBorde, double b, double h) {
		super(n, colorFondo, colorBorde);
		this.Base=b;
		this.Altura=h;
	}

	

	
	
	protected double getBase() {
		return Base;
	}

	protected void setBase(double base) {
		this.Base = base;
	}

	protected double getAltura() {
		return Altura;
	}

	protected void setAltura(double altura) {
		this.Altura = altura;
	}

	
	protected double CalcularPerimetro()
	{
		double c;
		c=2*((this.Base)+(this.Altura));
		return c;
	}

	protected double CalcularSuperficie()
	{
		double c;
		c=(this.Base)*(this.Altura);
		return c;
	}
	
	
	
}
