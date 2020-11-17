import java.io.*;
import java.util.*;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result = 0;

        // start the process
        while (result != 3) {
            mainMenu();
            result = sc.nextInt();
            if (result == 1) // ============ create new list ================
            {
                // create the list
                ArrayList<TaskItem> todoList = new ArrayList<>();
                // process the list
                processList(todoList);
                // saving to file
                writeListData(todoList);
            System.out.println("Quit to the main menu...1");
            }
            if (result == 2) // ============ Load an existing list ================
            {
                // load the existing list
                ArrayList<TaskItem> todoList = new ArrayList<>();
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

    private static void processList(ArrayList<TaskItem> todoList) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 8) {
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
            else if (choice == 5) // 5) mark an item as completed
            {
                markCompleted(todoList);
            }
            else if (choice == 6) // 6) unmark an item as completed
            {
                unmarkCompleted(todoList);
            }
            else if (choice == 7) // 7) save the current list
            {
                writeListData(todoList);
            }
            if (choice < 0 || choice > 8) {
                System.out.println("ERROR: INVALID INPUT. Please enter number between 1 - 8.");
            }
        } // end inner while loop
    }

    private static void unmarkCompleted(ArrayList<TaskItem> todoList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Completed Tasks.\n-------------");
        displayList(todoList);
        System.out.println("Which task will you unmark as completed? ");
        int choice = sc.nextInt();
    } // end unmarkCompleted

    private static void markCompleted(ArrayList<TaskItem> todoList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uncompleted Tasks.\n-------------");
        displayList(todoList);
        System.out.println("Which task will you mark as completed? ");
        int choice = sc.nextInt();


    } // end markCompleted

    private static void removeItem(ArrayList<TaskItem> todoList) {
        int number;
        Scanner sc = new Scanner(System.in);
        displayList(todoList);
        System.out.println("Which task will you remove? ");
        number = sc.nextInt();

        todoList.remove(number);
    } // end removeItem

    private static void addItem(ArrayList<TaskItem> todoList) {
        String title;
        String description;
        String date;

        title = getListTitle();
        description = getDescription();
        date = getDate();
        TaskItem newItem = new TaskItem(title, description, date);
        todoList.add(newItem);
    } // end addItem

    private static void editItem(ArrayList<TaskItem> todoList) {
        int number;
        String newTitle;
        String newDescription;
        String newDate;
        Scanner sc = new Scanner(System.in);

        displayList(todoList);
        System.out.println("Which task will you edit? ");
        number = sc.nextInt();
        System.out.println("Enter a new title for task " +number+": ");
        newTitle = sc.next();
        System.out.println("Enter a new description for task " +number+": ");
        newDescription = sc.next();
        System.out.println("Enter a new task due date (YYYY-MM-DD) for task " +number+": ");
        newDate = sc.next();

        TaskItem newItem = new TaskItem(newTitle, newDescription, newDate);
        todoList.set(number,newItem);
    } // end editItem

    private static void displayList(ArrayList<TaskItem> todoList) {
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
        System.out.println("5) mark an item as completed");
        System.out.println("6) unmark an item as completed");
        System.out.println("7) save the current list");
        System.out.println("8) quit to the main menu");
        System.out.printf("> ");
    } //end ListOperationMenu

    public static String getListTitle() {
        String buffer = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Task title: ");
        buffer = sc.nextLine();
        return buffer;
    } // end getListTitle

    public static String getDescription() {
        String buffer = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Task Description: ");
        buffer = sc.nextLine();
        return buffer;
    } // end getDescription

    public static String getDate() {
        String buffer = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Task due date(YYYY-MM-DD):");
        buffer = sc.nextLine();
        return buffer;
    }

    public static void writeListData(ArrayList<TaskItem> todoList) {
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