
public class TextoLibre extends Preguntas
{
	protected String Text;
	
	public TextoLibre(int numero, String enunciado, String respuesta, String text) {
		super(numero, enunciado, respuesta);
		Text = text;
	}

	protected String getText() {
		return Text;
	}

	protected void setText(String text) {
		Text = text;
	}
	
}
