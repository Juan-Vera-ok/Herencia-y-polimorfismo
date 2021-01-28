
public class CongeAire extends Congelados
{
	
	protected int Nitrogeno;
	protected int Oxigeno;
	protected int DioxidoCarbono;
	protected int VaporAgua;
	
	public CongeAire(String a,String b,String c,int d, int e,int f,int g,int h,int i) {
		super(a, b, c, d, e);
		this.Nitrogeno=f;
		this.Oxigeno=g;
		this.DioxidoCarbono=h;
		this.VaporAgua=i;
		
	}

	protected int getNitrogeno() {
		return Nitrogeno;
	}

	protected void setNitrogeno(int nitrogeno) {
		Nitrogeno = nitrogeno;
	}

	protected int getOxigeno() {
		return Oxigeno;
	}

	protected void setOxigeno(int oxigeno) {
		Oxigeno = oxigeno;
	}

	protected int getDioxidoCarbono() {
		return DioxidoCarbono;
	}

	protected void setDioxidoCarbono(int dioxidoCarbono) {
		DioxidoCarbono = dioxidoCarbono;
	}

	protected int getVaporAgua() {
		return VaporAgua;
	}

	protected void setVaporAgua(int vaporAgua) {
		VaporAgua = vaporAgua;
	}
	
	
}
