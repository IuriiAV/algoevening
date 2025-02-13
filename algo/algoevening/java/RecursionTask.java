package algoevening.java;

public class RecursionTask {

    public static void main(String[] args) {
        System.out.println(sumIteration(5));
    }

    private static int sumIteration(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
