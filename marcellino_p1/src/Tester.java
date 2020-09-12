import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4 digit integer:");
        String number = sc.nextLine();
        String encryptedNumber = Encrypter.encrypt(number);
        System.out.println("encrypts " +number+" to "+encryptedNumber);
    }
}
