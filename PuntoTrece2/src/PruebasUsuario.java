import java.util.Vector;
public class PruebasUsuario 
{
	public static void main(String[] args) 
	{
		Residencial u1=new Residencial("Hernesto Rojo","111333222");
		Comercial u2=new Comercial("Vanesa Garcia","443999333");
		GranUsuario u3=new GranUsuario("Pepito Perez","240939483");
		
		
		u1.conexion(181);
		u2.conexion(300);
		Vector vecConex= new Vector(5);
		
	
			vecConex.addElement(500);
			vecConex.addElement(400);
			vecConex.addElement(100);
			vecConex.addElement(900);
			vecConex.addElement(30);
			
		
		
		
		
		
		System.out.println(u1.calculaFacturación());
		System.out.println("--------------------");
		System.out.println(u2.calculaFacturación(60));
		System.out.println("--------------------");
		System.out.println(u3.periodoFacturacion(vecConex));
		System.out.println("--------------------");
		
		
		
	}

}
