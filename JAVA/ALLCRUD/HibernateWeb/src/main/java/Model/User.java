package Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int id;
	private String name;
	private long contact;
	private String address;
	private String email;
	private String password;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String name, long contact, String address, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.address = address;
		this.email = email;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", contact=" + contact + ", address=" + address + ", email="
				+ email + ", password=" + password + "]";
	}

	
}
