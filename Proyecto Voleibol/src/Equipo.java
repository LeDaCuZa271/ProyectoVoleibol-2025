import java.util.ArrayList;

public class Equipo {
	private String Nombre_Equipo;
	private ArrayList<Jugador> Lista_jugadores;
	private int Total_Partidos;
	private int Sets_Ganados;
	private int Sets_Perdidos;
	
	public String getNombre_Equipo() {
		return Nombre_Equipo;
	}
	public void setNombre_Equipo(String nombre_Equipo) {
		Nombre_Equipo = nombre_Equipo;
	}
	public ArrayList<Jugador> getLista_jugadores() {
		return Lista_jugadores;
	}
	public void setLista_jugadores(ArrayList<Jugador> lista_jugadores) {
		Lista_jugadores = lista_jugadores;
	}
	public int getTotal_Partidos() {
		return Total_Partidos;
	}
	public void setTotal_Partidos(int total_Partidos) {
		Total_Partidos = total_Partidos;
	}
	public int getSets_Ganados() {
		return Sets_Ganados;
	}
	public void setSets_Ganados(int sets_Ganados) {
		Sets_Ganados = sets_Ganados;
	}
	public int getSets_Perdidos() {
		return Sets_Perdidos;
	}
	public void setSets_Perdidos(int sets_Perdidos) {
		Sets_Perdidos = sets_Perdidos;
	}
	
	
	
	
}