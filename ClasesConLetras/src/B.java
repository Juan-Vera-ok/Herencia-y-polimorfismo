public class B extends A {
private int atributoB;
public B(){super(); this.atributoB=2;}
public void metodoA(){System.out.println("Método redefindo en B");}
public void metodoB(){System.out.println("Método B");}

public void imprimirAtributoB(){System.out.println(this.atributoB);}

private void metodoP(){System.out.println("Método privado");}
}