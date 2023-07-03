package arrays;

//Compare sum of first half of array elements to second half elements of an array
public class SumCompare {

    public static void isSumEqual(int[] ar, int n) {

        int sumFirst = 0, sumSecond = 0;
        for (int i = 0; i < n ; i++) {

            // Add elements in first half sum
            if (i < n / 2) {
                sumFirst += ar[i];
            }
            // Add elements in the second half sum
            else {
                sumSecond += ar[i];
            }
        }
        System.out.println("Sum of first half element is " + sumFirst);
        System.out.println("Sum of second half element is " + sumSecond);

    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 4, 2, 5, 2};
        int n = arr.length;

        isSumEqual(arr, n);

    }

}
