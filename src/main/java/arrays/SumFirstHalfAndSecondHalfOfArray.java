package arrays;

public class SumFirstHalfAndSecondHalfOfArray {

    public static void summOfTwoHalfs(int[] arr) {

        int sumFirst = 0;
        int sumSecond = 0;

        for (int i = 0; i < arr.length; i++) {

            // Add elements in first half sum
            if (arr[i] < arr.length/2) {
                sumFirst +=arr[i];
            }
            // Add elements in the second half sum
            else {
                sumSecond +=arr[i];
            }

        }
        System.out.println("Sum of first half elements is "
                + sumFirst);

        System.out.println("Sum of second half elements is "
                + sumSecond);
    }

    public static void main(String[] args) {

        int[]arr = {50, 35, 20, 15, 10};
        summOfTwoHalfs(arr);
    }
}
