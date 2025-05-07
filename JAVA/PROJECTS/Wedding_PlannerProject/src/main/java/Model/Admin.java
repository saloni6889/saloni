package Model;

public class Admin {
    private String email;
    private String password;

    // Customer-related fields added
    private String name;
    private long contact;
    private String address;

    // Getter and setter methods for Admin's email and password
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

    // Getter and setter methods for Customer's name, contact, and address
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

    // Override toString() method to include customer information as well
    @Override
    public String toString() {
        return "Admin [email=" + email + ", password=" + password + ", name=" + name + ", contact=" + contact + ", address=" + address + "]";
    }
}
