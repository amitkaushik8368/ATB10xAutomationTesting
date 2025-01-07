package JavaPracticeJan5_10;

/*
*     @This java program is to sort an array using quick sort method
 */

import java.util.Arrays;
public class ArrayLab001 {
    public static void main(String[] args) {
        int[] array = {54, 65, 34, 76, 12, 34, 9};

        // Call the quick sort function
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(array, low, high);

            // Recursively sort elements before and after the pivot
            quickSort(array, low, pivotIndex - 1); // Left subarray
            quickSort(array, pivotIndex + 1, high); // Right subarray
        }
    }
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choose the last element as the pivot
        int i = low - 1; // Pointer for elements smaller than the pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++; // Move the pointer
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // Place the pivot in its correct position
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1; // Return the index of the pivot
    }
}


