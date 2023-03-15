/**
 * C2-UD06-Ejercicio 5
 */
package clases;

/**
 * @author elena-01
 *
 */
public class Ejercicio5 {
	private static final String TITULO = "Ejercicio 5: Pasar de decimal a Binario";
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
			generaBinario(num);
		}
	}

	// GENERAR BINARIO DESDE NUMERO
	public void generaBinario(int num) {
		String numBinario = "";

		while (num > 0) {
			int a = num % 2;
			numBinario = a + numBinario;
			num = num / 2;
		}

		System.out.println(numBinario);

	}

}
