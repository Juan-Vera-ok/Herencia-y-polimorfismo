
public class Turista extends Boleto
{
	public Turista(String origen, String destino, String nombrePasajero, String dniPasajero, String fechaDeViaje,
			double importe) {
		super(origen, destino, nombrePasajero, dniPasajero, fechaDeViaje, importe);
	}

	final double Recargo=1.1;
	
	protected void setFechaDeViaje(String FechaRecargo) 
	{
		this.FechaDeViaje=FechaRecargo;
		this.Importe=Importe*Recargo;
		System.out.println("Se cambio la fecha a cambio de un recargo");
	}
	
	protected void setDestino(String DestinoRecargo) 
	{
		this.Destino = DestinoRecargo;
		this.Importe =Importe*Recargo;
		System.out.println("Se cambio el destino a cambio de un recargo");
	}
	
}
