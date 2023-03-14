import clases.Ejercicio1;
//import clases.Ejercicio2;
import clases.Ejercicio2;
import clases.Ejercicio3;
import clases.Ejercicio4;
import clases.Ejercicio5;
import clases.Ejercicio6;

/**
 * C2-UD06-Clase principal
 */

/**
 * @author elena-01
 *
 */
public class metodosyarrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n****************************************");
		System.out.println("************** C02 * TA06 **************");
		System.out.println("****************************************\n");

		// C2-T06: Ejercicio 1
		System.out.println("************** Ejercicio 1 *************\n");
		Ejercicio1 ejercicio1 = new Ejercicio1();
		ejercicio1.calculaArea();

		// C2-T06: Ejercicio 2
		System.out.println("\n************** Ejercicio 2 *************\n");
		Ejercicio2 ejercicio2 = new Ejercicio2();
		ejercicio2.pedirDatosNumeros();

		// C2-T06: Ejercicio 3
		System.out.println("\n************** Ejercicio 3 *************\n");
		Ejercicio3 ejercicio3 = new Ejercicio3();
		ejercicio3.pideNumero();
		
		// C2-T06: Ejercicio 4
		System.out.println("\n************** Ejercicio 4 *************\n");
		Ejercicio4 ejercicio4 = new Ejercicio4();
		ejercicio4.pideNumero();
		
		// C2-T06: Ejercicio 5
		System.out.println("\n************** Ejercicio 5 *************\n");
		Ejercicio5 ejercicio5 = new Ejercicio5();
		ejercicio5.pideNumero();
		
		// C2-T06: Ejercicio 5
		System.out.println("\n************** Ejercicio 6 *************\n");
		Ejercicio6 ejercicio6 = new Ejercicio6();
		ejercicio6.pideNumero();
	}

}
