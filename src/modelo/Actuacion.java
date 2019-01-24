package modelo;

import java.util.Date;

public class Actuacion {
	
	private int id;
	private String hora;
	private String escenario;
	
	public Actuacion() {
		
	}

	public Actuacion(int id, String hora, String escenario) {
		this.id = id;
		this.hora = hora;
		this.escenario = escenario;
	}
	
	public Actuacion(String hora, String escenario) {
		this.hora = hora;
		this.escenario = escenario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getEscenario() {
		return escenario;
	}

	public void setEscenario(String escenario) {
		this.escenario = escenario;
	}
}
