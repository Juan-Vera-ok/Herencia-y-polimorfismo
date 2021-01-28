
public class PrimeraClase extends Boleto
{

	public PrimeraClase(String origen, String destino, String nombrePasajero, String dniPasajero, String fechaDeViaje,
			double importe,String aerolinea) {
		super(origen, destino, nombrePasajero, dniPasajero, fechaDeViaje, importe, aerolinea);
	}
	
	
	protected void setFechaDeViaje(String Fecha) 
	{
		super.setFechaDeViaje(Fecha);
		System.out.println("Se cambio la fecha SIN recargo");
	}
	
	protected void setDestino(String Destino) 
	{
		super.setDestino(Destino);
		System.out.println("Se cambio el destino SIN recargo");
	}

}
