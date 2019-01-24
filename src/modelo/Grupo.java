package modelo;

public class Grupo {

	private int id;
	private String nombre;
	private String estilo;
	private int numeroMiembros;
	
	public Grupo() {
		
	}

	public Grupo(int id, String nombre, String estilo, int numeroMiembros) {
		this.id = id;
		this.nombre = nombre;
		this.estilo = estilo;
		this.numeroMiembros = numeroMiembros;
	}
	
	public Grupo(String nombre, String estilo, int numeroMiembros) {
		this.nombre = nombre;
		this.estilo = estilo;
		this.numeroMiembros = numeroMiembros;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	public int getNumeroMiembros() {
		return numeroMiembros;
	}

	public void setNumeroMiembros(int numeroMiembros) {
		this.numeroMiembros = numeroMiembros;
	}
	
}
