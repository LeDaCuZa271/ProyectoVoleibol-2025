public class Jugador extends Persona
{
	private int NroPolera;
	private boolean Habilidato;
	
	public int getNroPolera() {
		return NroPolera;
	}

	public void setNroPolera(int nroPolera) {
		NroPolera = nroPolera;
	}

	public boolean isHabilidato() {
		return Habilidato;
	}

	public void setHabilidato(boolean habilidato) {
		Habilidato = habilidato;
	}

	public Jugador(String nombre, int e, int n) {
		super(nombre, e);
		this.NroPolera=n;
		this.Habilidato=true;
	}
	
}