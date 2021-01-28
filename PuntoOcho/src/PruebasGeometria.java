
public class PruebasGeometria 
{
	
	public static void main(String[] args) {
	
	
	Pizarra p= new Pizarra("Negro");
	Figura k1= new Linea("Linea 1","Blanco","Blanco",2);
	Figura k2= new Circunferencia("Circulo 1","Blanco","Blanco",2,4);
	Figura k3= new Rectangulo("Rectangulo 1","Blanco","Blanco",2,2);
	
	
	
	
	p.agregarFigura(k1);

	p.agregarFigura(k2);

	p.agregarFigura(k3);
	
	p.mostrarFiguras();
	p.dibujarPizarra();;
	System.out.println();
	System.out.println(p.SuperficiePizarra());
	System.out.println(p.PerimetroPizarra());
	p.limpiarLista();
	p.mostrarFiguras();
	
	
	}
}
