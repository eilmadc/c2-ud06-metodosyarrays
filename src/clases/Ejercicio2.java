/**
 * C2-UD06-Ejercicio2
 */
package clases;

/**
 * @author elena-01
 *
 */
public class Ejercicio2 {
	private static final String TITULO = "Ejercicio 2";
	Utils utils = new Utils();

	// Pedir cantidad, rango de numeros.
	public void pedirDatosNumeros() {

		String mensaje1 = " · ¿Cuántos números aleatorios quieres generar?";
		String mensaje2 = " · Rango de números. Escribe MAXIMO:";
		String mensaje3 = " · Rango de números. Escribe MINIMO:";

		// Pide la cantidad de números a generar
		int numeros = utils.pideInt(mensaje1, TITULO);
		if (numeros > 0) {
			// Pide rango de numeros: Maximo y minimo
			int max = utils.pideInt(mensaje2, TITULO);
			int min = utils.pideInt(mensaje3, TITULO);

			// Mensajes consola con datos introducidos.
			System.out.println("· CANTIDAD de NúMEROS = " + numeros);
			System.out.println("· RANGO DE VALORES:");
			System.out.println("máximo = " + max);
			System.out.println("mínimo = " + min);

			// Genera números aleatorios
			generaNumerosAleatorios(numeros, max, min);
		}
	}

	// Genera números aleatorios.
	public void generaNumerosAleatorios(int cantidad, int max, int min) {

		for (int i = 0; i < cantidad; i++) {
			int num = (int) (Math.random() * (max - min) + min);
			System.out.println(num);
		}
	}
}
