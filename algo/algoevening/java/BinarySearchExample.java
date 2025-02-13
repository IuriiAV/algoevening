package algoevening.java;

public class BinarySearchExample {

    public static void main(String[] args) {
        int arr[] = {11, 22, 44, 50, 60, 86, 114, 140, 145, 190};
        int x = 114;
        System.out.println("Index of 114 = " + binarySearch(arr, x));
        System.out.println("Recursion index 114 is " + binarySearchRecusievly(arr,0, arr.length -1 , x));

    }

    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int element = arr[mid];
            if (element == x) {
                return mid;
            }
            if (element < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    private static int binarySearchRecusievly(int[] arr, int left, int right, int x) {
        int mid = left + (right - left) / 2;
        int element = arr[mid];

        //base case
        if (element == x) {
            return mid;
        }
        if (left > right) {
            return -1;
        }

        if (element < x) {
            return binarySearchRecusievly(arr, mid + 1, right, x);
        } else {
            return binarySearchRecusievly(arr, left, mid - 1, x);
        }
    }
}
