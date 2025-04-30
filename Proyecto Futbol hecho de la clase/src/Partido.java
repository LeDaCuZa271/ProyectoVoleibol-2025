import java.time.*;
public class Partido {
	private LocalDate fecha;
	private String lugar;
	private int golesLocal, golesVisitante;
	private Equipo local;
	private Equipo visitante;
	
	public Partido(int dia, int mes, int anio, String lugar, Equipo local, Equipo visitante) {
		this.fecha = LocalDate.of(anio, mes, dia);
		this.lugar = lugar;
		this.golesLocal = 0;
		this.golesVisitante = 0;
		this.local = local;
		this.visitante = visitante;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	public Equipo getLocal() {
		return local;
	}

	public void setLocal(Equipo local) {
		this.local = local;
	}

	public Equipo getVisitante() {
		return visitante;
	}

	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}

	@Override
	public String toString() {
		return "Partido [fecha=" + fecha + ", lugar=" + lugar + ", golesLocal=" + golesLocal + ", golesVisitante="
				+ golesVisitante + ", local=" + local + ", visitante=" + visitante + "]";
	}
	
	public void anotoGolLocal(int j) {
		System.out.println("GOOOOOOOOOOOOOOOOOL de"+ local+" -" +local.getJugadores().get(j));
		golesLocal++;
	}
	public void anotoGolVisitante(int j) {
		System.out.println("GOOOOOOOOOOOOOOOOOL de"+ visitante+" - "+visitante.getJugadores().get(j));
		golesVisitante++;
	}
	
	public void mostrarMarcador() {
		System.out.println(local+" "+ golesLocal+ " VS "+ visitante+ " "+golesVisitante);
	}
	
	public void finalizarPartido() {
		local.incrementarPartidosJugados();
		visitante.incrementarPartidosJugados();
		local.actualizarGoles(golesLocal, golesVisitante);
		visitante.actualizarGoles(golesVisitante, golesLocal);
		
		if(golesLocal>golesVisitante) {
			local.incrementarPartidosGanados();
			visitante.incrementarPartidosPerdidos();
		}else if(golesVisitante>golesLocal) {
			local.incrementarPartidosPerdidos();
			visitante.incrementarPartidosGanados();
		}else {
			local.incrementarPartidosEmpatados();
			visitante.incrementarPartidosEmpatados();
		}
	}
	
}
