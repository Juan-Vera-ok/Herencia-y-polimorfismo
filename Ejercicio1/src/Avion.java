

	
	public class Avion {
		 private Boleto [] PersonasBoletos;
		 private int size, next;
		 
		public Avion(int n){
		 this.size=n;
		 this.PersonasBoletos = new Boleto[size];
		 this.next=0;
		}
		
		public void addPersona(Boleto boleto) {
		 if (!(this.next < this.size))
		 this.enlarge();
		 PersonasBoletos[next]=boleto;
		 this.next++;
		}
		public void removePersona(String personaName){
		 boolean found=false;
		 int count=0;
		 Boleto aux;
		 while(!found && count<next){
		 if (PersonasBoletos[count] != null) {
		 aux=PersonasBoletos[count];
		 if (aux.getNombrePasajero().equals(personaName))
		 found=true;
		 }
		 count++;
		 }
		 
		 if (found)
		 PersonasBoletos[count-1]= null;
		}
		
		public boolean searchContact(String personaName){
		 boolean found=false;
		 int count=0;
		 Boleto aux;
		 while(!found && count<next) {
		 if (PersonasBoletos[count] != null) {
		 aux=PersonasBoletos[count];
		 if (aux.getNombrePasajero().equals(personaName))
		 found=true;
		 }
		 count++;
		 }
		 return found;
		}
		
		public Boleto searchContacts(String personaName){
			 boolean found=false;
			 int count=0;
			 Boleto aux=new Boleto(null,null,null,null,null,0);
			 while(!found && count<next) {
			 if (PersonasBoletos[count] != null) {
			 aux=PersonasBoletos[count];
			 if (aux.getNombrePasajero().equals(personaName))
			 found=true;
			 }
			 count++;
			 }
			 return aux;
			}
		
		
		
		public void listPersonas() {
		 int count=0;
		 Boleto aux;
		 while(count<next) {
		 if (PersonasBoletos[count] != null) 
		 {
		 aux=PersonasBoletos[count];
		 System.out.println(aux.getNombrePasajero());
		 System.out.println(aux.getDniPasajero());
		 System.out.println(aux.getOrigen());
		 System.out.println(aux.getDniPasajero());
		 System.out.println(aux.getFechaDeViaje());
		 System.out.println(aux.getDestino());
		 
		 if (aux instanceof PrimeraClase) 
				System.out.println("Primera clase");
		
		if (aux instanceof Turista)
					System.out.println("Turista");
			
		if (aux instanceof ClaseEconomica)
				System.out.println("Clase Economica");
		 
		 
		 }
		 }
		 count++;
		 }
		
		private void enlarge() 
		{
		 int count2=0;
		 Boleto [] aux=new Boleto[size+100];
		 for(int count1=0; count1<size; count1++) 
		 {
			 if (PersonasBoletos[count1] != null) 
			 {
			 aux[count2]=PersonasBoletos[count1];
			 count2++;
			 }
		 }
		 this.PersonasBoletos = aux;
		 this.next=count2;
		 this.size=size+100;
		}
		
		
	
		
		
	
	}
	
	
	

