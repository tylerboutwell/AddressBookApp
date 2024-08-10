import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    private ArrayList<Contact> contactList;

    public ContactList() {
        this.contactList = new ArrayList<Contact>();
    }

    public void addContact(String name, String number) {
        this.contactList.add(new Contact(name, number));
    }

    public void deleteContact(String number) {
        Contact searchedContact = searchByNumber(number);
        if (searchedContact == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println(searchedContact.getName() + " removed from contacts!");
            contactList.remove(searchedContact);
        }
    }

    public void editContact(String number, Scanner scan) {
        Contact searchedContact = searchByNumber(number);
        if (searchedContact == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println(searchedContact.getName() + " found!");
            System.out.println("Enter new name: ");
            String newName = scan.next();
            System.out.println("Enter new number: ");
            String newNumber = scan.next();
            searchedContact.setName(newName);
            searchedContact.setPhoneNumber(newNumber);
        }
    }

    private Contact searchByNumber(String number) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getPhoneNumber().equals(number)) {
                return contactList.get(i);
            }
        }
        return null;
    }

    public void printContacts() {
        for (int i = 0; i < contactList.size(); i++) {
            System.out.println(contactList.get(i));
        }
    }
}
