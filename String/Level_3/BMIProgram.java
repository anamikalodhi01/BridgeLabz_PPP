import java.util.Scanner;

public class BMIProgram {

    // (a) Method to take input of weight and height in 2D array
    public static double[][] takeInput(int n) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[n][2]; // column0 = weight, column1 = height (cm)

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) of person " + (i+1) + ": ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) of person " + (i+1) + ": ");
            hw[i][1] = sc.nextDouble();
        }
        return hw;
    }

    // (b) Method to calculate BMI & status
    public static String[][] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // convert to meters
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[][] { {String.format("%.2f", bmi), status} };
    }

    // (c) Method to compute BMI & Status for all persons
    public static String[][] processAll(double[][] hw) {
        int n = hw.length;
        String[][] result = new String[n][4]; // col0=Weight, col1=Height, col2=BMI, col3=Status

        for (int i = 0; i < n; i++) {
            result[i][0] = String.format("%.1f", hw[i][0]); // weight
            result[i][1] = String.format("%.1f", hw[i][1]); // height

            String[][] bmiStatus = calculateBMI(hw[i][0], hw[i][1]);
            result[i][2] = bmiStatus[0][0]; // BMI
            result[i][3] = bmiStatus[0][1]; // Status
        }
        return result;
    }

    // (d) Method to display in tabular format
    public static void display(String[][] table) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-15s%n",
                table[i][0], table[i][1], table[i][2], table[i][3]);
        }
    }

    // (e) Main method
    public static void main(String[] args) {
        int n = 10; // team of 10 members
        double[][] hw = takeInput(n);          // step a
        String[][] results = processAll(hw);  // step b + c
        display(results);                     // step d
    }
}
