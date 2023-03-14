import java.util.Scanner;
public class Contact {
    public String name;
    public String phone;
    public String email;

    public Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    
    @Override
    public String toString() {return "Name: " + name + "\nPhone: " + phone + "\nEmail: " + email;}
}
