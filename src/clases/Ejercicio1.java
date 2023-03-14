/**
 * C2-UD06-Ejercicio1
 */
package clases;

/**
 * @author elena-01
 *
 */
public class Ejercicio1 {

	private static final String TITULO = "Ejercicio 1";
	Utils utils = new Utils();

	// PEDIR FORMA GEOMETRICA AL USUARIO
	public void calculaArea() {

		String mensaje1 = "· ¿De qué figura deseas calcular el Área? ( Circulo, Triangulo, Cuadrado) ";
		String figura = utils.pideString(mensaje1, TITULO);
		System.out.println("FORMA GEOMÉTRICA : " + figura);
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

	// CALCULAR AREA DE FORMA GEOMETRICA: CIRCULO
	private void calculaAreaCirculo() {

		String mensaje = "Introduce RADIO : ";
		double radio = utils.pideDouble(mensaje, TITULO);

		Double areaCirculo = Math.pow(radio, 2) * Math.PI;

		System.out.println("RADIO = " + String.format("%.3f", radio));
		System.out.println("AREA CIRCULO = " + String.format("%.2f", areaCirculo));
		utils.mostrarMensajeDialog("AREA CIRCULO = " + String.format("%.2f", areaCirculo), TITULO);

	}

	// CALCULAR AREA DE FORMA GEOMETRICA: TRIANGULO
	private void calculaAreaTriangulo() {

		String mensajeBase = "Introduce BASE : ";
		String mensajeAltura = "Introduce ALTURA : ";
		Double base;
		Double altura;

		base = utils.pideDouble(mensajeBase, TITULO);
		altura = utils.pideDouble(mensajeAltura, TITULO);

		Double areaTriangulo = base * altura / 2;

		System.out.println("BASE = " + String.format("%.2f", base));
		System.out.println("ALTURA  = " + String.format("%.2f", altura));
		System.out.println("AREA TRIANGULO  = " + String.format("%.2f", areaTriangulo));
		utils.mostrarMensajeDialog("AREA TRIANGULO = " + String.format("%.2f", areaTriangulo), TITULO);
	}

	// CALCULAR AREA DE FORMA GEOMETRICA: CUADRADO
	private void calculaAreaCuadrado() {

		String mensaje = "Introduce LADO : ";
		Double lado;

		lado = utils.pideDouble(mensaje, TITULO);

		Double areaCuadrado = lado * lado;
		System.out.println("LADO = " + String.format("%.2f", lado));
		System.out.println("AREA CUADRADO = " + String.format("%.2f", areaCuadrado));
		utils.mostrarMensajeDialog("AREA CUADRADO = " + String.format("%.2f", areaCuadrado), TITULO);
	}

}
