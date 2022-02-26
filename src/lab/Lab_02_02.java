package lab;

import java.util.Scanner;

public class Lab_02_02 {
    public static void main(String[] args) {
        /**
         * Lab 2.2 Allow user to input a number, print out it's an odd or even number
         * */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input a number:");
        int number = scanner.nextInt();

        if(number % 2 == 0){
            System.out.println("This is an even number!");
        }
        else {
            System.out.println("This is an odd number!");
        }
    }
}