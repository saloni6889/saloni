package Model;

public class weddingplanner {
	private int id;
	private String name,address,email,password;
	private long contact;
	
	
	public weddingplanner() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "weddingplanner [id=" + id + ", name=" + name + ", contact=" + contact + ", email=" + email
				+ ", password=" + password + ", address=" + address + "]";
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}	
}