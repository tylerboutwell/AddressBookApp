import java.util.Scanner;

public class AddressBook {
    public static void main(String[] args) {
        ContactList userContactList = new ContactList();
        Scanner userInput = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Select - [print] [add] [delete] [edit] [exit]");
            input = userInput.nextLine();

            if (input.toLowerCase().equals("print")) {
                userContactList.printContacts();

            } else if (input.toLowerCase().equals("add")) {

                System.out.println("Person's name?");
                String personName = userInput.nextLine();
                System.out.println("Person's number?");
                String personNumber = userInput.nextLine();
                userContactList.addContact(personName, personNumber);
                System.out.println(personName + " successfully added to your contacts!");

            } else if (input.toLowerCase().equals("delete")) {
                System.out.println("Contact's ID number?");
                int personNumber = userInput.nextInt();
                userContactList.deleteContact(personNumber);
                userInput.nextLine();

            } else if (input.toLowerCase().equals("edit")) {
                System.out.println("Contact's ID number?");
                int personNumber = userInput.nextInt();
                userInput.nextLine();
                userContactList.editContact(personNumber, userInput);
            } else if (input.toLowerCase().equals("exit")) {
                System.out.println("Exiting");
                break;
            } else {
                System.out.println("Invalid input");
            }

        }
    }
}
