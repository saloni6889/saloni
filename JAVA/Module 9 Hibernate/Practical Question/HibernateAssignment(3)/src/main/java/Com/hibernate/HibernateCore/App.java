package Com.hibernate.HibernateCore;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started..!" );
        User u = new User(1, "jaavaaa", 785482652, "ahmedabad");
        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		session.save(u);
		tx.commit();
		session.close();
		sf.close();
	}       
        
}
