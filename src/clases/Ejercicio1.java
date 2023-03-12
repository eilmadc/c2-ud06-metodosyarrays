/**
 * 
 */
package clases;

import javax.swing.JOptionPane;

/**
 * @author elena-01
 *
 */
public class Ejercicio1 {

	private static final String TITULO = "Ejercicio 1";
	Utils utils = new Utils();

	public void calculaArea() {

		String mensaje1 = "· ¿De qué figura deseas calcular el Área? ( Circulo, Triangulo, Cuadrado) ";
		String figura = utils.pideString(mensaje1, TITULO);
		System.out.println(figura);
		if (figura == null) {
			System.out.println("· No has introducido dato");

		} else {

			switch (figura.toUpperCase()) {
			case "CIRCULO":
				calculaAreaCirculo();
				break;
			case "TRIANGULO":
				calculaAreaTriangulo();
				break;
			case "CUADRADO":
				calculaAreaCuadrado();
				break;
			default:
				System.out.println("No has escrito la forma Circulo, Triangulo o Cuadrado. ");
			}
		}
	}

	private void calculaAreaCirculo() {

		String mensaje = "Introduce RADIO : ";
		String mensajeError = "No has introducido dato";

		Double radio=0.0;
		radio = utils.pideDouble(mensaje, TITULO);
		System.out.println(radio);
		
		if (radio == null) {
			System.out.println(mensajeError);
		} else {
			Double areaCirculo = Math.pow(radio, 2) * Math.PI;
			System.out.println("RADIO = " + String.format("%.3f", radio));
			System.out.println("AREA CIRCULO = " + String.format("%.2f", areaCirculo));
			utils.mostrarMensajeDialog("AREA CIRCULO = " + String.format("%.2f", areaCirculo), TITULO);
		}

	}

	private void calculaAreaTriangulo() {

		String mensajeBase = "Introduce BASE : ";
		String mensajeAltura = "Introduce ALTURA : ";
		String mensajeError = "No has introducido dato";

		Double base;
		base = utils.pideDouble(mensajeBase, TITULO);
		Double altura;
		altura = utils.pideDouble(mensajeAltura, TITULO);

		if (base == null) {
			utils.mostrarMensajeDialog(mensajeError, TITULO);
		} else if (altura == null) {
			utils.mostrarMensajeDialog(mensajeError, TITULO);
		} else {
			Double areaTriangulo = base * altura / 2;
			System.out.println("BASE = " + String.format("%.2f", base));
			System.out.println("ALTURA  = " + String.format("%.2f", altura));
			System.out.println("AREA TRIANGULO  = " + String.format("%.2f", areaTriangulo));
			utils.mostrarMensajeDialog("AREA TRIANGULO = " + String.format("%.2f", areaTriangulo), TITULO);
		}
	}

	private void calculaAreaCuadrado() {

		String mensaje = "Introduce LADO : ";
		String mensajeError = "No has introducido dato";

		Double lado;
		lado = utils.pideDouble(mensaje, TITULO);
		if (lado == null) {
			utils.mostrarMensajeDialog(mensajeError, TITULO);
		} else {
			Double areaCuadrado = lado*lado;
			System.out.println("LADO = " + String.format("%.2f", lado));
			System.out.println("AREA CUADRADO = " + String.format("%.2f", areaCuadrado));
			utils.mostrarMensajeDialog("AREA CUADRADO = " + String.format("%.2f", areaCuadrado), TITULO);
		}
	}

}
