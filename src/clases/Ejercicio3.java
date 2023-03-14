/**
 * C2-UD06-Ejercicio 3
 */
package clases;

/**
 * @author elena-01
 *
 */
public class Ejercicio3 {
	private static final String TITULO = "Ejercicio 3";
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
			esPrimo(num);
		}
	}

	// AVERIGUA SI ES PRIMO
	private void esPrimo(int num) {

		boolean primo = true;
		int contador = (num - 1);
		

		//Divisiones entre todos los números desde num hasta 1, para comprobar si es un número primo.
		while ((primo) && (contador > 1)) {
			
			if (num % contador == 0) {
				primo = false;
				System.out.println("Divisible por : " + contador);
			}
			contador--;
		}

		if (primo)
			System.out.println(num + " SI es un número primo");
		else
			System.out.println(num + " NO es un número primo");
	}

}
