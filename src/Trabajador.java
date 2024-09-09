import java.time.LocalDate;
import java.time.Period;

public class Trabajador {
	private String nombre;
	private LocalDate inicio;
	private Double salario;
	
	private int añosDeTrabajo() {
		return Period.between(this.inicio, LocalDate.now()).getYears();
	}
	
	public Trabajador(String nombre, LocalDate horario, Double salario) {
		this.nombre = nombre;
		this.inicio = horario;
		this.salario = salario;
	}
	
	public int calcularDiasVacaciones() {
		return añosDeTrabajo() * 7;
	}
	
	public Double calcularAumentoSalarial() {
		return this.salario += 1000 * añosDeTrabajo();
	}
	
	public Double calcularIndemnizacionDespido() {
		return this.salario * this.añosDeTrabajo();
	}
}
