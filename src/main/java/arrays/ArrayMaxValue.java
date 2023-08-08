package arrays;

public class ArrayMaxValue {

    public static void main(String[] args) {
        int[] arr = {2,3,4,8,7};
        System.out.println(maxValue(arr));
    }

    public static int maxValue(int[] givenArray) {
        int max = givenArray[0];
        for (int i = 0; i < givenArray.length ; i++) {
             System.out.println("Element at index " + i + ":" + " "+ "element aligned" + " " + givenArray[i]);
            if (givenArray[i] > max)  {
                max = givenArray[i];

            }
        }
        return max;
    }
}
