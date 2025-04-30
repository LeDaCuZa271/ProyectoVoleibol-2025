import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
	private String nombre;
	private int partidosJugados,partidosPerdidos,partidosGanados,partidosEmpatados;
	private int golesFavor, golesContra;
	private ArrayList<Jugador>jugadores;

	public Equipo(String nombre) {
		this.nombre = nombre;
		this.partidosJugados = 0;
		this.partidosPerdidos = 0;
		this.partidosGanados = 0;
		this.partidosEmpatados = 0;
		this.golesFavor = 0;
		this.golesContra = 0;
		this.jugadores = new ArrayList<Jugador>();
	}
	
	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", partidosJugados=" + partidosJugados + ", partidosPerdidos="
				+ partidosPerdidos + ", partidosGanados=" + partidosGanados + ", partidosEmpatados=" + partidosEmpatados
				+ ", golesFavor=" + golesFavor + ", golesContra=" + golesContra + ", jugadores=" + jugadores + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPartidosJugados() {
		return partidosJugados;
	}

	public void setPartidosJugados(int partidosJugados) {
		this.partidosJugados = partidosJugados;
	}

	public int getPartidosPerdidos() {
		return partidosPerdidos;
	}

	public void setPartidosPerdidos(int partidosPerdidos) {
		this.partidosPerdidos = partidosPerdidos;
	}

	public int getPartidosGanados() {
		return partidosGanados;
	}

	public void setPartidosGanados(int partidosGanados) {
		this.partidosGanados = partidosGanados;
	}

	public int getPartidosEmpatados() {
		return partidosEmpatados;
	}

	public void setPartidosEmpatados(int partidosEmpatados) {
		this.partidosEmpatados = partidosEmpatados;
	}

	public int getGolesFavor() {
		return golesFavor;
	}

	public void setGolesFavor(int golesFavor) {
		this.golesFavor = golesFavor;
	}

	public int getGolesContra() {
		return golesContra;
	}

	public void setGolesContra(int golesContra) {
		this.golesContra = golesContra;
	}

	public ArrayList<Jugador> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Jugador> jugadores) {
		this.jugadores = jugadores;
	}
	
	public void verNomina() {
		for(Jugador jugador: jugadores) {
			System.out.println(jugador);
		}
	}
	public void addJugador() {
		Scanner lector= new Scanner(System.in);
		System.out.println("Ingrese el nombre del jugador:");
		String nom= lector.nextLine();
		System.out.println("Ingrese el dorsal del jugador:");
		int dor= lector.nextInt();
		System.out.println("Ingrese el dia de nacimiento del jugador:");
		int d= lector.nextInt();
		System.out.println("Ingrese el mes de nacimiento del jugador:");
		int m= lector.nextInt();
		System.out.println("Ingrese el año de nacimiento del jugador:");
		int a= lector.nextInt();
		
		jugadores.add(new Jugador(nom,dor,d,m,a));
	}
	
	public void addJugador (Jugador nuevo) {
		jugadores.add(nuevo);
	}
	
	public void incrementarPartidosJugados() {
		this.partidosJugados++;
	}
	
	public void incrementarPartidosGanados() {
		this.partidosGanados++;
	}
	
	public void incrementarPartidosPerdidos() {
		this.partidosPerdidos++;
	}
	
	public void incrementarPartidosEmpatados() {
		this.partidosEmpatados++;
	}
	public int getPuntos() {
		return partidosGanados*3+partidosEmpatados;
	}
	
	public void mostrarEstado() {
		System.out.println(nombre+"\t"+partidosJugados+"\t"+partidosGanados+"\t"+partidosEmpatados
							+"\t"+partidosPerdidos+"\t"+golesFavor+"\t"+golesContra+"\t"+getPuntos());
	}
	public void actualizarGoles(int favor, int contra) {
		golesFavor+=favor;
		golesContra+=contra;
	}
}
