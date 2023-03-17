package main;
import clases.Ejercicio1;
import clases.Ejercicio10;
import clases.Ejercicio11;
import clases.Ejercicio12;
//import clases.Ejercicio2;
import clases.Ejercicio2;
import clases.Ejercicio3;
import clases.Ejercicio4;
import clases.Ejercicio5;
import clases.Ejercicio6;
import clases.Ejercicio7;
import clases.Ejercicio8;
import clases.Ejercicio9;

/**
 * C2-UD06-Clase principal
 */

/**
 * @author elena-01
 *
 */
public class metodosyarraysApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		  System.out.println("\n****************************************");
		  System.out.println("************** C02 * TA06 **************");
		  System.out.println("****************************************\n");
		  
		  // C2-T06: Ejercicio 1
		  System.out.println("************** Ejercicio 1 *************\n"); Ejercicio1
		  ejercicio1 = new Ejercicio1(); ejercicio1.calculaArea();
		  
		  // C2-T06: Ejercicio 2
		  System.out.println("\n************** Ejercicio 2 *************\n");
		  Ejercicio2 ejercicio2 = new Ejercicio2(); ejercicio2.pedirDatosNumeros();
		  
		  // C2-T06: Ejercicio 3
		  System.out.println("\n************** Ejercicio 3 *************\n");
		  Ejercicio3 ejercicio3 = new Ejercicio3(); ejercicio3.pideNumero();
		  
		  // C2-T06: Ejercicio 4
		  System.out.println("\n************** Ejercicio 4 *************\n");
		  Ejercicio4 ejercicio4 = new Ejercicio4(); ejercicio4.pideNumero();
		  
		  // C2-T06: Ejercicio 5
		  System.out.println("\n************** Ejercicio 5 *************\n");
		  Ejercicio5 ejercicio5 = new Ejercicio5(); ejercicio5.pideNumero();
		  
		  // C2-T06: Ejercicio 6
		  System.out.println("\n************** Ejercicio 6 *************\n");
		  Ejercicio6 ejercicio6 = new Ejercicio6(); ejercicio6.pideNumero();
		  
		  // C2-T06: Ejercicio 7
		  System.out.println("\n************** Ejercicio 7 *************\n");
		  Ejercicio7 ejercicio7 = new Ejercicio7(); ejercicio7.convierteMoneda();
		  
		  // C2-T06: Ejercicio 8 - Sin dialog
		  System.out.println("\n************** Ejercicio 8 *************\n");
		  Ejercicio8 ejercicio8 = new Ejercicio8(); ejercicio8.pideNumeros();
		  
		  // C2-T06: Ejercicio 9 - Sin dialog
		  System.out.println("\n************** Ejercicio 9 *************\n");
		  Ejercicio9 ejercicio9 = new Ejercicio9(); ejercicio9.pideSizeArray();
		  
		  // C2-T06: Ejercicio 10 - Sin dialog
		  System.out.println("\n************** Ejercicio 10 *************\n");
		  Ejercicio10 ejercicio10 = new Ejercicio10(); ejercicio10.pideSizeArray();
		 

		// C2-T06: Ejercicio 11 - Sin dialog
		System.out.println("\n************** Ejercicio 11 *************\n");
		Ejercicio11 ejercicio11 = new Ejercicio11();
		ejercicio11.iniciaArray();

		// C2-T06: Ejercicio 12 - Sin dialog
		System.out.println("\n************** Ejercicio 12 *************\n");
		Ejercicio12 ejercicio12 = new Ejercicio12();
		ejercicio12.iniciaArray();
	}

}
