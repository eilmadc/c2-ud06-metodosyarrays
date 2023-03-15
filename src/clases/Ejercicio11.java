/**
 * C2 - UD06 - Ejercicio 11
 */
package clases;

import java.util.Random;
import java.util.Scanner;

/**
 * @author elena-01
 *
 */
public class Ejercicio11 {

	Scanner scanner = new Scanner(System.in);
	int num1[];
	int num2[];

	//1 Funcion inicial
	public void iniciaArray() {
		int size = pideSizeArray();
		rellenaArray(size);
	}

	// 2 Pide tamaño de los array
	public int pideSizeArray() {
		System.out.println("· Introduce el tamaño de los arrays: ");
		int size = scanner.nextInt();
		return size;
	}

	//3 Rellena los 2 arrays, uno con numeros aleatorios y el otro reasignados
	private void rellenaArray(int size1) {

		// Variables
		Random random = new Random();
		num1 = new int[size1];
		//num2 = new int[size1];

		// Recorrer arrays
		for (int i = 0; i < num1.length; i++) {
			num1[i] = random.nextInt();
		}
		
		//muestra array1 
		muestraArray(num1,1);
		
		//Asigno array 1 a array 2
		num2=num1;

		//relleno array2
		for (int i = 0; i < num2.length; i++) {
			num2[i] = random.nextInt();
		}
		
		multiplicaArrays(num1, num2);


	}

	//Multiplica valores array 1 y 2
	private void multiplicaArrays(int[] a1, int[] a2) {
		//tercer array
		int num3[] = new int[a1.length];
		
		// Recorrer arrays
		for (int i = 0; i < num1.length; i++) {
			num3[i] = num2[i] * num1[i];
		}
		
		muestraArray(num1,1);
		muestraArray(num2,2);
		muestraArray(num3,3);
	}

	private void muestraArray(int[] numArray, int numero) {
		System.out.println("\nVALORES DEL ARRAY "+numero+": ");
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(" " + numArray[i]);
		}
		System.out.println("\n");
	}

}
