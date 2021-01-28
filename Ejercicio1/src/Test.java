
public class Test {
	
	
	public static void main(String[] args) {
		
		
	Boleto [] PersonasBoletos= new Boleto[5];
	
	
	Boleto b0 = new PrimeraClase("Rio Gallegos","Buenos Aires","Fulano Perez","15343434","13 de Marzo",4000);
	Boleto b1 = new Turista("28 de Noviembre","Cordoba","Maria Garcia","40390434","21 de Julio",2000);
	Boleto b2 = new ClaseEconomica("Puerto San Julian","Chile","Pepe Ramirez","20656464","31 de Diciembre",1000);
	
	
	PersonasBoletos[0]=b0;
	PersonasBoletos[1]=b1;
	PersonasBoletos[2]=b2;
	
	for(int i=0;i<3;i++) {
	System.out.println(PersonasBoletos[i].getNombrePasajero());
	 System.out.println(PersonasBoletos[i].getDniPasajero());
	 System.out.println(PersonasBoletos[i].getOrigen());
	 System.out.println(PersonasBoletos[i].getDniPasajero());
	 System.out.println(PersonasBoletos[i].getFechaDeViaje());
	 System.out.println(PersonasBoletos[i].getDestino());
	 System.out.println(PersonasBoletos[i].getImporte());
	 
	 if(PersonasBoletos[i]instanceof PrimeraClase) 
		 System.out.println("Primera Clase");
		 
	 if(PersonasBoletos[i]instanceof Turista) 
		 System.out.println("Turista");
	 
	 if(PersonasBoletos[i]instanceof ClaseEconomica) 
		 System.out.println("Clase Economica");
		 
	 
	 
	 System.out.println("-------------------------");
	 
	}
	
	for(int i=0;i<3;i++) {
	PersonasBoletos[i].setFechaDeViaje("1 de Enero");
	PersonasBoletos[i].setDestino("Jujuy");
	}
	
	System.out.println("---------------------------------");
	
	for(int i=0;i<3;i++) {
		System.out.println(PersonasBoletos[i].getNombrePasajero());
		 System.out.println(PersonasBoletos[i].getDniPasajero());
		 System.out.println(PersonasBoletos[i].getOrigen());
		 System.out.println(PersonasBoletos[i].getDniPasajero());
		 System.out.println(PersonasBoletos[i].getFechaDeViaje());
		 System.out.println(PersonasBoletos[i].getDestino());
		 System.out.println(PersonasBoletos[i].getImporte());
		 
		 if(PersonasBoletos[i]instanceof PrimeraClase) 
			 System.out.println("Primera Clase");
			 
		 if(PersonasBoletos[i]instanceof Turista) 
			 System.out.println("Turista");
		 
		 if(PersonasBoletos[i]instanceof ClaseEconomica) 
			 System.out.println("Clase Economica");
		 
		 
		 System.out.println("-------------------------");
		 
		 
		}
	
	
	
	
	
	}
	
}
