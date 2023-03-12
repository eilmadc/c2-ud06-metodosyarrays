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
	public String pideString(String mensaje, String titulo) {
		String string = JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE);
		return string;
	}

	// Pedir Integer por dialog
	public int pideInt(String mensaje, String titulo) {
		int num = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE));
		return num;
	}

	// Pedir Double por dialog

	public double pideDouble(String mensaje, String titulo) {
		double num = 0;
		try {
			Double.parseDouble(JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.QUESTION_MESSAGE));
		} catch (Exception e) {
			System.out.println("No has introducido valor");
		} finally {
			return num;
		}
	}

}
