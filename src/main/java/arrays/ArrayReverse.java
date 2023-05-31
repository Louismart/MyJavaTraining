package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayReverse {

    public static void main(String[] args) {

        int[]array = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(array));
        reverseByFirstMethod(array);
        System.out.println(Arrays.toString(array));

    }
    //1.swap the first element of array with the last element; second element with the second last and so on/
    private static void reverseByFirstMethod(int[] array) {

        int maxIndex = array.length -1 ;
        int halfLenght = array.length/2;
        for (int i = 0; i < halfLenght ; i++) {
            int temp = array[i];
            array[i] = array[maxIndex -i ];
            array[maxIndex -i] = temp;
        }
    }
    private static void reverseBySecondMethod(int[] array) {
        //2 print array starting from first element
        System.out.println("Original Array:");
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + "  ");

        System.out.println();

        // print array starting from last element
        System.out.println("Original Array printed in reverse order:");
        for(int i = array.length-1; i >= 0; i--)
            System.out.print(array[i] + "  ");
    }

    // 3.function reverses the elements of the array
    private static void reverseByThirdMethod(int[] array)
    {
        Collections.reverse(Arrays.asList(array));
        System.out.println("Reversed Array:" + Arrays.asList(array));
    }
}
