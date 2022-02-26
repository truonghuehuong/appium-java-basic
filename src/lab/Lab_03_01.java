package lab;

public class Lab_03_01 {
    /**
     * Lab 3.1:    Count how many odd, even number(s) in an integer array
     * int[] intArr = {1, 2, 3, 4, 5};
     * Even numders: 2
     * Odd numbers: 3
     * */

    public static void main(String[] args) {
        int []intArray = {1,5,8,9,0,0,12,24,-36,48,59};
//        int intArray[] = {1,5,8,9,0,0,12,24,36,48,59}; // another way
//        int []intArray = new int[] {1,2,3,4,5,6}; // another way

        int countEven = 0, countOdd = 0;
//        for (int i = 0; i < intArray.length; i++) {    // another way
            for (int j : intArray) {
            if (j % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Even numbers: " + countEven);
        System.out.println("Odd numbers: " + countOdd);
    }
}
