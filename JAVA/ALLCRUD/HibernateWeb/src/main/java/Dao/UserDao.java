package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Model.User;

public class UserDao {
	SessionFactory sf = null;
	Session session = null;
	Transaction tx = null;

	public void insertUser(User u) {
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = sf.openSession();
		tx = session.beginTransaction();
		session.save(u);
		tx.commit();
		session.close();
		sf.close();
	}

	public User getUserById(int id) {
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = sf.openSession();
		tx = session.beginTransaction();
		User u = session.get(User.class, id);
		return u;
	}

	public List<User> getAllUser() {
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = sf.openSession();
		tx = session.beginTransaction();
		String hql = "from User";
		Query q = session.createQuery(hql);
		List<User> list = q.list();
		return list;
	}

	public void updateUser(User u) {
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = sf.openSession();
		tx = session.beginTransaction();
		session.update(u);
	
	}

	public void deleteUser(int id) {
		sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		session = sf.openSession();
		tx = session.beginTransaction();
		User u = session.get(User.class, id);
		session.delete(u);
	}
}