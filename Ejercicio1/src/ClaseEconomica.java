
public class ClaseEconomica extends Boleto
{
	public ClaseEconomica(String origen, String destino, String nombrePasajero, String dniPasajero, String fechaDeViaje,
			double importe) {
		super(origen, destino, nombrePasajero, dniPasajero, fechaDeViaje, importe);
		//
	}

	protected void setFechaDeViaje(String FechaRecargo) 
	{
		System.out.println("No es posible cambiar la fecha de clases economicas");
	}
	
	protected void setDestino(String DestinoRecargo) 
	{
		System.out.println("No es posible cambiar el destino de clases economicas");
	}
}
