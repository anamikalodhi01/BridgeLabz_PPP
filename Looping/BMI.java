import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input weight and height
        System.out.print("Enter weight (in kg): ");
        double weight = sc.nextDouble();

        System.out.print("Enter height (in cm): ");
        double heightCm = sc.nextDouble();

        // Convert height to meters
        double heightM = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightM * heightM);

        System.out.printf("\nYour BMI is: %.2f\n", bmi);

        // Determine BMI category
        if (bmi <= 18.4) {
            System.out.println("Status: Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Status: Normal");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Status: Overweight");
        } else {
            System.out.println("Status: Obese");
        }
    }
}
