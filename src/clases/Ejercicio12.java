/**
 * C2 - UD06 - Ejercicio 12
 */
package clases;

import java.util.Random;
import java.util.Scanner;

/**
 * @author elena-01
 *
 */
public class Ejercicio12 {

	Scanner scanner = new Scanner(System.in);
	int num[];

	// 1 Funcion inicial
	public void iniciaArray() {
		int size = pideSizeArray();
		rellenaArray(size);
		int digitoFinal = pideDigitoFinal();
		rellenaArray2(digitoFinal, num);
		muestraArray();
	}

	// 2 Pide tamaño de los array
	public int pideSizeArray() {
		System.out.println("· Introduce el tamaño de los arrays: ");
		int size = scanner.nextInt();
		return size;
	}

	// 3 Rellena array con numeros aleatorios
	private void rellenaArray(int size) {

		// Variables
		num = new int[size];
		int max = 300;
		int min = 1;

		// Recorre array y rellena
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) Math.random() * (max - min) + min;
		}
	}

	// Muestra Array
	private void muestraArray(int[] numArray) {

		System.out.println("\nVALORES DEL ARRAY : ");

		for (int i = 0; i < numArray.length; i++) {
			System.out.print(" " + numArray[i]);
		}
	}

	// 4 Pide digito final
	private int pideDigitoFinal() {

		int digito;

		System.out.println("· Introduce el digito final: ");
		digito = Integer.parseInt(scanner.nextLine());

		return digito;
	}

	// 5 TODO: Rellena segundo array
	private void rellenaArray2(int digitoFinal, int[] numArray) {

		int ultimoDigito;
		int nuevoArray[];
		
		for (int i = 0; i < numArray.length; i++) {
			ultimoDigito = numArray[i] % 10;
			if (digitoFinal == ultimoDigito) {
				nuevoArray[i]=numArray[i];
			}
			System.out.print(" " + numArray[i]);
		}
	}
}