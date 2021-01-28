
public class CongeAgua extends Congelados
{
	
	protected String GramosLitroAgua;
	
	public CongeAgua(String a,String b,String c,int d, int e,String f) {
		super(a, b, c, d, e);
		this.GramosLitroAgua=f;
	}



	protected String getGramosLitroAgua() {
		return GramosLitroAgua;
	}

	protected void setGramosLitroAgua(String gramosLitroAgua) {
		GramosLitroAgua = gramosLitroAgua;
	}

}
