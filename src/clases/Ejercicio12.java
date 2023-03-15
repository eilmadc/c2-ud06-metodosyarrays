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
		muestraArrayCompleto(num);
		muestraArrayDigito(num);
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
	private void muestraArrayCompleto(int[] numArray) {

		System.out.println("\nVALORES DEL ARRAY : ");

		for (int i = 0; i < numArray.length; i++) {
			System.out.print(" " + numArray[i]);
		}
	}
	
	// Muestra Array
	private void muestraArrayDigito(int[] numArray) {
		
		System.out.println("\nVALORES DEL ARRAY : ");
		int arrayDigito[] = null;
		
		int x = 0;
				
		for (int i = 0; i < numArray.length; i++) {
			System.out.print(" " + numArray[i]);
			if(numArray[i] == pideDigitoFinal()) {
				arrayDigito[x] = numArray[i] % 10;
				System.out.println(numArray[i]);
			}
		}
	}


	// 4 Pide digito final
	private int pideDigitoFinal() {
		
		int digito;

		System.out.println("· Introduce el digito final (0-9): ");
		
		String sc = scanner.next();
		digito = Integer.parseInt(sc);
		
		switch(digito) {
		case 0:
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("Digito introducido correctamente");
			break;
		default:
			System.out.println("Digito incorrecto. Valor comprendido entre 0 y 9");
			break;
		}
		return digito;
	}

	/*
	 * // 5 TODO: Rellena segundo array private void rellenaArray2(int digitoFinal,
	 * int[] numArray) {
	 * 
	 * int ultimoDigito; int nuevoArray[];
	 * 
	 * for (int i = 0; i < numArray.length; i++) { ultimoDigito = numArray[i] % 10;
	 * if (digitoFinal == ultimoDigito) { nuevoArray[i]=numArray[i]; }
	 * System.out.print(" " + numArray[i]); } }
	 */
}