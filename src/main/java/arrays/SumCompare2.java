package arrays;

public class SumCompare2 {

    public static boolean isSumEqual(int[] ar, int n) {

        // Function that returns true if sum of
        // first n-1 elements of the array is
        // equal to the last element
        int sumFirstPart = 0, lastElement = 0;

        // Find the sum of first n-1
        // elements of the array
        for (int i = 0; i < n; i++) {

            if (i < n - 1) {
                sumFirstPart += ar[i];
            } else {
                lastElement += ar[n - 1];
            }
        }
        if (sumFirstPart == lastElement) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 2, 9};
        int n = arr.length;

        System.out.println("The sum of n elements are equal to last element: " + isSumEqual(arr, n));

    }

}
