import java.time.LocalDate;
import java.util.ArrayList;

public class Partido {
	
	private Equipo equipo_Local;
	private Equipo equipo_Visitante;
	private String Lugar;
	private LocalDate Fecha;
	
	public String getLugar() {
		return Lugar;
	}
	public void setLugar(String lugar) {
		Lugar = lugar;
	}
	public LocalDate getFecha() {
		return Fecha;
	}
	public void setFecha(LocalDate fecha) {
		Fecha = fecha;
	}
	public Equipo getEquipo_Local() {
		return equipo_Local;
	}
	public void setEquipo_Local(Equipo equipo_Local) {
		this.equipo_Local = equipo_Local;
	}
	public Equipo getEquipo_Visitante() {
		return equipo_Visitante;
	}
	public void setEquipo_Visitante(Equipo equipo_Visitante) {
		this.equipo_Visitante = equipo_Visitante;
	}
	
	public Partido(String fecha,int y,int m, int d, Equipo local, Equipo visit, String cancha)
	{
		this.Fecha= LocalDate.of(y, m, d);
		this.equipo_Local=local;
		this.equipo_Visitante=visit;
		this.Lugar=cancha;
	}
	
	public void Finalizar_Partido(ArrayList<Set> set)
	{
		
	}
}