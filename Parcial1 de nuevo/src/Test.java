import java.util.Vector;
public class Test 
{
	protected Vector vecPreguntas;

	public Test(int cantidadPreguntas) {
		super();
		this.vecPreguntas=new Vector(cantidadPreguntas);
	}
	
	public void addPregunta(Preguntas a)
	{vecPreguntas.addElement(a);}
	
	public void quitarPregunta() 
	{vecPreguntas.remove(vecPreguntas.lastElement());}
	
	public void quitarTodo()
	{vecPreguntas.removeAllElements();}
	
	public void ListarPreguntasYRespuestasOpcionMultiple() 
	{
		for(int i=0;i<this.vecPreguntas.size();i=i+1) 
		{
			Preguntas a=(Preguntas)this.vecPreguntas.elementAt(i);
			if(a instanceof OpcionMultiple) 
			{
			OpcionMultiple a1=(OpcionMultiple)a;	
			System.out.println(a1.getEnunciado());
			System.out.println(a1.getRespuesta());
			}
		}
	}
	
	public int CantidadPreguntasTextoLibre() 
	{
		int cantidadTextoLibre=0;
		for(int i=0;i<this.vecPreguntas.size();i=i+1) 
		{
			Preguntas b=(Preguntas)this.vecPreguntas.elementAt(i);
			if(b instanceof TextoLibre) 
			{
			TextoLibre b1=(TextoLibre)b;
			cantidadTextoLibre=cantidadTextoLibre+1;
			}
		}
		return cantidadTextoLibre;
	}
	
	
	

}
