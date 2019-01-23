package modelo;

import java.util.Date;

public class Pedido {

	private int id;
	private Date fecha;
	
	public Pedido() {
		
	}

	public Pedido(int id, Date fecha) {
		this.id = id;
		this.fecha = fecha;
	}
	
	public Pedido(Date fecha) {
		
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
