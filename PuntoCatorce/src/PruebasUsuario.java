
public class PruebasUsuario 
{
	public static void main(String[] args) 
	{
		Usuario u1=new Residencial("Hernesto Rojo","111333222");
		Usuario u2=new Comercial("Vanesa Garcia","443999333");
		Usuario u3=new GranUsuario("Pepito Perez","240939483");
		
		
		u1.conexion(181);
		u2.conexion(300);
		
		System.out.println(u1.calculaFacturación());
		System.out.println("--------------------");
		System.out.println(u2.calculaFacturación(200));
		System.out.println("--------------------");
		System.out.println(u3.periodoFacturacion(5));
		System.out.println("--------------------");
		
		
		
	}

}
