package sorteo;

public class moneda extends sorteo {
	moneda( ) { posibilidades = 2;}
	public int lanzar( ) {
		int dato = (int) (Math.random( ) * posibilidades +1);
		if (dato ==1)
			System.out.println("CARA");
		else
			System.out.println("CRUZ");
		return dato;
	}
}