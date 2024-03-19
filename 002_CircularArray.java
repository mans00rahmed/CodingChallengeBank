package org.example;

public class circularArray {
    static void isCircularArray(int[] input) {
        int minIndex = findSmallestElement(input);
        boolean isCircular = true;

        for (int i = minIndex; i < input.length - 1; i++) {
            if (input[i] > input[i + 1]) {
                isCircular = false;
                break;
            }
        }
        for (int i = 0; i < minIndex - 1; i++) {
            if (input[i] > input[i + 1]) {
                isCircular = false;
                break;
            }
        }

        if (isCircular) {
            System.out.println("Array is circular.");
        } else {
            System.out.println("Array is not circular.");
        }
    }

    public static int findSmallestElement(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        int min = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        int[] array = {6, 7, 1, 2, 3, 4, 5};
        isCircularArray(array);
    }
}
