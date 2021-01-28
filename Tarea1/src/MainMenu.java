import java.util.Vector;
public class MainMenu {

	public static void main(String[] args) 
	{
		
		Agencia Agen1=new Agencia("Aerolinea 2", 5);
		
		int op;
		
		do
		{
			System.out.println("Opcion 1: Agregar persona");
			System.out.println("Opcion 2: Quitar última persona");			
			System.out.println("Opcion 3: Borrar todo");
			System.out.println("Opcion 4: Boletos vendidos en una determinada aerolínea");
			System.out.println("Opcion 5: Recaudado por Primera clase");
			System.out.println("Opcion 6: Recaudado por Clase turista");
			System.out.println("Opcion 7: Recaudado por Clase Economica");
			System.out.println("Opcion 8: Buscar pasajero por DNI");
			System.out.println("Opcion 9: Lista de pasajeros Clase Economica y determinada aerolinea");
			System.out.println("Opcion 10: Lista de pasajeros Clase Turista y determinado destino");
			System.out.println("----------------------------");
			op=Console.readInt("Ingrese opción");
			System.out.println("----------------------------");
			
			switch(op)
			{
				case 1:
				{
					String a=Console.readString("Ingrese Origen");
					String b=Console.readString("Ingrese Destino") ;
					String c=Console.readString("Ingrese NombrePasajero");
					String d=Console.readString("Ingrese DniPasajero");
					String e=Console.readString("Ingrese FechaDeViaje");
					double f=Console.readDouble("Ingrese importe");
					String g=Console.readString("Ingrese aerolinea");
					System.out.println("Primera Clase:i");
					System.out.println("Clase Turista:j");
					System.out.println("Clase Economica:k");
					String h=Console.readString("Ingrese clase");
					String i="i";
					String j="j";
					String k="k";
					if(h.equals(i)) {
					PrimeraClase aux= new PrimeraClase(a,b,c,d,e,f,g);
					Agen1.addBoleto(aux);}
					
					if(h.equals(j)) {
					Turista aux= new Turista(a,b,c,d,e,f,g);
					Agen1.addBoleto(aux);}
					
					if(h.equals(k)) {
					ClaseEconomica aux= new ClaseEconomica(a,b,c,d,e,f,g);
					Agen1.addBoleto(aux);}
				break;
				}
				case 2:	
				{
					Agen1.removeBoleto();
				break;
				}
				case 3:
				{
					Agen1.removeAllBoletos();
					break;
				}
				case 4:
				{
					String c=Console.readString("Ingrese Aerolinea");
					System.out.println(Agen1.BoletosTotalAerolinea(c));
				break;	
				}
				case 5:
				{
					System.out.println(Agen1.recaudadoPorPrimera());
					break;
				}
				case 6:
				{
					System.out.println(Agen1.recaudadoPorTurista());
					break;
				}
				case 7:
				{
					System.out.println(Agen1.recaudadoPorEconomica());
					break;
				}
				case 8:
				{
					String c=Console.readString("Ingrese DNI del pasajero");
					System.out.println(Agen1.buscarPasajeroDni(c).getNombrePasajero());
					System.out.println(Agen1.buscarPasajeroDni(c).getDniPasajero());
					break;
				}
				case 9:
				{
					String c=Console.readString("Clase Economica:Ingrese Aerolinea para buscar");
					Agen1.listaClaseEconomicaAerolinea(c);
					break;
				}
				case 10:
				{
					String c=Console.readString("Ingrese destino para buscar");
					Agen1.listaClaseTuristaDestino(c);
					break;
				}
			}
				
		}while(op!=-1);

	}

}
