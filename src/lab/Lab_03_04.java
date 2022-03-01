package lab;

public class Lab_03_04 {
    /**
     * Lab 3.4(optional):  Merge 2 SORTED integer array into one SORTED array
     * Array 01: {1, 12, 16, 28, 34}
     * Array 02: {1, 13, 16, 27, 99}
     * Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}
     */
    public static void main(String[] args) {
        int[] intArray1 = new int[]{1, 12, 16, 28, 34};
        int[] intArray2 = new int[]{1, 13, 16, 27, 99}; // 100, 151};

        int[] intArray = new int[intArray1.length + intArray2.length];
//        System.out.println(intArray.length);
        int i = 0, j=0, k=0;

        while (i < intArray1.length  && j < intArray2.length){
            if(intArray1[i] < intArray2[j]){
                intArray[k] = intArray1[i];
                i++;
            }
            else{
                intArray[k] = intArray2[j];
                j++;
            }
            System.out.println(intArray[k]);
            k++;
        }


    }
}
