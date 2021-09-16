package midsem;

import java.util.Arrays;

public class ArrayRemoveQ1b {

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 5, 2, 1, 9, 4};
        removeRandom(arr);
    }

     static void removeRandom(int[] arr) {
        if (arr.length == 0) return;
        int numEntries = arr.length;
        // Print the original array
        System.out.println("Input Array: " + Arrays.toString(arr));
//        System.out.println();
        // the index at which the element in the array is to be removed
        int random_index = (int) (Math.random() * numEntries);

        // display index
        System.out.println("Element to be removed at index: " + random_index);

        // if array is empty or index is out of bounds, removal is not possible
        if (arr == null
                || random_index < 0
                || random_index >= arr.length) {

            System.out.println("No removal operation can be performed!!");
        }
        // Create a proxy array of size one less than original array
        int[] proxyArray = new int[arr.length - 1];

        // copy all the elements in the original to proxy array except the one at index
        for (int i = 0, k = 0; i < arr.length; i++) {

            // check if index is crossed, continue without copying
            if (i == random_index) {
                continue;
            }

            // else copy the element
            proxyArray[k++] = arr[i];
        }

        // Print the copied proxy array
        System.out.println("Array after removal operation: " + Arrays.toString(proxyArray));
        System.out.println();

        removeRandom(proxyArray);

    }
}
