package algoevening.java;

import java.util.Arrays;

public class PatternOne_TwoPointers_SquaresOfSortedArray {

    public static void main(String[] args) {
        int[] numbers = {-4,-1,0,3,10};
        int[] result = new int[numbers.length];
        int index = result.length - 1;

        int left = 0;
        int right = numbers.length - 1;

        while (index >= 0) {
            int sL = numbers[left] * numbers[left];
            int sR = numbers[right] * numbers[right];
            if(sL > sR) {
                result[index] = sL;
                left ++;
            } else {
                result[index] = sR;
                right--;
            }
            index--;
        }
        System.out.println(Arrays.toString(result));
    }
}
