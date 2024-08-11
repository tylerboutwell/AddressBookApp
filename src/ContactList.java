import java.util.ArrayList;
import java.util.Scanner;

public class ContactList {
    private ArrayList<Contact> contactList;
    private int currentIdNumber = 0;

    public ContactList() {
        this.contactList = new ArrayList<Contact>();
    }

    public void addContact(String name, String number) {
        currentIdNumber += 1;
        this.contactList.add(new Contact(name, number, currentIdNumber));
    }

    public void deleteContact(int number) {
        Contact searchedContact = searchByNumber(number);
        if (searchedContact == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println(searchedContact.getName() + " removed from contacts!");
            contactList.remove(searchedContact);
        }
    }

    public void editContact(int number, Scanner scan) {
        Contact searchedContact = searchByNumber(number);
        if (searchedContact == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println(searchedContact.getName() + " found!");
            System.out.println("Enter new name: ");
            String newName = scan.nextLine();
            System.out.println("Enter new number: ");
            String newNumber = scan.nextLine();
            searchedContact.setName(newName);
            searchedContact.setPhoneNumber(newNumber);
        }
    }

    private Contact searchByNumber(int number) {
        for (int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getIdNumber() == number) {
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
