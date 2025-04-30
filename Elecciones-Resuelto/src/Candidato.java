
public class Candidato extends Persona {
	PartidoPolitico partido;

	public Candidato(int cod, String nombre, String ci, String usuario, String password, PartidoPolitico partido) {
		super(cod, nombre, ci, usuario, password);
		this.partido = partido;
	}

	public PartidoPolitico getPartido() {
		return partido;
	}

	public void setPartido(PartidoPolitico partido) {
		this.partido = partido;
	}

	@Override
	public String toString() {
		return this.getNombre()+"\t" + partido;
	}
	
}
