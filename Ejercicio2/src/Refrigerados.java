
public class Refrigerados extends ConTemperatura {

	
	protected int CodigoOrgAlim;

	
	public Refrigerados(String a, String b, String c, int d,int e,int f) {
		super(a, b, c, d, e);
		this.CodigoOrgAlim=f;
	}


	public int getCodigoOrgAlim() {
		return CodigoOrgAlim;
	}

	protected void setCodigoOrgAlim(int codigoOrgAlim) {
		CodigoOrgAlim = codigoOrgAlim;
	}
	
	
}
