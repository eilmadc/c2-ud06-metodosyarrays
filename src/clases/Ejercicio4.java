/**
 * C2-UD06-Ejercicio 4
 */
package clases;

/**
 * @author elena-01
 *
 */
public class Ejercicio4 {
	private static final String TITULO = "Ejercicio 4";
	Utils utils = new Utils();
	
	// PEDIR NUMERO AL USUARIO
	public void pideNumero() {

		String mensaje = "· Introduce número";
		int num;

		// Pide Numero
		num = utils.pideInt(mensaje, TITULO);

		if (num == 0) {
			System.out.println("No has introducido número");
		} else {
			System.out.println("NUMERO = " + num);
			calculaFactorial(num);
		}
	}
	
	public void calculaFactorial(int num) {
		
		double factorial=num;
		
		for (int i = (num-1); i>0; i--) {
			factorial=factorial*i;
			System.out.println(i);
		}
		
		System.out.println("· FACTORIAL = "+ factorial);
	}
}
