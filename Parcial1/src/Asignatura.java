
public class Asignatura extends EspacioCurricular
{
	protected boolean EsAnual;
	protected boolean EsObligatoria;
	

	protected boolean getEsAnual() {
		return EsAnual;
	}


	protected void setEsAnual(boolean esAnual) {
		EsAnual = esAnual;
	}


	protected boolean getEsObligatoria() {
		return EsObligatoria;
	}


	protected void setEsObligatoria(boolean esObligatoria) {
		EsObligatoria = esObligatoria;
	}


	public Asignatura(String codigo, String nombre, boolean esAnual, boolean esObligatoria) {
		super(codigo, nombre);
		EsAnual = esAnual;
		EsObligatoria = esObligatoria;
	}
	
	
	
}
