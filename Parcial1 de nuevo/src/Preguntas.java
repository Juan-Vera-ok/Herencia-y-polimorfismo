
public class Preguntas 
{
	protected int Numero;
	protected String Enunciado;
	protected String Respuesta;
	
	
	public Preguntas(int numero, String enunciado, String respuesta) {
		super();
		Numero = numero;
		Enunciado = enunciado;
		Respuesta = respuesta;
	}
	protected int getNumero() {
		return Numero;
	}
	protected void setNumero(int numero) {
		Numero = numero;
	}
	protected String getEnunciado() {
		return Enunciado;
	}
	protected void setEnunciado(String enunciado) {
		Enunciado = enunciado;
	}
	protected String getRespuesta() {
		return Respuesta;
	}
	protected void setRespuesta(String respuesta) {
		Respuesta = respuesta;
	}
	
	

}
