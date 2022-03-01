package lab;

public class Lab_03_03 {
    /**
     * Lab 3.3:      Sort an integer array from min to max
     * Input: {12, 34, 1, 16, 28}
     * Expected output: {1, 12, 16, 28, 34}
     */
    public static void main(String[] args) {
        int[] intArray = new int[]{98, 0, 1, 200, 46, -5, -90, 149, 1, 24, 675, 3, 8, 9};
        int temp;

        for (int i = 0; i < intArray.length; i++) {
            for (int j = i+1; j < intArray.length; j++) {
                if (intArray[j] < intArray[i]) {
                    temp = intArray[j];
                    intArray[j] = intArray[i];
                    intArray[i] = temp;
                }
            }
            System.out.println(intArray[i]);
        }
    }
}
