class Usuario {
private String nombre, dni;
private int cuenta;
Usuario (String d, String n)
{ nombre = n;
dni = d;
cuenta = 0;}
void conexion (int s) // Contabiliza "s‟ segundos en la cuenta
{ cuenta = cuenta + s;}
double calculaFacturación() //Calcula el importe facturable
{ return cuenta * 0.32; }
void reset() // Pone a cero la cuenta
{ cuenta = 0;}
}