/**
 * C2 - UD06
 */
package clases;

import java.util.Random;
import java.util.Scanner;

/**
 * @author elena-01
 *
 */
public class Ejercicio10 {

	Scanner scanner = new Scanner(System.in);
	int num[];

	// Pide tamaño del array
	public void pideSizeArray() {
		System.out.println("· Introduce el tamaño del array: ");
		int size = scanner.nextInt();

		System.out.println("· Introduce máximo de valores deseados en el array: ");
		int max = scanner.nextInt();

		System.out.println("· Introduce mínimo de valores deseados en el array: ");
		int min = scanner.nextInt();

		int rango = 10; // entre 0 y 9
		rellenaArray(size, max, min);
	}

	// Rellena el array con numeros entre 0 y 9
	private void rellenaArray(int size, int max, int min) {

		num = new int[size];
		Random random = new Random();

		for (int i = 0; i < num.length; i++) {
			int aux = 0;
			do {
				aux = (int) (Math.random() * (max - min) + min);
			} while (!esPrimo(aux));
			num[i] = aux;
			System.out.println(aux);
		}

		mostrarArray(num);

	}

	// AVERIGUA SI ES PRIMO
	private boolean esPrimo(int aux) {

		boolean primo = true;
		int contador = (aux - 1);

		// Divisiones entre todos los números desde num hasta 1, para comprobar si es un
		// número primo.
		while ((primo) && (contador > 1)) {

			if (aux % contador == 0) {
				primo = false;
				System.out.println("----- Divisible por : " + contador);
			}
			contador--;
		}

		if (primo) {
			System.out.println("----- "+aux + " SI es un número primo");
			return true;
		} else {
			System.out.println("----- "+aux + " NO es un número primo");
			return false;
		}
	}

	// mostrar array
	public void mostrarArray(int[] num) {
		System.out.println("VALORES DEL ARRAY : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(" " + num[i]);
		}
	}

}
