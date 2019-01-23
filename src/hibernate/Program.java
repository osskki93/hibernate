package hibernate;

import org.hibernate.Session;

import modelo.*;

public class Program {

	public static void main(String[] args) {
		
		Session session = HibernateUtilities.getSessionFactory().openSession();

		introducirDatos(session);
		leerDatos(session);
		
		session.close();
		HibernateUtilities.getSessionFactory().close();

	}
	
	private static void introducirDatos(Session session) {
		
		session.beginTransaction();
		Empresa e = new Empresa("73594143P","Lemus Logisticas S.L", 23, "Av. Algemesí Nº21");
		Item i = new Item("Mc Extrem Bacon", 93);
		java.util.Date d = new java.util.Date();
		Pedido p = new Pedido(new java.sql.Date(d.getTime()));
		
		session.save(e);
		session.save(i);
		session.save(p);
		
		session.getTransaction().commit();

	}
	
	private static void leerDatos(Session session) {
		
		session.beginTransaction();
		Empresa e = session.get(Empresa.class, "73594143P");
		Item i = session.get(Item.class, 1);
		Pedido p = session.get(Pedido.class, 1);
			
		System.out.println("He recuperado la empresa " +e.getNombre()+ " con  CIF " +e.getCif()+ " situada en " +e.getDireccion() + " donde trabajan " +e.getEmpleados()+ " empleados");
		System.out.println("He recuperado el item " +i.getNombre()+ " del cual nos quedan " +i.getCantidad()+ " unidades ");
		System.out.println("He recuperado el pedido hecho en la siguiente fecha: " +p.getFecha());
		
		session.getTransaction().commit();
	}
}
