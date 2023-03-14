import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        LinkedList<Contact> contactBook = new LinkedList();
        Scanner scan = new Scanner(System.in);
        Boolean loop = true;
        System.out.println("Welcome to the Java Contact Book");
        while (loop == true) {
            System.out.println("****************************************************************");
            System.out.println("(A)dd\n(D)elete\n(E)mail Search\n(P)rint List\n(S)earch\n(Q)uit");
            System.out.println("****************************************************************");
            System.out.println("Enter a command: ");
            String command = scan.nextLine();
            switch (command) {
                case "A":
                    System.out.println("Add Contact");
                    System.out.println("Enter Name: ");
                    String name = scan.nextLine();
                    System.out.println("Enter phone number: ");
                    String phone = scan.nextLine();
                    System.out.println("Enter email: ");
                    String email = scan.nextLine();
                    Contact contact = new Contact(name, phone, email);
                    contactBook.add(contact);
                    System.out.println(contact);
                    break;
                case "D":
                    System.out.println("Delete Contact");
                    if (contactBook.size() != 0) {
                        System.out.println("Delete Contact");
                        System.out.println("Enter contact name: ");
                        String del = scan.nextLine();
                        int test = 0;
                        for (int i = 0; i < contactBook.size(); i++) {
                            if (contactBook.get(i).name.equals(del)) {
                                System.out.println("Deleting the following contact: ");
                                System.out.println(contactBook.get(i));
                                contactBook.remove(i);
                                test++;
                            }
                        }
                        if (test == 0) {
                            System.out.println("Contact doesn't exist.");
                        }
                    }
                    else{
                        System.out.println("No contacts to delete.");
                    }
                    break;
                case "E":
                    if (contactBook.size() != 0) {
                        System.out.println("Email Search");
                        System.out.println("Enter email: ");
                        String eSearch = scan.nextLine();
                        System.out.println("Contacts with the email '" + eSearch + "': ");
                        int test2 = 0;
                        for (int i = 0; i < contactBook.size(); i++) {
                            if (contactBook.get(i).email.equals(eSearch)) {
                                System.out.println("=========================");
                                System.out.println("Contact " + (i + 1));
                                System.out.println(contactBook.get(i));
                                test2++;
                            }
                        }
                        System.out.println("=========================");
                        if (test2 == 0) {
                            System.out.println("No contacts with the email '" + eSearch + "'.");
                        }
                    }
                    else{
                        System.out.println("No contacts to search.");
                    }
                    break;
                case "P":
                    System.out.println("Print list");
                    System.out.println("Contacts: ");
                    for (int i = 0; i < contactBook.size(); i++){
                        System.out.println("=========================");
                        System.out.println("Contact " + (i + 1));
                        System.out.println(contactBook.get(i));
                    }
                    System.out.println("=========================");
                    if (contactBook.size() == 0){
                        System.out.println("No contacts to print.");
                    }
                    break;
                case "S":
                    if (contactBook.size() != 0) {
                        System.out.println("Search");
                        System.out.println("Enter name: ");
                        String search = scan.nextLine();
                        System.out.println("Contacts with the name '" + search + "': ");
                        int test3 = 0;
                        for (int i = 0; i < contactBook.size(); i++) {
                            if (contactBook.get(i).name.equals(search)) {
                                System.out.println("=========================");
                                System.out.println("Contact " + (i + 1));
                                System.out.println(contactBook.get(i));
                                test3++;
                            }
                        }
                        System.out.println("=========================");
                        if (test3 == 0) {
                            System.out.println("No contacts with the name '" + search + "'.");
                        }
                    }
                    else{
                        System.out.println("No contacts to search.");
                    }
                    break;
                case "Q":
                    System.out.println("Thank you for using the Java Contact Book");
                    loop = false;
                    break;
                default:
                    System.out.println("Please enter a valid command.");
                    break;

            }
        }
    }
}