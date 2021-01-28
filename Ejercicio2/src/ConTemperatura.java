
public class ConTemperatura  extends Producto
{
	protected int TemperaturaReco;
	
	
	public ConTemperatura(String a, String b, String c, int d, int e) {
		super(a, b, c, d);
		this.TemperaturaReco=e;
	}

	protected int getTemperaturaReco() {
		return TemperaturaReco;
	}

	protected void setTemperaturaReco(int temperaturaReco) {
		TemperaturaReco = temperaturaReco;
	}

	
	

}
