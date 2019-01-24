package modelo;

import java.util.Date;

public class Festival {
	
	private int id;
	private String nombre;
	private String lugar;
	private Date fecha;
	
	public Festival() {
		
	}

	public Festival(int id, String nombre, String lugar, Date fecha) {
		this.id = id;
		this.nombre = nombre;
		this.lugar = lugar;
		this.fecha = fecha;
	}
	
	public Festival(String nombre, String lugar, Date fecha) {
		this.nombre = nombre;
		this.lugar = lugar;
		this.fecha = fecha;
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

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
