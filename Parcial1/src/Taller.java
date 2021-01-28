
public class Taller extends EspacioCurricular 
{
	protected double Horas;
	protected boolean ManejoDeOffice;
	protected boolean InglesBasico;
	
	public Taller(String codigo, String nombre, double horas, boolean manejoDeOffice, boolean inglesBasico) {
		super(codigo, nombre);
		Horas = horas;
		ManejoDeOffice = manejoDeOffice;
		InglesBasico = inglesBasico;
	}

	protected double getHoras() {
		return Horas;
	}

	protected void setHoras(double horas) {
		Horas = horas;
	}

	protected boolean isManejoDeOffice() {
		return ManejoDeOffice;
	}

	protected void setManejoDeOffice(boolean manejoDeOffice) {
		ManejoDeOffice = manejoDeOffice;
	}

	protected boolean isInglesBasico() {
		return InglesBasico;
	}

	protected void setInglesBasico(boolean inglesBasico) {
		InglesBasico = inglesBasico;
	}
	
	
	

}
