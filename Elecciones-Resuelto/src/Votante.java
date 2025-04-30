public class Votante extends Persona{
	private Recinto recinto;
	private boolean habilitado;
	
	public Votante(int cod, String nombre, String ci, String usuario, String password, Recinto recinto,
			boolean habilitado) {
		super(cod, nombre, ci, usuario, password);
		this.recinto = recinto;
		this.habilitado = habilitado;
	}
	
	public Recinto getRecinto() {
		return recinto;
	}
	public void setRecinto(Recinto recinto) {
		this.recinto = recinto;
	}
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	@Override
	public String toString() {
		return "Votante [recinto=" + recinto + ", habilitado=" + habilitado + "]";
	}
	
	

}
