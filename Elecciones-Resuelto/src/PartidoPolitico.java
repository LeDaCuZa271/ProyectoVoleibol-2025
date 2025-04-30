import java.io.*;
import java.util.ArrayList;
public class PartidoPolitico {
	private String sigla, nombre;
	private boolean habilitado;
	
	public PartidoPolitico(String sigla, String nombre, boolean habilitado) {
		super();
		this.sigla = sigla;
		this.nombre = nombre;
		this.habilitado = habilitado;
	}
	
	public PartidoPolitico(String sigla, String nombre) {
		super();
		this.sigla = sigla;
		this.nombre = nombre;
		this.habilitado = true;
	}
	
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	@Override
	public String toString() {
		return  sigla + ", " + nombre + ", " + habilitado;
	}
	
	public boolean registrarPartidoTxt(String archivo) {
		try {
			PrintWriter escritor = new PrintWriter(new FileWriter(archivo,true));
			String registro = this.sigla+";"+this.nombre+";"+this.habilitado;
			escritor.println(registro);
			escritor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;
	}
	
	
	public boolean registrarPartidoBin(String archivo) {
		try {	
			DataOutputStream escritor =  new DataOutputStream(new FileOutputStream(archivo,true));
			escritor.writeUTF(this.sigla);
			escritor.writeUTF(this.nombre);
			escritor.writeBoolean(this.habilitado);
			escritor.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return false;
		}
		return true;
	}
	
	
	static ArrayList<PartidoPolitico> leerPartidosTxt(String archivo){
		ArrayList<PartidoPolitico> partidos =  new ArrayList<PartidoPolitico>();
		
		try {
			BufferedReader lector =  new BufferedReader(new FileReader(archivo));
			String linea;
			while((linea = lector.readLine())!=null) {
				String [] datos = linea.split(";");
				String sigla =  datos[0];
				String nombre = datos[1];
				boolean hab = Boolean.parseBoolean(datos[2]);
				partidos.add(new PartidoPolitico(sigla, nombre,hab));
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Ha ocurrido un error al encontrar el archivo");
		}catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Ha ocurrido un error al recibir los datos");
		}
	
		return partidos;
	}
	
	
	static ArrayList<PartidoPolitico> leerPartidosBin(String archivo){
		ArrayList<PartidoPolitico> partidos =  new ArrayList<PartidoPolitico>();
		
		try {
			DataInputStream lector =  new DataInputStream(new FileInputStream(archivo));
			while(lector.available()!=0) {
				String sigla =  lector.readUTF();
				String nombre = lector.readUTF();
				boolean hab = lector.readBoolean();
				partidos.add(new PartidoPolitico(sigla, nombre,hab));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Ha ocurrido un error al encontrar el archivo");
		}catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Ha ocurrido un error al recibir los datos");
		}
	
		return partidos;
	}
	
	
	static boolean reescribirPartidosTxt(ArrayList<PartidoPolitico> partidos, String archivo) {
		try {
			PrintWriter escritor = new PrintWriter(new FileWriter(archivo));
			for (PartidoPolitico pp : partidos) {
				String registro = pp.getSigla()+";"+pp.getNombre()+";"+pp.isHabilitado();
				escritor.println(registro);
			}
			
			escritor.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return false;
		}
		
		
		return true;
	}
	
	static boolean reescribirPartidosBin(ArrayList<PartidoPolitico> partidos, String archivo) {
		try {
			DataOutputStream escritor =  new DataOutputStream(new FileOutputStream(archivo));
			for (PartidoPolitico pp : partidos) {
				escritor.writeUTF(pp.getSigla());
				escritor.writeUTF(pp.getNombre());
				escritor.writeBoolean(pp.isHabilitado());
			}
			
			escritor.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			return false;
		}
		
		
		return true;
	}
}
