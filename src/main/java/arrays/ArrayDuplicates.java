package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static arrays.FrequentNumbers.mostFrequent;

public class ArrayDuplicates {

    public static void main(String args[]) {

        // mostFrequent(array1) should return 1.
        int[] array1 = {1, 3, 1, 3, 2, 1};
        // mostFrequent(array2) should return 3.
        int[] array2 = {3, 3, 1, 3, 2, 1};
        // mostFrequent(array3) should return null.
        int[] array3 = {};
        // mostFrequent(array4) should return 0.
        int[] array4 = {0};
        // mostFrequent(array5) should return -1.
        int[] array5 = {0, -1, 10, 10, -1, 10, -1, -1, -1, 1};

        System.out.println(Arrays.toString(new Integer[]{mostFrequent(array1)}));
    }

    public static Integer mostFrequent(int[] givenArray) {

        Integer maxItem = null;
/*
Our first solution is very simple. All we are doing here is to loop over an array and comparing each element to every
 other element. For doing this, we are using two loops, inner loop, and outer loop. We are also making sure that
 we are ignoring comparing of elements to itself by checking for i != j before printing duplicates. Since we are
  comparing every element to every other element, this solution has quadratic time complexity i.e. O(n^2). This
  solution has the worst complexity in all three solutions.
 */
        System.out.println("Finding duplicate elements in array using brute force method");
        for (int i = 0; i < givenArray.length; i++) {
            for (int j = i + 1; j < givenArray.length; j++) {
                if (i != j && givenArray[i] == givenArray[j]) {
                    maxItem = givenArray[j];
                    // got the duplicate element
                }
            }
        }
        return maxItem;

    }
}


