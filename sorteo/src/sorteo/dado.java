package sorteo;

public class dado extends sorteo{
	dado( ) { posibilidades = 6;}
	public int lanzar( ) {
		int dato = (int) (Math.random( ) * posibilidades +1);
		System.out.println(dato);
		return dato;
	}
}