/**
 * C2 -UD06
 */
package clases;

import java.util.Scanner;

/**
 * @author elena-01
 *
 */
public class Ejercicio8 {
	Scanner scanner = new Scanner(System.in);
	int num[] = new int[10];

	public void pideNumeros() {
		System.out.print("Introduce 10 números : ");

		for (int i = 0; i < num.length; i++) {
			num[i] = scanner.nextInt();
		}
		mostrarArray();
	}

	public void mostrarArray() {
		for (int i = 0; i < num.length; i++) {
			System.out.println("Indice: "+i+" - Valor: "+ num[i]);
		}
	}
}
