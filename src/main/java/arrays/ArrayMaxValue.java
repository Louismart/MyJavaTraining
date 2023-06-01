package arrays;

public class ArrayMaxValue {

    public static void main(String[] args) {
        //arrayCount(2,3,4,8,7);
        //check if Array comprise 3, if yes- r print it
        maxValue(new char[]{'1','3'});
    }

    public static int maxValue(char[] chars) {
        //int[] numArr = {2, 3, 2, 6, 8, 3,2,25,88,33,3,4,3};
        int max = chars[0];
        for (int i = 0; i < chars.length ; i++) {
            // System.out.println("Element at index " + i + ":" + numArr[i]);
            if (chars[i] > max)  {
                max = chars[i];

            }
        }
        return max;
    }
}
