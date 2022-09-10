
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {

        boolean quit = false;
        int choice;
        printOptions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0 -> printOptions();
                case 1 -> mobilePhone.printAllContacts();
                case 2 -> addContacts();
                case 3 -> modifyContact();
                case 4 -> removeContact();
                case 5 -> findContact();
                case 6 -> quit = true;
                default -> System.out.println("Please enter a valid input!");
            }
        }
    }

    public static void printOptions() {
        System.out.println("\nPress");
        System.out.println("\t0 - To print choice options.");
        System.out.println("\t1 - To print the list of contacts.");
        System.out.println("\t2 - To add a new contact.");
        System.out.println("\t3 - To modify an existing contact.");
        System.out.println("\t4 - To remove a contact from the list.");
        System.out.println("\t5 - To find a contact in the list.");
        System.out.println("\t6 - To quit the application.");
    }

    public static void addContacts() {
        System.out.print("Enter new contact name: ");
        String newContactName = scanner.nextLine();
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        mobilePhone.addNewContact(newContactName, phoneNumber);
    }

    public static void modifyContact() {
        System.out.print("Enter contact name to update: ");
        String contactNameToUpdate = scanner.nextLine();
        System.out.print("Enter a new phone number: ");
        String newPhoneNumber = scanner.nextLine();
        mobilePhone.updateContact(contactNameToUpdate, newPhoneNumber);
    }

    public static void removeContact() {
        System.out.print("Specify a contact to delete: ");
        String contactToDelete = scanner.nextLine();
        mobilePhone.removeContact(contactToDelete);
    }

    public static void findContact() {
        System.out.print("Type a contact name to find: ");
        String queryContact = scanner.nextLine();
        mobilePhone.queryContact(queryContact);
    }
}
