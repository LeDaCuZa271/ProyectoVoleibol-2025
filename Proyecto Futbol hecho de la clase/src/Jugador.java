import java.time.*;
import java.time.temporal.ChronoUnit;
public class Jugador {
	private String nombre;
	private int dorsal;
	private LocalDate fechaNacimiento; //libreria java.time.*
	private boolean habilitado;
	
	public Jugador(String nombre, int dorsal, int dia, int mes, int anio) {
		this.nombre=nombre;
		this.dorsal=dorsal;
		this.fechaNacimiento= LocalDate.of(anio, mes, dia);
		this.habilitado= true;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", dorsal=" + dorsal + ", fechaNacimiento=" + fechaNacimiento
				+ ", habilitado=" + habilitado + "]";
	}

	public int getEdad() {
		return (int) ChronoUnit.YEARS.between(fechaNacimiento, LocalDate.now());
	}

}
