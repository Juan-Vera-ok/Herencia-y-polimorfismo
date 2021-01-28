import java.util.Vector;
public class PruebasParcial {

	public static void main(String[] args) 
	{
		

		Universidad u1=new Universidad("UNPA",5);
		
		Asignatura a1=new Asignatura("12345", "Lengua", false, false);

		Asignatura a2=new Asignatura("22222", "Matematica", true,false);

		Taller t1=new Taller("54321", "Practicas", 40, false, false);
		Taller t2=new Taller("11111", "Laboratorio", 60, false, false);
		
		u1.addEspacioCurricular(a1);
		u1.addEspacioCurricular(a2);
		u1.addEspacioCurricular(t1);
		u1.addEspacioCurricular(t2);
		
		System.out.println("Cantidad de asignaturas");
		System.out.println(u1.CantidadAsignaturas());

		System.out.println("Cantidad de talleres");
		System.out.println(u1.CantidadTalleres());
		

		
		System.out.println("----------------------------");
		

		System.out.println("Cantidad de asignaturas semestrales y optativas");
		System.out.println(u1.CantidadAsignaturasSemetralesYOptativas());
		
		System.out.println("Cantidad promedio talleres");
		System.out.println(u1.CantidadHorasPromedioTalleres());
		
		
		System.out.println("----------------------------");
		
		u1.NombreYCodigoEspaciosCurriculares();

		

	}

}
