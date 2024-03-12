package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] largerArray = {1, -2, 0,0,0, 4, -5, 0, 6, 0, -8};

        // Create arrays for positive and negative values
        int[] positiveArray = new int[largerArray.length];
        int[] negativeArray = new int[largerArray.length];

        int zeroCount = 0;
        int positiveIndex = 0;
        int negativeIndex = 0;
        int i = 0;

        while (i < largerArray.length) {
            if (largerArray[i] == 0) {
                zeroCount++;
            } else if (largerArray[i] > 0) {
                positiveArray[positiveIndex++] = largerArray[i];
            } else {
                negativeArray[negativeIndex++] = largerArray[i];
            }
            i++;
        }


        positiveArray = resizeArray(positiveArray, positiveIndex);
        negativeArray = resizeArray(negativeArray, negativeIndex);


        System.out.println("Number of zeros: " + zeroCount);
        System.out.print("Positive values array: ");
        for (int value : positiveArray) {
            System.out.print(value + " ");
        }
        System.out.println();
        System.out.print("Negative values array: ");
        for (int value : negativeArray) {
            System.out.print(value + " ");
        }
        System.out.println();
    }


    private static int[] resizeArray(int[] array, int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, newSize);
        return newArray;
    }
}



