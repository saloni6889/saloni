package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args){
		
		SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Owner o1=new Owner();
		o1.setId(1);
		o1.setName("Jaavaaa");
		o1.setContact(785482652);
		
		Vehicle v1=new Vehicle();
		v1.setVid(1);
		v1.setModel("Bus");
		v1.setPrice(150000.50);
		
		o1.setVid(v1);
		v1.setOid(o1);
		
		session.save(o1);
		session.save(v1);
		
		tx.commit();
		session.close();
		sf.close();
	}
}
