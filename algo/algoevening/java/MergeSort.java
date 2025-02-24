package algoevening.java;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] one = {1, 3, 5, 6};
        int[] two = {2, 3, 4};

        System.out.println(Arrays.toString(merge(one,two)));

        int[] arr = {38,27,43,3,9,82,10};
        System.out.println(Arrays.toString(mergeSort(arr)));

    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

        int[] resLeft = mergeSort(left);
        int[] resRight = mergeSort(right);

        return merge(resLeft, resRight);
    }

    public static int[] merge(int[] one, int[] two) {
        int oneIndex = 0;
        int twoIndex = 0;
        int resultIndex = 0;
        int[] result = new int[one.length + two.length];
        while (oneIndex < one.length && twoIndex < two.length) {
            int oneElement = one[oneIndex];
            int twoElement = two[twoIndex];
            if (oneElement < twoElement) {
                result[resultIndex] = oneElement;
                oneIndex++;
            } else {
                result[resultIndex] = twoElement;
                twoIndex++;
            }
            resultIndex++;
        }

        while(oneIndex < one.length) {
            result[resultIndex] = one[oneIndex];
            oneIndex++;
            resultIndex++;
        }

        while(twoIndex < two.length) {
            result[resultIndex] = two[twoIndex];
            twoIndex++;
            resultIndex++;
        }

        return result;
    }
}
