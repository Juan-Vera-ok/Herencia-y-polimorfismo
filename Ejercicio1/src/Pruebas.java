
public class Pruebas {

	public static void main(String[] args) 
	{			
			
		
		Avion a=new Avion(5);
		
			int op;
			
			do
			{
				System.out.println("Opcion 1: Agregar persona");
				System.out.println("Opcion 2: Quitar persona");			
				System.out.println("Opcion 3: Lista de personas");
				System.out.println("Opcion 4: Cambiar fecha de viaje");
				System.out.println("Opcion 5: Cambiar destino");
				System.out.println("----------------------------");
				op= Console.readInt("Ingrese opción");
				System.out.println("----------------------------");
				
				switch(op)
				{
					case 1:
					{
						String a1=Console.readString("Ingrese Origen");
						String b=Console.readString("Ingrese Destino") ;
						String c=Console.readString("Ingrese NombrePasajero");
						String d=Console.readString("Ingrese DniPasajero");
						String e=Console.readString("Ingrese FechaDeViaje");
						double f=Console.readDouble("Ingrese importe");
						String g=Console.readString("Ingrese clase");
						String h="Primera clase";
						String i="Turista";
						String j="Clase economica";
						if(g.equals(h)) {
						Boleto aux= new PrimeraClase(a1,b,c,d,e,f);
						a.addPersona(aux);}
						
						if(g.equals(i)) {
							Boleto aux= new Turista(a1,b,c,d,e,f);
							a.addPersona(aux);}
						
						if(g.equals(j)) {
							Boleto aux= new ClaseEconomica(a1,b,c,d,e,f);
							a.addPersona(aux);}
					
						
					break;
					}
					case 2:	
					{
						String personaName=Console.readString("Ingrese persona a eliminar");
						a.removePersona(personaName);
					break;
					}
					case 3:
					{
						a.listPersonas();
						break;
					}
					case 4:
					{
						String personaName=Console.readString("Ingrese persona para cambiar fecha");
						a.searchContact(personaName);
						if(a.searchContact(personaName)==true) {
							String fechaDeViaje=Console.readString("Ingrese fecha nueva");
							a.searchContacts(personaName).setFechaDeViaje(fechaDeViaje);}
					break;	
					}
					case 5:
					{
						String personaName=Console.readString("Ingrese persona para cambiar destino");
						a.searchContact(personaName);
						if(a.searchContact(personaName)==true) {
							String DestinoNuevo=Console.readString("Ingrese destino nuevo");
							a.searchContacts(personaName).setFechaDeViaje(DestinoNuevo);}
						break;
					}
				}
					
			}while(op!=-1);
	}

}
