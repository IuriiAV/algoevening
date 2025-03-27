package algoevening.java;

import java.util.Arrays;

public class PrefixSumTask {

    public static void main(String[] args) {
        //int[] array = {2, 5, 1, 6, 1};
        int[] array = {1, 7, 3, 6, 5, 6};

        //1
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum = " + sum);
        int[] output = new int[array.length];
        output[0] = array[0];

        //2
        for (int i = 1; i < array.length; i++) {
            // i = array[i] + array[i-1]
            output[i] = array[i] + output[i - 1];
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(output));

        for (int i = 0; i < output.length; i++) {
            int sumRight = sum - output[i];
            int sumLeft = output[i] - array[i];
            if (sumLeft == sumRight) {
                System.out.println("Found index " + i);
                break;
            }
        }
    }
}
