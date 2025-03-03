package algoevening.java;

public class PatternOne_TwoPointers_TwoSumArraySorted {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 4, 5, 7, 11, 15};
        int target = 9;

        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                System.out.println("index 1 = " + left + " index 2 = " + right);
                break;
            }
            if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
    }
}
