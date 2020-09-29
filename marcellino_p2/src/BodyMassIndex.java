import java.text.DecimalFormat;

public class BodyMassIndex {

    private double height;
    private double weight;
    private double bmiScore;

    // Constructors
    public BodyMassIndex(){

    }

    public BodyMassIndex(double height, double weight) {

        this.height = height;
        this.weight = weight;
    }

    // Getters and Setters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBmiScore(double bmiScore) {
        this.bmiScore = bmiScore;
    }

    public double calculateBMI(){
        bmiScore = (703 * weight) / ((height)*(height));
        return bmiScore;
    }

    public void displayBMICategory(){
        System.out.println("---------------------------");
        System.out.println("BMI Category");
        System.out.println("Underweight < 18.5");
        System.out.println("Normal Weight = 18.5 - 24.9");
        System.out.println("Overweight = 25 - 29.9");
        System.out.println("Obesity >= 30");
    }

    public void userBMICategory() {
        double bmiScore = calculateBMI();
        String category;
        if(bmiScore <= 18.5) {
            category = "Underweight";
        } else if(bmiScore < 25) {
            category = "Normal weight";
        } else if(bmiScore < 30) {
            category = "Overweight";
        } else {
            category = "Obese";
        }
        System.out.println("---------------------------");
        System.out.printf("Your BMI is %.1f \n", bmiScore);
        System.out.println("Your category is: "+category);
    }

    @Override
    public String toString() {
        return "---------------------------\n" +
                "Your height is: " + height + " inch,\n" +
                "Your weight is: " + weight + " lb\n";
    }


}
