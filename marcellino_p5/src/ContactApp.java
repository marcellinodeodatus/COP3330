import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class ContactApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result = 0;

        // start the process
        while (result != 3) {
            mainMenu();
            result = sc.nextInt();
            if (result == 1) // ============ create new contact list ================
            {
                // create the list
                ArrayList<ContactItem> contactList = new ArrayList<>();
                // process the list
                processList(contactList);
                // saving to file
                writeListData(contactList);
            System.out.println("Quit to the main menu...1");
            }
            if (result == 2) // ============ Load an existing contact list ================
            {
                // load the existing list
                ArrayList<ContactItem> todoList = new ArrayList<>();
                // process the list
                processList(todoList);
                // saving to file
                writeListData(todoList);
            }
            if (result <= 0 || result > 3) {
                System.out.println("ERROR: INVALID INPUT. Please enter number between 1 to 3.");
            }
        } // end while loop

        System.out.println("Exiting the Program...");

    } // end main

    private static void processList(ArrayList<ContactItem> todoList) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 6) {
            listOperationMenu();
            choice = sc.nextInt();
            if (choice == 1) // 1) view the list
            {
                displayList(todoList);
            }
            else if (choice == 2) // 2) add an item
            {
                addItem(todoList);
            }
            else if (choice == 3) // 3) edit an item
            {
                editItem(todoList);
            }
            else if (choice == 4) // 4) remove an item
            {
                removeItem(todoList);
            }
            else if (choice == 5) // 5) save the current list
            {
                writeListData(todoList);
            }
            if (choice < 0 || choice > 6) {
                System.out.println("ERROR: INVALID INPUT. Please enter number between 1 - 8.");
            }
        } // end inner while loop
    }

    private static void removeItem(ArrayList<ContactItem> todoList) {
        int number;
        Scanner sc = new Scanner(System.in);
        displayList(todoList);
        System.out.println("Which task will you remove? ");
        number = sc.nextInt();

        todoList.remove(number);
    } // end removeItem

    private static void addItem(ArrayList<ContactItem> todoList) {
        String firstName;
        String lastName;
        String phoneNumber;
        String emailAddress;

        firstName = getFirstName();
        lastName = getLastName();
        phoneNumber = getPhone();
        emailAddress = getEmailAddress();
        ContactItem newItem = new ContactItem(firstName, lastName, phoneNumber, emailAddress);
        todoList.add(newItem);
    } // end addItem

    private static void editItem(ArrayList<ContactItem> todoList) {
        int number;
        String newFirstName;
        String newLastName;
        String newPhone;
        String newEmail;
        Scanner sc = new Scanner(System.in);

        displayList(todoList);
        System.out.println("Which contact will you edit? ");
        number = sc.nextInt();
        System.out.println("Enter a new first name for contact " +number+": ");
        newFirstName = sc.next();
        System.out.println("Enter a new last name for contact " +number+": ");
        newLastName = sc.next();
        System.out.println("Enter a new phone number (xxx-xxx-xxxx) for contact " +number+": ");
        newPhone = sc.next();
        System.out.println("Enter a new email address (x@y.z) for contact " +number+": ");
        newEmail = sc.next();

        ContactItem newItem = new ContactItem(newFirstName, newLastName, newPhone, newEmail);
        todoList.set(number,newItem);
    } // end editItem

    private static void displayList(ArrayList<ContactItem> todoList) {
        for (int i = 0; i < todoList.size(); i++) {
            System.out.print(i+")  "+todoList.get(i).toString());
        }
    } // end displayList

    public static void mainMenu() {
        System.out.println("Main Menu");
        System.out.println("-------------------\n");
        System.out.println("1) create a new list");
        System.out.println("2) load an existing list");
        System.out.println("3) Quit\n");
        System.out.print("> ");
    } // end mainMenu

    public static void listOperationMenu() {
        System.out.println("List Operation Menu");
        System.out.println("---------");
        System.out.println("1) view the list");
        System.out.println("2) add an item");
        System.out.println("3) edit an item");
        System.out.println("4) remove an item");
        System.out.println("5) save the current list");
        System.out.println("6) quit to the main menu");
        System.out.printf("> ");
    } //end ListOperationMenu

    public static String getFirstName() {
        String buffer = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("First name: ");
        buffer = sc.nextLine();
        return buffer;
    } // end getListTitle

    public static String getLastName() {
        String buffer = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Last name: ");
        buffer = sc.nextLine();
        return buffer;
    } // end getDescription

    public static String getPhone() {
        String buffer = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Phone number (xxx-xxx-xxxx):");
        buffer = sc.nextLine();
        return buffer;
    }

    public static String getEmailAddress() {
        String buffer = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Email address (x@y.z):");
        buffer = sc.nextLine();
        return buffer;
    }

    public static void writeListData(ArrayList<ContactItem> todoList) {
        try ( Formatter output = new Formatter("todoList.txt")) {
            for (int i = 0; i < todoList.size(); i++){
                output.format("%s",todoList.get(i));
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to find the file...");
        } catch (IOException ex){
            ex.printStackTrace();
        }
        System.out.println("Saving data...");
    } // end writeListData
} // end class App