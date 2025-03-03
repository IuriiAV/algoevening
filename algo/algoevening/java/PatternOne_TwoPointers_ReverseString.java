package algoevening.java;

import java.util.Arrays;

public class PatternOne_TwoPointers_ReverseString {

    public static void main(String[] args) {
        String text = "Hello World!";
        char[] chars = text.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
        System.out.println(Arrays.toString(chars));
    }
}
