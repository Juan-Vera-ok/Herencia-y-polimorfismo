
public class OpcionMultiple extends Preguntas
{
	protected String Opcion1;
	protected String Opcion2;
	protected String Opcion3;
	
	public OpcionMultiple(int numero, String enunciado, String respuesta, String opcion1, String opcion2, String opcion3) {
		super(numero, enunciado, respuesta);
		Opcion1 = opcion1;
		Opcion2 = opcion2;
		Opcion3 = opcion3;
	}
	
	
	protected String getOpcion1() {
		return Opcion1;
	}
	protected void setOpcion1(String opcion1) {
		Opcion1 = opcion1;
	}
	protected String getOpcion2() {
		return Opcion2;
	}
	protected void setOpcion2(String opcion2) {
		Opcion2 = opcion2;
	}
	protected String getOpcion3() {
		return Opcion3;
	}
	protected void setOpcion3(String opcion3) {
		Opcion3 = opcion3;
	}
	
	
	
}
