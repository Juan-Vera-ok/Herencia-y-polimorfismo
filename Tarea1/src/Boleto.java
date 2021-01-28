
public class Boleto 
{
	protected String Origen;
	protected String Destino;
	protected String NombrePasajero;
	protected String DniPasajero;
	protected String FechaDeViaje;
	protected double Importe;
	protected String Aerolinea;
	
	public Boleto(String origen, String destino, String nombrePasajero, String dniPasajero, String fechaDeViaje,
			double importe, String aerolinea) 
	{
		this.Origen = origen;
		this.Destino = destino;
		this.NombrePasajero = nombrePasajero;
		this.DniPasajero = dniPasajero;
		this.FechaDeViaje = fechaDeViaje;
		this.Importe = importe;
		this.Aerolinea= aerolinea;
	}
	protected String getAerolinea() {
		return this.Aerolinea;
	}
	protected void setAerolinea(String aerolinea) {
		Aerolinea = aerolinea;
	}
	protected String getOrigen() {
		return Origen;
	}
	protected void setOrigen(String origen) {
		Origen = origen;
	}
	protected String getDestino() {
		return Destino;
	}
	protected void setDestino(String destino) {
		Destino = destino;
	}
	protected String getNombrePasajero() {
		return NombrePasajero;
	}
	protected void setNombrePasajero(String nombrePasajero) {
		NombrePasajero = nombrePasajero;
	}
	protected String getDniPasajero() {
		return DniPasajero;
	}
	protected void setDniPasajero(String dniPasajero) {
		DniPasajero = dniPasajero;
	}
	protected String getFechaDeViaje() {
		return FechaDeViaje;
	}
	protected void setFechaDeViaje(String fechaDeViaje) {
		FechaDeViaje = fechaDeViaje;
	}
	protected double getImporte() {
		return Importe;
	}
	protected void setImporte(double importe) {
		Importe = importe;
	}
	
}

