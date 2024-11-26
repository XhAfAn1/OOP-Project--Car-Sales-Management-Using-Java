package project;

public class Admin extends User {

    private String username;
    private String password;

    public Admin() {
    }

    public Admin(String username, String password, String name, String address, String email, String phone) {
        super(name, address, email, phone);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        String s;
        s = "Admin details:\n" + "Name: " + getName() + "\nAddress: " + getAddress() + "\nE-mail: " + getEmail() + "\nPhone No.: " + getPhone();
        return s;
    }

}
