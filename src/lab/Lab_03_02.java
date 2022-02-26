package lab;

public class Lab_03_02 {
    /**
     * Lab 3.2:        Finding maximum value/minimum value from an integer array
     * int[] intArr = {1, 2, 3, 4, 5};
     * Minimum: 1
     * Maximum: 5
     * */
    public static void main(String[] args) {
        int[] intArray = new int[] {120,-1,12,9,20,8,9,111,5,0,130};
        int minNum = 0, maxNum = 0;

        for (int j : intArray) {
            if (j <= minNum) {
                minNum = j;
            }
        }

        for (int i : intArray) {
            if (i >= maxNum) {
                maxNum = i;
            }
        }
        System.out.println("Minimum is: " + minNum);
        System.out.println("Maximum is: " + maxNum);
    }
}
