package mathLogic;

import java.util.stream.Stream;

public class Fibanacci {

    // ll    l     s -- < window
    // 0,    1,    1,   2,     3, 5, 8, 13, 21, 34 ..  values
    // 0,    1,    2,   3 ... indexes
    // fibbgonach(8) == 21
    // fibbonach(1) = 1
    // fibbonach(2) = 1
    // fibbonach(3) = 2

    public static int fibbonachi(int index) {
        int temp_last = 1;
        int temp_last_last = 0;

        for (int i = 2; i < index; i++) {
            int sum = temp_last + temp_last_last; // 1
            temp_last_last = temp_last;   // 1
            temp_last = sum;
        }

        return temp_last + temp_last_last;
    }

    // using Stream
    public static void fibbonachi2() {
        int[] fibs = {0, 1, 1, 2, 3, 5, 8};
        Stream<Integer> fibonacci = Stream.generate(() -> {
            int result = fibs[1];
            int fib3 = fibs[0] + fibs[1];
            fibs[0] = fibs[1];
            fibs[1] = fib3;

            return result;
        });

    }

    public static void main(String[] args) {
        System.out.println("The Fibanacci number is: " + fibbonachi(9));


    }
}
