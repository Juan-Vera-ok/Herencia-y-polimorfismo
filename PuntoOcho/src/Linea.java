
public class Linea extends Figura
{

	protected double medida;
	
	public Linea(String n, String colorFondo, String colorBorde, double m) {
		super(n, colorFondo, colorBorde);
		this.medida=m;
	}
	
	protected double CalcularPerimetro() {
		return 0;}
	
	protected double CalcularSuperficie() {
		return 0;}
	
	
	
}
