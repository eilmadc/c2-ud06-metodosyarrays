/**
 * C2-UD06-Ejercicio 6
 */
package clases;

/**
 * @author elena-01
 *
 */
public class Ejercicio6 {
	private static final String TITULO = "Ejercicio 6: Calcula Numero de Cifras";
	Utils utils = new Utils();

	// PEDIR NUMERO AL USUARIO
	public void pideNumero() {

		String mensaje = "· Introduce número";
		int num;
		int numCifras;

		// Pide Numero
		num = utils.pideInt(mensaje, TITULO);

		if (num == 0) {
			System.out.println("No has introducido número");
		} else {
			System.out.println("NUMERO = " + num);
			numCifras = cuentaCifras(num);
			System.out.println("NUMERO de CIFRAS = " +numCifras);
		}
	}

	public int cuentaCifras(int num) {
		int numCifras = 0;

		while (num != 0) {
			num = num / 10;
			numCifras++;
		}

		return numCifras;
	}

}
