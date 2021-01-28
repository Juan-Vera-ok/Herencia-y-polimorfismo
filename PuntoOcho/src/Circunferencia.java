
public class Circunferencia extends Figura
{

	protected double Diametro;
	protected double Radio;
	protected final double pi=3.1415;
	
	public Circunferencia(String n, String colorFondo, String colorBorde, double d, double r) 
	{
		super(n, colorFondo, colorBorde);
		this.Diametro=d;
		this.Radio=r;
	}

	
	
	protected double getDiametro() {
		return Diametro;
	}

	protected void setDiametro(double diametro) {
		Diametro = diametro;
	}

	protected double getRadio() {
		return Radio;
	}

	protected void setRadio(double radio) {
		Radio = radio;
	}

	protected double getPi() {
		return pi;
	}
	
	protected double CalcularPerimetro() 
	{
		double a;
		a=(this.pi)*(this.Diametro);
		return a;
	}
	
	protected double CalcularSuperficie()
	{
		double b;
		b=this.pi*((this.Radio)*(this.Radio));
		return b;
	}
	
	
}
