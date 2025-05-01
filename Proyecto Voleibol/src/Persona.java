public class Persona {
	
	private String Nombre;
	private int Edad;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	
	public Persona(String nombre, int e)
	{
		this.Nombre=nombre;
		this.Edad=e;
	}
	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Edad=" + Edad + "]";
	}
	
	
	
}