
public class PruebasProducto 
{
	public static void main(String[] args) 
	{
		Producto[] VectorProductos;
      VectorProductos=new Producto[7];
		
		Producto p0=new Fresco("Envasado el 30 de Julio","Argentina","30 de Noviembre",23);
		VectorProductos[0]=p0;
		
		Producto p1=new Refrigerados("Envasado el 30 de Julio","Argentina","30 de Noviembre",23, 38,99999);
		VectorProductos[1]=p1;
		
		
		Producto p2=new Congelados("Envasado el 30 de Julio","Argentina","30 de Noviembre",23, 38);
		VectorProductos[2]=p2;
		
		
		Producto p3=new CongeAire("Envasado el 30 de Julio","Argentina","30 de Noviembre",23, 38,25,25,25,25);
		VectorProductos[3]=p3;
		
		Producto p4=new CongeAgua("Envasado el 30 de Julio","Argentina","30 de Noviembre",23, 38,"38 g/l");
		VectorProductos[4]=p4;
		
		Producto p5=new CongeNitro("Envasado el 30 de Julio","Argentina","30 de Noviembre",23, 38,"Metodo ortodoxo",360);
		VectorProductos[5]=p5;
		
		for(int i=0;i<5;i++) 
		{
			System.out.println(VectorProductos[i].getFechaCaducidad());
			System.out.println(VectorProductos[i].getFechaEnvasado());
			System.out.println(VectorProductos[i].getNumeroLote());
			System.out.println(VectorProductos[i].getPaisOrigen());
			
			
			if(VectorProductos[i]instanceof ConTemperatura) 
			{
			System.out.println(((ConTemperatura) VectorProductos[i]).getTemperaturaReco());}
			
			if(VectorProductos[i]instanceof Refrigerados) 
			{
			System.out.println(((Refrigerados) VectorProductos[i]).getCodigoOrgAlim());}
			
			if(VectorProductos[i]instanceof CongeNitro) 
			{
			System.out.println(((CongeNitro) VectorProductos[i]).getMetodoEmpleado());}
			
			if(VectorProductos[i]instanceof CongeNitro) 
			{
			System.out.println(((CongeNitro) VectorProductos[i]).getTiempoEnSegundos());}
			
			if(VectorProductos[i]instanceof CongeAgua) 
			{
			System.out.println(((CongeAgua) VectorProductos[i]).getGramosLitroAgua());}
			
			if(VectorProductos[i]instanceof CongeAire) 
			{
			System.out.println(((CongeAire) VectorProductos[i]).getNitrogeno());}
			
			if(VectorProductos[i]instanceof CongeAire) 
			{
			System.out.println(((CongeAire) VectorProductos[i]).getOxigeno());}
			
			if(VectorProductos[i]instanceof CongeAire) 
			{
			System.out.println(((CongeAire) VectorProductos[i]).getDioxidoCarbono());}
			
			if(VectorProductos[i]instanceof CongeAire) 
			{
			System.out.println(((CongeAire) VectorProductos[i]).getVaporAgua());}
			
			
			System.out.println("--------------------------------------------------");
				
			
			
		}
		
		
	}

}
