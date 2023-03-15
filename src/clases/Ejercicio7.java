/**
 * C2-UD08 - Ejercicio 7
 */
package clases;

/**
 * @author elena-01
 *
 */
public class Ejercicio7 {

	final static double VALOR_YEN = 129.852;//
	final static double VALOR_LIBRA = 0.86;
	final static double VALOR_DOLAR = 1.28611;

	private static final String TITULO = "Ejercicio 7: Convierte monedas";
	Utils utils = new Utils();

	public void convierteMoneda() {

		double num = pideNumero();
		String mon = pideMoneda();
		
		if ((num != 0) && (mon != "")) {
			convierteEuros(num, mon);
		}else {
			System.out.println("· No se han introducido datos");
		}
	}

	// PEDIR NUMERO AL USUARIO
	public double pideNumero() {

		String mensaje = "· Introduce Cantidad de Euros ";
		double num;

		// Pide Numero
		num = utils.pideDouble(mensaje, TITULO);

		if (num != 0) {
			System.out.println("·EUROS = " + num);
		}
		return num;
	}

	// PEDIR MONEDA AL USUARIO
	public String pideMoneda() {

		String mensaje = "· Introduce MONEDA ( Yen Libra Dolar ) ";
		String divisa = "";

		// Pide Moneda
		divisa = utils.pideString(mensaje, TITULO);

		if (divisa != "") {
			System.out.println("· MONEDA = " + divisa);
		}
		return divisa;
	}

	// PEDIR MONEDA

	// CONVERTIR MONEDA
	public void convierteEuros(double cantidadEuros, String moneda) {
		double total = 0;

		switch (moneda.toUpperCase()) {
		case "YEN":
			total = cantidadEuros * VALOR_YEN;
			break;
		case "DOLAR":
			total = cantidadEuros * VALOR_DOLAR;
			break;
		case "LIBRA":
			total = cantidadEuros * VALOR_LIBRA;
			break;
		default:
			System.out.println("· No has introducido una moneda válida.");
		}

		if (total != 0) {
			System.out.println(("RESULTADO  " + cantidadEuros + "EURO" + " = " + String.format("%.2f", total) + " "
					+ moneda.toUpperCase()));
			utils.mostrarMensajeDialog(("RESULTADO : \n" + cantidadEuros + " EUROS \n" + " = \n"
					+ String.format("%.2f", total) + " " + moneda.toUpperCase()), TITULO);
		}

	}

}
