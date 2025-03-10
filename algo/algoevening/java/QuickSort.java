package algoevening.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {7, -2, 4, 1, 6, 5, 0, -4, 2};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));


//        System.out.println(Arrays.toString(arr));
////        System.out.println("Index of element = " + index);
//        change(arr, 0, index - 1);
//        System.out.println(Arrays.toString(arr));
//        change(arr, index + 1, arr.length - 1);
//        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int index = change(arr, start, end);
            quickSort(arr, start, index - 1);
            quickSort(arr, index + 1, end);
        }
    }

    private static int change(int[] arr, int start, int end) {
        int index = start;
        int value = arr[end];
        for (int i = start; i <= end - 1; i++) {
            if (arr[i] < value) {
                swap(arr, index, i);
                index++;
            }
        }
        swap(arr, index, end);
        return index;
    }

    private static void swap(int[] array, int index, int i) {
        int temp = array[index];
        array[index] = array[i];
        array[i] = temp;
    }
}
