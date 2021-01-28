
public class PruebasMedio 
{
	public static void main(String[] args) 
	{
		
		
		Comerciales c1=new Comerciales(4);
		
		Medios m1=new Radio("Diario nuevo dia","Pepito Perez",1234,60,"12:00 am", "Emisora 101.1", "Larry", c1);
		Medios m2=new Television("Diario nuevo dia","Pepito Perez",1234,60,"12:00 am", "Emisora 101.1",2,4,1);
		
		EmpresaMedios e1=new EmpresaMedios(m1);
		EmpresaMedios e2=new EmpresaMedios(m2);
		
		e1.MostrarDatosPrograma();
		e2.MostrarDatosPrograma();
		
		
		
		
	}


}
