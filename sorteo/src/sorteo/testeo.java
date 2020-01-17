package sorteo;

public class testeo {
	public static void main(String[] args) {
		moneda m1 = new moneda( );
		dado d1 = new dado( );
		System.out.print("Lanzo 1 dado y una moneda y me sale: ");
		d1.lanzar( );
		m1.lanzar( );
	}
}
