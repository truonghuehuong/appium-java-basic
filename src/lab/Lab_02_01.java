package lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab_02_01 {
    public static void main(String[] args) {
        /**
         * Lab 2.1 Get input from user about height(m) and weight(kg) then calculate BMI
         * 	- Underweight is < 18.5
         * 	- Normal weight is between 18.5 - 24.9
         * 	- Overweight is between 25 - 29.9
         * 	- Obesity is >= 30
         * BMI = weight / (height * height)
         * */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your weight(kg): ");
        double weight = scanner.nextDouble();
        System.out.println("Please enter your height(m): ");
        double height = scanner.nextDouble();

        DecimalFormat decimalFormat = new DecimalFormat("0.00"); // to round a number

        // Weight and Height cannot be <= 0
        if (weight <= 0 || height <= 0) {
            System.out.println("Weight/ Height cannot be <= 0");
        } else {  // Just calculate if input value is valid
            double BMI = weight / (height * height);
            if (BMI < 18.5) {
                System.out.printf("Your BMI is: %s. You are underweight", decimalFormat.format(BMI));
            } else if (BMI >= 18.5 && BMI <= 24.9) {
                System.out.printf("Your BMI is: %s. Congratulations! You have a Normal weight!", decimalFormat.format(BMI));
            } else if (BMI >= 25 && BMI <= 29.9) {
                System.out.printf("Your BMI is: %s. You are Overweight!!!", decimalFormat.format(BMI));
            } else {
                System.out.printf("Your BMI is: %s. You are Obesity!!!", decimalFormat.format(BMI));
            }
        }
    }
}
