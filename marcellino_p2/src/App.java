import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);
    }

    private static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData) {
        double totalBMI = 0;
        double average = 0;

        for (int i = 0; i < bmiData.size(); i++){
            totalBMI += bmiData.get(i).calculateBMI();
        }

        average = totalBMI / bmiData.size();
        System.out.printf("The average BMI score entered by the user is %.1f \n", average);
    }

    private static void displayBmiInfo(BodyMassIndex bmi) {
        bmi.displayBMICategory();
        bmi.userBMICategory();
    }

    private static double getUserWeight() {
        Scanner scanner = new Scanner((System.in));
        double weight = 0;
        boolean badInput = true;

        while(badInput){
            System.out.println("Please enter weight in pounds (Only positive values!): ");
            weight = scanner.nextDouble();

            if(weight < 0) {
                System.out.println("I said positive! Try it again.");
            } else if (weight == 0){
                System.out.println("Weight cannot be Zero! Try it again.");
            }
            else {
                badInput = false;
            }
        }// end while loop
        return weight;
    }

    private static double getUserHeight() {
        Scanner scanner = new Scanner((System.in));
        double height = 0;
        boolean badInput = true;

        while(badInput){
            System.out.println("Please enter height in inches (Only positive values!): ");
            height = scanner.nextDouble();

            if(height < 0) {
                System.out.println("I said positive! Try it again.");
            } else if (height == 0){
                System.out.println("Height cannot be Zero! Try it again.");
            }else {
                badInput = false;
            }
        }// end while loop
        return height;
    }// end getUserHeight

    private static boolean moreInput() {
        Scanner scanner = new Scanner(System.in);
        String response = null;
        boolean yn;

        while (true) {
                System.out.println("Calculate your BMI (Body Mass Index) [Y/N]? ");
                response = scanner.next();

                if (response.equals("y") || (response.equals("Y"))){
                    yn = true;
                    break;
                } else if (response.equals("n") || (response.equals("N"))){
                    yn = false;
                    break;
                } else {
                    System.out.println("Sorry, I didn't catch that. Please answer y/n");
                }
        }
        return response.equalsIgnoreCase("Y");
    }
} // end class App
