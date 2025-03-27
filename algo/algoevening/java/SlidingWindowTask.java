package algoevening.java;

public class SlidingWindowTask {

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 2};
        int sum = 7;
        System.out.println(getMinLength(arr, sum));
        // 2 2 2 6  = 12 > 7 , 10 > 7

        // 2 1 5
        // 1 5
        // 1 5 2
        // 5 2
        // 2
        // 2 3 2
        // 3 2
    }

    public static int getMinLength(int[] arr, int sum) {
        int minLength = 9999;
        int currSum = 0;
        int start = 0;
        for(int i = 0; i < arr.length; i++) {
            currSum += arr[i]; // 2 , 1 , 5
            while (currSum >= sum) { // 8 >= 7, 6 >=7
                int currLength  = i - start + 1; // 3
                if(currLength < minLength) {
                    minLength = currLength;
                }
                currSum = currSum - arr[start];
                start++;
            }

        }
        return minLength;
    }
}
