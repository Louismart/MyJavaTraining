package arrays;

//Compare sum of first N-1 elements to Nth element of an array
public class SumCompare {

    // Function that returns true if sum of
    // first n-1 elements of the array is
    // equal to the last element
    static boolean isSumEqual(int[] ar) {

        // Find the sum of first n-1 elements of the array
        int sum = 0;
        int i;
        for (i = 0; i < ar.length - 1; i++)
            sum += ar[i];
        System.out.println(sum);

        // If sum equals to the last element
        if (sum == ar[ar.length - 1]) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[]arr = {2,2,3,4,11};
                //  0 1 2 3 4
        System.out.println(isSumEqual(arr));

    }
}
