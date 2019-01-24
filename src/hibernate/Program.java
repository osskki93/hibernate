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
		java.util.Date d = new java.util.Date();
		Festival f = new Festival("Tomorrowland","Bélgica", new java.sql.Date(d.getTime()));
		Actuacion a = new Actuacion("19:00", "Main Stage");
		Grupo g = new Grupo("Dimitri Vegas & Like Mike","EDM",2);
		
		Festival f2 = new Festival("ViñaRock","Albacete", new java.sql.Date(d.getTime()));
		Actuacion a2 = new Actuacion("14:00", "Reagge Stage");
		Grupo g2 = new Grupo("La Raiz","RAP",10);
		
		session.saveOrUpdate(f);
		session.saveOrUpdate(a);
		session.saveOrUpdate(g);
		
		session.saveOrUpdate(f2);
		session.saveOrUpdate(a2);
		session.saveOrUpdate(g2);

		session.getTransaction().commit();

	}
	
	private static void leerDatos(Session session) {
		
		session.beginTransaction();
		
		Festival f = session.get(Festival.class, 1);
		Actuacion a = session.get(Actuacion.class, 1);
		Grupo g = session.get(Grupo.class, 1);
		
		Festival f2 = session.get(Festival.class, 2);
		Actuacion a2 = session.get(Actuacion.class, 2);
		Grupo g2 = session.get(Grupo.class, 2);
			
		System.out.println("\n" +"He recuperado el festival " +f.getNombre()+ " que se celebrará en " +f.getLugar()+ " en la siguiente fecha: " +f.getFecha());
		System.out.println("He recuperado la actuación que se celebrará a las " +a.getHora()+ " en el escenario: " +a.getEscenario());
		System.out.println("He recuperado el grupo " +g.getNombre()+ " que hace estilo " +g.getEstilo()+ " y que esta compuesto por "+ g.getNumeroMiembros() +" miembros"+ "\n");
		
		System.out.println("\n" +"He recuperado el festival " +f2.getNombre()+ " que se celebrará en " +f2.getLugar()+ " en la siguiente fecha: " +f2.getFecha());
		System.out.println("He recuperado la actuación que se celebrará a las " +a2.getHora()+ " en el escenario: " +a2.getEscenario());
		System.out.println("He recuperado el grupo " +g2.getNombre()+ " que hace estilo " +g2.getEstilo()+ " y que esta compuesto por "+ g2.getNumeroMiembros() +" miembros"+ "\n");
		
		session.getTransaction().commit();
	}
	
}
