/**
 * 
 */
package clases;

import javax.swing.JOptionPane;

/**
 * @author elena-01
 *
 */
public class Utils {

	// Mostrar mensaje en dialog
	public void mostrarMensajeDialog(String mensaje, String titulo) {
		JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
	}

	// Pedir String por dialog
	@SuppressWarnings("finally")
	public String pideString(String mensaje, String titulo) {
		String string = "";
		try {
			string = JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
		} catch (Exception e) {
			System.out.println("No has introducido valor");
		}finally {
		return string;
		}
	}

	// Pedir Integer por dialog
	@SuppressWarnings("finally")
	public int pideInt(String mensaje, String titulo) {
		int num = 0;
		try {
			num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE));
		} catch (Exception e) {
			System.out.println("No has introducido valor");
		} finally {
			return num;
		}
	}

	// Pedir Double por dialog

	@SuppressWarnings("finally")
	public double pideDouble(String mensaje, String titulo) {
		double num = 0.0;
		try {
			num = Double.parseDouble(JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE));
		} catch (Exception e) {
			System.out.println("No has introducido valor");
		} finally {
			return num;
		}
	}
	
	//Devuelve double o float por pantalla con 2 posiciones.
	public String dosPos(double numero) {
		String x = String.format("%.2f", numero);
		return x;
	}

}
