package algoevening.java;

import java.util.Arrays;

public class PatternOne_TwoPointers_RemoveElement {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 2, 0, 4, 2};
        int remove = 2;

        int slow = 0;
        for(int fast = 0; fast < numbers.length; fast++) {
            if(numbers[fast] != remove) {
                numbers[slow++] = numbers[fast];
            }
        }

        System.out.println(Arrays.toString(numbers) + " we have " + slow + " elements");
        for (int i = slow; i < numbers.length; i++) {
            numbers[i] = -1;
        }
        System.out.println(Arrays.toString(numbers) + " we have " + slow + " elements");

    }
}
