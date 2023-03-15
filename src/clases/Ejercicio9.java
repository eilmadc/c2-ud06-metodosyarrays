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
public class Ejercicio9 {

	Scanner scanner = new Scanner(System.in);
	int num[];

	//Pide tamaño del array
	public void pideSizeArray() {
		System.out.println("Introduce el tamaño del array: ");
		int size = scanner.nextInt();
		int rango = 10; //entre 0 y 9
		rellenaArray(size,rango);
	}

	//Rellena el array con numeros entre 0 y 9
	private void rellenaArray(int size, int rango) {
		num = new int[size];
		Random random = new Random();
		
		for (int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(rango) ;
		}

		mostrarArray(num);
		sumaArray(num);
	}

	//sumar array
	private void sumaArray(int[] num2) {
		int suma=0;
		for (int i = 0; i < num2.length; i++) {
			suma= suma + num2[i];
		}
		System.out.println("\nSUMA = "+ suma);
	}

	//mostrar array
	public void mostrarArray(int[] num) {
		System.out.println("VALORES DEL ARRAY : ");
		for (int i = 0; i < num.length; i++) {
			System.out.print(" " + num[i]);
		}
	}

}
