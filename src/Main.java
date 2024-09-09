import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Trabajador miAmigo = new Trabajador("Jorge Carlos", LocalDate.of(2020, 3, 16), 100000.0);
		JOptionPane.showMessageDialog(null, miAmigo.calcularDiasVacaciones());
	}
}
