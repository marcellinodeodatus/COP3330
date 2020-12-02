import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class Main_driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int result = 0;

        while (result != 3) {
            mainMenu();
            result = sc.nextInt();
            if (result == 1) // ============ Task List ================
            {
                TaskApp.main(args);
            }
            if (result == 2) // =========== Contact List ==============
            {
                ContactApp.main(args);
            }
            if (result <= 0 || result > 3) {
                System.out.println("ERROR: INVALID INPUT. Please enter number between 1 to 3.");
            }
        }

    } // end main

    public static void mainMenu() {
        System.out.println("Select Your Application");
        System.out.println("-------------------\n");
        System.out.println("1) Task List");
        System.out.println("2) Contact List");
        System.out.println("3) Quit\n");
        System.out.print("> ");
    } // end mainMenu

} // end class Main_driver
