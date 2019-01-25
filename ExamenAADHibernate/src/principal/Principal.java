package principal;

import org.hibernate.Session;

public class Principal {
	
	public static void main(String[] args) {
	
		System.out.println("Hello!!");
			
	Session session = HibernateUtilities.getSessionFactory().openSession();	
	
	// Llamamos al método pasándole la session como parametro
	IntroducirDatos(session);
	
	session.close();
	
	HibernateUtilities.getSessionFactory().close();
	System.out.println("GoodBye");
	}
	
	public static void IntroducirDatos(Session session) {
		
		/*Aadimos el primer festival*/

		session.beginTransaction();

		Festival f1 = new Festival();
		f1.setNombre("Monsters of Rock");
		f1.setLugar("Zaragoza");
		f1.setFecha("08-2015");
		
		Grupo g1 = new Grupo();
		g1.setNombre("Twisted Sister");
		g1.setEstilo("Glam Metal");
		g1.setMiembros(5);
		
		Actuacion a1 = new Actuacion();
		a1.setHora("22:00");
		a1.setEscenario("Principal");
		
		// Añadimos la actuación a1 al grupo g1
		g1.setActuacion(a1);
		// Añadimos el grupo g1 al festival f1
		f1.addGrupo(g1);
		
		Grupo g2 = new Grupo();
		g2.setNombre("Saxon");
		g2.setEstilo("Hard Rock");
		g2.setMiembros(5);
		
		Actuacion a2 = new Actuacion();
		a2.setHora("20:00");
		a2.setEscenario("Principal");
		
		// Añadimos la actuación a2 al grupo g2
		g2.setActuacion(a2);
		// Añadimos el grupo g2 al festival f1
		f1.addGrupo(g2);

		/* TODO:
		 * Aadir g1 y g2 en el festival f1
		 * Enlazar g1 con a1 y g2 con a2
		 */
		
		session.save(f1);
		
		session.getTransaction().commit();
		
		/*Aadimos el segundo festival*/

		session.beginTransaction();

		f1 = new Festival();
		f1.setNombre("Metal Fest");
		f1.setLugar("Barcelona");
		f1.setFecha("07-2016");
		
		g1 = new Grupo();
		g1.setNombre("Judas Priest");
		g1.setEstilo("Speed Metal");
		g1.setMiembros(5);
		
		a1 = new Actuacion();
		a1.setHora("22:00");
		a1.setEscenario("Principal");
		
		// Añadimos la actuación a1 al grupo g1
		g1.setActuacion(a1);
		// Añadimos el grupo g1 al festival f1
		f1.addGrupo(g1);
		
		g2 = new Grupo();
		g2.setNombre("Queensryche");
		g2.setEstilo("Progressive Metal");
		g2.setMiembros(5);
		
		a2 = new Actuacion();
		a2.setHora("19:00");
		a2.setEscenario("Escenario 2");
		
		// Añadimos la actuación a2 al grupo g2
		g2.setActuacion(a2);
		// Añadimos el grupo g2 al festival f1
		f1.addGrupo(g2);

		/* TODO:
		 * Aadir g1 y g2 en el festival f1
		 * Enlazar g1 con a1 y g2 con a2
		 */
		
		session.save(f1);
		
		session.getTransaction().commit();		

	}
}
