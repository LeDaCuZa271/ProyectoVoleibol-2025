public class Set {
	
	private int Puntos_Local;
	private int Puntos_Visitante;
	private int Set_Local;
	private int Set_Visitante;
	
	public int getSet_Local() {
		return Set_Local;
	}
	public void setSet_Local(int set_Local) {
		Set_Local = set_Local;
	}
	public int getSet_Visitante() {
		return Set_Visitante;
	}
	public void setSet_Visitante(int set_Visitante) {
		Set_Visitante = set_Visitante;
	}

	public int getPuntos_Local() {
		return Puntos_Local;
	}
	public void setPuntos_Local(int puntos_Local) {
		Puntos_Local = puntos_Local;
	}
	public int getPuntos_Visitante() {
		return Puntos_Visitante;
	}
	public void setPuntos_Visitante(int puntos_Visitante) {
		Puntos_Visitante = puntos_Visitante;
	}
	
	public Set()
	{
		this.Puntos_Local=0;
		this.Set_Local=0;
		this.Puntos_Visitante=0;
		this.Set_Visitante=0;
	}
	
	public void Anoto_Local()
	{
		this.Puntos_Local++;
	}

	public void Anoto_Visitante()
	{
		this.Puntos_Visitante++;
	}
	
	public void Finalizar_Set()
	{
		if(this.Puntos_Local>=25 && this.Puntos_Local-2>=this.Puntos_Visitante)
		{
			this.Set_Local++;
		}
		else if (this.Puntos_Visitante>=25 && this.Puntos_Visitante-2>=this.Puntos_Local)
		{
			this.Set_Visitante++;
		}
		
	}
}