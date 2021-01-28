
public class PruebasParcialDeNuevo 
{
	public static void main(String[] args) 
	{
		Preguntas p1=new VerdaderoOFalso(15,"El COVID surgio en China","Verdadero");
		Preguntas p2=new OpcionMultiple(23,"El COVID surgio en...","China","USA","Argentina","China");
		Preguntas p3=new TextoLibre(9,"¿Dónde surgió el COVID-19?","En China","En China");
		
		Test t1=new Test(3);
		
		t1.addPregunta(p1);
		t1.addPregunta(p2);
		t1.addPregunta(p3);
		
		
		t1.ListarPreguntasYRespuestasOpcionMultiple();
		System.out.println(t1.CantidadPreguntasTextoLibre());
	}

}
