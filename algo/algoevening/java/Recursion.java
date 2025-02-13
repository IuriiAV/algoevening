package algoevening.java;

public class Recursion {

    public static void main(String[] args) {
        //print digits from 1 to 5
        System.out.println("Iterate approach");
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        System.out.println("Recurrent approach");
        printDigit(1);
    }

    public static void printDigit(int n) { // 1
        //base case
        if (n == 6) {
            return;
        }
        //recurrent case
        System.out.println(n);
        printDigit(n + 1);
    }
}
