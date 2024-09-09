import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Trabajador miAmigo = new Trabajador("Jorge Carlos", LocalDate.of(2020, 3, 16), 100000.0);
		JOptionPane.showMessageDialog(null, "Dias de vacaciones: "+miAmigo.calcularDiasVacaciones());
		JOptionPane.showMessageDialog(null, "Aumento Salarial: "+miAmigo.calcularAumentoSalarial());
		JOptionPane.showMessageDialog(null, "Indemnizacion de Despido: "+miAmigo.calcularIndemnizacionDespido());
	}
}
