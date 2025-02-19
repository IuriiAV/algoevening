package algoevening.java;

public class ValidPalindrome {

    public static void main(String[] args) {
        String str = "abeccdeba";
        System.out.println("Is palindrome abeccdeba " + isPalindrome(str));
        System.out.println("Is palindrome abeccfdeba " + isPalindrome("abeccfdeba"));
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            char l = str.charAt(left);
            char r = str.charAt(right);
            if (l == r) {
                left++;
                right--;

            } else {
                return check(str, left + 1, right) || check(str, left, right - 1);
            }
        }
        return true;
    }

    public static boolean check(String str, int left, int right) {
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
