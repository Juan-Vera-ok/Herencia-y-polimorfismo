
public abstract class Producto {

	protected String FechaEnvasado;
	protected String PaisOrigen;
	protected String FechaCaducidad;
	protected int NumeroLote1;
	
	
	
	
	public Producto(String fechaEnvasado, String paisOrigen, String fechaCaducidad, int numeroLote) {
		super();
		FechaEnvasado = fechaEnvasado;
		PaisOrigen = paisOrigen;
		FechaCaducidad = fechaCaducidad;
		NumeroLote1 = numeroLote;
	}
	protected String getFechaEnvasado() {
		return FechaEnvasado;
	}
	protected void setFechaEnvasado(String fechaEnvasado) {
		FechaEnvasado = fechaEnvasado;
	}
	protected String getPaisOrigen() {
		return PaisOrigen;
	}
	protected void setPaisOrigen(String paisOrigen) {
		PaisOrigen = paisOrigen;
	}
	protected String getFechaCaducidad() {
		return FechaCaducidad;
	}
	protected void setFechaCaducidad(String fechaCaducidad) {
		FechaCaducidad = fechaCaducidad;
	}
	protected int getNumeroLote() {
		return NumeroLote1;
	}
	protected void setNumeroLote(int numeroLote) {
		NumeroLote1 = numeroLote;
	}
	protected int NumeroLote;
	
	
	
	
	
	
}
