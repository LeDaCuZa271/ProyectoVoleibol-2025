
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Equipo sistemas = new Equipo("Ingenieria de sistemas");
		Equipo economia =  new Equipo("Economia e Inteligencia de negocios");
		
		sistemas.addJugador(new Jugador("Orlando Rivera",1,16,9,1975));
		sistemas.addJugador(new Jugador("Algel Avila",10,27,2,1980));
		sistemas.addJugador(new Jugador("Oswaldo Figueroa",7,27,3,1970));
		sistemas.addJugador(new Jugador("Lourdes Peredo",11,12,12,1980));
		
		System.out.println("---------"+sistemas+"----------");
		sistemas.verNomina();
		
		economia.addJugador(new Jugador("Javier Von Borries", 10, 10, 10, 1980));
		economia.addJugador(new Jugador("Lourdes Espinoza", 9, 11, 11, 1980));
		economia.addJugador(new Jugador("Santiago Zurita", 7, 9, 11, 2003));
		economia.addJugador(new Jugador("Yuri Miranda", 1, 17, 9, 1980));
		economia.addJugador(new Jugador("Carlos Machicado", 4, 6, 7, 1980));
	
		System.out.println("---------"+economia+"----------");
		economia.verNomina();
		
	}
		
}
