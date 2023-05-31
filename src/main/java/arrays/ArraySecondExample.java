package arrays;

public class ArraySecondExample {

    public static void main(String[] args) {

        int[] myArrays = new int[25];
        for (int i = 0; i < 25 ; i++) {
            myArrays[i] = i * 10;
        }
        printArray(myArrays);
    }
    public static void printArray(int[] array) {
        for (int i=0; i <array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
