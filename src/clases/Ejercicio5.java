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
		int numBinario[] = new int[12];

		rellenaArray(num, numBinario);
		imprimirArray(numBinario);

	}

	public int[] rellenaArray(int num, int numBinario[]) {
		int cociente = 0;

		for (int i = 0; i <= numBinario.length; i++) {
			cociente = num / 2;
			
			if (cociente > 1) {

				numBinario[i] = num % 2; // resto
				// cociente

				num /= 2; // reducimos num por 2

			} else if (cociente == 1) {
				numBinario[i + 1] = 1;
			}  
			System.out.print(num + " - ");
			System.out.print(cociente + " - ");
			System.out.println(numBinario[i]);
		}

		return numBinario;
	}

	public void imprimirArray(int binario[]) {
		for (int i = 0; i < binario.length; i++) {
			System.out.println(binario[i]);
		}
	}
}
