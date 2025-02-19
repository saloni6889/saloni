package Com.hibernate.HibernateCore;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	@Id
     private int id;
     private String name;
     private long contact;
     private String address;
	public User(int id, String name, long contact, String address) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + "]";
	}  
}