
public class Test {
	public static void main(String[] args) 
		{
		
		AA p = new AA();
		BB q = new BB();
		CC r = new CC();;
		int M;

		
		p = q;
		System.out.println(M = q.g() + p.g() + r.g());
		q = r;
		r = null;
		System.out.println(M = q.h());
		
		}

					}
